public class Second {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        double d = Math.cos(Math.PI * Math.max(a, b) / 180);
        System.out.println(d);
    }
}
