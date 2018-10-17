/**
 * 
 */
package utils;

import com.relevantcodes.extentreports.ExtentReports;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

// OB: ExtentReports extent instance created here. That instance can be
// reachable by getReporter() method.

public class ExtentReportsManager {

	private static ExtentReports extent;

	public synchronized static ExtentReports getReporter() {
		if (extent == null) {
			// Set HTML reporting file location
			String workingDir = System.getProperty("user.dir");
			extent = new ExtentReports(workingDir + "\\ExtentReports\\IslamicFinder_Automation_Report.html", true);
		}
		return extent;
	}
}
