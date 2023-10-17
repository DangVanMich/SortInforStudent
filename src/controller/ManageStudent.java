/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Repository.IStudentRepository;
import Repository.StudentRepository;
import java.util.ArrayList;
import java.util.List;
import model.Student;
import view.Menu;

/**
 *
 * @author admin
 */
public class ManageStudent extends Menu<String>{
    private IStudentRepository infor =  (IStudentRepository) new StudentRepository();
    private List<Student> list= new ArrayList<>();
    
    static String title="====== Collection Sort Program ======";
    static String[] mc={"Input Information Student", "Display", "Exit"};
    public ManageStudent(){
        super(title, mc);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                infor.sortStudent(list);
                break;
            case 2:
                infor.display(list);
                break;
            case 3:
                System.exit(0);
                break;
        }
    }
    
}
