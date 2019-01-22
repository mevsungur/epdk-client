package client;

import com.mevlutsungur.BildirimPetrol8FirmaBultenLocator;
import com.mevlutsungur.BildirimPetrol8FirmaBultenPortType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.rpc.ServiceException;
import java.io.StringReader;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ClientMain {

  public static void main(String[] argv) throws RemoteException, ServiceException, JAXBException {

      BildirimPetrol8FirmaBultenLocator locator = new BildirimPetrol8FirmaBultenLocator();
      BildirimPetrol8FirmaBultenPortType service = locator.getbildirimPetrol8FirmaBultenHttpSoap11Endpoint();

      System.out.println("Uygulama başladı");

      LocalDate localDate1 = LocalDate.of(2017, 01, 01);

      for (int i = 0; i < 365; i++) {
          String formattedDate = localDate1.plusDays(i).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

          String sorguYanit = service.genelSorgu(71L, formattedDate);

          Unmarshaller unmarshaller = null;

              JAXBContext jaxbContext = JAXBContext.newInstance(EpdkResponseObject.class);
              unmarshaller = jaxbContext.createUnmarshaller();


              StringReader reader = new StringReader(sorguYanit);
              EpdkResponseObject mappedResponse = (EpdkResponseObject) unmarshaller.unmarshal(reader);

              List<PetrolPiyasasiEnYuksekHacimliSekizFirmaninAkaryakitFiyatlari> liste =
                      mappedResponse.getPetrolPiyasasiEnYuksekHacimliSekizFirmaninAkaryakitFiyatlari();

              liste.forEach(e -> {
                  if(e.getYakitTipi().equals("Motorin"))
                  System.out.println(formattedDate + "\t " + e.getFiyat());

              });




      }


  }}