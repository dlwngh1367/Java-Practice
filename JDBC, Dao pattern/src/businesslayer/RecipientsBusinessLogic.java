/* File: RecipientsBusinessLogic.java
 * Author: Juho Lee
 * Date: 2023.02.08
 * Description: Printing Recipients using JDBC and Dao pattern.
 */
package businesslayer;

import java.util.List;
import dataaccesslayer.RecipientsDaoImpl;
import transferobjects.RecipientsDTO;
import dataaccesslayer.RecipientsDao;

/*

The RecipientsBusinessLogic class contains methods to interact with the RecipientsDao and perform business logic

operations on RecipientsDTO objects.
*/
public class RecipientsBusinessLogic {

/**

The maximum length allowed for a recipient's name.
*/
private static final int NAME_MAX_LENGTH = 30;
/**

The RecipientsDao instance used to access recipient data.
*/
private RecipientsDao recipientDao = null;
/**

Constructs a new RecipientsBusinessLogic object and initializes the RecipientsDao instance.
*/
public RecipientsBusinessLogic(){
recipientDao = new RecipientsDaoImpl();
}
/**

Returns a list of all recipients.
@return A list of RecipientsDTO objects.
*/
public List<RecipientsDTO> getAllRecipients(){
return recipientDao.getAllRecipients();
}
/**

Returns a recipient with the given award ID.
@param awardID The award ID of the recipient to retrieve.
@return The RecipientsDTO object with the given award ID.
*/
public RecipientsDTO getRecipient(Integer awardID){
return recipientDao.getRecipientByAwardId(awardID);
}
/**

Adds a new recipient to the database.
@param recipient The RecipientsDTO object to add.
@throws ValidationException if the recipient is invalid.
*/
public void addRecipient(RecipientsDTO recipient) throws ValidationException{
cleanRecipient(recipient);
validateRecipient(recipient);
recipientDao.addRecipient(recipient);
}
/**

Updates an existing recipient in the database.
@param recipient The RecipientsDTO object to update.
@throws ValidationException if the recipient is invalid.
*/
public void updateRecipient(RecipientsDTO recipient) throws ValidationException{
cleanRecipient(recipient);
validateRecipient(recipient);
recipientDao.updateRecipient(recipient);
}
/**

Prints the column attributes of the recipient data table.
*/
public void printColumAttribute(){
recipientDao.printColumAttributes();
}
/**

Deletes a recipient from the database.
@param recipient The RecipientsDTO object to delete.
*/
public void deleteRecipient(RecipientsDTO recipient){
recipientDao.deleteRecipient(recipient);
}
/**

Removes leading and trailing whitespace from the recipient's name.
@param recipient The RecipientsDTO object to clean.
*/
private void cleanRecipient(RecipientsDTO recipient){
if(recipient.getName() != null){
recipient.setName(recipient.getName().trim());
}
}
/**

Validates a recipient's name.
@param recipient The RecipientsDTO object to validate.
@throws ValidationException if the name is invalid.
*/
private void validateRecipient(RecipientsDTO recipient) throws ValidationException{
validateString(recipient.getName(), "Name", NAME_MAX_LENGTH, true);
}

private void validateString(String value, String fieldName, int maxLength, boolean isNullAllowed)
throws ValidationException {
            if(value == null && isNullAllowed){
            // return; // null permitted, nothing to validate
            } else if(value == null && ! isNullAllowed){
            throw new ValidationException(String.format("%s cannot be null",
            fieldName));
            } else if(value.length() == 0){
            throw new ValidationException(String.format("%s cannot be empty or only whitespace",
            fieldName));
            } else if(value.length() > maxLength){
            throw new ValidationException(String.format("%s cannot exceed %d characters",
            fieldName, maxLength));
            }
            }
            }