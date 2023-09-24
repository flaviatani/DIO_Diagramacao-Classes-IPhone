package Componente;

import Tools.NavegadorInternet;
import Tools.ReprodutorMusical;
import Tools.Telefone;

import App.*;

public class ComponenteIphone {
    public static void main(String[] args){
        IPhone iphone = new IPhone();
        ReprodutorMusical musica = (ReprodutorMusical) iphone;
        Telefone telefonico = (Telefone) iphone;
        NavegadorInternet internet = (NavegadorInternet) iphone;


        System.out.println("Musica");
        musica.selecionarMusica();
        musica.tocar();
        musica.pausar();
        System.out.println(" ");

        System.out.println("Telefone");
        telefonico.ligar();
        telefonico.atender();
        telefonico.iniciarCorreioVoz();
        System.out.println(" ");

        System.out.println("Internet");
        internet.pagina();
        internet.adicionarNovaPagina();
        internet.atualizarPagina();
    }
}