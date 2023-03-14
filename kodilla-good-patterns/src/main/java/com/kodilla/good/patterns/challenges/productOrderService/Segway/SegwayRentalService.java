package com.kodilla.good.patterns.challenges.productOrderService.Segway;

import com.kodilla.good.patterns.challenges.productOrderService.User;
import com.kodilla.good.patterns.challenges.productOrderService.interfaces.RentalService;

import java.time.LocalDateTime;

public class SegwayRentalService implements RentalService {
    @Override
    public boolean rent(User user, LocalDateTime from, LocalDateTime to) {

        return true;
    }
}
