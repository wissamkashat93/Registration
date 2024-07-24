import java.util.*;
/** 
* This java app is for Registrations
* @author Wissam Kashat, wissamfrances@yahoo.com 
* @since 12/10/2022 (Wissam Kashat, v1.0) 
* @version v1.0 
*/
public class Main { //using replit

    /**
     *
     * @param args
     */
    public static void main(String [] args)
      {
            RegistrationMethods dmv = new RegistrationMethods();
            
            dmv.setFileNames();
            ArrayList<CarOwner> ltState = new ArrayList<CarOwner>();
            dmv.processTextToArrayList(ltState);
            dmv.printArrayListToFile (ltState,"Initial Set of Car Owners - Unsorted");
            dmv.writeListToBinary(ltState);
            CarOwner[ ] ltStateCopy = dmv.readListFromBinary() ;            
            Arrays.sort(ltStateCopy);
            dmv.printArrayToFile(ltStateCopy, "Sorted list based on Registration date");
            CarOwner[ ] dueOwners= dmv.flagOverdueOwners( ltStateCopy) ;
            dmv.printArrayToFile(dueOwners, "Owners with Expired Registration");
            CarOwner[ ]almostDue= dmv.flagAlmostDueOwners(ltStateCopy) ;
            dmv.printArrayToFile(almostDue, "Owners with registration expiring in three months or less");
                       

      }
      
}
