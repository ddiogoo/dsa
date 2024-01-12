import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Qual o tamanho do array que você deseja ordenar?");
        System.out.println("Os valores do array serão criados de forma aleatória");

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o tamanho: ");
        int size = sc.nextInt();
        sc.close();

        int[] arr = generateArray(size);
        System.out.println("Array atual: " + show(arr));

        Ordenacao ordenacaoPorInsercao = new Ordenacao(arr);
        ordenacaoPorInsercao.ordenar();

        System.out.println("Array após ordenação: " + show(ordenacaoPorInsercao.getArr()));
    }

    private static int[] generateArray(int size) {
        Random r = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt() % size + 1;
        }
        return arr;
    }

    private static String show(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i : arr) {
            sb.append(i + ", ");
        }
        String strSb = sb.toString();
        return strSb.substring(0, strSb.length() - 2) + "]";
    }

}
