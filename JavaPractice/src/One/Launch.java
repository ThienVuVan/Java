package One;

public class Launch {
    public static void main(String[] args) {
//        Default aDefault = new Default();
//        aDefault.a = 1; // same package -> ok
//        System.out.println(aDefault.a);
//        SubDefault subDefault = new SubDefault();
//        subDefault.a = 2;
//        System.out.println(subDefault.a);

//        Protect protect = new Protect();
//        protect.a = 1;
//        System.out.println(protect.a);
        SubProtect subProtect = new SubProtect();
        subProtect.a = 8;

    }
}
