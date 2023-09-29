// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: MAavercick");
        int anoDelancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDelancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //media calculada com 3 notas
        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                 Filme Top Gun
                 Filme de aventura com galã dos anos 80
                 Muito bom!
                 Ano de laçamento
                 """ + anoDelancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);

        System.out.println(classificacao);

    }
}