/* File: DataSource.java
 * Author: Juho Lee
 * Date: 2023. 02. 08
 * Description: Printing Recipients using JDBC and Dao pattern.
 * References:
 * Ram N. (2013).  Data Access Object Design Pattern or DAO Pattern [blog] Retrieved from
 * http://ramj2ee.blogspot.in/2013/08/data-access-object-design-pattern-or.html
 */
package dataaccesslayer;

import java.util.List;

import transferobjects.RecipientsDTO;

/**

A Data Access Object (DAO) interface for managing recipients of awards.
*/
public interface RecipientsDao {

/**

Retrieves a list of all recipients.
@return the list of all recipients
*/
List<RecipientsDTO> getAllRecipients();
/**

Retrieves the recipient with the given award ID.
@param awardID the award ID to search for
@return the recipient with the given award ID
*/
RecipientsDTO getRecipientByAwardId(Integer awardID);
/**

Adds a new recipient to the database.
@param recipient the recipient to add
*/
void addRecipient(RecipientsDTO recipient);
/**

Updates an existing recipient in the database.
@param recipient the recipient to update
*/
void updateRecipient(RecipientsDTO recipient);
/**

Deletes a recipient from the database.
@param recipient the recipient to delete
*/
void deleteRecipient(RecipientsDTO recipient);
/**

Prints the column attributes of the recipient table.
*/
public void printColumAttributes();
}