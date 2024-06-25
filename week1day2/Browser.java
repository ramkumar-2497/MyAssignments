package week1day2;

public class Browser {
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
	}
 public void Loadurl() {
	 System.out.println("Application Loaded Successfully");
 }
	public static void main(String[] args) {
	 Browser bro=new Browser();
	 String browserName=bro.launchBrowser("Opera");
	 System.out.println(browserName);
 bro.Loadurl();

	}
		
	}
