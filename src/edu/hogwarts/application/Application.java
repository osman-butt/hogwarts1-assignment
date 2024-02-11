package edu.hogwarts.application;

import edu.hogwarts.controller.StudentController;
import edu.hogwarts.controller.TeacherController;
import edu.hogwarts.view.UserInterface;

public class Application {

    // Controller attributes
    TeacherController teacherController;
    StudentController studentController;
    InitApp initApp;
    UserInterface userInterface;

    public static void main(String[] args) {
        Application app = new Application();
        app.start();
    }

    public void start() {
        studentController = new StudentController();
        teacherController = new TeacherController();
        // InitApp should use dependency injection
        initApp = new InitApp(studentController,teacherController);
        initApp.initData();
        userInterface = new UserInterface(studentController,teacherController);
        userInterface.start();
    }

}