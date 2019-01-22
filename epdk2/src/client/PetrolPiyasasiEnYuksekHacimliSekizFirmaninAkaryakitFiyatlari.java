package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class PetrolPiyasasiEnYuksekHacimliSekizFirmaninAkaryakitFiyatlari {

    private String YakitTipi;

    private String Birim;

    private Double Fiyat;

    @Override
    public String toString() {
        return "AkaryakitFiyatlari{" +
                "YakitTipi='" + YakitTipi + '\'' +
                ", Birim='" + Birim + '\'' +
                ", Fiyat=" + Fiyat +
                '}';
    }

    public String getYakitTipi() {
        return YakitTipi;
    }

    public void setYakitTipi(String yakitTipi) {
        YakitTipi = yakitTipi;
    }

    public String getBirim() {
        return Birim;
    }

    public void setBirim(String birim) {
        Birim = birim;
    }

    public Double getFiyat() {
        return Fiyat;
    }

    public void setFiyat(Double fiyat) {
        Fiyat = fiyat;
    }
}
