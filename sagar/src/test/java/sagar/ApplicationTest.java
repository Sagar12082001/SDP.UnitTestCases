package sagar;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ApplicationTest{
	@Test
	public void addTest(){
		Application app=new Application();
		assertEquals(app.add(2,3),5.0);
	}



public void addTest2() {
		Application app=new Application();
		assertEquals(app.add(2.0,3.1),5.1);
  }

}
