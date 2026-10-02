public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo Pagina " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionado nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica " + musica);
    }


    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        System.out.println("----Testando Reprodutor musical----");
        iphone.selecionarMusica("Eu já tava bem");
        iphone.tocar();
        iphone.pausar();

        System.out.println("\n----Testando Aparelho Telefonico----");
        iphone.ligar("75981811331");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\n----Testando Navegador de Internet----");
        iphone.exibirPagina("https://www.netflix.com/browse");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
    }
}

