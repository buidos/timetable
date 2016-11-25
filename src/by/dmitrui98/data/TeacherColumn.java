package by.dmitrui98.data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Администратор on 11.11.2016.
 */
public class TeacherColumn implements Serializable {
    private ArrayList <Teacher> teacherList = new ArrayList<Teacher>();
    private int group;

    public TeacherColumn(ArrayList<Teacher> teacherRow, int group) {
        this.teacherList = teacherRow;
        this.group = group;
    }


    public ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }

    public int getGroup() {
        return group;
    }
}
