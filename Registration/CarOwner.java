public class CarOwner extends Citizen implements CarOwnerInterface{ // All the subclass of Serilizable is also a Serializable 
      
      public String license;
      public int  month;
      public int year;
            
/** 
* This java app is for Registrations
* @author Wissam Kashat, wissamfrances@yahoo.com 
* @since 12/10/2022 (Wissam Kashat, v1.0) 
* @version v1.0 
*/
    public CarOwner() // default / non-argumented constructor 
      {
            this.setFirstName("No Name");
            this.setLastName("No Name");      
            this.setLicense("Not Assigned");
            this.month = 0;
            this.year = 0;
      }

    /**
     *
     * @param inFirstName
     * @param inLastName
     * @param inLicense
     * @param inMonth
     * @param inYear
     */
    public CarOwner(String inFirstName,String inLastName,String inLicense,int inMonth,int inYear ) // default / non-argumented constructor 
      {
            this.setFirstName(inFirstName);
            this.setLastName(inLastName);            
            this.setLicense(inLicense);
            this.month = inMonth;
            this.year = inYear;
      }

    /**
     *
     * @param inLicense
     */
    public void setLicense(String inLicense)
      {
            this.license = inLicense;
      }

    /**
     *
     * @return
     */
    public String getLicense ()
      {
            return this.license;
      } 

    /**
     *
     * @param inMonth
     */
    public void  setmonth(int inMonth)
      {
            this.month = inMonth;
      }

    /**
     *
     * @return
     */
    public int getMonth()
      {
            return this.month;
      }

    /**
     *
     * @param inYear
     */
    public void  setYear(int inYear)
      {
            this.year = inYear;
      }

    /**
     *
     * @return
     */
    public int getYear()
      {
            return this.year;
      }
      @Override
      /**
      * overrides compareTo to sort CarOwners based on chronological
      * of month and year car was last. If param is null or not CarOwner class, returns -1
      * if object total months < param total months, temp is -1, object total months > param total months, temp is 1
      * otherwise the same and temp is 0
      * @return temp
      */
      public int compareTo(Object o){
            int temp = -1;
            if(o != null && this.getClass() == o.getClass()){
                  CarOwner copy = (CarOwner)o;
                  if((year*12+this.month) < (copy.year*12+copy.month))
                        temp = -1;
                  else if ((year*12+this.month) > (copy.year*12+copy.month))
                        temp = 1;
                  else //the same
                        temp = 0;
            }
            return temp;
      }
      
      
      @Override
      public String toString()
      {
            String s1= super.toString()+"\t"+this.license +"\t\t"+String.format("    %-15s",this.month+"/"+this.year);
            return s1;
      }
}
