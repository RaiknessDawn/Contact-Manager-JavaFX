// Project:             Final
// Class:               ContactBusiness
// Date:                04/11/2025
// Author:              Jason Acuna
// Description:         Subclass of Contact that represents a Business contact.
//                      Adds an extra field to store the company name.
//                      Overrides toString to include the company.
//                      Throws ContactException for invalid address input.
package Acuna;

public class ContactBusiness extends Contact {
    private String company;

    public ContactBusiness(String name, String email, String phone, 
                           String street, String city, String state, String zip, 
                           ContactType type, String company) throws ContactException {
        super(name, email, phone, street, city, state, zip, type);
        this.company = company;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + company;
    }
    @Override
    public String toFile() {
    return super.toFile() + "," + company;
}
}
