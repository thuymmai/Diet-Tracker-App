# Fix "cannot find symbol variable buttonlogin" in WelcomeActivity

The `WelcomeActivity` class fails to compile because it references `R.id.buttonlogin` and `R.id.txtmessage`, which are not defined in the associated layout file `activity_welcome.xml`. The layout file currently appears to be a duplicate of the registration screen and is missing the login button and the error message text view.

## Proposed Changes

### [Component Name] Layout Fixes

#### [MODIFY] [activity_welcome.xml](file:///C:/Project group/app/src/main/res/layout/activity_welcome.xml)

Update the layout to include the missing elements and adjust the UI to reflect a Welcome/Login screen.

- Change the header text from "Create new account" to "Welcome back".
- Add a `Button` with ID `@+id/buttonlogin` labeled "Login".
- Add a `TextView` with ID `@+id/txtmessage` to display login feedback.
- Organize the Login and Register buttons.

## Verification Plan

### Automated Tests
- Run the build command to ensure the compilation error is resolved:
  `./gradlew :app:compileDebugJavaWithJavac`

### Manual Verification
- Deploy the app to a device/emulator and verify that the Welcome screen shows both Login and Register buttons.
- Verify that clicking "Login" triggers the login logic and "Register" opens the registration screen.
