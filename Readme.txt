Dependencies:
1. The system should have java 1.8 or above installed.
2. Eclipse should point to Java1.8 sdk.

Running Canvas:
1. Unzip ConsoleCanvasApplication.zip in local directory.
2. Import the project into eclipse workbench as an "Existing maven project".The Java build path should point to jdk 1.8 system library. And also the Java Compiler compliance level should be 1.8.
3. Maven Build the project -> mvn clean install. 
4. To run the application, open the CanvasApp.java class,right click and run as a Java Application.
5. To run the test case, open the CanvasAppTest.java class,right click and run as a Java Application.
6. If maven is not installed in the system,please create a Java project in eclipse and copy the src folder.Then follow point number 4 and 5.

Future Enhancements:
1. Remove the switch case code in DrawingServiceImpl to a factory method, which will create and render different shapes as per the command.
2. Improve the bucketFiller method.
3. InputService and DrawingService API improvements.
4. Add more test cases to cover the negative scenario. Add integration tests.

Assumptions made:
1. While creating the Line or rectangle shape,checking the canvas for null.If its null,that means the canvas is not yet created 
   and I am creating a canvas instance first by manupulating the (x,y) co-ordinates for line or rectangle.