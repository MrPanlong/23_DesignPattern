package StructurePattern.TransferObjectPattern.cainiao;

/**
 * @ClassName: StudentVo
 * @Date: 2022/6/12 11:19
 * @Author: panLong
 * @Description: TODO
 */

public class StudentVo {
    private String name;
    private int rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public StudentVo(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}
