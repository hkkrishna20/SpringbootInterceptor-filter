package com.views.filterinterceptor;
/*
 * package com.cricclubs.views.filterinterceptor;
 * 
 * import java.io.IOException;
 * 
 * import javax.servlet.Filter; import javax.servlet.FilterChain; import
 * javax.servlet.FilterConfig; import javax.servlet.ServletException; import
 * javax.servlet.ServletRequest; import javax.servlet.ServletResponse; import
 * javax.servlet.annotation.WebFilter; import
 * javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.beans.factory.config.AutowireCapableBeanFactory; import
 * org.springframework.boot.web.servlet.FilterRegistrationBean; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.stereotype.Component;
 * 
 * @Component
 * 
 * @WebFilter("/student/**") public class FirstFilter implements Filter { public
 * static final String X_CLACKS_OVERHEAD = "X-Clacks-Overhead";
 * 
 * // this method will be called by container when we send any request public
 * void doFilter(ServletRequest request, ServletResponse response, FilterChain
 * chain) throws IOException, ServletException {
 * 
 * System.out.println("doFilter() method is invoked"); HttpServletRequest
 * httpServletRequest = (HttpServletRequest) request; HttpServletResponse
 * httpServletResponse = (HttpServletResponse) response;
 * System.out.println("Context path is  " +
 * httpServletRequest.getContextPath()); chain.doFilter(httpServletRequest,
 * httpServletResponse); System.out.println("doFilter() method is ended");
 * System.out.println("Remote Host:" + request.getRemoteHost());
 * System.out.println("Remote Address:" + request.getRemoteAddr());
 * HttpServletResponse res = (HttpServletResponse) response;
 * ((HttpServletResponse) res).setHeader(X_CLACKS_OVERHEAD,
 * "GNU Terry Pratchett"); chain.doFilter(request, response); }
 * 
 * // this method will be called by container while deployment public void
 * init(FilterConfig config) throws ServletException {
 * 
 * System.out.println("init() method has been get invoked");
 * System.out.println("Filter name is " + config.getFilterName());
 * System.out.println("ServletContext name is" + config.getServletContext());
 * System.out.println("init() method is ended"); }
 * 
 * public void destroy() { // do some stuff like clearing the resources
 * 
 * }
 * 
 * }
 */