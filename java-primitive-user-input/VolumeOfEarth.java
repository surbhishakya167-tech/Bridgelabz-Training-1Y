public class VolumeOfEarth {
    public static void main(String[] args) {
        double r = 6378;
        double pi = 3.14;
        double volumeKm = (4/3)*pi*r*r*r;
        double radiusMiles = r*0.621371;
        double volumeMiles = (4/3)*pi*radiusMiles*radiusMiles*radiusMiles;
		System.out.println("The volume of earth in cubic kilometers is "+volumeKm);
        System.out.println("The volume of earth in cubic miles is "+volumeMiles);
    }
}

