package edu.hogwarts.application;

import edu.hogwarts.controller.StudentController;

public class Application {

    // Controller attributes

    public static void main(String[] args) {
        Application app = new Application();
        app.start();
    }

    public void start() {
        var studentController = new StudentController();
        var initApp = new InitApp();
        initApp.initData();
    }

}