/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactDetails;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Manish Kr Gupta
 */
public class ContactMangementFlow {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean flag = false;
    String name = null, email = null, adds = null;
    int num = 0, othernums = 0;
    UserDetailsDAO userDetailsDAO = new UserDetailsDAO();
    ContactVO contactVO = new ContactVO();
    
    public void contactFlows() throws IOException {
        do {
            System.out.println("Let procesed Next Step.... ");
            System.out.println("Please Provide following Detials.....");
            System.out.println("Press 1 to Create New Contact");
            System.out.println("Press 2 to Modify Contact");
            System.out.println("Press 3 to Search a Contact");
            System.out.println("Press 4 to Delete a Contact");
            System.out.println("Press 5 to Display all  Contacts");
            
            int userinput = (Integer.parseInt(br.readLine()));
            
            switch (userinput) {
                case 1:
                    System.out.println("Enter Contact Name");
                    name = br.readLine();
                    contactVO.setName(name);
                    System.out.println("Enter Contact Number");
                    num = (Integer.parseInt(br.readLine()));
                    contactVO.setContactNo(num);
                    System.out.println("Enter Contact Email");
                    email = br.readLine();
                    contactVO.setEmail(email);
                    System.out.println("Enter Contact Address");
                    adds = br.readLine();
                    contactVO.setAddress(adds);
                    System.out.println("Enter Other Contact Number");
                    othernums = (Integer.parseInt(br.readLine()));
                    contactVO.setOtherConatct(othernums);
                    
                    int output = userDetailsDAO.insertContact(contactVO);
                    if (output > 0) {
                        System.out.println(output + " Contact Successfully Created");
                    } else {
                        System.out.println("Failed to Create....!!");
                    }
                    break;
                case 2:
                    userDetailsDAO.displayContact();
                    int r1;
                    System.out.println("Enter a Conatact number which you want to modify");
                    int num2;
                    try {
                        num2 = (Integer.parseInt(br.readLine()));
                        contactVO.setContactNo(num2);
                        System.out.println("Enter new Name of this Contact Number:");
                        name = br.readLine();
                        contactVO.setName(name);
                        r1 = userDetailsDAO.modifyContactName(contactVO);
                        
                        System.out.println("Enter new Email of this Contact Number:");
                        email = br.readLine();
                        contactVO.setEmail(email);
                        r1 = userDetailsDAO.modifyContactEmail(contactVO);
                        if (r1 > 0) {
                            System.out.println("Update Successfully..!!");
                            userDetailsDAO.displayContact();
                            ///userDetailsDAO.searchContact(name);
                        } else {
                            System.out.println("Updation Failure...!!");
                        }
                    } catch (Exception e) {
                        
                    }
                    break;
                case 3:
                    System.out.println("Enter a Conatact number or Contact Person name which you want to Seacrh");
                    String contactName = br.readLine();
                    boolean flag1 = userDetailsDAO.searchContact(contactName);
                    if (flag1 == false) {
                        System.out.println("Contact Not Found......");
                    }
                    
                    break;
                case 4:
                    System.out.println("Choose A Numner :");
                    userDetailsDAO.displayContact();
                    System.out.println("Enter a Conatact number which you want to Delete");
                    int no = (Integer.parseInt(br.readLine()));
                    int deletedResult = userDetailsDAO.deleteContact(no);
                    if (deletedResult > 0) {
                        System.out.println(deletedResult + "Record Deleted");
                    } else {
                        System.out.println("Delete not Performed.......!");
                    }
                    break;
                case 5:
                    System.out.println("----------Contact List-------------");
                    userDetailsDAO.displayContact();
                    break;
                default:
                    System.out.println("Please provide correct information.....!!!!");
                    break;
                
            }
            System.out.println("Do You Want to Continue!! Y/N");
            String condi = br.readLine();
            
            if (condi.equalsIgnoreCase("Y")) {
                flag = true;
            } else {
                System.out.println("Thank You for using Contact Management System.....");
                flag = false;
            }
            
        } while (flag);
        
    }
    
}
