package com.PheonixVX.FabricModGenerator.generateFiles;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class gradleproperties {

    public static void generateGradleProperties(String filePath, ArrayList properties) {
        try {
            File file = new File(filePath + File.separator + "gradle.properties");
            if (file.createNewFile()) {
                JOptionPane.showMessageDialog(null, "gradle.properties created at " + file.toPath());
                FileWriter fileWriter = new FileWriter(file.toPath().toString());
                fileWriter.write("# Done to increase the memory available to gradle. \n");
                fileWriter.write("org.gradle.jvmargs=-Xmx1G\n");
                fileWriter.write("\n# Fabric Properties\n");
                fileWriter.write("\t\t# check these on https://fabricmc.net/use\n");
                fileWriter.write("\t\tminecraft_version=1.16.1\n");
                fileWriter.write("\t\tyarn_mappings=1.16.1+build.1\n");
                fileWriter.write("\t\tloader_version=0.8.8+build.202\n");
                fileWriter.write("\n# Mod Properties\n");
                fileWriter.write("\t\tmod_version = " + properties.get(2) + "\n");
                fileWriter.write("\t\tmaven_group = " + properties.get(3) + "\n");
                fileWriter.write("\t\tarchives_base_name = " + properties.get(1).toString().toLowerCase().replace(" ", "-") + "\n");
                fileWriter.write("\n# Dependencies\n");
                fileWriter.write("\t\t# currently not on the main fabric site, check on the maven: https://maven.fabricmc.net/net/fabricmc/fabric-api/fabric-api\n");
                fileWriter.write("\t\tfabric_version=0.13.1+build.370-1.16");
                fileWriter.close();
            } else {
                JOptionPane.showMessageDialog(null, "gradle.properties exists or could not be created!!!");
            }
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, "gradle.properties failed to create!");
            e.printStackTrace();
        }
    }
}
