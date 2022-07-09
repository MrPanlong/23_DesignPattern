package StructurePattern.TransferObjectPattern.cainiao;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: StudentBo
 * @Date: 2022/6/12 11:20
 * @Author: panLong
 * @Description: TODO
 */

public class StudentBo {
    //列表当作一个数据库
    List<StudentVo> students;

    public StudentBo() {
        students = new ArrayList<>();
        StudentVo student1 = new StudentVo("Robert", 0);
        StudentVo student2 = new StudentVo("John", 1);
        students.add(student1);
        students.add(student2);
    }
    public void deleteStudent(StudentVo student){
        students.remove(student.getRollNo());
        System.out.println("Student:Roll No "+ student.getRollNo()+",deleted from database");
    }
    //从数据库检索学生名单
    public List<StudentVo> getAllStudents(){
        return students;
    }
    public StudentVo getStudent(int rollNo){
        return students.get(rollNo);
    }
    public void updateStudent(StudentVo student){
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No "+ student.getRollNo()+", updated in the databases");
    }
}
