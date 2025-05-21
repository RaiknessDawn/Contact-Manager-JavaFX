// Project:             Final
// Class:               Contact
// Date:                04/11/2025
// Author:              Jason Acuna
// Description:         This abstract class defines a generic contact with fields for 
//                      name, phone number, email, and address. It serves as a base 
//                      class for ContactBusiness, ContactFamily, and ContactFriend.
//                      Includes a nested Address class that validates inputs and throws
//                      ContactException for invalid state or zip.
//                      A static count tracks the number of Contact objects created.
package Acuna;


public abstract class Contact implements Comparable<Contact>
{

   public static void resetCount() {
   count = 0;
   }

   private String name;
   private String email;
   private String phone;
   private Address address;
   private ContactType type; 
   
   
   private static int count = 0;

    public Contact(String name, String email, String phone, 
            String street, String city, String state, String zip,
            ContactType type) throws ContactException
{
        this.name = name;
        this.email = email;
        this.phone = phone;
        
        // create the inner Address object
        this.address = new Address(street, city, state, zip);
        this.type = type;
        
        ++count;
}

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPhone()
    {
        return phone;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    @Override
    public String toString()
    {
    return name + ", " + phone + ", " + email + ", " + 
           address + ", " + type;
    }

    @Override
    public int compareTo(Contact contactObj)
    {
        return this.name.compareTo(contactObj.getName());
    }

    
private class Address 
{
    // private instance fields. 
    // Each object gets its own copy of the fields
    private String street;
    private String city;
    private String state;
    private String zip;
    
    // public constructor
    public Address(String street, String city, String state, String zip) throws ContactException
{
    this.street = street;
    this.city = city;
    this.state = state;
    this.zip = zip;
    
    // Call validation methods
    validateStreet();
    validateCity();
    validateState();
    validateZip();
}
    
    // Use Refactor - Encapsulate fields to generate the get an set methods.
    // Set javadoc to none.
    public String getStreet()
    {
        return street;
    }

    // Notice parameter and field name are the same.
    // this keyword to refer to objects fields
    public void setStreet(String street)
    {
    
        this.street = street;
        validateStreet();
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
        validateCity();
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state) throws ContactException
    {
        this.state = state;
        validateState();
    }

    public String getZip()
    {
        return zip;
    }

    public void setZip(String zip) throws ContactException
    {
        this.zip = zip;
        validateZip();
    }
        // toString method to display the fields in the class
        @Override
        public String toString()
        {
            return street + ", " + city + ", " + state + ", " + zip;
        }
    public void validateStreet()
    {
        if(street.length() > 10)
        {
            street = street.substring(0,10);
        }
    }
    public void validateCity()
    {
        if (!city.isEmpty()) {
        char first = city.charAt(0);
        first = Character.toUpperCase(first);
        city = first + city.substring(1);
        }
        
    }
    public final void validateState() throws ContactException
{
            // change to uppercase
            state = state.toUpperCase();
            if(state.length() != 2)
            {
                throw new ContactException("State: Not 2 characters");
            }
 }

    public final void validateZip() throws ContactException
{
            //use regex for match zip code
            if(!zip.matches("^\\d{5}$"))
            {
                throw new ContactException("Zip: Incorrect format");
            }
}
public String toFile() {
    return street + "," + city + "," + state + "," + zip;
}
}  

    
    public static int getCount()
    {
        return count;
    }
    public static enum ContactType
    {
    BUSINESS, FAMILY, FRIEND
    }
    public static void decrementCount() {
    --count;
}
// Lab12
public String toFile()
{
        return name + "," + phone + "," + email + "," + 
            address.toFile() + "," + type;
}

      
}
