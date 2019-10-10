package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	@Before
	public void commonStep() {
		launchBrowser();
		loadUrl("https://www.slideegg.com/");
		
	}
@After
public void quit() {
	close();
}
}
