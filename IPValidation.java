import java.util.Scanner;

public class IPValidation {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String s = getString();
        if(s.contains("."))
            System.out.println(checkIPv4(s));
        if(s.contains(":"))
            System.out.println(checkIpv6(s));
    }


    private static String getString() {
        String s = scan.nextLine();
        if(s.charAt(0)=='0'){
            System.out.println("Invalid Input due to 0 at the beginning ");
            return null;
        }
        return s;
    }

    private static String checkIPv4(String s) {
        int i;
        String[] contents = s.split("\\.");
        if(contents.length!=4)
            return "Invalid size for IPv4";
        for(String string : contents){
            int convertedIntValue = Integer.parseInt(string);
            if(convertedIntValue <0 || convertedIntValue >255){
                return "Invalid values  for an IPv4 Address";
            }
        }
        for(i=0;i<s.length();i++){
            if((int)s.charAt(i)>64 && (int)s.charAt(i)<122){
                System.out.println("Invalid Address Input due to Alphabetical Input");
                break;
            }
        }if (s.contains("0")){
            i = s.indexOf("0");
            if (s.charAt(i - 1)=='.'){
                System.out.println("Invalid Input due to . after 0 ");
            }
        }
        return "IPv4";
    }

    private static String checkIpv6(String s) {
        if (s.contains("::")) {
            System.out.println("Invalid Input due to consecutive colons");
        }
        String[] contents = s.split(":");
        int size = contents.length;
        for(int i=0;i<contents.length;i++) {
            if (contents[i] == "0000") {
                size--;
            }
        }
        if(size==7)
            return "Invalid IPv6 Address";
        return "Ipv6";
    }

}
