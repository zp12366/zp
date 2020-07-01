package ryan.day2;

public class Handler {
    public static void main(String[] args) {
        boolean b = Person.isPerson();          // static 修饰的静态方法可以直接使用 class 调用，无需通过new 关键词实例化对象

        // static 属性是所有实例以及类共用的，他们指向了一个地址，所有一旦改变，这个类的该属性，以及所有该类实例出来的对象的该属性都将改变。
        Sequence sequence = new Sequence();
        System.out.printf("sequence num is %d in the first\r\n", sequence.getSequence());
        Sequence.autoIncrement();
        System.out.printf("sequence num is %d in the second\r\n", sequence.getSequence());

        System.out.println("\nperson1 start .........");

        // 这里的 Person 使用了组合，人有心脏，眼睛，人与 心脏，眼睛是 has 的 关系
        Person person1 = new Person(new PersonEyes("blue"), new Leg(), new Heart(), sequence);
        System.out.printf("person1 id card num is %d\r\n", person1.getIdCard());

        person1.getHeart().beat();
        person1.working();
        person1.eating();
        person1.run();

        System.out.println("\nstudent1 start .........");

        Student student1 = new Student(new PersonEyes("red"), new Leg(), new Heart(), "第一中学", sequence);
        System.out.printf("student1 id card num is %d\r\n", student1.getIdCard());

        student1.working();
        student1.eating();
        student1.getHeart().beat();

        System.out.println("\nconcert start .........");

        // 这是java 中的多态，join 方法约定参数是一个 Person，那么 Person 实例的对象可以作为参数
        // Student 继承了 Person，一个 Student 的实例即是 Student 也是 Person
        Concert concert = new Concert();
        concert.join(person1);
        concert.join(student1);

        System.out.println("\nclass type start .........");
        Person student2 = new Student(new PersonEyes("grey"), new Leg(), new Heart(), "第二中学", sequence);
        System.out.printf("student2 id card num is %d\r\n", student2.getIdCard());

        //student2.getSchool(); 不能调用，实例化时，表示的类型是Person，Person 没有该方法，student 才有。

        // student2 初始化时，虽然指定类型是 Person，但它是通过 new Student 而来，他实际是一个 student，
        // 而student 继承 Person，所以初始化赋值时程序可以正常运行。这是 java 多态的体现
        Student student22 = (Student)student2;
        // Student person11 = (Student)person1; 若这样执行，将抛出异常，Person1 是 new Person 实例而来，他不是 Student,
        System.out.printf("my school is %s\n", student22.getSchool());


        System.out.println("\nclass type student3 start .........");
        // 对于 (Class) 类似这种做法有更友好的形式：
        Person student3 = new Student(new PersonEyes("black"), new Leg(), new Heart(), "第三中学", sequence);
        if (student3 instanceof Student){
            System.out.printf("my school is %s\n", ((Student) student3).getSchool());
        }

        // 增加 instanceof 的判断，避免直接转型造成程序抛出异常
        if (person1 instanceof Student){
            System.out.printf("my school is %s\n", ((Student) student3).getSchool());
        }
    }
}
