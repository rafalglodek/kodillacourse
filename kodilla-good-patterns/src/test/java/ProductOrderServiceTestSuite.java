import com.kodilla.good.patterns.challenges.productOrderService.*;
import com.kodilla.good.patterns.challenges.productOrderService.Segway.SegwayInformationService;
import com.kodilla.good.patterns.challenges.productOrderService.Segway.SegwayRentalRepository;
import com.kodilla.good.patterns.challenges.productOrderService.Segway.SegwayRentalService;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class ProductOrderServiceTestSuite {
    @Test
    void testRentalProcessor() {
        //Given
        User John = new User("John", "Doe");
        RentRequest rentRequest = new RentRequest(John, LocalDateTime.of(2017, 8, 1, 12, 0),
                LocalDateTime.of(2017, 8, 10, 12, 0));
        //RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();

        //rentRequestRetriever.retrieve();
        RentalProcessor rentalProcessor = new RentalProcessor(new SegwayInformationService(), new SegwayRentalService(),
                new SegwayRentalRepository());
        //RentalDto rentalDto = new RentalDto(John,true);
        rentalProcessor.process(rentRequest);


        //When

        //Then
        //assertEquals();
    }
}
