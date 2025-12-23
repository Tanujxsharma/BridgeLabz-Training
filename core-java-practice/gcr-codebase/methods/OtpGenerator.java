
public class OtpGenerator {
    
    // Method to generate a 6-digit OTP number
    public static int generateOtp() {
        int otp = (int) (100000 + Math.random() * 900000);
        return otp;
    }
    
    // Method to validate if all OTPs are unique
    public static boolean validateUniqueOtp(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        // Array to store 10 OTP numbers
        int[] otps = new int[10];
        
        System.out.println("Generating 10 OTP numbers...\n");
        
        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOtp();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }
        
        System.out.println();
        
        // Validate if all OTPs are unique
        boolean isUnique = validateUniqueOtp(otps);
        
        if (isUnique) {
            System.out.println(" All OTPs are unique!");
        } else {
            System.out.println(" Some OTPs are duplicate!");
        }
        
    }
}