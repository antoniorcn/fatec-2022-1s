package edu.curso;

public class EstouroHeap {
    public static void main(String[] args) {
        No raiz = new No();
        // raiz.payload = 10;
        System.out.println("Raiz : " + raiz +
                "  Payload: " + raiz.payload);

        No temp = raiz;


        while(true) {
            temp.proximo = new No();
            temp = temp.proximo;
            System.out.println("Temp : " + temp +
                    "  Payload: " + temp.payload);
        }


//        System.out.println("Temp : " + temp +
//                "  Payload: " + temp.payload);
//
//        No a = temp;
//        System.out.println("A : " + a +
//                "  Payload: " + a.payload);
//
//        raiz.proximo = new No();
//        raiz.proximo.payload = 10;
//        a = raiz.proximo;
//        System.out.println("A : " + a +
//                "  Payload: " + a.payload);

    }
}
