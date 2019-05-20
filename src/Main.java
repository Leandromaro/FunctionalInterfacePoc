import Interfaces.MiddleInterface;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate plus10Days = now.plusDays(10);
        LocalDate plus5Days = now.plusDays(5);
        MiddleInterface<LocalDate> middleInterface = (from, to, dateToEvaluate) -> from.isBefore(dateToEvaluate) && to.isAfter(dateToEvaluate);
        System.out.println(middleInterface.isBetween(now, plus10Days, plus5Days));
    }
}
