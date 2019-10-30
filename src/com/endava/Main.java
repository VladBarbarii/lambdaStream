package com.endava;

import com.endava.models.User;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.endava.models.Gender.FEMALE;
import static com.endava.models.Gender.MALE;

public class Main {
//
//    public static final List<User> USERS = Arrays.asList(new User("Vasea", MALE, 39),
//            new User("Sveta", FEMALE, 30),
//            new User("Jenea", MALE, 40),
//            new User("Igor", MALE, 55),
//            new User("Sveta", FEMALE, 30),
//            new User("Jenea", MALE, 40));

    public static void main(String args[]) {

        String string = "first second first first second third";
        String[] splittedString = string.split(" ");

        Arrays.stream(splittedString)
                .distinct()
                .forEach(word->{
                    int count = 0;
                    int index = 0;
                  while (index!=-1){
                    count++;
                    index=string.indexOf(word, index+word.length());
                  }
                    System.out.println(word + "\t" +  count);
                });



//        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)
//                .stream()
//                .filter(num -> num % 2 == 0)
//                .forEach(System.out::println);
//
//        printDelimiterLine();
//
//        USERS.stream()
//                .parallel()
//                .map(User::getName)
//                .filter(string -> string.startsWith("A"))
//                .forEach(System.out::println);
//
//        printDelimiterLine();
//
//        System.out.println(USERS
//                .stream()
//                .collect(Collectors.groupingBy(User::getGender)));
//        printDelimiterLine();
//
//        System.out.println(Stream.of(new User("Vasea", MALE, 39),
//                new User("Sveta", FEMALE, 30),
//                new User("Jenea", MALE, 40))
//                .map(User::getName)
//                .collect(Collectors.joining(" *** ")));
//
//        printDelimiterLine();
//
//        System.out.println(Stream.of(new User("Vasea", MALE, 39),
//                new User("Sveta", FEMALE, 30),
//                new User("Jenea", MALE, 40))
//                .collect(Collectors.groupingBy(User::getGender, Collectors.counting())));
//
//        printDelimiterLine();
//
//        System.out.println(
//                USERS.stream()
//                        .filter(user -> user.getGender() == MALE)
//                        .sorted(Comparator.comparing(User::getAge))
//                        .collect(Collectors.toSet()));
//
//        printDelimiterLine();
//
//    }
//
//    public static void printDelimiterLine() {
//        System.out.println("\n-------------------------------------------------------\n");
      }
}
