/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.StudentDao;
import java.util.List;
import model.Student;

/**
 *
 * @author admin
 */
public class StudentRepository implements IStudentRepository {

    @Override
    public void sortStudent(List<Student> list) {
        StudentDao.Instance().sortInforStudent(list);
    }

    @Override
    public void display(List<Student> list) {
        if (list.isEmpty()) {
            System.err.println("List is empty!");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("------ Student " + (i + 1) + " ------");
            System.out.print("Name: " + list.get(i).getName());
            System.out.println("");
            System.out.print("Classes: " + list.get(i).getClasses());
            System.out.println("");
            System.out.print("Mark: " + list.get(i).getMark());
            System.out.println("");
        }
    }
}
