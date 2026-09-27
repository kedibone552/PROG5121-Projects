/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programming1apoe;

/**
 *
 * @author ST10522809
 */
public class Login {

    // Variables used to store the user's registration details
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String cellPhoneNumber;

    /**
     * Constructor to store the user's personal details.
     */
    public Login(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Checks whether the username contains an underscore
     * and is no more than five characters long.
     */
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    /**
     * Checks whether the password:
     * - Contains at least eight characters
     * - Contains a capital letter
     * - Contains a number
     * - Contains a special character
     */
    public boolean checkPasswordComplexity(String password) {
        return password.length() >= 8
                && password.matches(".*[A-Z].*")
                && password.matches(".*[0-9].*")
                && password.matches(".*[^a-zA-Z0-9].*");
    }

    /**
     * Checks whether the South African cell phone number
     * contains the international code +27 and nine digits after it.
     *
     * The regular expression is used to validate the number.
     */
    public boolean checkCellPhoneNumber(String cellPhoneNumber) {
        return cellPhoneNumber.matches("^\\+27[0-9]{9}$");
    }

    /**
     * Registers the user and returns the appropriate messages.
     */
    public String registerUser(String username, String password,
            String cellPhoneNumber) {

        if (!checkUserName(username)) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }

        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }

        if (!checkCellPhoneNumber(cellPhoneNumber)) {
            return "Cell phone number incorrectly formatted or does not contain international code.";
        }

        this.username = username;
        this.password = password;
        this.cellPhoneNumber = cellPhoneNumber;

        return "Username successfully captured.\n"
                + "Password successfully captured.\n"
                + "Cell phone number successfully added.";
    }

    /**
     * Checks whether the entered login details match
     * the username and password saved during registration.
     */
    public boolean loginUser(String enteredUsername,
            String enteredPassword) {

        return enteredUsername.equals(this.username)
                && enteredPassword.equals(this.password);
    }

    /**
     * Returns the login status message.
     */
    public String returnLoginStatus(boolean loginSuccessful) {

        if (loginSuccessful) {
            return "Welcome " + firstName + " " + lastName
                    + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}

