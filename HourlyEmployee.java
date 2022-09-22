package exercises4.inheritanceinterface.bll;

public class HourlyEmployee extends Employee {
	private double wage;
	private int hours;
	
    public HourlyEmployee( String name, String jobTitle, double WeeklySalary, int hoursWorked )
    {
       super( name, jobTitle ); 
       setWage( WeeklySalary );
       setHours(hoursWorked);
    }
    
    public void setWage( double hrSalary )
         {
             if ( hours >= 0.0 )
                wage = hrSalary;
             else
                throw new IllegalArgumentException(
                   "Hourly wage must be  >= 0.0" );
          } 
    
       
          public double getWage()
          {
             return wage;
          } 
          
          
          public void setHours(int hoursWorked)
          {
        	  if ( ( hoursWorked >= 0.0 ))
        	  {
        		  hours=hoursWorked;
        	  }
        	  else
        	  {
        		  throw new IllegalArgumentException(
        		  "Hours worked must be >= 0.0" );
        	  }
          }
          public int getHours()
          {
        	  return hours;
          }
          
         
          @Override                                                           
          public double calculatePay()                                            
          {
              return getHours()*getWage();                                        
          }

		@Override
		public String toString() {
			return "HourlyEmployee [name="+getname()+", jobTitle="+getJobTitle()+", wage=" + wage + ", hours=" + hours +", totalWage="+calculatePay()+ "]";
		}

		@Override
		public double earnings() {
			// TODO Auto-generated method stub
			return 0;
		}

			    
          
}