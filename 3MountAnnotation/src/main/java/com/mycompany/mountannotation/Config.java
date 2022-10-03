/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mountannotation;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */

public class Config implements Serializable {

    private static Config config = null;
    private static final String filename = "app.obj";
    public static boolean loggedin;

    public static Config instance() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }

    public static boolean isLoggedin() {
        return loggedin;
    }

    @Bosholmasin
    public static void setLoggedin(boolean loggedin) {
        Config.loggedin = loggedin;
    }

    @Override
    public String toString() {
        return "Config{" + '}';
    }
    

}
