# FASAL API AUTOMATION ASSIGNMENT


****************************************************************************
SYSTEM SETUP

1. Install Java 8 following steps in https://docs.oracle.com/javase/10/install/installation-jdk-and-jre-macos.htm
2. Install brew following steps in https://docs.brew.sh/Installation
3. Install maven by running command $brew install maven
4. Install Intellij Ide following steps in https://www.jetbrains.com/help/idea/installation-guide.html

****************************************************************************
RUNNING THE TEST

1. Open terminal
2. Change directory to root of project $cd <path-here>
3. Run command mvn clean test -Dsurefire.suiteXmlFiles=testng.xml

****************************************************************************
VIEWING REPORT

1. Navigate to /target/surefire-reports directory
2. Double click on index.html file

****************************************************************************
LEARNING RESOURCES

1. https://maven.apache.org/surefire/maven-surefire-plugin/examples/testng.html
2. https://medium.com/chaya-thilakumara/rest-assured-api-testing-part-1-e96a2f284a6e