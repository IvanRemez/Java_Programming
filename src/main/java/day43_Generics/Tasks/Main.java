package day43_Generics.Tasks;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<>();
            // ArrayList only accepting objects belonging to Integer class
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
//        items.add("Orange");

        printDoubled(items);

        System.out.println("----------------------------------------------");

        FootballPlayer joe = new FootballPlayer("Joe");
            // Joe registered to be on the football team
        BaseballPlayer pat = new BaseballPlayer("Pat");
            // Pat registered to be on the football team
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<SoccerPlayer> liverpool = new Team("Liverpool"); // Team accepting any type of player

//        liverpool.addPlayer(joe);
//        liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);









    }

    private static void printDoubled(ArrayList<Integer> items){

        for (int i : items){
            System.out.println(i*2);
        }
    }
}
