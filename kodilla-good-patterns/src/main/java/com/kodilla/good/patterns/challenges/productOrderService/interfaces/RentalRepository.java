package com.kodilla.good.patterns.challenges.productOrderService.interfaces;

import com.kodilla.good.patterns.challenges.productOrderService.User;

import java.time.LocalDateTime;

public interface RentalRepository {


    void createRental(User user, LocalDateTime from, LocalDateTime to);

}
