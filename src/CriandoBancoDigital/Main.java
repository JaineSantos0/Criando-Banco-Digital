package CriandoBancoDigital;

public class Main {
    public static void main(String[] args) {

        Cliente Jaine = new Cliente();
        Jaine.setNome("Jaine");

        Conta cc = new ContaCorrente(Jaine);
        Conta poupanca = new ContaPoupanca(Jaine);

        cc.depositar(100);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
