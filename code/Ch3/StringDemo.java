public class StringDemo {
    public static void main(String[] args) {
        String slogan_eng = "Freedom is not free";
        System.out.println(slogan_eng);
        System.out.println(slogan_eng.toUpperCase());
        System.out.println(slogan_eng.charAt(5));
        System.out.println(slogan_eng.substring(4,6));
        System.out.println(slogan_eng.indexOf('o'));
        System.out.println(slogan_eng.indexOf('o',6));
        System.out.println("a".compareTo("d"));
    }
}