package edu.curso;

public class TesteCarro {

    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setModelo("Onix");

        Pneu p3 = c1.getP1();
        System.out.println("Potencia do motor do carro: " + c1.getPotenciaMotor());
        c1 = null;

//        Pneu p2 = new Pneu();
//        p2.setFabricante("Michelin");
//        c1.setP1(p2);

//        System.out.println("Carro : " + c1.getModelo());
//        System.out.println("com Pneu : " + c1.getP1().getFabricante());

        System.out.println("Carro : " + c1);
        System.out.println("Pneu : " + p3.getFabricante());

    }
}
