package exercises4.inheritanceinterface.pll;

import exercises4.inheritanceinterface.bll.HourlyEmployee;
import exercises4.inheritanceinterface.bll.SalariedEmployee;

public class TestEmployee {

	public static void main(String[] args) {
		SalariedEmployee salariedEmployee =new SalariedEmployee("Diwakar", "Manager",45000);
		
		HourlyEmployee hourlyEmployee=new HourlyEmployee("N","Executive",150,50);
		
		System.out.println(salariedEmployee);
		System.out.println(hourlyEmployee);
}
}