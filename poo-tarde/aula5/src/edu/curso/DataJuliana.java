package edu.curso;

public class DataJuliana {

    public int calcularData(int ano, int mes, int dia) {
        int diaJuliano = ( 1461 * ( ano + 4800 + ( mes - 14)/12 )  ) / 4 +

                ( 367 * ( mes - 2- 12 * (  ( mes - 14)/12 )  ) ) /12 -

                ( 3 * ( ( ano + 4900 + ( mes - 14 ) / 12 ) / 100 )  ) / 4 +

                dia - 32075;
        return diaJuliano;
    }

    public static void main(String[] args) {
        DataJuliana dt = new DataJuliana();
        int diaJuliano = dt.calcularData(2016, 8, 5);
        System.out.println("Dia Juliano é : " + diaJuliano);
    }

}
