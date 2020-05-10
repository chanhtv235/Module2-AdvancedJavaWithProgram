package StackAndQueue;

import java.util.*;

public class DemSoLanXuatHienCuaMotTuTrongChuoi {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sn=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sn.nextLine();
        s=s.toUpperCase();
        List<Character> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            arr.add((s.charAt(i)));
        }
        Map<Character,Integer> map=new TreeMap<>();
        for(Character c: arr){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
//        for(Map.Entry<Character,Integer> entry: map.entrySet()){
//            System.out.print(entry.getKey()+":"+entry.getValue()+" ");
//        }
        for (Character key: map.keySet()){
            System.out.println(key+":"+ map.get(key));
        }
    }
}
