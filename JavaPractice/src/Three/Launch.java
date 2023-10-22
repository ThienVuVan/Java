package Three;

import One.Default;
import One.Protect;
import One.SubDefault;

public class Launch {
    public static void main(String[] args) {
//        Default aDefault = new Default();
//        aDefault.a = 1; // error, a is default;
//        aDefault.getA(); // error, getA() is default;


//        Protect protect = new Protect();
//        protect.a = 1; // error ngoài package;

        SubProtect subProtect = new SubProtect();
//        subProtect.a = 5; // error, ngoài package;
        One.SubProtect subProtect1 = new One.SubProtect();
//        subProtect1.a = 7; // error, ngoài package;

    }
}
