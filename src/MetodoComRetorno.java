
public class MetodoComRetorno {
    public static void main(String[] args) {
        System.out.println(MetodoComRetorno.somar(2,3));
        System.out.println(MetodoComRetorno.mostrarPares(100));
        System.out.println(MetodoComRetorno.mostrarDiaPorExtenso(3));
        System.out.println(MetodoComRetorno.contarLetras("Banana"));
        }

    public static double somar(double a, double b){
        return a + b;
    }

    public static String mostrarPares(int valor) {
        String retorno = "";
        for (int a = 0; a <= valor; a = a + 2){
            retorno += a + " ";
        }
        return retorno;
    }

    public static String mostrarDiaPorExtenso(int dia){
        String extenso = "Domingo";
        if (dia == 2){
            extenso = "Segunda Feira";
        } else if (dia == 3) {
            extenso = "Terça Feira";
        } else if (dia == 4) {
            extenso = "Quarta Feira";
        } else if (dia == 5) {
            extenso = "Quinta Feira";
        } else if (dia == 6) {
            extenso = "Sexta Feira";
        } else if (dia == 7) {
            extenso = "Sabado";
        } else {
            extenso = "Dia desconhecido!";
        }
        return extenso;
    }

    public static int contarLetras(String palavra) {
        int quantidade = 0;
        palavra = palavra.toUpperCase();
        for (int a = 0; a < palavra.length(); a++){
            if (palavra.charAt(a) == 'A'){
                quantidade++;
            }
        }
        return quantidade;
    }

}