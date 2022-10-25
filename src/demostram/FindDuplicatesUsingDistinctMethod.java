package demostram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicatesUsingDistinctMethod {
    public static void main(String[] args) {
        List<String> companies = new ArrayList<String>();
        // 1.1 add string elements to List
        companies.add("Meta");
        companies.add("Apple");
        companies.add("Amazon");
        companies.add("Netflix");
        companies.add("Meta"); // duplicate
        companies.add("Google");
        companies.add("Apple"); // duplicate
        //System.out.println("1. Original List with duplicates : \n");
        System.out.println(companies);

        //companies.forEach(System.out::println);
        // 2. get unique elements after removing duplicates
        List<String> distinctcompanies=companies.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctcompanies);
       // / 2.1 print unique elements
        distinctcompanies.forEach(System.out::println);
        // 3. get duplicate elements
        for (String distinctcompany:distinctcompanies){
            companies.remove(distinctcompany);
            System.out.println(distinctcompany);
        }


    }
}
