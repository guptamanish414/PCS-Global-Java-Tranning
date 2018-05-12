package ConatctMain;

import ContactDetails.AdminDetailsDAO;
import ContactDetails.ConatactAdminVO;
import ContactDetails.ContactMangementFlow;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Manish Kr Gupta
 */
public class ContactMain {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        AdminDetailsDAO adminDetailsDAO = new AdminDetailsDAO();
        ConatactAdminVO contactAdminVO = new ConatactAdminVO();
        boolean result = false;
       
        try {
            String username = null;
            String password = null;

            System.out.println("Enter Admin User Name");
            username = br.readLine();
            contactAdminVO.setUsername(username);
            System.out.println("Enter Admin Password");
            password = br.readLine();
            contactAdminVO.setPassword(password);
            result = adminDetailsDAO.checkAdminDetails(contactAdminVO);
            if (result) {
               ContactMangementFlow contactMangementFlow = new ContactMangementFlow();
               contactMangementFlow.contactFlows();
            } else {
                System.out.println("Please Provide correct details....");
            }
        } catch (Exception e) {
            System.out.println("Error  is System...!!!! Please contact to System manager..!!");
        }
    }
}
