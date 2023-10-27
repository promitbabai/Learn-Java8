package com.learn.listofdatastreamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainClassToUseListOfUserData {


    public static void main(String[] args) {

        List<User> userList = new ArrayList<User>();
        userList.add(new User(172280, "Promit", "promit.m@gmail.com", "kolkata", "12345"));
        userList.add(new User(172280, "Duggu", "promit.m@gmail.com", "kolkata", "12345"));
        userList.add(new User(172280, "Mamon", "promit.m@gmail.com", "kolkata", "12345"));
        userList.add(new User(172284, "Pradip", "promit.m@gmail.com", "mumbai", "12345"));
        userList.add(new User(172284, "Meeta", "promit.m@gmail.com", "mumbai", "12345"));
        userList.add(new User(172284, "Braja", "promit.m@gmail.com", "delhi", "12345"));
        userList.add(new User(172286, "Karabi", "promit.m@gmail.com", "delhi", "12345"));


        //userList.forEach(user -> System.out.println(user.getName()));

        /*System.out.println("\n ############ Search in List of Objects ################### ");
        List<User> filteredList = userList.stream()
                        .filter(user -> user.getId() > 172282)
                        .filter(user -> user.getCity().equals("mumbai"))
                        .collect(Collectors.toList());
        filteredList.forEach(user -> System.out.println(user.getName()));*/



       /* System.out.println("\n ############ Sort List of Objects based on certain parameters ################### ");
        List<User> sortedByCity = userList.stream()
                                    .sorted(Comparator.comparing(User::getCity).reversed())
                                    .collect(Collectors.toList());
        sortedByCity.forEach(user -> System.out.println(user.getCity() + " - " + user.getName()));*/



       /* System.out.println("\n ############ Sort List of Objects based on More than one parameters ################### ");
        Comparator<User> compareByCityThenByName = Comparator.comparing(User::getCity).thenComparing(User::getName);
        List<User> sortedByCityThenByName = userList.stream()
                .sorted(compareByCityThenByName)
                .collect(Collectors.toList());
        sortedByCityThenByName.forEach(user -> System.out.println(user.getCity() + " - " + user.getName()));*/


        System.out.println("\n ############ Sort List of Objects based on Custom Comparator ################### ");

        List<User> sortedByCustomComparator =userList.stream().sorted((o1,o2) -> {
                                                                    if(o1.getId() == o2.getId())
                                                                        return o1.getName().compareTo(o2.getName());
                                                                    else if (o1.getId() > o2.getId())
                                                                        return 1;
                                                                    else return -1;
                                                                })
                                                                .collect(Collectors.toList());
        sortedByCustomComparator.forEach(user -> System.out.println(user.getCity() + " - " + user.getName()));

        System.out.println("\n ############ Delete certain Objects from the List based on certain parameters ################### ");


    }
}
