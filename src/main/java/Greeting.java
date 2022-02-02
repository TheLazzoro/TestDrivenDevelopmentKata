import java.util.ArrayList;
import java.util.Locale;

public class Greeting {
    public String greet(Object name) {

        if (name == null || name == "") {
            return "Hello, my friend.";
        } else if (name instanceof String) {
            String nameStr = (String) name;

            if(nameStr.contains(",")) {
                String[] names = nameStr.split(",");
                return greet_multiple(names);
            }

            if (name.equals(nameStr.toUpperCase())) {
                return "HELLO, " + name + "!";
            }
            return "Hello, " + name + ".";

        } else if (name instanceof String[]) {
            return greet_multiple(name);
        }

        return null;
    }

    private String greet_multiple(Object name) {
        String[] names = (String[]) name;
        String message = "Hello";

        ArrayList<String> normalNames = new ArrayList<String>();
        ArrayList<String> shoutedNames = new ArrayList<String>();

        for (int i = 0; i < names.length; i++) {
            String n = names[i];

            if (n.equals(n.toUpperCase())) {
                shoutedNames.add(n);
            } else {
                normalNames.add(n);
            }
        }

        for (int i = 0; i < normalNames.size(); i++) {
            String n = normalNames.get(i);

            if (i == normalNames.size() - 1) {
                message += " and " + n;
            } else {
                message += ", " + n;
            }
        }

        message += ".";

        for (int i = 0; i < shoutedNames.size(); i++) {
            String n = shoutedNames.get(i);

            message += " AND HELLO " + n + "!";
        }

        return message;
    }
}
