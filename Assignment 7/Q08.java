// 8. Write a java program to observe the utility of public access specifier.

import Q04_package.Q05_subpackage.*;

public class Q08 {
    public static void main(String[] args) {
        Q05 obj = new Q05();
        obj.Q08_method();
    }
}

// error: Q08_method() is not public in Q05; cannot be access;
