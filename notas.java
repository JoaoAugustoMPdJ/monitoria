public class Notas {
public static double media(double[] valores) {
if (valores.length == 0) return 0;
double soma = 0;
for (double v : valores) soma += v;
return soma / valores.length;
}


public static void main(String[] args) {
double[] turma = {7.0, 8.5, 9.0};
System.out.println("Média da turma: " + media(turma));
}
}