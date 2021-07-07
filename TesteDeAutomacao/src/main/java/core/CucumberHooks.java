package core;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class CucumberHooks {
	
	@Before
	public void inicio(Scenario scenario) {
		Configuracoes.setConfig(scenario);
	}
	
	@After
	public void fim() {
		try {
			System.out.println("Tirando screenshot");
			Screenshot.takeScreenshot();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Configuracoes.finishTest();
	}
}
