public class Iphone implements ReprodutorMusical, AparelhoTelefônico, NavegadornaInternet {

    // Reprodutor musical
    public void tocar(){
        System.out.println("TOCANDO PELO IPHONE");
    }

    public void pausar(){
        System.out.println("PAUSANDO PELO IPHONE");
    }

    public void selecionarMusica(String musica){
        System.out.println("SELECIONANDO A MUSICA " + musica + " PELO IPHONE");
    }
    
    // Aparelho telefônico
    public void ligar(String numero){
        System.out.println("LIGANDO PARA O NÚMERO " + numero + " PELO IPHONE");
    }

    public void atender(){
        System.out.println("ATENDENDO PELO IPHONE");
    }

    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ PELO IPHONE");
    }

    // Navegador na internet
    public void exibirPagina(String url){
        System.out.println("EXIBINDO PÁGINA " + url + " PELO IPHONE");
    }

    public void adicionarNovaAba(){
        System.out.println("ADICIONANDO NOVA ABA PELO IPHONE");
    }

    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PÁGINA PELO IPHONE");
    }

}
