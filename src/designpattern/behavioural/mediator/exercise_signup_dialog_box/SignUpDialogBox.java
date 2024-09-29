package designpattern.behavioural.mediator.exercise_signup_dialog_box;

/**
 * We are using a third-party GUI framework for building an application.
 * We need to build a dialog box for a new user to sign up. On this dialog
 * box we need three UI elements:
 * - A text box to enter a username
 * - A text box to enter a password
 * - A checkbox to agree with the terms
 * - A signup button
 * The signup button is only enabled if both text boxes are filled out
 * and the checkbox is checked.
 * Use the mediator pattern with the observer pattern to implement the
 * coordination between these elements in this class
 */

public class SignUpDialogBox {
    private TextBox usernameTextBox = new TextBox();
    private TextBox passwordTextBox = new TextBox();
    private CheckBox agreeToTermsCheckBox = new CheckBox();
    private Button signUpButton = new Button();

    public SignUpDialogBox() {
        usernameTextBox.addEventHandler(this::controlChanged);
        passwordTextBox.addEventHandler(this::controlChanged);
        agreeToTermsCheckBox.addEventHandler(this::controlChanged);
    }

    private void controlChanged() {
        signUpButton.setEnabled(isFormValid());
    }

    private boolean isFormValid() {
        return !usernameTextBox.isEmpty() && !passwordTextBox.isEmpty() && agreeToTermsCheckBox.isChecked();
    }

    public void simulateUserInteraction() {
        // Initially the button should be disabled
        System.out.println("Initially: " + signUpButton.isEnabled());

        // The user enters their username, the button is still disabled
        usernameTextBox.setContent("username");
        System.out.println("After setting the username: " + signUpButton.isEnabled());

        // The user enters their password, the button is still disabled
        passwordTextBox.setContent("password");
        System.out.println("After setting the password: " + signUpButton.isEnabled());

        // The agrees to the terms, the button becomes enabled
        agreeToTermsCheckBox.setChecked(true);
        System.out.println("After agreeing to terms: " + signUpButton.isEnabled());

        // The user removes the password, the button becomes disabled
        passwordTextBox.setContent("");
        System.out.println("After removing the password: " + signUpButton.isEnabled());

        // The user enters the password again, the button becomes enabled
        passwordTextBox.setContent("password");
        System.out.println("After re-setting the password: " + signUpButton.isEnabled());
    }
}
