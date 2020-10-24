package u6fila;

import utils.JOptionPaneUtil;

public class Main {

    public static void main(String[] args) {

        var cap = JOptionPaneUtil.exibirJanelaDeEntrada("Digite a capacidade: ");

        var fila = new TadFila(Integer.parseInt(cap));

        fila.exibir();

        int []v = new int[]{6, 8, 2, 5, 9, 4, 1, 11};
        for (int i : v) {
            System.out.println("Enfileirando " + i);

            fila.enfileirar(i);
            fila.exibir();
        }

        System.out.println("\nDesempilhando itens");
        int i = 8;
        while (i > 0) {
            int valor = fila.desenfileirar();
            if (valor == -1) {
                System.out.println("Não foi possível desenfileirar.\n");
            } else {
                System.out.println("Desenfileirou: " + valor + "\n");
            }
            fila.exibir();
            i--;
        }
        fila.exibir();
    }
}
