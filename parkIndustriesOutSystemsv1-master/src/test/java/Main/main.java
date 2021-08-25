package Main;

import parkIndustriesOutSystems.utilities.Reporting;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;


public class main {
//  static TestNG testNG;

  public static void main(String[] args) throws IOException {

    System.out.print("Executing Selenium Test Scripts for Capmation!!\n");
    TestNG testNG=new TestNG();
    List<String> suiteFiles=new ArrayList<String>();
    Reporting rep = new Reporting();


    try {
      suiteFiles.add("./test-classes/TestNG.xml");
      testNG.setTestSuites(suiteFiles);
      testNG.run();

    } catch (Exception e) {
      e.printStackTrace();
    }

    String url = System.getProperty("user.dir") + "\\test-classes\\test-output\\" + rep.time;
    File htmlFile = new File(url);
    Desktop.getDesktop().browse(htmlFile.toURI());





//    //Declare List of suites, classes and tests
//    List<XmlSuite> suites = new ArrayList<XmlSuite>();
//    List<XmlClass> classes = new ArrayList<XmlClass>();
//    List<XmlTest> tests = new ArrayList<XmlTest>();
//
//    //Declare a XML suite
//    XmlSuite suite = new XmlSuite();
//
//    //Set suite Name
//    suite.setName("Capmation Test");
//
//    //Add Listener
//    suite.addListener("capmation.utilities.Reporting");
//
//    //Declare Test
//    XmlTest test = new XmlTest(suite);
//    test.setName("Capmation - Chrome Test");
//
//    //Add Parameters to Test
//    test.addParameter("browser", "chrome");
//
//    //Declare XML classes and add to XML Classes List
//    XmlClass class1 = new XmlClass("capmation.testCases.TC_GoogleSearch_001");
//    classes.add(class1);
//
//    XmlClass class2 = new XmlClass("capmation.testCases.TC_Capmation_001");
//    classes.add(class2);
//
//    //Set XML Classes by passing XML classes list
//    test.setXmlClasses(classes);
//
//    //
//    tests.add(test);
//
//    //Add suite to list of suites
//    suites.add(suite);
//
//    //Declare TestNG variable
//    TestNG tng = new TestNG();
//
//    //Set TestNG suites by passing in a Lis tof suites
//    tng.setXmlSuites(suites);
//
//    //Execute TestNG
//    tng.run();
  }
}
