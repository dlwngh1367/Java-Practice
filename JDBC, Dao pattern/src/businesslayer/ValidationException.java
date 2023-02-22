/* File: ValidationException.java
 * Author: Juho Lee
 * Date: 2023.02.08
 * Description: Printing Recipients using JDBC and Dao pattern.
 */
package businesslayer;


            /**

            An exception that is thrown when data is not in a valid format.
            */
            public class ValidationException extends Exception {

            /**

            Constructs a new ValidationException with a default message.
            */
            public ValidationException(){
            super("Data not in valid format");
            }
            /**

            Constructs a new ValidationException with the given message.
            @param message the message to be associated with the exception
            */
            public ValidationException(String message){
            super(message);
            }
            /**

            Constructs a new ValidationException with the given message and cause.
            @param message the message to be associated with the exception
            @param throwable the cause of the exception
            */
            public ValidationException(String message, Throwable throwable){
            super(message, throwable);
            }
            /**

            Constructs a new ValidationException with the given cause.
            @param throwable the cause of the exception
            */
            public ValidationException(Throwable throwable){
            super(throwable);
            }
            }
