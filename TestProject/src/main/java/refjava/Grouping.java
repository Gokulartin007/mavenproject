package refjava;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups = {"drive"})
	public void Figo() {
	System.out.println("good driving pleasure");
	}
	
	@Test(groups = {"eco"})
	public void eeco() {
		System.out.println("good for family");
		}
	
	
	@Test(groups = {"look"})
	public void Tiago() {
		System.out.println("good looking ");
		}
	
	@Test(groups = {"look"})
	public void Swift() {
		System.out.println("good driving pleasure and look");
		}
	
	@Test(groups = {"eco"})
	public void alto() {
		System.out.println("good in economy ");
		}
	
	@Test(groups = {"look"})
	public void Sropio() {
		System.out.println("rugged look");
		}

}
