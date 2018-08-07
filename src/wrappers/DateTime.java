package wrappers;
import java.time.Instant;

public class DateTime {

	public static void main(String[] args) {
		
		Instant now = Instant.now();
		System.out.println(now);
		
		
		System.out.println(now.getEpochSecond());
		System.out.println(now.getNano());
		
		Instant earlier = now.minusSeconds(20);
		System.out.println(earlier);
		
		System.out.println(now.isAfter(earlier));

	}

}
