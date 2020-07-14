package com.PheonixVX.FabricModGenerator.generateFiles;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class buildgradle {

    public static void createBuildGradle(String filePath, ArrayList<String> properties) {
        try {
            File file = new File(filePath + File.separator + "build.gradle");
            if (file.createNewFile()) {
                JOptionPane.showMessageDialog(null, "build.gradle created at " + file.toPath());
                FileWriter fileWriter = new FileWriter(file.toPath().toString());
                fileWriter.write("plugins {\r\n" +
                        "\tid 'fabric-loom' version '0.4-SNAPSHOT'\r\n" +
                        "\tid 'maven-publish'\r\n" +
                        "}\r\n\r" +
                        "\n" +
                        "sourceCompatibility = JavaVersion.VERSION_1_8\r\n" +
                        "targetCompatibility = JavaVersion.VERSION_1_8\r\n\r" +
                        "\n" +
                        "archivesBaseName = project.archives_base_name\r\n" +
                        "version = project.mod_version\r\n" +
                        "group = project.maven_group\r\n\r" +
                        "\n" +
                        "dependencies {\r\n" +
                        "\t//to change the versions see the gradle.properties file\r\n" +
                        "\tminecraft \"com.mojang:minecraft:${project.minecraft_version}\"\r\n" +
                        "\tmappings \"net.fabricmc:yarn:${project.yarn_mappings}:v2\"\r\n" +
                        "\tmodImplementation \"net.fabricmc:fabric-loader:${project.loader_version}\"\r\n\r" +
                        "\n" +
                        "\t// Fabric API. This is technically optional, but you probably want it anyway.\r\n" +
                        "\tmodImplementation \"net.fabricmc.fabric-api:fabric-api:${project.fabric_version}\"\r\n\r" +
                        "\n" +
                        "\t// PSA: Some older mods, compiled on Loom 0.2.1, might have outdated Maven POMs.\r\n" +
                        "\t// You may need to force-disable transitiveness on them.\r\n" +
                        "}\r\n\r" +
                        "\n" +
                        "processResources {\r\n" +
                        "\tinputs.property \"version\", project.version\r\n\r" +
                        "\n" +
                        "\tfrom(sourceSets.main.resources.srcDirs) {\r\n" +
                        "\t\tinclude \"fabric.mod.json\"\r\n" +
                        "\t\texpand \"version\": project.version\r\n" +
                        "\t}\r\n\r" +
                        "\n" +
                        "\tfrom(sourceSets.main.resources.srcDirs) {\r\n" +
                        "\t\texclude \"fabric.mod.json\"\r\n" +
                        "\t}\r\n" +
                        "}\r\n\r" +
                        "\n" +
                        "// ensure that the encoding is set to UTF-8, no matter what the system default is\r\n" +
                        "// this fixes some edge cases with special characters not displaying correctly\r\n" +
                        "// see http://yodaconditions.net/blog/fix-for-java-file-encoding-problems-with-gradle.html\r\n" +
                        "tasks.withType(JavaCompile) {\r\n" +
                        "\toptions.encoding = \"UTF-8\"\r\n" +
                        "}\r\n\r" +
                        "\n" +
                        "// Loom will automatically attach sourcesJar to a RemapSourcesJar task and to the \"build\" task\r\n" +
                        "// if it is present.\r\n" +
                        "// If you remove this task, sources will not be generated.\r\n" +
                        "task sourcesJar(type: Jar, dependsOn: classes) {\r\n" +
                        "\tclassifier = \"sources\"\r\n" +
                        "\tfrom sourceSets.main.allSource\r\n" +
                        "}\r\n\r" +
                        "\n" +
                        "jar {\r\n" +
                        "\tfrom \"LICENSE\"\r\n" +
                        "}\r\n\r" +
                        "\n" +
                        "// configure the maven publication\r\n" +
                        "publishing {\r\n" +
                        "\tpublications {\r\n" +
                        "\t\tmavenJava(MavenPublication) {\r\n" +
                        "\t\t\t// add all the jars that should be included when publishing to maven\r\n" +
                        "\t\t\tartifact(remapJar) {\r\n" +
                        "\t\t\t\tbuiltBy remapJar\r\n" +
                        "\t\t\t}\r\n" +
                        "\t\t\tartifact(sourcesJar) {\r\n" +
                        "\t\t\t\tbuiltBy remapSourcesJar\r\n" +
                        "\t\t\t}\r\n" +
                        "\t\t}\r\n" +
                        "\t}\r\n\r" +
                        "\n" +
                        "\t// select the repositories you want to publish to\r\n" +
                        "\trepositories {\r\n" +
                        "\t\t// uncomment to publish to the local maven\r\n" +
                        "\t\t// mavenLocal()\r\n" +
                        "\t}\r\n" +
                        "}");
                fileWriter.close();
            } else {
                JOptionPane.showMessageDialog(null, "build.gradle exists or could not be created!!!");
            }
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, "build.gradle failed to create!");
            e.printStackTrace();
        }
    }
}
