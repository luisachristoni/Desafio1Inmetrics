package suport;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Generator {
	public static String datetime() {
		Timestamp time = new Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("ddMMyyyyhhmmss").format(time);
	}

}
