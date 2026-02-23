public class Main {
    public static void main(String[] args) {
        Configurador conf1 = Configurador.getInstancia();
        
        Configurador conf2 = Configurador.getInstancia();

        System.out.println("ID Objeto 1: " + System.identityHashCode(conf1));
        System.out.println("ID Objeto 2: " + System.identityHashCode(conf2));

        if (conf1 == conf2) {
            System.out.println("Sucesso: Ambas as variáveis apontam para a mesma instância única!");
        }
    }
}