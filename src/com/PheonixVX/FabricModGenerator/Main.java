package com.PheonixVX.FabricModGenerator;

import com.PheonixVX.FabricModGenerator.generateFiles.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashSet;

public class Main extends JFrame {

    public Main() {
        // Window Initialization
        setTitle("Fabric Mod Stub Generator");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null); // I assume responsibility for this.

        // Options
        final JLabel rootFolderLabel = new JLabel("Root Folder: ");
        final JTextField rootFolderPath = new JTextField();
        final JButton rootFolderSelector = new JButton("...");
        final JFileChooser rootFolderChooser = new JFileChooser();
        final JLabel packageNameLabel = new JLabel("Package Name:");
        final JTextField packageNamePath = new JTextField();
        final JLabel extraOptions = new JLabel("Extra Options:");
        final JLabel modNameLabel = new JLabel("Mod Name:");
        final JTextField modNameField = new JTextField("Example Mod");
        final JLabel modVersonLabel = new JLabel("Mod Version:");
        final JTextField modVersionField = new JTextField("1.0.0");
        final JLabel mavenGroupLabel = new JLabel("Maven Group:");
        final JTextField mavenGroupField = new JTextField("net.fabricmc");
        final JLabel mainClassLabel = new JLabel("Main Class:");
        final JTextField mainClassField = new JTextField("ExampleMod");
        HashSet<String> extraOptionsArray = new HashSet<>();
        final JCheckBox useMixins = new JCheckBox();
        final JCheckBox generateReadMe = new JCheckBox();
        final JCheckBox useCC0License = new JCheckBox();
        final JCheckBox useGitIgnore = new JCheckBox();
        final JButton generateProject = new JButton("Generate Project");

        rootFolderSelector.addActionListener(e -> {
            int file = rootFolderChooser.showOpenDialog(Main.this);
            if (file == 0) {
                rootFolderPath.setText(rootFolderChooser.getSelectedFile().getAbsolutePath());
            } else {
                JOptionPane.showMessageDialog(Main.this, "You must select a folder!!!", "Folder Selection", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        useMixins.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                extraOptionsArray.add("mixin");
            } else {
                extraOptionsArray.remove("mixin");
            }
        });

        generateReadMe.addItemListener(e -> {
           if (e.getStateChange() == ItemEvent.SELECTED) {
               extraOptionsArray.add("readme");
           } else {
               extraOptionsArray.remove("readme");
           }
        });

        useCC0License.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                extraOptionsArray.add("cc0license");
            } else {
                extraOptionsArray.remove("cc0license");
            }
        });

        useGitIgnore.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                extraOptionsArray.add("gitignore");
            } else {
                extraOptionsArray.remove("gitignore");
            }
        });

        generateProject.addActionListener(e -> {
            ArrayList<String> properties = new ArrayList<>();
            properties.add(packageNamePath.getText());
            properties.add(modNameField.getText());
            properties.add(modVersionField.getText());
            properties.add(mavenGroupField.getText());
            generateProject(rootFolderChooser.getSelectedFile().getAbsolutePath(), properties, extraOptionsArray);
        });

        rootFolderChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        rootFolderLabel.setBounds(75, 10, 75, 10);
        rootFolderPath.setBounds(75, 25, 225, 20);
        rootFolderSelector.setBounds(300, 25, 20, 20);
        packageNameLabel.setBounds(75, 50, 100, 10);
        packageNamePath.setBounds(75, 65, 225, 20);
        extraOptions.setBounds(100, 200, 100, 20);
        modNameLabel.setBounds(75, 95, 75, 10);
        modNameField.setBounds(75, 110, 100, 20);
        modVersonLabel.setBounds(200, 95, 75, 10);
        modVersionField.setBounds(200, 110, 100, 20);
        mavenGroupLabel.setBounds(75, 135, 100, 10);
        mavenGroupField.setBounds(75, 150, 100, 20);
        mainClassLabel.setBounds(200, 135, 75, 10);
        mainClassField.setBounds(200, 150, 100, 20);
        useMixins.setBounds(100, 225, 15, 15);
        useMixins.setToolTipText("Use mixins");
        generateReadMe.setBounds(115, 225, 15, 15);
        generateReadMe.setToolTipText("Generate README.md");
        useCC0License.setBounds(130, 225, 15, 15);
        useCC0License.setToolTipText("CC0 License");
        useGitIgnore.setBounds(145, 225, 15, 15);
        useGitIgnore.setToolTipText("Use Git Ignore");
        generateProject.setBounds(125, 325, 150, 25);

        add(rootFolderLabel);
        add(rootFolderPath);
        add(rootFolderSelector);
        add(packageNameLabel);
        add(packageNamePath);
        add(extraOptions);
        add(modNameLabel);
        add(modNameField);
        add(modVersonLabel);
        add(modVersionField);
        add(mavenGroupLabel);
        add(mavenGroupField);
        add(mainClassLabel);
        add(mainClassField);
        add(useMixins);
        add(generateReadMe);
        add(useCC0License);
        add(useGitIgnore);
        add(generateProject);
        setResizable(false); // Muahaha no 4K resolution for you!!
        setMaximumSize(new Dimension(400, 400));
        setMinimumSize(new Dimension(400, 400)); // Nice. right?
        // If you wonder why I did this, it's because Null Layouts require
        // me to position everything myself. And me being the idiot I am,
        // tried to use a GUI Editor in the first place and didn't notice
        // a System.exit(0) call causing me to think it never showed up
        // and that the GUI Editor was trash, so I did what every idiot does,
        // I use Null Layout and position everything myself so it looks
        // bad on bigger resolutions. Whew!! That was a lot to type!
    }

    public static void main(String[] args) {
        Main dialog = new Main();
        dialog.setVisible(true);
    }

    private static void generateProject(String filePath, ArrayList<String> properties, HashSet<String> extraOptions) {
        System.out.println(extraOptions);
        settingsgradle.createSettingsFile(filePath);
        gradlewbat.creategradlewFile(filePath);
        gradlewsh.createGradlewSH(filePath);
        gradleproperties.generateGradleProperties(filePath, properties);
        buildgradle.createBuildGradle(filePath, properties);
        if (extraOptions.contains("readme")) {
            readmemd.createReadMe(filePath);
        }
        if (extraOptions.contains("cc0license")) {
            cc0license.createCC0License(filePath);
        }
        if (extraOptions.contains("gitignore")) {
            gitignore.createGitIgnore(filePath);
        }
        generateSourceFiles.createSourceFiles(filePath, properties.get(1), properties.get(0), extraOptions);
    }

    // Extra Options List
    // Mixin
    // CC0License
    // Git Ignore

    // Properties List
    // 0 : packageNamePath
    // 1 : modNameField
    // 2 : modVersionField
    // 3 : mavenGroupField
}
