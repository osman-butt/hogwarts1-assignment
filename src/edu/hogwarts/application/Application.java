package edu.hogwarts.application;

import edu.hogwarts.controller.StudentController;
import edu.hogwarts.controller.TeacherController;

public class Application {

    // Controller attributes
    TeacherController teacherController;
    StudentController studentController;

    public static void main(String[] args) {
        Application app = new Application();
        app.start();
    }

    public void start() {
        studentController = new StudentController();
        teacherController = new TeacherController();
        var initApp = new InitApp();
        initApp.initData();
    }

}