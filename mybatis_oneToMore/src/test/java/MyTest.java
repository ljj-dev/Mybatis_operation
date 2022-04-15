import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import test.gdpu.mybatis.dao.ClassMapper;
import test.gdpu.mybatis.dao.StudentMapper;
import test.gdpu.mybatis.pojo.Student;
import test.gdpu.mybatis.util.MybatisUtil;

import java.util.List;

public class MyTest {
    @Test
    public void test01(){
       SqlSession session = MybatisUtil.getSession();
       StudentMapper mapper = session.getMapper(StudentMapper.class);
       Student student = mapper.queryStudentById(1001);
        System.out.println(student);
    }

    @Test
    public void test02(){
        SqlSession session = MybatisUtil.getSession();
        ClassMapper mapper = session.getMapper(ClassMapper.class);
        List<Class> classes = mapper.queryClassWithStudents(503);
        System.out.println(classes);
    }
}
