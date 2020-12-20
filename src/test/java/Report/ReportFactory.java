package Report;

import Utils.Helper;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReportFactory {
    @BeforeSuite
    public void removeOldReport(){
        Helper.executeUnixCommand("rm -rf allure-results");
        Helper.executeUnixCommand("rm -rf allure-report");
    }
    @AfterSuite
    public void createReport(){
        Helper.executeUnixCommand("allure generate");
        String reportFolder = reportFolderName();
        Helper.executeUnixCommand("mkdir Reports/"+reportFolder);
        Helper.executeUnixCommand("cp -r allure-report/ ./Reports/"+reportFolder+"/");
        Helper.executeUnixCommand("mv ./Reports/"+reportFolder+"/index.html ./Reports/"+reportFolder+"/reportFile.html");

    }
    private String reportFolderName(){
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMMdd-hhmmss");
        Date now = new Date();
        return df.format(now);
    }



}
