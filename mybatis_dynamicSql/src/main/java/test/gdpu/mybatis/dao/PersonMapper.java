package test.gdpu.mybatis.dao;

import test.gdpu.mybatis.pojo.Person;

import java.util.List;

public interface PersonMapper {
    public List<Person> queryPersonByConditon(Person person);
}
