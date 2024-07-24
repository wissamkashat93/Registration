import java.io.Serializable;

/** 
* This java app is for Registrations
* @author Wissam Kashat, wissamfrances@yahoo.com 
* @since 12/10/2022 (Wissam Kashat, v1.0) 
* @version v1.0 
*/

public class Citizen implements CitizenInterface,Serializable { // interface
      
      private String firstName;
      private String lastName;

    /**
     *
     */
    public Citizen()    // default/Non-Argumented constructor 
      {
            firstName = "No Name";
            lastName  = "No Name";
      }

    /**
     *
     * @param inFirstName
     * @param inLastName
     */
    public Citizen(String inFirstName,String inLastName)    // default/Non-Argumented constructor 
      {
            firstName = inFirstName;
            lastName  = inLastName;
      }

    /**
     *
     * @param inFirst
     */
    public void setFirstName(String inFirst)
      {
            this.firstName = inFirst ;
      }

    /**
     *
     * @return
     */
    public String getFirstName()
      {
            return this.firstName ;
      }

    /**
     *
     * @param inLast
     */
    public void setLastName(String inLast)
      {
            this.lastName = inLast;
      }
      
    /**
     *
     * @return
     */
    public String getLastName()
      {
            return this.lastName;
      }

      @Override
      public String toString()
      {
            String s1=String.format("%-20s",this.firstName+" " +this.lastName);


            return s1;
      } 
}
