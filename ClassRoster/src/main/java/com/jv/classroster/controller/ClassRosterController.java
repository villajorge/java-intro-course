/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jv.classroster.controller;

import com.sg.classroster.dao.ClassRosterDao;
import com.sg.classroster.dao.ClassRosterDaoException;
import com.sg.classroster.dao.ClassRosterDaoFileImpl;
import com.sg.classroster.dto.Student;
import com.sg.classroster.ui.ClassRosterView;
import com.sg.classroster.ui.UserIO;
import com.sg.classroster.ui.UserIOConsoleImpl;
import java.util.List;

/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class ClassRosterController {
    private ClassRosterView rosterView;
    private ClassRosterDao dao;
    
    public ClassRosterController(ClassRosterDao dao, ClassRosterView rosterView){
        this.dao = dao;
        this.rosterView = rosterView;
    }
    
    public void run(){
        boolean keepGoing = true;
        int menuSelection = 0;
        try{
        while (keepGoing){
            menuSelection = getMenuSelection();
            
            switch (menuSelection) {
                case 1:
                    listStudents();
                    break;
                case 2:
                    createStudent();
                    break;
                case 3:
                    viewStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    keepGoing = false;
                    break;
                default:
                    unknownCommand();
            }

        }
       exitMessage();
        }catch (ClassRosterDaoException e){
            rosterView.displayErrorMessage(e.getMessage());
        }
}
    
    private int getMenuSelection() {
        return rosterView.printMenuAndGetSelection();
    }
    
    private void createStudent() throws ClassRosterDaoException{
        rosterView.displayCreateStudentBanner();
        Student newStudent = rosterView.getNewStudentInfo();
        dao.addStudent(newStudent.getStudentId(), newStudent);
        rosterView.displayCreateSuccessBanner();
    }
    
    private void listStudents() throws ClassRosterDaoException{
        rosterView.displayDisplayAllBanner();
        List<Student> studentList = dao.getAllStudents();
        rosterView.displayStudentList(studentList);
    }
    
    private void viewStudent() throws ClassRosterDaoException {
        rosterView.displayDisplayStudentBanner();
        String studentId = rosterView.getStudentIdChoice();
        Student student = dao.getStudent(studentId);
        rosterView.displayStudent(student);
    }
    
    private void removeStudent() throws ClassRosterDaoException{
        rosterView.displayRemoveStudentBanner();
        String studentId = rosterView.getStudentIdChoice();
        Student removedStudent = dao.removeStudent(studentId);
        rosterView.displayRemoveResult(removedStudent);
    }
    
    private void unknownCommand(){
        rosterView.displayUnknownCommandBanner();
    }
    
    private void exitMessage(){
        rosterView.displayExitBanner();
    }
}  

