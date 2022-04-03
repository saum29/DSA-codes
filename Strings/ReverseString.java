public class ReverseString {

    private static String hello = "Hello World";
    
    public static void main(String[] args)
    {
    System.out.println(reverseString(hello));
    }
    
    public static String reverseString(String s) {
    char c[] = s.toCharArray();
    int i = 0, j = c.length - 1;
    while (i < j) {
        char tmp = c[i];
        c[i] = c[j];
        c[j] = tmp;
        i++;
        j--;
    }
    return new String(c);
    }
    
    