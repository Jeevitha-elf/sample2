package TestNGparameters;

import org.testng.annotations.Test;

public class Sample {
	@Test(priority=1)
	public void A1() {
		System.out.println("hi");
	}
		@Test
		public void A2() {
			System.out.println("hello");
		}
		
		@Test(priority=2)
		public void A3() {
			System.out.println("abc");
		
		}
	}


