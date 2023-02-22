/* File: Main.java
 * Author: Juho Lee
 * Date: 2023.02.08
 * Description: Printing Recipients using JDBC and Dao pattern.
 */
import businesslayer.RecipientsBusinessLogic;
import businesslayer.ValidationException;
import transferobjects.RecipientsDTO;

import java.util.List;
/**
 * The Main class is responsible for demonstrating the functionality of RecipientsBusinessLogic.
 */
public class Main {

    /**
     * Runs a demo of RecipientsBusinessLogic.
     * 
     * @throws ValidationException if validation fails for any of the operations
     */
    public void demo() throws ValidationException {
        try{
            RecipientsBusinessLogic logic = new RecipientsBusinessLogic();
            List<RecipientsDTO> list = null;
            RecipientsDTO recipient = null;
            
            System.out.println( "Recipients Table - Column Attributes:" );
            logic.printColumAttribute();
            
            System.out.println();
            System.out.println("Printing Recipients");
            list = logic.getAllRecipients();
            printRecipients(list);
            
            System.out.println( "Recipients Table - Column Attributes:" );
            logic.printColumAttribute();
            System.out.println();
            System.out.println("Printing One Recipient");
            recipient = logic.getRecipient(1);
            printRecipient(recipient);
            System.out.println();
            
            System.out.println( "Recipients Table - Column Attributes:" );
            logic.printColumAttribute();
            System.out.println();
            System.out.println("Inserting One Recipient");
            recipient = new RecipientsDTO();
            recipient.setName("Juho Lee");
            recipient.setYear(2022);
            recipient.setCity("Ottawa");
            recipient.setCategory("Computer Science");
            logic.addRecipient(recipient);
            list = logic.getAllRecipients();
            printRecipients(list);
            
            System.out.println( "Recipients Table - Column Attributes:" );
            logic.printColumAttribute();
            System.out.println();
            System.out.println("Updating last Recipient");
            Integer updatePrimaryKey = list.get(list.size() - 1).getAwardID();
            recipient = new RecipientsDTO();
            recipient.setAwardID(updatePrimaryKey);
            recipient.setName("Juho Lee");
            recipient.setYear(2023);
            recipient.setCity("Toronto");
            recipient.setCategory("Business");
            logic.updateRecipient(recipient);
            list = logic.getAllRecipients();
            printRecipients(list);
            
            System.out.println( "Recipients Table - Column Attributes:" );
            logic.printColumAttribute();
            System.out.println();
            System.out.println("Deleting last Recipient");
            recipient = list.get(list.size() - 1);
            logic.deleteRecipient(recipient);
            list = logic.getAllRecipients();
            printRecipients(list);	

            
        }
        catch(ValidationException e){
            System.err.println(e.getMessage());
        }
    }
	
    /**
     * Prints the details of a recipient.
     * 
     * @param recipient the recipient whose details need to be printed
     */
    private static void printRecipient(RecipientsDTO recipient){
        String output = String.format("%s, %s, %s, %s, %s",
                recipient.getAwardID().toString(),
                recipient.getName(),
                recipient.getYear(),
                recipient.getCity(),
                recipient.getCategory());
        System.out.println(output);
    }
	
    /**
     * Prints the details of a list of recipients.
     * 
     * @param recipients the list of recipients whose details need to be printed
     */
    private static void printRecipients(List<RecipientsDTO> recipients){
        for(RecipientsDTO recipient : recipients){
            printRecipient(recipient);
        }
        System.out.println();
    }
}
