package teste;

public class Teste {
    public static void main(String[] args) {
        char c = 'c';
        int i = 10;
        double d = 10;
        long l = 1;
        String s = "Hello";
        
        //c = c + i;
        s += i;
        //i += s;
        //c += s;
        i += l;
        
        System.out.println(s);
        System.out.println(i);
    }
    
}
