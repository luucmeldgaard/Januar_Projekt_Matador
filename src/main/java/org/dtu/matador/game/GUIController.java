package org.dtu.matador.game;

import gui_main.GUI;

import java.util.Map;

class GUIController {

    private static GUIController guiControllerObject;
    private static GUI gui;

    private GUIController(Map<String, Map<String, String>> fieldMap) {
        GUICreator fields = new GUICreator();
        gui = new GUI(fields.setup(fieldMap));
    }

    public static GUIController getInstance(Map<String, Map<String, String>> fieldMap) {
        if (guiControllerObject == null) {
            guiControllerObject = new GUIController(fieldMap);
        }
        else {System.out.println("GUI instance already initialized..."); }
        return guiControllerObject;
    }

    public String buttonRequest(String c){
        return gui.getUserButtonPressed("Number of players", "2", "3", c);
    }

}
