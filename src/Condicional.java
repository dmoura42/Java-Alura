public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        double notaDoFilme = 8.1;
        boolean incluidoNoPlano = true;
        String tipoPlano = "normal";


        System.out.println("Lançamento que os clientes estão curtindo!");

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação.");
        }
    }
}
