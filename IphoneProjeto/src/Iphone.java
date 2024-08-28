public class Iphone implements AparelhoTelefonico,ReprodutorMusical,NavegadorInternet{
    public  void ligar(){
        System.out.println("Ligando");
    }

    public void atender(){
        System.out.println("Atendendo");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }

    public void tocar(){
        System.out.println("Tocando musica");
    }

    public void pausar(){
        System.out.println("Pausando musica");
    }

    public void selecionarMusica(String musica){
        System.out.println("Selecionando musica " + musica);
    }

    public void exibirPagina(){
        System.out.println("exibindo pagina");
    }

    public void adicionarNovaAba(){
        System.out.println("adicionando pagina");
    }

    public void atualizarPagina(){
        System.out.println("atualizando pagina");
    }
}
