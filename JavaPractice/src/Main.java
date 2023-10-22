import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /* functional interface; */
        /* functionalInterface(); */

        /* Generics */
        /* generics(); */

        /* Generic Method */
        /*
        printer(1.2);
        printer("Hello ae");
        System.out.println(printer2(4.5));
         */

        /* Exception */
        /* exception(); */

        /* inner class */
        /* innerClass(); */

        /* anonymous class */
        /* anonymousClass(); */

        /* enumeration */
        /* enumeration(); */

        /* wrapper class */
        /* wrapperClass(); */

        /* about string */
        /* aboutString(); */

        /* about check and uncheck exception */
        /* c_u_exception(); */

        /* about Set */
        /* aboutSet(); */

        /* primitive and reference data type */
        /* primitive_and_reference(); */

        /* Casting */
        /* Casting(); */

        /* I++ */
        /* IPlusPlus(); */

        /* about String Type */
        /* aboutStringType(); */

        /* about Thread */
        /* aboutThread(); */

    }
    public static void functionalInterface(){
        Animal cat = (name) -> {return "Hello " + name;};
        System.out.println(cat.speak("Thien"));
    }
    public static void generics(){
        Person<Integer, Integer> person1 = new Person<>(3,4);
        System.out.println(person1.getId() + " " + person1.getAge());
        Person<Double, String> person2 = new Person<>(2.5, "20");
        System.out.println(person2.getId() + " " + person2.getAge());
    }
    public static <T> void printer(T value){
        System.out.println(value);
    }
    public static <T> T printer2(T value){
        return value;
    }
    public static void exception(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban bao nhieu tuoi?");
        try{
            int age =scanner.nextInt();
            int result = age / 0;
        }catch (InputMismatchException ime){
            System.out.println("Hay nhap tuoi bang so");
        }catch (ArithmeticException ae){
            System.out.println("Khong the chia cho 0");
        }catch (Exception e){
            System.out.println("Bat tat ca exception");
        }finally {
            System.out.println("Ket thuc chuong trinh!");
        }
    }
    public static void innerClass(){
        OutClass outClass = new OutClass(2);
        // tạo inner class;
        OutClass.InnerClass innerClass = outClass.new InnerClass();
        innerClass.setId(1);
        System.out.println(innerClass.getId());
        // truy cập private properties outclass;
        System.out.println(innerClass.getOutId());
        // static inner class;
        OutClass.InnerClass2 innerClass2 = new OutClass.InnerClass2(3);
        System.out.println(innerClass2.innerId2);
    }
    public static void anonymousClass(){
        Animal animal = new Animal() {
            @Override
            public String speak(String name) {
                return "hello " + name;
            }
        };
        System.out.println(animal.speak("thien"));
    }
    public static void enumeration(){
        Enumeration enumeration1 = Enumeration.GIAO_HANG;
        Enumeration enumeration2 = Enumeration.DAT_HANG;
        System.out.println(enumeration1.getTime());
        System.out.println(enumeration2.getTime());
    }
    public static void wrapperClass(){
       // Integer x = new Integer(5); // deprecated
        Integer x = Integer.valueOf(5); // boxing;
        Integer y = 5; // auto boxing;

        int z = x.intValue(); // unboxing;
        int k = y; // auto unboxing;

        System.out.println(x == y); // true; Integer Caching;

        Integer a = 155;
        Integer b = 155;
        System.out.println(a == b); // false; out of Integer cahing;
        System.out.println(a.equals(b)); // true; use default equal() to auto unboxing and compare;

    }
    public static void aboutString(){
        String a = "thien"; // save in string pool;
        String b = "thien"; // save in string pool;
        // a và b cùng trỏ đến một đối tượng có value là "thien" trong string pool;
        String c = new String("thien"); // out of string pool, vì khai náo new, sẽ tạo ô nhớ mới;
        System.out.println(a == b); // true; cùng trỏ đến một địa chỉ;
        System.out.println(a == c); // false; không cùng trỏ đến một địa chỉ;
        System.out.println(a.equals(c)); // true; auto unboxing để so sánh giá trị nguyên thủy;

        a = "nguyen";
        // không sửa a, mà là tạo đối tượng mới trong string pool với giá trị 'nguyen', và a trỏ đến địa chỉ mới.
        // 'thien' vẫn còn trong string pool;
        System.out.println(a);

    }
    public static void c_u_exception() {
        TaiKhoan taiKhoan = new TaiKhoan(1000);
        // uncheck - exception;
        // taiKhoan.RutTien(2000);
        // System.out.println(taiKhoan.getSoDu());

        // check exception;
        try{
            // taiKhoan.napTien(1000);
            taiKhoan.napTien("123");
        }catch (SaiDinhDangTienException e) {
            System.out.println(e.getMessage());
        }
        printer(taiKhoan.getSoDu());
    }
    public static void aboutSet(){
        Set mySet = new HashSet();
        Person person1 = new Person(1,10);
        Person person2 = new Person(2,20);
        Person person3 = new Person(1,10);

        mySet.add(person1);
        mySet.add(person2);
        mySet.add(person3);

        System.out.println(mySet); // e object
        System.out.println(person1 == person3); // false, compare address;
        System.out.println(person1.equals(person3)); // false when not override equal() yet;

    }
    public static void primitive_and_reference(){
        Student student = new Student(1,"Jame", 18);
        IncreaseAge(student.getAge());
        System.out.println(student.getAge()); // still 18;
        IncreaseAge(student);
        System.out.println(student.getAge()); // 19
        IncreaseAge(student,20);
        System.out.println(student.getAge()); // still 19;
    }
    public static void IncreaseAge(int age){
        age++;
    }
    public static void IncreaseAge(Student o){
        o.setAge(o.getAge() + 1);
    }
    public static void IncreaseAge(Student o, int age){
        Student student = new Student(o.getId(), o.getName(), age);
        o = student; // o đã trỏ tới địa chỉ khác
    }
    public static void Casting(){
        /* Primitive casting */
        // Widening;
//        int a = 99;
//        double b = a; // java auto understand;
//        System.out.println(a);
//        System.out.println(b);

        // Narrowing;
//        int c = 129;
//        byte d = (byte)c;
//        System.out.println(c);
//        System.out.println(d);

        // Apply to string;
//        int e = 12;
//        String f = String.valueOf(e); // boxing;
//        System.out.println(e);
//        System.out.println(f);
//
//        String k = "55"; // auto boxing;
//        int h = Integer.parseInt(k);
//        System.out.println(k);
//        System.out.println(h);

        /* Reference Casting */

        // Up-Casting
        DongVat dongVat = new Cho();
        dongVat.an();
//        dongVat.keu(); // wrong;

        // Down-Casting
        Cho cho = (Cho)dongVat;
        cho.an();
        cho.keu();
        System.out.println(dongVat == cho);

        // practice
        Meo meo = new Meo();
        testDongVat(meo);

        // casting thực tế là chỉ thay đổi kiểu dữ liệu của biến, chứ không thay đổi đối tượng mà biến chỉ đến,
        // thế nên cha có thể trỏ đến đối tượng kiểu con, nhưng nếu cha được ép sang kiểu mà không quan hệ với
        // đối tượng con thí sẽ lỗi.
    }
    public static void testDongVat (DongVat dongVat){
        dongVat.an();
        if(dongVat instanceof Cho){
            ((Cho) dongVat).keu();
        }
    }
    public static void IPlusPlus(){
        // demo

        // i++ nghĩa là trong một câu lênh, i sẽ được tăng lên khi mọi thứ trong câu lệnh đã thực hieenj xong;

        int a = 0;
        int b = 0;
        int c = a + b++;
        System.out.println(c);

        // ++i nghĩa là trong một câu lệnh, i sẽ được cộng đầu tiên rồi mới đến các câu phần khác;
        int d = a + ++b;
        System.out.println(d);
    }
    public static void aboutStringType(){
        String a = "thien";
        StringBuffer b = new StringBuffer("thien");
        StringBuilder c = new StringBuilder("thien");
        System.out.println(b.equals(c));
    }
    public static void aboutThread(){
        MyThread myThread = new MyThread();
        myThread.run();
        MyRunableThread myRunableThread = new MyRunableThread();
        myRunableThread.run();
    }
}











