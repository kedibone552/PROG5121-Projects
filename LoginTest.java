/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package programming1apoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class LoginTest {

    @Test
    public void testValidUsername() {
        Login user = new Login("Kedi", "Mathaba");

        assertTrue(user.checkUserName("kyl_1"));
    }

    @Test
    public void testInvalidUsername() {
        Login user = new Login("Kedi", "Mathaba");

        assertFalse(user.checkUserName("kyle!!!!!!!"));
    }

    @Test
    public void testValidPassword() {
        Login user = new Login("Kedi", "Mathaba");

        assertTrue(user.checkPasswordComplexity("Ch&&sec@ke99!"));
    }

    @Test
    public void testInvalidPassword() {
        Login user = new Login("Kedi", "Mathaba");

        assertFalse(user.checkPasswordComplexity("password"));
    }

    @Test
    public void testValidCellPhoneNumber() {
        Login user = new Login("Kedi", "Mathaba");

        assertTrue(user.checkCellPhoneNumber("+27838968976"));
    }

    @Test
    public void testInvalidCellPhoneNumber() {
        Login user = new Login("Kedi", "Mathaba");

        assertFalse(user.checkCellPhoneNumber("08966553"));
    }

    @Test
    public void testSuccessfulLogin() {
        Login user = new Login("Kedi", "Mathaba");

        user.registerUser(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976"
        );

        assertTrue(
                user.loginUser("kyl_1", "Ch&&sec@ke99!")
        );
    }

    @Test
    public void testFailedLogin() {
        Login user = new Login("Kedi", "Mathaba");

        user.registerUser(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976"
        );

        assertFalse(
                user.loginUser("wrong", "password")
        );
    }
}
