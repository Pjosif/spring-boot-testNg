package spring_boot_testng.testng_sping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

@SpringBootApplication
public class TestNGWithSpringApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(TestNGWithSpringApplication.class, args);
		XmlSuite xmlSuite = new XmlSuite();
		xmlSuite.setName("Suite1");
		
		XmlTest xmlTest = new XmlTest(xmlSuite);
		xmlTest.setName("Test1");
		
		XmlClass testClass = new XmlClass(TestNGTestsWithSpringBootIT.class);
		
		List<XmlClass> testClasses = new ArrayList<XmlClass>();
		testClasses.add(testClass);
		
		xmlTest.setClasses(testClasses);
		
		TestNG testing = new TestNG();
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(xmlSuite);
		testing.setXmlSuites(suites);
		testing.run();
	}

}
