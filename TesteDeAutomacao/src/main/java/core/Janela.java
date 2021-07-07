package core;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WindowType;

public class Janela {
	
	public static void novaGuia() {
		Driver.getWebDriver().switchTo().newWindow(WindowType.TAB);
	}
	
	public static void mudarJanela(String id) {
		Driver.getWebDriver().switchTo().window(id);
	}

	public static int mudarJanela(int window) {
		Set<String> windowHandles = Driver.getWebDriver().getWindowHandles();
		int i = 0;
		String handle = new String();
		for (Iterator<String> it = windowHandles.iterator(); it.hasNext() && 0 <= window && i <= window;) {
			handle = it.next();
			i++;
		}
		mudarJanela(handle);
		return i - 1;
	}

	public static void fecharJanela(int window) {
		mudarJanela(window);
		Driver.getWebDriver().close();
	}
}
