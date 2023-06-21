public class Java3_9
{
    public static void main(String ar[])
    {
        String str1="Welcome";
        String str2="to";
        String str3 = "Java";
        String reversedStr = "";
        System.out.println(str1.length());
        char ch=str1.charAt(5);
        System.out.println(ch);
        String str4 = str1.concat(" ").concat(str2).concat(" ").concat(str3);
        System.out.println(str4);
        System.out.println(str1.equals(str2));
        System.out.println(str1.startsWith("W"));
        System.out.println(str1.endsWith("n"));
        System.out.println("Substring: " +str1.substring(3));
        System.out.println(str4.lastIndexOf("e", 5));
        System.out.println(str4.indexOf("to"));
        for (int i = 0; i < str4.length(); i++) {
            reversedStr = str4.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: "+ reversedStr);
    }
}
