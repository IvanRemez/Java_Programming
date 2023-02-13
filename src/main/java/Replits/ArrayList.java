package Replits;

import java.util.Arrays;

public class ArrayList {

    public static void main(String[] args) {

        java.util.ArrayList<String> hunt = new java.util.ArrayList<>();

        hunt.addAll(Arrays.asList("1","10","3","nanuk","nanuk"));

        int boast = 0;
        int nanuks = 0;
        int kills = 0;
        int wayStones = 0;
        boolean huntSuccessful = false;

        for (String each : hunt) {

            if (each.equalsIgnoreCase("nanuk")){
                nanuks++;
            }
        }
        for (int i = 0; i < hunt.size(); i++) {
            hunt.remove("nanuk");
        }

        for (int i = 0; i < hunt.size(); i++) {

            kills += Integer.parseInt(hunt.get(i));
        }

        if (wayStones >= nanuks){

            if (kills >= boast){
                huntSuccessful = true;
            }
        }


        System.out.println(hunt);
        System.out.println(nanuks);
        System.out.println(kills);


    }

}
