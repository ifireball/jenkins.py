# Python Wrapper Maker #
*  This tool creates python wrapper (PW) classes for every descriptor and extension point out of the Jenkins source code directory.
*  E.g. for the `Builder.java` file creates a `BuilderPW.java` file, which can be used for the plugin development in Python.
*  These wrappers are included in the [python-wrapper](../python-wrapper) runtime plugin.
*  Build the PWM tool with maven `$ mvn package`
*  Run it with command `$ java -jar target/pwm.jar -i jenkins_source_code_directory`
