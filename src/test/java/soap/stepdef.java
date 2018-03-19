package soap;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import com.eviware.soapui.SoapUI;
import com.eviware.soapui.settings.ProxySettings;
import com.eviware.soapui.tools.SoapUITestCaseRunner;

public class stepdef {
  @Given("^open$")
  public void open() throws Throwable {
  }

  @When("^submit$")
  public void submit() throws Throwable {
  }

  @Then("^end$")
  public void end() throws Throwable {
	  SoapUI.getSettings().setBoolean(ProxySettings.ENABLE_PROXY,false);
	  SoapUI.saveSettings();
	  SoapUI.updateProxyFromSettings();
	  SoapUITestCaseRunner runner = new SoapUITestCaseRunner();
	  runner.setProjectFile("C:\\Users\\T924192\\Documents\\Ziwei-s-First-Card-and-Group-Admin-Project-soapui-project.xml");
	  runner.setPrintReport(true); 
	  runner.run();
  }


}
