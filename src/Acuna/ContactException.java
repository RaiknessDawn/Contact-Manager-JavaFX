// Project:             Final
// Class:               ContactException
// Date:                04/11/2025
// Author:              Jason Acuna
// Description:         Custom exception class used to signal invalid 
//                      address input (state or zip) in the Contact class.
package Acuna;


public class ContactException extends Exception
{
    public ContactException(String message)
    {
        super(message);
    }
}

