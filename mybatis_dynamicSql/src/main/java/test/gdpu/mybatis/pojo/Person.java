package test.gdpu.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private int id;
    private String name;
    private int age;
    private String favourites;

    public Person(String name, String favourites) {
        this.name = name;
        this.favourites = favourites;
    }
}
