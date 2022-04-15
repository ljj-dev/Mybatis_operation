package test.gdpu.mybatis.dao;

import test.gdpu.mybatis.pojo.Course;

public interface CourseMapper {
    public Course queryCourseWithStudents(int id);
}
