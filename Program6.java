public class Program6 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        
        boolean notA = !a;
        System.out.println("!a: " + notA);

        // a | b (a OR b)
        boolean aOrB = a | b;
        System.out.println("a | b: " + aOrB);

        // (!a & b) | (a & !b)
        boolean complexExpression = (!a & b) | (a & !b);
        System.out.println("(!a & b) | (a & !b): " + complexExpression);
    }
}
