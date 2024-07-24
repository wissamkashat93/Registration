import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/** 
* This java app is for Registrations
* @author Wissam Kashat, wissamfrances@yahoo.com 
* @since 12/10/2022 (Wissam Kashat, v1.0) 
* @version v1.0 
*/


public class RegistrationMethods implements RegistrationMethodsInterface{

    /**
     *
     */
    public final int  REG_MONTH  = 4 ;

    /**
     *
     */
    public final int REG_YEAR = 2022 ;
      String inputFileName, outputFileName, binFileName ;
      /**
     * Prompts the user to provide the location of the csv file to be processed 
     * (registration.csv), the location for where the user wants the output file 
     * saved (output.txt), and the location for the binary file (ltStateBinary.dat).
     */
    public void setFileNames()
    {
            String inputStr= ""  ;
            File file ; 
            Scanner scan = new Scanner(System.in);
            boolean isOkay = false;
            do
            {
                  System.out.println("Enter the path to the registrations.csv file (ie c:/tmp/registration.csv)");
                  do
                  {                        
                        inputStr = scan.nextLine();                        
                  }while(inputStr.equals("")); 
                  file = new File(inputStr);
                  if(file.exists())      
                        isOkay=true;
            }while(isOkay == false);

            this.inputFileName = inputStr; // Assigning file name for inputFileName
            
            
            //
            System.out.println("Enter the path where output.txt should be saved (ie c:/tmp/output.txt)");
            do
            {                        
                  inputStr = scan.nextLine();                        
            }while(inputStr.equals("")); 
            
            this.outputFileName=inputStr;

            System.out.println("Enter the path where binFile.dat should be saved (ie c:/tmp/binFile.dat)");
            do
            {                        
                  inputStr = scan.nextLine();                        
            }while(inputStr.equals("")); 
            
            this.binFileName=inputStr;
            scan.close();
    }

    /**
     * Takes csv file (inputFileName) and parses out each record.  split() and nextLine() 
     * will be helpful.  For each line, create a CarOwner object and add to ArrayList <CarOwner>
     * collection
     * @param inList
     */
    public void processTextToArrayList(ArrayList<CarOwner> inList)
    {
            inList.clear();
            
            try
            {
                   File fileName = new File(this.inputFileName);
                   FileReader fileReader = new FileReader(fileName) ;             
                   Scanner inputStream = new Scanner(fileReader);
                   String input = "";
                   String [] words;    // Array of string to hold part of line 
                   CarOwner co;

                   input = inputStream.nextLine();  // removing the top line(title line) 
                   while (inputStream.hasNextLine())
                   {
                        input  = inputStream.nextLine();
                        words = input.split(",");
                        co = new CarOwner(words[1],words[0],words[2],Integer.parseInt(words[3]),Integer.parseInt(words[4]));
                        inList.add(co);
                   }
                   inputStream.close();
            } 
            catch (IOException e) 
            {
                                    
            }
    }

    /**
     * Prints out ArrayList passed in based on toString() along with passed in
     * message
     *
     * @param inList ArrayList<CarOwner> collection passed in to be written to
     * a text file
     * @param inMsg Message specific to the array being printed
     */
    public void printArrayListToFile(ArrayList<CarOwner> inList, String inMsg)
    {
            
            try
            {
                  File fileName = new File(this.outputFileName);                  
                  FileWriter fileWriter = new FileWriter(fileName) ;
                  PrintWriter printWriter = new PrintWriter(fileWriter);
                  String input = "";
                  
                  printWriter.println(inMsg);
                  for (CarOwner co : inList) // The for each loop 
                  {
                        input = co.toString();
                        //co.getFirstName()+" "+co.getLastName()+"\t"+co.getLicense()+"\t"+co.getMonth()+"/"+co.getYear();
                        printWriter.println(input);
                  }
                  printWriter.println("");
                  //Yosemite Sam FGH-123 3/2021
                  printWriter.close();
                  fileWriter.close();                  
            } 
            catch (IOException e) 
            {
                                    
            }
    }

    /**
     * Takes a ArrayList <CarOwner> collection as an input and creates a binary file output.  
     * The output file can later be read into the java program for processing.
     * 
     * @param inList ArrayList<CarOwner> collection
     */
    public void writeListToBinary(ArrayList<CarOwner> inList)
    {
      try
      {
            FileOutputStream fileOutStream  = new FileOutputStream(this.binFileName);
            ObjectOutputStream objOutStream = new ObjectOutputStream(fileOutStream);
            
            for (CarOwner co : inList) // The for each loop 
            {                  
                  objOutStream.writeObject(co);        
            }
            //Yosemite Sam FGH-123 3/2021
            objOutStream.close();
            fileOutStream.close();                 
      } 
      catch (IOException e) 
      {
                              
      }
    }

