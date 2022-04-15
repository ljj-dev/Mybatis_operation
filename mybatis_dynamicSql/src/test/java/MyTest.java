import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import test.gdpu.mybatis.dao.PersonMapper;
import test.gdpu.mybatis.pojo.Person;
import test.gdpu.mybatis.util.MybatisUtil;

import java.util.List;

public class MyTest {
    @Test
    public void test01(){
        SqlSession session = MybatisUtil.getSession();
        PersonMapper mapper = session.getMapper(PersonMapper.class);
        Person person = new Person("ljj", "bask");
        List<Person> persons = mapper.queryPersonByConditon(person);
        for(Person person1 : persons){
            System.out.println(person1);
        }
    }

    @Test
    public void test02() {
        SqlSession session = MybatisUtil.getSession();
        PersonMapper mapper = session.getMapper(PersonMapper.class);
        Person person = new Person();
        List<Person> persons = mapper.queryPersonByConditon(person);
        for (Person person1 : persons) {
            System.out.println(person1);
        }
    }
}
