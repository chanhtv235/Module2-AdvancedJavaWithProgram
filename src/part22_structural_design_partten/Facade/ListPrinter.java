package part22_structural_design_partten.Facade;

import java.util.List;

public class ListPrinter {
    public void printList(List<Integer> numbers){
        for (Integer number: numbers) {
            System.out.println(number);
        }
    }
}