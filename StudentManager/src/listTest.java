import com.yqh.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listTest {
    public static void main(String[] args) {
        List<PeopleTest> list = new ArrayList<>();

        PeopleTest peopleTest = new PeopleTest(7, "yqh");
//        peopleTest.setAge(7);
//        peopleTest.setName("yqh");
        PeopleTest peopleTest2 = new PeopleTest(10, "yyp");
//        peopleTest2.setAge(10);
//        peopleTest2.setName("yyp");

        list.add(peopleTest);
        list.add(peopleTest2);

        Iterator<PeopleTest> itPepo = list.iterator();
        while(itPepo.hasNext()){
            PeopleTest p = itPepo.next();
            System.out.println(p.getAge());
            System.out.println(p.getName());
        }
//        System.out.println(list.get(0));
    }
}

class PeopleTest{
    private int age;
    private String name;

    PeopleTest(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
