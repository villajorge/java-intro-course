/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jv.classmodeling;

/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class School2 {
    private int enrollment;
    private int teachers;
    private String[] coursesOffered;
    private String sportsOffered;
    private String clubsOffered;
    private Student[] roster;

    
    public void enrollStudent(Student student){
        
    }
    
    public void unenrollStudent(Student student){
        
    }
    
    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public int getTeachers() {
        return teachers;
    }

    public void setTeachers(int teachers) {
        this.teachers = teachers;
    }

    public String[] getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(String[] coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public String getSportsOffered() {
        return sportsOffered;
    }

    public void setSportsOffered(String sportsOffered) {
        this.sportsOffered = sportsOffered;
    }

    public String getClubsOffered() {
        return clubsOffered;
    }

    public void setClubsOffered(String clubsOffered) {
        this.clubsOffered = clubsOffered;
    }

    public Student[] getRoster() {
        return roster;
    }

    public void setRoster(Student[] roster) {
        this.roster = roster;
    }
    
    
    
}
