public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;

    public iPhone(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música!");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o telefone, aguarde...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página na internet...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba do navegador, carregando...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }

    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone("iPhone 2007");

        System.out.println("Modelo do iPhone: " + meuIPhone.getModelo());

        System.out.println("# Reprodutor Musical #");
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica();

        System.out.println("# Aparelho Telefonico #");
        meuIPhone.ligar();
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        System.out.println("# Navegador na Internet #");
        meuIPhone.exibirPagina();
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
