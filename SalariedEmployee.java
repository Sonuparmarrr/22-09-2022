package exercises4.inheritanceinterface.bll;

public  class SalariedEmployee extends Employee{
	private double weeklySalary;

	  public SalariedEmployee( String name, String jobTitle, double salary ) {
		  super( name, jobTitle );
         setWeeklySalary( weeklySalary );
      }
      
      public void setWeeklySalary( double salary )
           {
               if ( salary >= 0.0 )
                  weeklySalary = salary;
               else
                  throw new IllegalArgumentException(
                     "Weekly salary must be >= 0.0" );
            } 
      
         
            public double getWeeklySalary()
            {
               return weeklySalary;
            } 
      
           
            @Override                                                           
            public double calculatePay()                                            
            {
                return getWeeklySalary();                                        
            }

			@Override
			public String toString() {
				return "SalaryEmployee [name=" + getname() + ",name=\" + getlastname() + \", jobTitle="+getJobTitle()+", totalWeeklySalary=" + calculatePay() + "]";
			}

			@Override
			public double earnings() {
				// TODO Auto-generated method stub
				return 0;
			}
}