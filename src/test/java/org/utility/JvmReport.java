package org.utility;

import java.io.File;
import java.util.LinkedList;
import java.util.List;


import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generateJvmReport(String jsonpath) {
	    File f = new File("C:\\Users\\BHAVYA P\\Desktop\\Mini Project Bhavya\\MiniProject\\AdactinMiniProject\\JvmF");
	    
	    Configuration c= new Configuration(f, "facebook");
	    c.addClassifications("platformname", "android");
	    c.addClassifications("platformversion", "windows 11");
	    c.addClassifications("browsername", "chrome");
	    c.addClassifications("browser version", "128");
	    
	    List<String> li = new LinkedList<String>();
	    li.add(jsonpath);
	    
	    ReportBuilder r=new ReportBuilder(li, c);
          r.generateReports();
		}
}
