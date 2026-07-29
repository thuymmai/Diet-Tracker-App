# Implementation Plan - Fix Missing Symbols in WelcomeActivity

The `WelcomeActivity` fails to compile because it references `R.id.buttonlogin` and `R.id.txtmessage`, which are missing from its layout file `activity_welcome.xml`. Additionally, the layout file currently appears to be a copy of the registration layout (displaying "Create new account").

## Proposed Changes

### [Component Name] app resources

#### [MODIFY] [activity_welcome.xml](file:///C:/Project group/app/src/main/res/layout/activity_welcome.xml)
- Update the header `TextView` (currently `textView`) to display "Login" instead of "Create new account".
- Add a `Button` with ID `@+id/buttonlogin` for the login action.
- Add a `TextView` with ID `@+id/txtmessage` for displaying error messages (initially hidden).
- Ensure `buttonregister` is still present as it is used to navigate to the registration screen.

## Verification Plan

### Automated Tests
- Run `./gradlew :app:assembleDebug` to ensure the project compiles successfully.

### Manual Verification
- N/A (UI layout fix, verified by compilation)
