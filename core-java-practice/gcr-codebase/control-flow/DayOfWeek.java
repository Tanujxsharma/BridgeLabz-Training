public class DayOfWeek {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int yearOfCentury = year % 100;
        int centuryNumber = year / 100;
        int dayOfWeekZeller = (day + (13 * (month + 1)) / 5 + yearOfCentury + yearOfCentury / 4 + centuryNumber / 4 - 2 * centuryNumber) % 7;
        int dayOfWeekIndex = (dayOfWeekZeller + 6) % 7;
        System.out.println(dayOfWeekIndex);
    }
}
