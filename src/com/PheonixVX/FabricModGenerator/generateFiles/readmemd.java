package com.PheonixVX.FabricModGenerator.generateFiles;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class readmemd {

    public static void createReadMe(String filePath) {

        try {
            File file = new File(filePath + File.separator + "readme.md");
            if (file.createNewFile()) {
                JOptionPane.showMessageDialog(null, "Readme.MD created at " + file.toPath());
                FileWriter fileWriter = new FileWriter(file.toPath().toString());
                fileWriter.write("# Fabric Example Mod\n\n");
                fileWriter.write("## Setup\n\n");
                fileWriter.write("For setup instructions please see the [fabric wiki page](https://fabricmc.net/wiki/tutorial:setup) that relates to the IDE that you are using.\n\n");
                fileWriter.write("## License\n\n");
                fileWriter.write("This template is available under the CC0 license. Feel free to learn from it and incorporate it in your own projects.\n");
                fileWriter.close();
            } else {
                JOptionPane.showMessageDialog(null, "Readme.MD exists or could not be created!!!");
            }
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Readme.MD failed to create!");
            e.printStackTrace();
        }
    }
}
