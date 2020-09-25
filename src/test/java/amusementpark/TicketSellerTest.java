package amusementpark;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TicketSellerTest {

    // note that when and then could be a one-liner if it wasn't an example
    @Test
    @DisplayName(value = "Given visitor under 13 when checks if can buy ticket then return false")
    void visitorUnder13CanBuyReturnsFalse() {
        // given, arrange
        var visitor = new Visitor(12, 150);
        var seller = new TicketSeller();

        // when, act
        boolean canBuy = seller.canBuy(visitor);

        // then, assert
        Assertions.assertFalse(canBuy);
    }

    // note how DRY is violated by this and test above
    @Test
    @DisplayName(value = "Given visitor under 140 cm when checks if can buy ticket then return false")
    void visitorUnder140CmCanBuyReturnsFalse() {
        // given, arrange
        var visitor = new Visitor(16, 130);
        var seller = new TicketSeller();

        // when, act
        boolean canBuy = seller.canBuy(visitor);

        // then, assert
        Assertions.assertFalse(canBuy);
    }

    @Test
    @DisplayName(value = "Given visitor can't buy ticket when tries to buy ticket then not allowed")
    void visitorNotAllowedCantBuyTicket() {
        // given, arrange
        var visitor = new Visitor(11, 110);
        var seller = new TicketSeller();

        // when, act
        // then, assert
        Assertions.assertThrows(TicketSeller.CannotBuyException.class, () -> seller.sellTicker(visitor));
    }

}