/* File: RecipientsDTO.java
 * Author: Juho Lee
 * Date: 2023.02.08
 * Description: Printing Recipients using JDBC and Dao pattern.
 */
package transferobjects;

/**

A data transfer object (DTO) class for recipients of awards.
*/
public class RecipientsDTO {
private Integer awardID;
private String name;
private Integer year;
private String city;
private String category;

/**

Gets the ID of the award for this recipient.
@return the award ID
*/
public Integer getAwardID() {
return awardID;
}
/**

Sets the ID of the award for this recipient.
@param awardID the award ID to set
*/
public void setAwardID(Integer awardID) {
this.awardID = awardID;
}
/**

Gets the name of this recipient.
@return the name
*/
public String getName() {
return name;
}
/**

Sets the name of this recipient.
@param name the name to set
*/
public void setName(String name) {
this.name = name;
}
/**

Gets the year in which this recipient received the award.
@return the year
*/
public Integer getYear() {
return year;
}
/**

Sets the year in which this recipient received the award.
@param year the year to set
*/
public void setYear(Integer year) {
this.year = year;
}
/**

Gets the city in which this recipient is located.
@return the city
*/
public String getCity() {
return city;
}
/**

Sets the city in which this recipient is located.
@param city the city to set
*/
public void setCity(String city) {
this.city = city;
}
/**

Gets the category of award for which this recipient received the award.
@return the category
*/
public String getCategory() {
return category;
}
/**

Sets the category of award for which this recipient received the award.
@param category the category to set
*/
public void setCategory(String category) {
this.category = category;
}
}