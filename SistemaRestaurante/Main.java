package SistemaRestaurante;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jucilene Garcia",1452441,117.5);
        cliente1.depositoInicial(200);
        cliente1.comprar(76.9);
        cliente1.comprar(113.45);
        cliente1.consulta();
        cliente1.novoDeposito(38);
        cliente1.consulta();
        cliente1.novoDeposito(90);
        cliente1.comprar(45);
        cliente1.consulta();
        cliente1.encerrarConta();
    }
}
