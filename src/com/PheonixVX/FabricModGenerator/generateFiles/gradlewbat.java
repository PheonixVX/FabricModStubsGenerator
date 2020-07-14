package com.PheonixVX.FabricModGenerator.generateFiles;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class gradlewbat {

    public static void creategradlewFile(String filePath) {
        // I ain't writing down this crap
        try {
            File file = new File(filePath + File.separator + "gradlew.bat");
            if (file.createNewFile()) {
                JOptionPane.showMessageDialog(null, "gradlew.bat created at " + file.toPath());
                FileWriter fileWriter = new FileWriter(file.toPath().toString());
                fileWriter.write("@rem\r\n" +
                        "@rem Copyright 2015 the original author or authors.\r\n" +
                        "@rem\r\n" +
                        "@rem Licensed under the Apache License, Version 2.0 (the \"License\");\r\n" +
                        "@rem you may not use this file except in compliance with the License.\r\n" +
                        "@rem You may obtain a copy of the License at\r\n" +
                        "@rem\r\n" +
                        "@rem      https://www.apache.org/licenses/LICENSE-2.0\r\n" +
                        "@rem\r\n" +
                        "@rem Unless required by applicable law or agreed to in writing, software\r\n" +
                        "@rem distributed under the License is distributed on an \"AS IS\" BASIS,\r\n" +
                        "@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\r\n" +
                        "@rem See the License for the specific language governing permissions and\r\n" +
                        "@rem limitations under the License.\r\n" +
                        "@rem\r\n\r" +
                        "\n" +
                        "@if \"%DEBUG%\" == \"\" @echo off\r\n" +
                        "@rem ##########################################################################\r\n" +
                        "@rem\r\n" +
                        "@rem  Gradle startup script for Windows\r\n" +
                        "@rem\r\n" +
                        "@rem ##########################################################################\r\n\r" +
                        "\n" +
                        "@rem Set local scope for the variables with windows NT shell\r\n" +
                        "if \"%OS%\"==\"Windows_NT\" setlocal\r\n\r" +
                        "\n" +
                        "set DIRNAME=%~dp0\r\n" +
                        "if \"%DIRNAME%\" == \"\" set DIRNAME=.\r\n" +
                        "set APP_BASE_NAME=%~n0\r\n" +
                        "set APP_HOME=%DIRNAME%\r\n\r" +
                        "\n" +
                        "@rem Resolve any \".\" and \"..\" in APP_HOME to make it shorter.\r\n" +
                        "for %%i in (\"%APP_HOME%\") do set APP_HOME=%%~fi\r\n\r" +
                        "\n" +
                        "@rem Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.\r\n" +
                        "set DEFAULT_JVM_OPTS=\"-Xmx64m\" \"-Xms64m\"\r\n\r" +
                        "\n" +
                        "@rem Find java.exe\r\n" +
                        "if defined JAVA_HOME goto findJavaFromJavaHome\r\n\r" +
                        "\n" +
                        "set JAVA_EXE=java.exe\r\n" +
                        "%JAVA_EXE% -version >NUL 2>&1\r\n" +
                        "if \"%ERRORLEVEL%\" == \"0\" goto init\r\n\r" +
                        "\n" +
                        "echo.\r\n" +
                        "echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.\r\n" +
                        "echo.\r\n" +
                        "echo Please set the JAVA_HOME variable in your environment to match the\r\n" +
                        "echo location of your Java installation.\r\n\r" +
                        "\n" +
                        "goto fail\r\n\r" +
                        "\n" +
                        ":findJavaFromJavaHome\r\n" +
                        "set JAVA_HOME=%JAVA_HOME:\"=%\r\n" +
                        "set JAVA_EXE=%JAVA_HOME%/bin/java.exe\r\n\r" +
                        "\n" +
                        "if exist \"%JAVA_EXE%\" goto init\r\n\r" +
                        "\n" +
                        "echo.\r\n" +
                        "echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%\r\n" +
                        "echo.\r\n" +
                        "echo Please set the JAVA_HOME variable in your environment to match the\r\n" +
                        "echo location of your Java installation.\r\n\r" +
                        "\n" +
                        "goto fail\r\n\r" +
                        "\n" +
                        ":init\r\n" +
                        "@rem Get command-line arguments, handling Windows variants\r\n\r" +
                        "\n" +
                        "if not \"%OS%\" == \"Windows_NT\" goto win9xME_args\r\n\r" +
                        "\n" +
                        ":win9xME_args\r\n" +
                        "@rem Slurp the command line arguments.\r\n" +
                        "set CMD_LINE_ARGS=\r\n" +
                        "set _SKIP=2\r\n\r" +
                        "\n" +
                        ":win9xME_args_slurp\r\n" +
                        "if \"x%~1\" == \"x\" goto execute\r\n\r" +
                        "\n" +
                        "set CMD_LINE_ARGS=%*\r\n\r" +
                        "\n" +
                        ":execute\r\n" +
                        "@rem Setup the command line\r\n\r" +
                        "\n" +
                        "set CLASSPATH=%APP_HOME%\\gradle\\wrapper\\gradle-wrapper.jar\r\n\r" +
                        "\n" +
                        "@rem Execute Gradle\r\n" +
                        "\"%JAVA_EXE%\" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %GRADLE_OPTS% \"-Dorg.gradle.appname=%APP_BASE_NAME%\" -classpath \"%CLASSPATH%\" org.gradle.wrapper.GradleWrapperMain %CMD_LINE_ARGS%\r\n\r" +
                        "\n" +
                        ":end\r\n" +
                        "@rem End local scope for the variables with windows NT shell\r\n" +
                        "if \"%ERRORLEVEL%\"==\"0\" goto mainEnd\r\n\r" +
                        "\n" +
                        ":fail\r\n" +
                        "rem Set variable GRADLE_EXIT_CONSOLE if you need the _script_ return code instead of\r\n" +
                        "rem the _cmd.exe /c_ return code!\r\n" +
                        "if  not \"\" == \"%GRADLE_EXIT_CONSOLE%\" exit 1\r\n" +
                        "exit /b 1\r\n\r" +
                        "\n" +
                        ":mainEnd\r\n" +
                        "if \"%OS%\"==\"Windows_NT\" endlocal\r\n\r" +
                        "\n" +
                        ":omega");
                fileWriter.close();
            } else {
                JOptionPane.showMessageDialog(null, "gradlew.bat exists or could not be created!!!");
            }
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, "gradlew.bat failed to create!");
            e.printStackTrace();
        }
    }
}
