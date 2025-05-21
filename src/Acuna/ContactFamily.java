// Project:             Lab12
// Class:               ContactFamily
// Date:                04/11/2025
// Author:              Jason Acuna
// Description:         Subclass of Contact that represents a Family contact.
//                      Adds an extra field to store the relationship (e.g., sister, uncle).
//                      Overrides toString to include the relationship.
//                      Throws ContactException for invalid address input.
package Acuna;

public class ContactFamily extends Contact {
    private String relationship;

    public ContactFamily(String name, String email, String phone, 
                         String street, String city, String state, String zip, 
                         ContactType type, String relationship) throws ContactException {
        super(name, email, phone, street, city, state, zip, type);
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + relationship;
    }
    
    @Override
    public String toFile() {
    return super.toFile() + "," + relationship;
}
}

