/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import java.util.List;
import model.Student;

/**
 *
 * @author admin
 */
public interface IStudentRepository {

    public void sortStudent(List<Student> list);

    public void display(List<Student> list);
}
