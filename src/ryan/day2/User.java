package ryan.day2;

public class User {
    // 类属性通常设置以 private 修饰，拒绝外部直接访问，提供setter, getter 方法访问，如下的 setName(), getName()
    private String name;
    private int age;

    // 构造方法，该方法是默认的构造方法，new 关键词创建对象默认调用该方法，
    // 即使不写在代码中，该方法也会被 java 自动注入到类中，但通常我们需要写出来，让代码更明了。
    public User(){

    }
    // 构造方法，java 支持方法重载，相同的方法名，不同的参数允许同时存在。构造方法也是一样的
    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
