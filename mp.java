import java.util.*;

public class mp {
    public static void main(String[] args) {
        Map<Integer, Integer> np = new LinkedHashMap<>();

        np.put(10 ,100);
        np.put(19 , 98);
        np.put(10 , 98);
        np.put(17 , 34);
        np.put(12 , 45);


        for(Map.Entry<Integer, Integer> i: np.entrySet()){
                System.out.println(i.getKey() + " " + i.getValue());
        }


        np.remove(19);

        if(np.containsKey(10)){
            System.out.println("Marks Of Roll no " + np.get(10));
        }
        else{
            System.out.println("Student not found\n" );
        }


        np.put(10 , 56);


        for(Map.Entry<Integer , Integer> i : np.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}