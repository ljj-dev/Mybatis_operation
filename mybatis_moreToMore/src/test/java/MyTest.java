import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import test.gdpu.mybatis.dao.CourseMapper;
import test.gdpu.mybatis.dao.StudentMapper;
import test.gdpu.mybatis.pojo.Course;
import test.gdpu.mybatis.pojo.Student;
import test.gdpu.mybatis.util.MybatisUtil;

public class MyTest {
    @Test
    public void test01(){
        SqlSession session = MybatisUtil.getSession();
        CourseMapper mapper = session.getMapper(CourseMapper.class);
        Course course = mapper.queryCourseWithStudents(111);
        System.out.println(course);
    }

    @Test
    public void test02(){
        SqlSession session = MybatisUtil.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student student = mapper.queryStudentWithCourses(1001);
        System.out.println(student);
    }
}
