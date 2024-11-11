package vttp.batchb.ssf.day11Workshop.imageController;

import java.util.*;

public class RandomImage {
      
    private static List<String> list = new ArrayList<>();
    
    public static List addImage(){
        list.add("Images/desert.jpg");
        list.add("Images/forest.jpg");
        list.add("Images/ocean.jpg");

        return list;
    }


}
