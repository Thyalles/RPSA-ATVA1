public class Configurador {
    private static Configurador instancia;
    
    private String tema;

private Configurador() {
        this.tema = "Modo Escuro";
        System.out.println("Instância do Configurador criada pela primeira vez.");
    }

    public static Configurador getInstancia() {
        if (instancia == null) {
            instancia = new Configurador();
        }
        return instancia;
    }

    public String getTema() { return tema; }
    public void setTema(String tema) { this.tema = tema; }
}