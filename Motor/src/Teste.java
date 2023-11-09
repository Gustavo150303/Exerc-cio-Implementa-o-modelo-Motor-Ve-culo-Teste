import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main (String[] args){
        ArrayList<Veiculo> lista = new ArrayList<>(5);
        Scanner sc = new Scanner(System.in);
        boolean etapaConcluida = false;
        do {
            System.out.println("[1]cadastrar veiculo [2]ler veiculo [3]sair");
            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    if(lista.size() <5) {
                        System.out.println("Digite a placa");
                        String placa = sc.nextLine();

                        System.out.println("Digite a marca");
                        String marca = sc.nextLine();

                        System.out.println("Digite o modelo");
                        String modelo = sc.nextLine();

                        System.out.println("Digite a cor");
                        String cor = sc.nextLine();

                        System.out.println("Digite a velocidade máxima");
                        float veloxMax = sc.nextFloat();

                        System.out.println("Digite a quantidade de rodas");
                        int qtdRodas = sc.nextInt();

                        System.out.println("Digite a quantidade de pistões: ");
                        int qtdPistoes = sc.nextInt();

                        System.out.println("Digite a potência: ");
                        int potencia = sc.nextInt();
                        Motor motor = new Motor();
                        Veiculo veiculo = new Veiculo();
                        veiculo.setCor(cor);
                        veiculo.setMarca(marca);
                        veiculo.setModelo(modelo);
                        motor.setPotencia(potencia);
                        motor.setQtdPist(qtdPistoes);
                        veiculo.setMotor(motor);
                        veiculo.setPlaca(placa);
                        veiculo.setQtdRodas(qtdRodas);
                        veiculo.setVeloxMax(veloxMax);
                        lista.add(veiculo);
                    }
                    else{
                        System.out.println("a lista está cheia");
                    }
                    break;
                case 2:
                    for(Veiculo v : lista){
                        System.out.println(v.toString());
                    }
                    break;
                case 3:
                    etapaConcluida=true;
            }
        }while(!etapaConcluida);
    }
}
