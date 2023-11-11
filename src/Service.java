public interface Service {

    void test();

    default void test2() {
        System.out.println("1233");
    }





    //!(a || b) = !a && !b
    //!a && !b

    // a && b && c || a && b = a && b










    //!((b != 0) || (c <= 5))

    //!(b != 0) && !(c <= 5)

    // (b == 0) && (c > 5)




}
