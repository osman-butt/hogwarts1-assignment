package edu.hogwarts.application;

public class Application {

    // Controller attributes

    public static void main(String[] args) {
        Application app = new Application();
        app.start();
    }

    public void start() {
        var initApp = new InitApp();
        initApp.initData();
    }

}