import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.ArrayList;

public class main {

public static ArrayList<Item> shoppingCart = new ArrayList<Item>();

    public static void main(String[] args) {

    }

    public static void Login() {
        User newLogin = new User();
        int loginAttempt = 0;
        boolean loggedIn = false;
        do {
        String userName = "test"; //get username form website

        String passWord = " test"; // get password from website

        //add code to search database for userName
        if (/* username has been found */) {
            //check if password is correct

                if (/* password is correct*/) {
                    newLogin.setUserName(userName);
                    loggedIn = true;
                    double userId = 420; //get from database
                    newLogin.setUserId(userId);
                } else {
                    loginAttempt++;
                    System.out.println("Password is incorrect"); // have this displayed to website
                    //have user renter password
                }
            }
        else{
                System.out.println("User not found"); //have this displayed to website
// need to finish logic
            }
        } while (loggedIn = false && loginAttempt < 3);
        if (loginAttempt >= 3) {
            System.out.println("Login locked"); // display something similar
            // exit website
            System.exit(1);
        }

    }
public static void Logout(User newLogin){
        //should clear out the data
        newLogin.setUserId(0);
        newLogin.setUserName("");

        //exit website

    System.exit(0);


}
public static void addCart(){
        // get from database
    String name = "";
     int itemId = - 0;
     double price = 0;
     double discountPercent = 0;
     double discountFlat = 0;
     int quantity = 0 ;
        Item aItem = new Item(name, itemId, price, discountPercent, discountFlat, quantity );
        shoppingCart.add(aItem);

}
public void removeCart(int unwantedItemId){
    if(shoppingCart.indexOf(unwantedItemId) != -1) {
        shoppingCart.remove(shoppingCart.indexOf(unwantedItemId));
    }
    else {
        System.out.println("Item not found"); // display something similar.
    }

}

    public static byte[] encryptPassword (String password) {
        byte[] encryptedData = new byte[0];
        try {
            AES_ENCRYPTION aes_encryption = new AES_ENCRYPTION();
            aes_encryption.init();
            encryptedData = aes_encryption.encrypt(password);


        } catch (Exception ignored) {
        }
        return encryptedData;
    }
    public static String decryptPassword(byte[] password) {
        String decryptedData = null;
        try {
            AES_ENCRYPTION aes_encryption = new AES_ENCRYPTION();
            aes_encryption.init();
            decryptedData = aes_encryption.decrypt(password);


        } catch (Exception ignored) {
        }
        return decryptedData;

    }

    public static void createAccount() {

        String userName;
        String fName;
        String lName;
        String unsafePassword;
        boolean match = false;

        // have user input data

        // pull list of usernames from database and make array
        String[] names = new String[];
        for (int j = 0, j < getNamesCount().size) // this line needs to be finished


        // search database for a matching username
        for (int i = 0; i < names.length || true; i++){
            if (userName.equalsIgnoreCase(names[i])){
                match = true;
                System.out.println("username taken please try another"); // display to website
            }

            }
        byte[] safePassword = encryptPassword(unsafePassword);

        //send userName, fName, lName, safePassword to database.


    }


}
