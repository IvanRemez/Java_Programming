package day43_Generics.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {  // <T> = can be SoccerPlayer, FootballPlayer, or BaseballPlayer
                        //      = ANY Class can be passed to Team
                // Should accept ONLY Player class and it's subclasses
    // ^^ = <T extends Player> = T = any object of Player or child class of Player

    private String name;

    private List<T> members = new ArrayList<T>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){

        if (members.contains(player)){
            System.out.println(((Player)player).getName() + " is already on the team");
            return false;
        }else {
            members.add(player);
            System.out.println(((Player)player).getName() + " picked for team" + this.name);
            return true;
        }
    }
}
