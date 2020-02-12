package com.test.dozer_spring.dozer_spring;

import java.io.FileInputStream;
import java.util.Arrays;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.dozer.DozerBeanMapper;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import com.test.dozer_spring.dozer_spring.model.DestinationObject;
import com.test.dozer_spring.dozer_spring.model.SourceObject;
import com.test.dozer_spring.dozer_spring.model.Student;

public class Demo {

    public static void main(String[] args) throws Exception {
        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser sp = spf.newSAXParser();
        XMLReader xr = sp.getXMLReader();

        xr.setContentHandler(new FragmentContentHandler(xr));
        xr.parse(new InputSource(new FileInputStream("src/main/resources/input.xml")));
        
        
        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
        SourceObject sourceObject = new SourceObject();
        sourceObject.setName("Sajal");
        sourceObject.setAddress("India");
 
        sourceObject.getStudents().add(new Student("S1", "C1", "diffField1"));
        sourceObject.getStudents().add(new Student("S2", "C2", "diffField2"));
        sourceObject.getStudents().add(new Student("S3", "C3", "diffField3"));
 
        dozerBeanMapper.setMappingFiles(Arrays.asList("student-mapper.xml"));
        DestinationObject destinationObject = dozerBeanMapper.map(sourceObject, DestinationObject.class);
 
        System.out.println(destinationObject);
    }
}