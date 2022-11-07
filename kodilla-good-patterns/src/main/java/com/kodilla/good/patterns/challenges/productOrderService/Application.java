package com.kodilla.good.patterns.challenges.productOrderService;

import com.kodilla.good.patterns.challenges.productOrderService.Segway.SegwayInformationService;
import com.kodilla.good.patterns.challenges.productOrderService.Segway.SegwayRentalRepository;
import com.kodilla.good.patterns.challenges.productOrderService.Segway.SegwayRentalService;

public class Application {

    public static void main(String[] args) {
        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
        RentRequest rentRequest = rentRequestRetriever.retrieve();

        RentalProcessor rentalProcessor = new RentalProcessor(
                new SegwayInformationService(), new SegwayRentalService(), new SegwayRentalRepository());
        rentalProcessor.process(rentRequest);
    }
}