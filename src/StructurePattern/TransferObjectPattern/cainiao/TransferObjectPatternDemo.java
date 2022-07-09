package StructurePattern.TransferObjectPattern.cainiao;

/**
 * @ClassName: TransferObjectPatternDemo
 * @Date: 2022/6/12 13:14
 * @Author: panLong
 * @Description: TODO
 */

public class TransferObjectPatternDemo {
    public static void main(String[] args) {
        StudentBo studentBo = new StudentBo();

        //输出所有学生
        for (StudentVo student : studentBo.getAllStudents()) {
            System.out.println("Student :[RollNo : "+ student.getRollNo() + ", name :"+ student.getName()+"]");
        }

        //更新学生
        StudentVo student = studentBo.getAllStudents().get(0);
        student.setName("Michael");
        studentBo.updateStudent(student);

        //获取学生
        studentBo.getStudent(0);
        System.out.println("Student : [RollNo : "+ student.getRollNo() + ", Name:"+student.getName()+"]");
    }
}
