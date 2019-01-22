package client;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "PetrolPiyasasiEnYuksekHacimliSekizFirmaninAkaryakitFiyatlariResult")
public class EpdkResponseObject {

    @XmlElement(name = "PetrolPiyasasiEnYuksekHacimliSekizFirmaninAkaryakitFiyatlari")
    private List<PetrolPiyasasiEnYuksekHacimliSekizFirmaninAkaryakitFiyatlari> PetrolPiyasasiEnYuksekHacimliSekizFirmaninAkaryakitFiyatlari;

    public List<client.PetrolPiyasasiEnYuksekHacimliSekizFirmaninAkaryakitFiyatlari> getPetrolPiyasasiEnYuksekHacimliSekizFirmaninAkaryakitFiyatlari() {
        return PetrolPiyasasiEnYuksekHacimliSekizFirmaninAkaryakitFiyatlari;
    }

    public void setPetrolPiyasasiEnYuksekHacimliSekizFirmaninAkaryakitFiyatlari(List<client.PetrolPiyasasiEnYuksekHacimliSekizFirmaninAkaryakitFiyatlari> petrolPiyasasiEnYuksekHacimliSekizFirmaninAkaryakitFiyatlari) {
        PetrolPiyasasiEnYuksekHacimliSekizFirmaninAkaryakitFiyatlari = petrolPiyasasiEnYuksekHacimliSekizFirmaninAkaryakitFiyatlari;
    }

    @Override
    public String toString() {
        return "Result{" +
                "PetrolPiyasasiEnYuksekHacimliSekizFirmaninAkaryakitFiyatlari=" + PetrolPiyasasiEnYuksekHacimliSekizFirmaninAkaryakitFiyatlari +
                '}';
    }
}
