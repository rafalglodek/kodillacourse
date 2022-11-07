package com.kodilla.good.patterns.challenges.productOrderService.Segway;

import com.kodilla.good.patterns.challenges.productOrderService.User;
import com.kodilla.good.patterns.challenges.productOrderService.interfaces.InformationService;

public class SegwayInformationService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Segway rent has been accepted!");
    }
}
