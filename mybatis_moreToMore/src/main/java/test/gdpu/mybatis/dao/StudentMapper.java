package test.gdpu.mybatis.dao;

import test.gdpu.mybatis.pojo.Student;

public interface StudentMapper {
    public Student queryStudentWithCourses(int id);
}
