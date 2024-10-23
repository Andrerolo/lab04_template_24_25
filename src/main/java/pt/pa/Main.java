package pt.pa;

import pt.pa.adts.*;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {5,1,4,3,7,4,8,9,1,4,6,4,7,6,9,5,3,6,8,4,6,9};

        Map<Integer, Integer> uniqueCount = new MapList<>();
        //Map<Integer, Integer> uniqueCount = new MapBST<>();

        for(int num : numbers) {
            if(uniqueCount.containsKey(num)) {
                int curCount = uniqueCount.get(num);
                uniqueCount.put(num, curCount + 1);
            } else {
                uniqueCount.put(num, 1);
            }
        }

        System.out.println(uniqueCount);
        //TODO: 1. show only unique numbers
        // TODO 1: Exibir apenas números únicos
        System.out.println("\nNúmeros únicos:");
        for (Integer key : uniqueCount.keys()) {
            System.out.println(key); // Imprime as chaves (números únicos)
        }

        // TODO 2: Exibir números únicos ordenados e suas respectivas ocorrências
        System.out.println("\nNúmeros únicos ordenados e suas ocorrências:");
        for (Integer key : uniqueCount.keys()) {
            System.out.printf("Número: %d, Ocorrências: %d\n", key, uniqueCount.get(key));
        }

        // Testa a remoção de algumas chaves e exibe a árvore resultante
        System.out.println("\nRemovendo o número 4 (com múltiplas ocorrências):");
        uniqueCount.remove(4); // Remove o número 4
        System.out.println(uniqueCount);

        System.out.println("\nRemovendo o número 7:");
        uniqueCount.remove(7); // Remove o número 7
        System.out.println(uniqueCount);

        System.out.println("\nRemovendo o número 1:");
        uniqueCount.remove(1); // Remove o número 1
        System.out.println(uniqueCount);

    }

}
