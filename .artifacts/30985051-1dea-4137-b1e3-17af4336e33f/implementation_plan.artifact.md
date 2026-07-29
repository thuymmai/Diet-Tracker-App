# Fix "cannot find symbol variable buttonlogin" in WelcomeActivity

The build is failing because `WelcomeActivity.java` attempts to reference `R.id.buttonlogin`, which is missing from its layout file `activity_welcome.xml`. Additionally, `R.id.textMessage` is missing from the layout, and `ViewFoodItem.class` appears to be a missing or renamed class.

## Proposed Changes

### [Layouts]

#### [MODIFY] [activity_welcome.xml](file:///C:/Project group/app/src/main/res/layout/activity_welcome.xml)
- Add a Login button with ID `buttonlogin`.
- Add a TextView with ID `textMessage` to display login feedback.
- Update the title text from "Create new account" to "Welcome / Login".

### [Java]

#### [MODIFY] [WelcomeActivity.java](file:///C:/Project group/app/src/main/java/com/example/diettracker/WelcomeActivity.java)
- Update the success Intent to point to `HomeActivity.class` instead of the missing `ViewFoodItem.class`.

## Verification Plan

### Automated Tests
- Run `./gradlew :app:compileDebugJavaWithJavac` to verify the project builds successfully.

### Manual Verification
- N/A (Build fix)
