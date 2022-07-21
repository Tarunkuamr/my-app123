package validation;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class email {
	private static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	   public static void main(String args[]) {
	       List<String> emails = new ArrayList<String>();
	       emails.add("sai@gmail.com");
	       emails.add("sai.bhavanam@gmail.in");
	       emails.add("sai@gmail.me.org");
	       emails.add("sai_bhavanam61@gmail.com");
	       emails.add("sai-bhavanam61@gmail.com");
	       emails.add("@sai gmadil.com");
	       emails.add("sai&gmail.com");
	       emails.add("sai4#@gmail.me.org");
	       emails.add("@sai3.gmail.com");
	Pattern pattern = Pattern.compile(regex);
	       for (String value : emails) {
	           Matcher matcher = pattern.matcher(value);
	System.out.println(value + " is " + (matcher.matches() ? "valid" : "invalid"));
	       }
	   }
	}

