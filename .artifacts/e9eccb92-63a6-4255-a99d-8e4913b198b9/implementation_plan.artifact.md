# Fix Compilation Error: Class Name Mismatch in ViewMeal.java

The project fails to build because the class `MainActivity` is declared in a file named `ViewMeal.java`. In Java, a public class must match its filename. Additionally, the class incorrectly references `R.layout.activity_main`, which does not exist; it should reference `R.layout.activity_view_meal`.

## Proposed Changes

### [Diet Tracker App]

#### [MODIFY] [ViewMeal.java](file:///C:/Project group/app/src/main/java/com/example/diettracker/ViewMeal.java)
- Rename class `MainActivity` to `ViewMeal`.
- Update `setContentView` to use `R.layout.activity_view_meal` instead of `R.layout.activity_main`.

## Verification Plan

### Automated Tests
- Run `./gradlew :app:compileDebugJavaWithJavac` to verify that the compilation error is resolved.

### Manual Verification
- None required as this is a syntax/compilation fix.
