package edu.hogwarts.application;

import edu.hogwarts.controller.StudentController;
import edu.hogwarts.controller.TeacherController;

public class Application {

    // Controller attributes
    TeacherController teacherController = new TeacherController();
    StudentController studentController = new StudentController();
    InitApp initApp;

    public static void main(String[] args) {
        Application app = new Application();
        app.start();
    }

    public void start() {
        // InitApp should use dependency injection
        initApp = new InitApp(studentController,teacherController);
        initApp.initData();
    }

}