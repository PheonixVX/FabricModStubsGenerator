package com.PheonixVX.FabricModGenerator.generateFiles;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class gitignore {

    public static void createGitIgnore(String filePath) {
        try {
            File file = new File(filePath + File.separator + ".gitignore");
            if (file.createNewFile()) {
                JOptionPane.showMessageDialog(null, ".gitignore created at " + file.toPath());
                FileWriter fileWriter = new FileWriter(file.toPath().toString());
                fileWriter.write("# gradle\r\n\r" +
                        "\n" +
                        ".gradle/\r\n" +
                        "build/\r\n" +
                        "out/\r\n" +
                        "classes/\r\n\r" +
                        "\n" +
                        "# eclipse\r\n\r" +
                        "\n" +
                        "*.launch\r\n\r" +
                        "\n" +
                        "# idea\r\n\r" +
                        "\n" +
                        ".idea/\r\n" +
                        "*.iml\r\n" +
                        "*.ipr\r\n" +
                        "*.iws\r\n\r" +
                        "\n" +
                        "# vscode\r\n\r" +
                        "\n" +
                        ".settings/\r\n" +
                        ".vscode/\r\n" +
                        "bin/\r\n" +
                        ".classpath\r\n" +
                        ".project\r\n\r" +
                        "\n" +
                        "# fabric\r\n\r" +
                        "\n" +
                        "run/");
                fileWriter.close();
            } else {
                JOptionPane.showMessageDialog(null, ".gitignore exists or could not be created!!!");
            }
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, ".gitignore failed to create!");
            e.printStackTrace();
        }
    }
}
