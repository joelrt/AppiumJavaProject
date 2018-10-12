## iOS - Appium Project

This sample provides a full iOS TestNG based test project that can be imported as java Eclipse or Intellij IDE project.
Below are listed the steps to go through to run your first test.


### 1) Requirements:

Download: 
- TestNG:
  `https://github.com/cbeust/testng`
- Selenium Server Standalone and Client:
  `https://selenium-release.storage.googleapis.com/3.14/selenium-server-standalone-3.14.0.jar`
  `https://goo.gl/9EV896`
- Appium server and client: 
  `https://github.com/appium/appium-desktop/releases/latest`  
  `https://search.maven.org/search?q=g:io.appium%20AND%20a:java-client`

### 2) Download the project:

Download the project "AppiumProject" from this repository and import it into Eclipse or Intellij IDE.

### 3) Modify parameters in class WebDriverManager (under /src/main/framework)

        
        //Update the iOS Version Eg. iPhone X
        capabilities.setCapability("deviceName", "iOS Version");
        
        //Update the iOS PhoneID Eg. 162725BD-9B7A-442B-98CA-0DD20EF38FD9
        capabilities.setCapability(MobileCapabilityType.UDID, "iOS mobile ID");
        
You will also see an URL that depends on the location of the device in use for the test
        
        driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

### 4) Run the test 

Run the test in your IDE and you will see its success.



