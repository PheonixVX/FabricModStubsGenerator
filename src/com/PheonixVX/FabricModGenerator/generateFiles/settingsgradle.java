package com.PheonixVX.FabricModGenerator.generateFiles;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class settingsgradle {

    public static void createSettingsFile(String filePath) {
        try {
            File file = new File(filePath + File.separator + "settings.gradle");
            if (file.createNewFile()) {
                JOptionPane.showMessageDialog(null, "Settings.gradle created at " + file.toPath());
                FileWriter fileWriter = new FileWriter(file.toPath().toString());
                fileWriter.write("pluginManagement {\n");
                fileWriter.write("\trepositories {\n");
                fileWriter.write("\t\tjcenter()\n");
                fileWriter.write("\t\tmaven {\n");
                fileWriter.write("\t\t\tname = 'Fabric'\n");
                fileWriter.write("\t\t\turl = 'https://maven.fabricmc.net/'\n");
                fileWriter.write("\t\t}\n");
                fileWriter.write("\t\tgradlePluginPortal()\n");
                fileWriter.write("\t}\n");
                fileWriter.write("}\n");
                fileWriter.close();
            } else {
                JOptionPane.showMessageDialog(null, "Settings.gradle exists or could not be created!!!");
            }
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Settings.gradle failed to create!");
            e.printStackTrace();
        }
    }
}
