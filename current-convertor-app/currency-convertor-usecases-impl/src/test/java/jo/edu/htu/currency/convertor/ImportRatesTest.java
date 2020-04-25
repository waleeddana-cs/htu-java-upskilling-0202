package jo.edu.htu.currency.convertor;

import jo.edu.htu.currency.model.ExchangeRateRepository;
import jo.edu.htu.currency.model.DBExchangeRateRepository;

import java.nio.file.Paths;

public class ImportRatesTest {

    public static void main(String[] args) {
        ExchangeRateRepository repository = new DBExchangeRateRepository();
        ImportRatesHandler importRatesHandler = new BISImportRatesHandler(repository);

        ImportRequest request = new ImportRequest(Paths.get(".", "table-i3-e.csv"));
        importRatesHandler.importRates(request);
    }
}
