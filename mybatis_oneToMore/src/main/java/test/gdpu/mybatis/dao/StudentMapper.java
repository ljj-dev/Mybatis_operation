package test.gdpu.mybatis.dao;

import test.gdpu.mybatis.pojo.Student;

public interface StudentMapper {
    public void addStudent(Student student);

    public void deleteStudent(int id);

    public void updateStudent(int id);

    public Student queryStudentById(int id);

}
