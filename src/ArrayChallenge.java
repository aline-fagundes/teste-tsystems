public class ArrayChallenge {

    public static String StringChallenge(String str) {

        StringBuilder result = new StringBuilder();

        str = str.toLowerCase();

        for(int i = 0; i < str.length();) {
            if(Character.isLetter(str.charAt(i))) {
                result.append(Character.toUpperCase(str.charAt(i)));
                i++;

                while(i < str.length() && Character.isLetter(str.charAt(i))) {
                    result.append(str.charAt(i));
                    i++;
                }
            } else {
                i++;
            }
        }
        if(result.length() > 0) {
            result.setCharAt(0, Character.toLowerCase(result.charAt(0)));
        }
        return TokenChallenge(result.toString());
    }

    public static String TokenChallenge(String str) {

        StringBuilder finalResult = new StringBuilder();
        finalResult.append(str + "e9qj5t08");

        for(int i = 3; i < finalResult.length(); i +=4) {

            finalResult.setCharAt(i, '_');
        }
        return finalResult.toString();
    }
}
