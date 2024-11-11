import myClass.ComparableCircle;

import java.util.Arrays;

public class Exercise2 {
    // [Thực hành] triển khai interface 'Comparable' cho các lớp hình học
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[4];
        circles[0] = new ComparableCircle(2);
        circles[1] = new ComparableCircle();
        circles[3] = new ComparableCircle(5.5, "neon", true);
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
