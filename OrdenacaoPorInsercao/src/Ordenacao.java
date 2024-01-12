import java.util.List;

public class Ordenacao {
    private int[] arr;

    public Ordenacao(int[] arr) {
        this.arr = arr;
    }

    public Ordenacao(List<Integer> arr) {
        this.arr = arr.stream().mapToInt(Integer::intValue).toArray();
    }

    public void ordenar() {
        for (int j = 1; j < arr.length; j++) {
            int chave = arr[j], i = j - 1;
            while (i >= 0 && arr[i] > chave) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = chave;
        }
    }

    public int[] getArr() {
        return arr;
    }
}