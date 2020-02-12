package com.spring.test.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.GzipResourceResolver;
import org.springframework.web.servlet.resource.PathResourceResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.spring.test.view.config.MyCustomInterceptor;

@Configuration
@EnableWebMvc
@ComponentScan

@EnableWebSecurity
public class SpringMvcConfigurationImpl  implements WebMvcConfigurer {

	@Autowired
	MyCustomInterceptor interceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		 registry.addInterceptor(interceptor).addPathPatterns("/config/**");
	}

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home");
//		registry.addViewController("/").setViewName("home");
		registry.addViewController("/hello").setViewName("hello");
		registry.addViewController("/login").setViewName("login");
		registry.addViewController("/").setViewName("login");
		registry.addViewController("/login").setViewName("login");
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/view/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		registry.viewResolver(resolver);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		System.out.println("WebMvcConfigurer - addResourceHandlers() function get loaded...");
		registry.addResourceHandler("/resources/static/**").addResourceLocations("/resources/");

		registry.addResourceHandler("/js/**").addResourceLocations("/js/").setCachePeriod(3600).resourceChain(true)
				.addResolver(new GzipResourceResolver()).addResolver(new PathResourceResolver());
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
//	}
	public CustomFilter getCustomFilter() throws Exception {
		CustomFilter filter = new CustomFilter("/login", "POST");
		filter.setAuthenticationFailureHandler((request, response, exception) -> {
			response.sendRedirect("/login?error");
		});
		return filter;
	}

	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().requireCsrfProtectionMatcher(new AntPathRequestMatcher("**/login")).and().authorizeRequests()
		.antMatchers("/resources/**", "/registration", "/login", "/loginbean").permitAll()
				.anyRequest().authenticated().and()
				.addFilterBefore(getCustomFilter(), UsernamePasswordAuthenticationFilter.class).formLogin().defaultSuccessUrl("/welcome")
				.loginPage("/login").permitAll().and().logout().permitAll();
	}
	
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/*.css");
		web.ignoring().antMatchers("/*.js");
		web.ignoring().antMatchers("/webjars/**");
	}
}