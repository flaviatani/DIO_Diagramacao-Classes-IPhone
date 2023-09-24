package App;

import Tools.NavegadorInternet;
import Tools.ReprodutorMusical;
import Tools.Telefone;



public class IPhone implements ReprodutorMusical, Telefone, NavegadorInternet {


    @Override
    public void pagina() {
        System.out.println("Abrindo a pagina");
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Adicionando nova pagina");
    }


    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo musica");
    }

    @Override
    public void pausar() {
        System.out.println("Parando a musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo correio de voz");
    }

}
