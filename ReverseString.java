public class ReverseString {
    public static void main(String[] args) {
        String name = "PawanKumar";
        String reverseName = "";

        int n = name.length();
        
        for(int i=0; i<n; i++) {
            char ch = name.charAt(i);
            reverseName = ch + reverseName;
        }
        System.out.println("Original Name : " + name);
        System.out.println("Reversed Name : " + reverseName);

       

        // ----------------- Reverse using String Buffer ------------------

        // StringBuffer name = new StringBuffer();
        // name.append("Pawan Kumar Singh");
        // System.out.println("Name is : " + name);
        // name.reverse();
        // System.out.println("reversed name is : " + name);

    }
}
