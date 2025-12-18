public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;
        int penPerStudent = totalPens / students; // Calculate pens per student
        int remainingPens = totalPens % students; // Calculate remaining pens
        System.out.print("The Pen Per Student is"+penPerStudent+"and the remaning pen not distributed is "+remainingPens);
    }
}