import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String nome= "isa";
        char caractere= 'i';
        int y = 32;
        double x = 10.258;
        System.out.printf("nome: %s",nome);
        System.out.println("bom dia");
        System.out.println(y);
        System.out.printf("%.4f\n",x);
        Locale.setDefault(Locale.US);
}
}