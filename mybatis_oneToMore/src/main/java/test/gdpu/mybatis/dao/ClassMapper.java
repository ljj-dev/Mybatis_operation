package test.gdpu.mybatis.dao;

import java.util.List;

public interface ClassMapper {
    public List<Class> queryClassWithStudents(int id);

}
