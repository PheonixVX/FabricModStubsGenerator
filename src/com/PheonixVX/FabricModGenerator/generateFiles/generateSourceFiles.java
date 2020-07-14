package com.PheonixVX.FabricModGenerator.generateFiles;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class generateSourceFiles {

    public static void createSourceFiles(String filePath, String mainClass, String packageName, HashSet<String> extraOptions) {
        File files = new File(filePath + File.separator + "src" + File.separator + "main");
        if (!files.exists()) {
            if (files.mkdirs()) {
                System.out.println("Created folder at " + files.getAbsolutePath());
                File packageFiles = new File(files + File.separator + packageName.replace(".", File.separator));
                if (packageFiles.mkdirs()) {
                    try {
                        if (!mainClass.endsWith(".java")) {
                            mainClass += ".java";
                        }
                        FileWriter fileWriter = new FileWriter(packageFiles + File.separator + mainClass);
                        fileWriter.write("package " + packageName + ";\r\n\r" +
                                "\n" +
                                "import net.fabricmc.api.ModInitializer;\r\n\r" +
                                "\n" +
                                "public class ExampleMod implements ModInitializer {\r\n" +
                                "\t@Override\r\n" +
                                "\tpublic void onInitialize() {\r\n" +
                                "\t\t// This code runs as soon as Minecraft is in a mod-load-ready state.\r\n" +
                                "\t\t// However, some things (like resources) may still be uninitialized.\r\n" +
                                "\t\t// Proceed with mild caution.\r\n\r" +
                                "\n" +
                                "\t\tSystem.out.println(\"Hello Fabric world!\");\r\n" +
                                "\t}\r\n" +
                                "}");
                        fileWriter.close();
                        if (extraOptions.contains("mixin")) {
                            File mixinFolder = new File(packageFiles + File.separator + "mixin");
                            mixinFolder.mkdirs();
                            FileWriter fileWriter1 = new FileWriter(mixinFolder + File.separator + "ExampleMixin.java");
                            fileWriter1.write("package " + packageName + ".mixin;\\r\\n" +
                                    "\\r\\n" +
                                    "import net.minecraft.client.gui.screen.TitleScreen;\\r\\n" +
                                    "import org.spongepowered.asm.mixin.Mixin;\\r\\n" +
                                    "import org.spongepowered.asm.mixin.injection.At;\\r\\n" +
                                    "import org.spongepowered.asm.mixin.injection.Inject;\\r\\n" +
                                    "import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;\\r\\n" +
                                    "\\r\\n" +
                                    "@Mixin(TitleScreen.class)\\r\\n" +
                                    "public class ExampleMixin {\\r\\n" +
                                    "\\t@Inject(at = @At(\\\"HEAD\\\"), method = \\\"init()V\\\")\\r\\n" +
                                    "\\tprivate void init(CallbackInfo info) {\\r\\n" +
                                    "\\t\\tSystem.out.println(\\\"This line is printed by an example mod mixin!\\\");\\r\\n" +
                                    "\\t}\\r\\n" +
                                    "}");
                            fileWriter.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to create package directories!");
                }
            } else {
                System.out.println("Failed to create directories!");
                JOptionPane.showMessageDialog(null, "Failed to create directories!");
            }
        }
    }
}
