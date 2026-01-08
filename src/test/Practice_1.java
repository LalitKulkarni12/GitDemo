package test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Practice_1 {
	@Test(groups= {"execute"}, enabled = false)
	public void method_1() {
		System.out.println("Practice_1 ---> method_1()");
	}
	
	//@Parameters({"name","city"})
	@Test(dataProvider = "getDetails")
	public void method_2(String nameParameter, String cityParameter) {
		System.out.println("Practice_1 ---> method_2()");
		System.out.println(nameParameter+" lives in "+cityParameter+" city");
	}
	
	@Test(groups= {"execute"}, enabled = false)
	public void method_3() {
		System.out.println("Practice_1 ---> method_3()");
	}
	
	@DataProvider
	public Object[][] getDetails(){
		Object[][] data = new Object[3][2];
		data[0][0] = "Lalt Kulkarni";
		data[0][1] = "Pune";
		data[1][0] = "Sunidhi Kulkarni";
		data[1][1] = "Wakad";
		data[2][0] = "Shlok Kulkarni";
		data[2][1] = "Pimpri";
		return data;
	}
	
	
}
