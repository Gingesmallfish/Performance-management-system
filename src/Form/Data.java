package Form;

import java.util.ArrayList;

public class Data {// 泛型
    public static ArrayList<Student> students = new ArrayList<>();
    // 静态代码
    static {
        students.add(new Student("101","张三","男"));
        students.add(new Student("102","李四","男"));
        students.add(new Student("103","王五","女"));
    }
}
