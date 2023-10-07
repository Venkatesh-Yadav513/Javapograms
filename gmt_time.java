import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class ChennaiTimeToGMT {
    public static void main(String[] args) {
        // Get the current time in Chennai time zone
        ZonedDateTime chennaiTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata")); // "Asia/Kolkata" is the time zone ID for Chennai
        
        // Convert Chennai time to GMT
        ZonedDateTime gmtTime = chennaiTime.withZoneSameInstant(ZoneId.of("GMT"));
        
        // Format the GMT time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String formattedTime = gmtTime.format(formatter);
        
        // Print the formatted GMT time
        System.out.println("Current time in Chennai (GMT): " + formattedTime);
    }
}