    /**
     * Reads an ArrayList<CarOwner> collection from a binary file (ltStateBinary.dat).  
     * Then, each ArrayList object item is then written to a newly created CarOwner[], 
     * called temp.  temp is returned to the calling method.
     * @return 
     */
    public CarOwner[] readListFromBinary()
    {
            CarOwner [] temp = null;
            ArrayList<CarOwner> arList = new ArrayList<CarOwner>();
            try
            {
                  FileInputStream fileInStream  = new FileInputStream(this.binFileName);
                  ObjectInputStream objInStream = new ObjectInputStream(fileInStream);
                  CarOwner  co; 
                  try
                  {
                        do
                        {
                              co = (CarOwner)objInStream.readObject();                              
                              arList.add(co);
                        }while(true);
                  }
                  catch(EOFException e )
                  {

                  }
                  objInStream.close();


                  temp = new CarOwner[arList.size()];
                  for(int x =0 ;x<arList.size();x++)
                  {
                        temp[x] = arList.get(x);                       
                  }
            }
            catch (IOException e) 
            {
                                    
            }
            catch (Exception e) 
            {
                                    
            }        
            
            return temp;
    }

    /**
     * Prints out array passed in based on toString() along with passed in
     * message
     *
     * @param inArray CarOwner[] array to be written to a text file
     * @param inMsg Message specific to the array being printed
     */
    public void printArrayToFile(CarOwner[] inArray, String inMsg)
    {
            try
            {
                  File fileName = new File(this.outputFileName);                  
                  FileWriter fileWriter = new FileWriter(fileName,true) ; // the true argument for appending test to file
                  PrintWriter printWriter = new PrintWriter(fileWriter);
                  String input = "";
                  
                  printWriter.println(inMsg);
                  for (int x =0; x<inArray.length ; x++) 
                  {
                        input = inArray[x].toString();                        
                        printWriter.println(input);
                  }
                  printWriter.println("");
                  //Yosemite Sam FGH-123 3/2021
                  printWriter.close();
                  fileWriter.close();                  
            } 
            catch (IOException e) 
            {
                                    
            }
    }

    /**
     * Method that generates and returns an array for vehicles whose
     * registration have expired defined as registration is over 12 months old
     * based on current REG_MONTH and REG_YEAR.
     *
     * @param inArray CarOwner[]
     * @return 
     */
    public CarOwner[] flagOverdueOwners(CarOwner[] inArray)
    {
      CarOwner [] array = null ;
      int x,count = 0;
      CarOwner dummy = new CarOwner() ;
      dummy.setYear(REG_YEAR- 1);  // 12 months means 1 year old 
      dummy.setmonth(REG_MONTH);
      for(x=0;x<inArray.length;x++) 
      {
            if(inArray[x].compareTo(dummy)<0)
                 count++ ;
      }

      array = new CarOwner[count];
      for(x=0,count=0;x<inArray.length;x++) 
      {
            if(inArray[x].compareTo(dummy)<0)
            {
               array[count] = inArray[x];   
               count++ ;
            }
      }
      return array;
    }
    
    /**
     * Method that generates and returns an array for vehicles whose
     * registration will expire in three months or less. The state of Looney
     * Tunes sends a reminder three months out to the car owner.
     *
     * @param inArray CarOwner[]
     * @return 
     */
    public CarOwner[] flagAlmostDueOwners(CarOwner[] inArray)
    {
      CarOwner [] array = null ;
      int x,count = 0;
      CarOwner dummy = new CarOwner() ;
      CarOwner dummy1 = new CarOwner() ;
      
      dummy.setYear(REG_YEAR- 1);  // 12 months means 1 year old 
      dummy.setmonth(REG_MONTH+3);
      dummy1.setYear(REG_YEAR- 1);  // 12 months means 1 year old 
      dummy1.setmonth(REG_MONTH);
      for(x=0;x<inArray.length;x++) 
      {
            if(inArray[x].compareTo(dummy)<0 && inArray[x].compareTo(dummy1)>=0)
               count++ ;
      }

      array = new CarOwner[count];
      for(x=0,count=0;x<inArray.length;x++) 
      {
            if(inArray[x].compareTo(dummy)<0&& inArray[x].compareTo(dummy1)>=0)
            {
               array[count] = inArray[x];   
               count++ ;
            }
      }
      return array;
    }
}
