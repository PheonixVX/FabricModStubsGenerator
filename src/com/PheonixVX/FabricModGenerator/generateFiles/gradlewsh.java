package com.PheonixVX.FabricModGenerator.generateFiles;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class gradlewsh {

    public static void createGradlewSH(String filePath) {
        // I definitely used an auto formatter for this
        try{
            File file = new File(filePath + File.separator + "gradlew");
            if (file.createNewFile()) {
                JOptionPane.showMessageDialog(null, "gradlew created at " + file.toPath());
                FileWriter fileWriter = new FileWriter(file.toPath().toString());
                fileWriter.write("#!/usr/bin/env sh\r\n\r" +
                        "\n" +
                        "#\r\n" +
                        "# Copyright 2015 the original author or authors.\r\n" +
                        "#\r\n" +
                        "# Licensed under the Apache License, Version 2.0 (the \"License\");\r\n" +
                        "# you may not use this file except in compliance with the License.\r\n" +
                        "# You may obtain a copy of the License at\r\n" +
                        "#\r\n" +
                        "#      https://www.apache.org/licenses/LICENSE-2.0\r\n" +
                        "#\r\n" +
                        "# Unless required by applicable law or agreed to in writing, software\r\n" +
                        "# distributed under the License is distributed on an \"AS IS\" BASIS,\r\n" +
                        "# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\r\n" +
                        "# See the License for the specific language governing permissions and\r\n" +
                        "# limitations under the License.\r\n" +
                        "#\r\n\r" +
                        "\n" +
                        "##############################################################################\r\n" +
                        "##\r\n" +
                        "##  Gradle start up script for UN*X\r\n" +
                        "##\r\n" +
                        "##############################################################################\r\n\r" +
                        "\n" +
                        "# Attempt to set APP_HOME\r\n" +
                        "# Resolve links: $0 may be a link\r\n" +
                        "PRG=\"$0\"\r\n" +
                        "# Need this for relative symlinks.\r\n" +
                        "while [ -h \"$PRG\" ] ; do\r\n" +
                        "    ls=`ls -ld \"$PRG\"`\r\n" +
                        "    link=`expr \"$ls\" : '.*-> \\(.*\\)$'`\r\n" +
                        "    if expr \"$link\" : '/.*' > /dev/null; then\r\n" +
                        "        PRG=\"$link\"\r\n" +
                        "    else\r\n" +
                        "        PRG=`dirname \"$PRG\"`\"/$link\"\r\n" +
                        "    fi\r\n" +
                        "done\r\n" +
                        "SAVED=\"`pwd`\"\r\n" +
                        "cd \"`dirname \\\"$PRG\\\"`/\" >/dev/null\r\n" +
                        "APP_HOME=\"`pwd -P`\"\r\n" +
                        "cd \"$SAVED\" >/dev/null\r\n\r" +
                        "\n" +
                        "APP_NAME=\"Gradle\"\r\n" +
                        "APP_BASE_NAME=`basename \"$0\"`\r\n\r" +
                        "\n" +
                        "# Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.\r\n" +
                        "DEFAULT_JVM_OPTS='\"-Xmx64m\" \"-Xms64m\"'\r\n\r" +
                        "\n" +
                        "# Use the maximum available, or set MAX_FD != -1 to use that value.\r\n" +
                        "MAX_FD=\"maximum\"\r\n\r" +
                        "\n" +
                        "warn () {\r\n" +
                        "    echo \"$*\"\r\n" +
                        "}\r\n\r" +
                        "\n" +
                        "die () {\r\n" +
                        "    echo\r\n" +
                        "    echo \"$*\"\r\n" +
                        "    echo\r\n" +
                        "    exit 1\r\n" +
                        "}\r\n\r" +
                        "\n" +
                        "# OS specific support (must be 'true' or 'false').\r\n" +
                        "cygwin=false\r\n" +
                        "msys=false\r\n" +
                        "darwin=false\r\n" +
                        "nonstop=false\r\n" +
                        "case \"`uname`\" in\r\n" +
                        "  CYGWIN* )\r\n" +
                        "    cygwin=true\r\n" +
                        "    ;;\r\n" +
                        "  Darwin* )\r\n" +
                        "    darwin=true\r\n" +
                        "    ;;\r\n" +
                        "  MINGW* )\r\n" +
                        "    msys=true\r\n" +
                        "    ;;\r\n" +
                        "  NONSTOP* )\r\n" +
                        "    nonstop=true\r\n" +
                        "    ;;\r\n" +
                        "esac\r\n\r" +
                        "\n" +
                        "CLASSPATH=$APP_HOME/gradle/wrapper/gradle-wrapper.jar\r\n\r" +
                        "\n" +
                        "# Determine the Java command to use to start the JVM.\r\n" +
                        "if [ -n \"$JAVA_HOME\" ] ; then\r\n" +
                        "    if [ -x \"$JAVA_HOME/jre/sh/java\" ] ; then\r\n" +
                        "        # IBM's JDK on AIX uses strange locations for the executables\r\n" +
                        "        JAVACMD=\"$JAVA_HOME/jre/sh/java\"\r\n" +
                        "    else\r\n" +
                        "        JAVACMD=\"$JAVA_HOME/bin/java\"\r\n" +
                        "    fi\r\n" +
                        "    if [ ! -x \"$JAVACMD\" ] ; then\r\n" +
                        "        die \"ERROR: JAVA_HOME is set to an invalid directory: $JAVA_HOME\r\n\r" +
                        "\n" +
                        "Please set the JAVA_HOME variable in your environment to match the\r\n" +
                        "location of your Java installation.\"\r\n" +
                        "    fi\r\n" +
                        "else\r\n" +
                        "    JAVACMD=\"java\"\r\n" +
                        "    which java >/dev/null 2>&1 || die \"ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.\r\n\r" +
                        "\n" +
                        "Please set the JAVA_HOME variable in your environment to match the\r\n" +
                        "location of your Java installation.\"\r\n" +
                        "fi\r\n\r" +
                        "\n" +
                        "# Increase the maximum file descriptors if we can.\r\n" +
                        "if [ \"$cygwin\" = \"false\" -a \"$darwin\" = \"false\" -a \"$nonstop\" = \"false\" ] ; then\r\n" +
                        "    MAX_FD_LIMIT=`ulimit -H -n`\r\n" +
                        "    if [ $? -eq 0 ] ; then\r\n" +
                        "        if [ \"$MAX_FD\" = \"maximum\" -o \"$MAX_FD\" = \"max\" ] ; then\r\n" +
                        "            MAX_FD=\"$MAX_FD_LIMIT\"\r\n" +
                        "        fi\r\n" +
                        "        ulimit -n $MAX_FD\r\n" +
                        "        if [ $? -ne 0 ] ; then\r\n" +
                        "            warn \"Could not set maximum file descriptor limit: $MAX_FD\"\r\n" +
                        "        fi\r\n" +
                        "    else\r\n" +
                        "        warn \"Could not query maximum file descriptor limit: $MAX_FD_LIMIT\"\r\n" +
                        "    fi\r\n" +
                        "fi\r\n\r" +
                        "\n" +
                        "# For Darwin, add options to specify how the application appears in the dock\r\n" +
                        "if $darwin; then\r\n" +
                        "    GRADLE_OPTS=\"$GRADLE_OPTS \\\"-Xdock:name=$APP_NAME\\\" \\\"-Xdock:icon=$APP_HOME/media/gradle.icns\\\"\"\r\n" +
                        "fi\r\n\r" +
                        "\n" +
                        "# For Cygwin or MSYS, switch paths to Windows format before running java\r\n" +
                        "if [ \"$cygwin\" = \"true\" -o \"$msys\" = \"true\" ] ; then\r\n" +
                        "    APP_HOME=`cygpath --path --mixed \"$APP_HOME\"`\r\n" +
                        "    CLASSPATH=`cygpath --path --mixed \"$CLASSPATH\"`\r\n" +
                        "    JAVACMD=`cygpath --unix \"$JAVACMD\"`\r\n\r" +
                        "\n" +
                        "    # We build the pattern for arguments to be converted via cygpath\r\n" +
                        "    ROOTDIRSRAW=`find -L / -maxdepth 1 -mindepth 1 -type d 2>/dev/null`\r\n" +
                        "    SEP=\"\"\r\n" +
                        "    for dir in $ROOTDIRSRAW ; do\r\n" +
                        "        ROOTDIRS=\"$ROOTDIRS$SEP$dir\"\r\n" +
                        "        SEP=\"|\"\r\n" +
                        "    done\r\n" +
                        "    OURCYGPATTERN=\"(^($ROOTDIRS))\"\r\n" +
                        "    # Add a user-defined pattern to the cygpath arguments\r\n" +
                        "    if [ \"$GRADLE_CYGPATTERN\" != \"\" ] ; then\r\n" +
                        "        OURCYGPATTERN=\"$OURCYGPATTERN|($GRADLE_CYGPATTERN)\"\r\n" +
                        "    fi\r\n" +
                        "    # Now convert the arguments - kludge to limit ourselves to /bin/sh\r\n" +
                        "    i=0\r\n" +
                        "    for arg in \"$@\" ; do\r\n" +
                        "        CHECK=`echo \"$arg\"|egrep -c \"$OURCYGPATTERN\" -`\r\n" +
                        "        CHECK2=`echo \"$arg\"|egrep -c \"^-\"`                                 ### Determine if an option\r\n\r" +
                        "\n" +
                        "        if [ $CHECK -ne 0 ] && [ $CHECK2 -eq 0 ] ; then                    ### Added a condition\r\n" +
                        "            eval `echo args$i`=`cygpath --path --ignore --mixed \"$arg\"`\r\n" +
                        "        else\r\n" +
                        "            eval `echo args$i`=\"\\\"$arg\\\"\"\r\n" +
                        "        fi\r\n" +
                        "        i=`expr $i + 1`\r\n" +
                        "    done\r\n" +
                        "    case $i in\r\n" +
                        "        0) set -- ;;\r\n" +
                        "        1) set -- \"$args0\" ;;\r\n" +
                        "        2) set -- \"$args0\" \"$args1\" ;;\r\n" +
                        "        3) set -- \"$args0\" \"$args1\" \"$args2\" ;;\r\n" +
                        "        4) set -- \"$args0\" \"$args1\" \"$args2\" \"$args3\" ;;\r\n" +
                        "        5) set -- \"$args0\" \"$args1\" \"$args2\" \"$args3\" \"$args4\" ;;\r\n" +
                        "        6) set -- \"$args0\" \"$args1\" \"$args2\" \"$args3\" \"$args4\" \"$args5\" ;;\r\n" +
                        "        7) set -- \"$args0\" \"$args1\" \"$args2\" \"$args3\" \"$args4\" \"$args5\" \"$args6\" ;;\r\n" +
                        "        8) set -- \"$args0\" \"$args1\" \"$args2\" \"$args3\" \"$args4\" \"$args5\" \"$args6\" \"$args7\" ;;\r\n" +
                        "        9) set -- \"$args0\" \"$args1\" \"$args2\" \"$args3\" \"$args4\" \"$args5\" \"$args6\" \"$args7\" \"$args8\" ;;\r\n" +
                        "    esac\r\n" +
                        "fi\r\n\r" +
                        "\n" +
                        "# Escape application args\r\n" +
                        "save () {\r\n" +
                        "    for i do printf %s\\\\n" +
                        " \"$i\" | sed \"s/'/'\\\\\\\\''/g;1s/^/'/;\\$s/\\$/' \\\\\\\\/\" ; done\r\n" +
                        "    echo \" \"\r\n" +
                        "}\r\n" +
                        "APP_ARGS=`save \"$@\"`\r\n\r" +
                        "\n" +
                        "# Collect all arguments for the java command, following the shell quoting and substitution rules\r\n" +
                        "eval set -- $DEFAULT_JVM_OPTS $JAVA_OPTS $GRADLE_OPTS \"\\\"-Dorg.gradle.appname=$APP_BASE_NAME\\\"\" -classpath \"\\\"$CLASSPATH\\\"\" org.gradle.wrapper.GradleWrapperMain \"$APP_ARGS\"\r\n\r" +
                        "\n" +
                        "exec \"$JAVACMD\" \"$@\"");
                fileWriter.close();
            } else {
                JOptionPane.showMessageDialog(null, "gradlew exists or could not be created!!!");
            }
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, "gradlew failed to create!");
            e.printStackTrace();
        }
    }
}
