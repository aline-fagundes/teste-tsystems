public class StringChallenge {

    public static String StringChallenge(String str) {

        StringBuilder result = new StringBuilder();

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); ) {
            if (Character.isLetter(str.charAt(i))) {
                result.append(Character.toUpperCase(str.charAt(i)));
                i++;

                while (i < str.length() && Character.isLetter(str.charAt(i))) {
                    result.append(str.charAt(i));
                    i++;
                }
            } else {
                i++;
            }
        }
        return result.toString();
    }
}
