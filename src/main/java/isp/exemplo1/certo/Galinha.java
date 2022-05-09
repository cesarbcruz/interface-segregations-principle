package isp.exemplo1.certo;

import java.text.MessageFormat;

public class Galinha implements Aves {

    private String latitude;
    private String longitude;

    @Override
    public void setLocalizacao(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String renderizar() {
        return MessageFormat.format("https://maps.google.com/?q={0},{1}", this.latitude, longitude);
    }
}
