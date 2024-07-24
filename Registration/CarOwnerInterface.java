
/** 
* This java app is for Registrations
* @author Wissam Kashat, wissamfrances@yahoo.com 
* @since 12/10/2022 (Wissam Kashat, v1.0) 
* @version v1.0 
*/


public interface CarOwnerInterface extends Comparable<Object> {
      //- license: String- month: int- year: int

    /**
     *
     * @param inLicense
     */
      void setLicense(String inLicense);
 
    /**
     *
     * @return
     */
    String getLicense (); 

    /**
     *
     * @param inMonth
     */
    void  setmonth(int inMonth);

    /**
     *
     * @return
     */
    int getMonth();

    /**
     *
     * @param inYear
     */
    void  setYear(int inYear);
      
    /**
     *
     * @return
     */
    int getYear();      
    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    int compareTo(Object o);      

    /**
     *
     * @return
     */
    String toString();
}
