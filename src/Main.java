import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem ao cálculo salarial");
        String[] nome = new String[2];
        double[] salarioLiquido = new double[2];
        double[] salarioBruto = new double[2];
        double[] descontoINSS =new double[2];
        double[] descontoIR = new double[2];
        int i;

        for (i = 0; i < 2; i++) {
            System.out.printf("Digite o nome do funcionario %d:\n", (i + 1));
            nome[i] = sc.next();
            System.out.printf("Digite o salário bruto do funcionário %d:\n", (i + 1));
            salarioBruto[i] = sc.nextDouble();


        }


        for (i = 0; i < 2; i++) {
            if (salarioBruto[i] <= 1412.00) {
                descontoINSS[i] = salarioBruto[i] * 0.075;
                if (salarioBruto[i] >= 2259.21 && salarioBruto[i] <= 2826.65){
                    descontoIR[i] = salarioBruto[i] * 0.075;
                }
                salarioLiquido[i] = salarioBruto[i] - (descontoINSS[i] + descontoIR[i]);

            } else if (salarioBruto[i] >= 1412.01 && salarioBruto[i] <= 2666.86) {
                descontoINSS[i] = salarioBruto[i] * 0.09;
                if (salarioBruto[i] >= 2826.66 && salarioBruto[i] <= 3751.05){
                    descontoIR[i] = salarioBruto[i] * 0.15;
                }
                salarioLiquido[i] = salarioBruto[i] - (descontoINSS[i] + descontoIR[i]);
            } else if (salarioBruto[i] >= 2666.69 && salarioBruto[i] <= 4000.03) {
                descontoINSS[i] = salarioBruto[i] * 0.12;
                if (salarioBruto[i] >= 3751.06 && salarioBruto[i] <= 4664.68){
                    descontoIR[i] = salarioBruto[i] * 0.225;
                }
                salarioLiquido[i] = salarioBruto[i] - (descontoINSS[i] + descontoIR[i]);
            } else if (salarioBruto[i] >= 4000.04) {
                descontoINSS[i] = salarioBruto[i] * 0.14;
                if (salarioBruto[i] >= 4664.68 ){
                    descontoIR[i] = salarioBruto[i] * 0.275;
                }
                salarioLiquido[i] = salarioBruto[i] - (descontoINSS[i] + descontoIR[i]);
            }

            System.out.printf("Nome do funcioário: %S. \nSalário bruto: %.2f.\nDesconto INSS: %.2f.\n" +
                    "Desconto IR: %.2f. \nSalário liquido: %.2f\n", nome[i], salarioBruto[i], descontoINSS[i], descontoIR[i], salarioLiquido[i]);
        }


    }
}

