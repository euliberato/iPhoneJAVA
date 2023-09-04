import main.funcionalidades.AparelhoTelefonico;
import main.funcionalidades.NavegadorInternet;
import main.funcionalidades.ReprodutorMusical;

public class SmartPhone {
    public static void main(String[] args) {

        ReprodutorMusical musica = new ReprodutorMusical();
        AparelhoTelefonico chamadas = new AparelhoTelefonico();
        NavegadorInternet browser = new NavegadorInternet();

        musica.tocar();
        chamadas.ligar();
        browser.exibirPagina();
        
    }
}
