package isp.exemplo1;

import isp.exemplo1.certo.Aves;
import isp.exemplo1.certo.Galinha;
import isp.exemplo1.certo.Pombo;

import java.text.MessageFormat;

public class Exemplo1 {
    static void gerarLinkLocalizacao(Aves aves){
        System.out.println(MessageFormat.format("{0}: {1}", aves.getClass().getSimpleName(), aves.renderizar()));
    }

    public static void main(String[] args) {
        Galinha galinha = new Galinha();
        galinha.setLocalizacao("-22.55809", "-47.43757");
        gerarLinkLocalizacao(galinha);

        Pombo pombo = new Pombo();
        pombo.setLocalizacao("-22.55809", "-47.43757");
        pombo.setAltitude("645.69485015");
        gerarLinkLocalizacao(pombo);
    }
}
