import java.text.DecimalFormat;
import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args) {
        //Definicion de Variable
        double resis1 = 0, resis2 = 0, resis3 = 0, rt = 0;
        int cont = 1;
        double dato;
        //instancia para formato de decimales
        DecimalFormat df = new DecimalFormat("#.0");
        //instancia de Scanner para leer datos desde Teclado
        Scanner sc = new Scanner(System.in);
        System.out.println  ("**********************************************");
        System.out.println  ("*             Calculo de Resistencia         *");
        System.out.println  ("**********************************************");
        //Ciclo de control de cantidad de datos ingresado
            while (cont <= 3) {
                System.out.print("*");
                System.out.print("   Ingrese resistencia " + cont + ": ");
                dato = sc.nextDouble();
                //sc.nextLine();
                if (dato >=0) {
                    //Asignacion de valor ingresado a cada variable x ingreso
                    if (cont == 1) {
                        resis1 = dato;
                    } else if (cont == 2) {
                        resis2 = dato;
                    } else {
                        resis3 = dato;
                    }
                    cont++;
                }else {
                    System.out.println("Debe Ingresar Solo Datos Positivos");
                }
                if (cont == 4) {
                    dato = -1;
                }
            }
            //Calculo de Resistencias por Separado
            double calcResis1 = (1 / resis1);
            double calcResis2 = (1 / resis2);
            double calcResis3 = (1 / resis3);
            //Calculo de la Resistencia Total
            rt = 1 / (calcResis1 + calcResis2 + calcResis3);
            //muestra por pantalla de variable de Resistencia Total
        System.out.println  ("**********************************************");
        System.out.println  ("La resistencia total es de : " + df.format(rt));
        System.out.println  ("**********************************************");







    }
}
