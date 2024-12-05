package ua.edu.ucu.app.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = Student.builder().name("Oles")
                .age(32)
                .mark(61)
                .mark(100) // from Math Analysis
                .grades(Arrays.asList(1,2,3))
                .gender("m").build();
        System.out.println(user);
    }
}