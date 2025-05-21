// Project:             Final
// Class:               ContactFriend
// Date:                04/11/2025
// Author:              Jason Acuna
// Description:         Subclass of Contact that represents a Friend contact.
//                      Adds an extra field to store the year the user met this contact.
//                      Overrides toString to include the year met.
//                      Throws ContactException for invalid address input                      
package Acuna;

public class ContactFriend extends Contact {
    private int yearMet;

    public ContactFriend(String name, String email, String phone, 
                         String street, String city, String state, String zip, 
                         ContactType type, int yearMet) throws ContactException {
        super(name, email, phone, street, city, state, zip, type);
        this.yearMet = yearMet;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + yearMet;
    }
    @Override
    public String toFile() {
    return super.toFile() + "," + yearMet;
}
}
