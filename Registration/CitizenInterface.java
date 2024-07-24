
/** 
* This java app is for Registrations
* @author Wissam Kashat, wissamfrances@yahoo.com 
* @since 12/10/2022 (Wissam Kashat, v1.0) 
* @version v1.0 
*/


public interface CitizenInterface {


    /**
     *
     * @param inFirst
     */
    void setFirstName(String inFirst);

    /**
     *
     * @return
     */
    String getFirstName();

    /**
     *
     * @param inLast
     */
    void setLastName(String inLast);

    /**
     *
     * @return
     */
    String getLastName();
 
    /**
     *
     * @return
     */
     String toString(); 
}