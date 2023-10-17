/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;

import java.util.Collections;
import java.util.List;
import model.Student;
import view.Validation;

/**
 *
 * @author admin
 */
public class StudentDao {
     private static StudentDao instance= null;
    private Validation validation;
    
    public StudentDao(){
        validation= new Validation();
    }
    
    
    public static StudentDao Instance(){
        if(instance==null){
            synchronized (StudentDao.class) {
                if(instance==null){
                    instance= new StudentDao();
                }
            }
        }
        return instance;
    }
    
     public void sortInforStudent(List<Student> list){
        while(true){
            System.out.println("Please input student information");
            String name= validation.checkInputString("Name : ");
            String classes= validation.checkInputString("Classes: ");           
            double mark= validation.checkInput("Mark: ");
            Student infor= new Student(name, classes, mark);
            list.add(infor);
            Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));
            System.out.println("Do you want to continue (Y/N)? Choose Y to continue, N to return main screen");
            if(!validation.checkInputYesNo()){
                return;
            }
        }
    }
    
}
