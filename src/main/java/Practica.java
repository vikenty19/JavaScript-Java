import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practica {
    static final int wheels = 4;
     String color;
    int x = 5;
    public static void main(String[] args) {
        Map<String,String> body = new HashMap<>();
        body.put("person1","Petya");
        body.put("person2","vasya");
        body.put("person3","Dima");
        String a = "turandot ";
        String b = "princess";
        String c = "the ";
        String d = a.concat(c).concat(b);
        System.out.println(d);
        for(String temp:body.keySet()){
         System.out.println(body.get(temp));

     }
        Practica p = new Practica();
        p.color = "green";
        System.out.println(Practica.wheels);

//create List of HashMap
        List<HashMap<String,String>> list = new ArrayList<>();
       HashMap<String,String >map = new HashMap<>();
       map.put("1","One");
       map.put("2","Two");
        HashMap<String,String >map1 = new HashMap<>();
        map1.put("3","Three");
        map1.put("4","Four");
        list.add(map);
       list.add(map1);
        System.out.println(list);

}}