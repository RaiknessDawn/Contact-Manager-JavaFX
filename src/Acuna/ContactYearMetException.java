// Project:             Final
// Class:               ContactYearMetException
// Date:                05/02/2025
// Author:              Jason Acuna
// Description:         Custom exception thrown when the yearMet is not in the valid range 1950–2025.

package Acuna;

public class ContactYearMetException extends Exception {
    public ContactYearMetException(String message) {
        super(message);
    }
}