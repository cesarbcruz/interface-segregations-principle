package isp.exemplo1.certo;

public class Pombo implements AvesQueVoam {
    private String latitude;
    private String longitude;
    private String altitude;

    @Override
    public void setLocalizacao(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    @Override
    public String renderizar() {
        return "https://earth.google.com/web/@"+this.latitude+","+longitude+","+this.altitude+"a,46717.46645174d";
    }
}
