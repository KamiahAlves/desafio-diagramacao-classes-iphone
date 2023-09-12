// Interface para o Reprodutor Musical
public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Interface para o Aparelho Telefônico
public interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

// Interface para o Navegador na Internet
public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba(String url);
    void atualizarPagina();
}

// Classe que representa o iPhone, implementando as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos das interfaces
  
    public void tocar() {
    }

    public void pausar() {
    }

    public void selecionarMusica(String musica) {
    }

    public void ligar(String numero) {
    }

    public void atender() {
       
    }

    public void iniciarCorreioVoz() {
       
    }

    public void exibirPagina(String url) {
    }

    public void adicionarNovaAba(String url) {
    }

    public void atualizarPagina() {
    }
}
