/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactDetails;

/**
 *
 * @author Manish Kr Gupta
 */
public class ContactVO {

    private int contactId;
    private String name;
    private int contactNo;
    private String email;
    private String address;
    private int otherConatct;

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOtherConatct() {
        return otherConatct;
    }

    public void setOtherConatct(int otherConatct) {
        this.otherConatct = otherConatct;
    }

    
}
