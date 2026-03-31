package workshop;

public interface GeoUtils {

    static double calculateDistance(String a, String b) {

        if(a.equalsIgnoreCase("agra") && b.equalsIgnoreCase("mathura")) return 70;
        if(a.equalsIgnoreCase("agra") && b.equalsIgnoreCase("delhi")) return 200;
        if(a.equalsIgnoreCase("agra") && b.equalsIgnoreCase("hathrus")) return 100;

        if(a.equalsIgnoreCase("mathura") && b.equalsIgnoreCase("agra")) return 70;
        if(a.equalsIgnoreCase("mathura") && b.equalsIgnoreCase("delhi")) return 140;
        if(a.equalsIgnoreCase("mathura") && b.equalsIgnoreCase("hathrus")) return 150;

        if(a.equalsIgnoreCase("delhi") && b.equalsIgnoreCase("agra")) return 200;
        if(a.equalsIgnoreCase("delhi") && b.equalsIgnoreCase("mathura")) return 140;
        if(a.equalsIgnoreCase("delhi") && b.equalsIgnoreCase("hathrus")) return 300;

        if(a.equalsIgnoreCase("hathrus") && b.equalsIgnoreCase("agra")) return 100;
        if(a.equalsIgnoreCase("hathrus") && b.equalsIgnoreCase("mathura")) return 150;
        if(a.equalsIgnoreCase("hathrus") && b.equalsIgnoreCase("delhi")) return 300;

        return 0;
    }
}
