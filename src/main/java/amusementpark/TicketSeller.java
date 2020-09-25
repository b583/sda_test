package amusementpark;

class TicketSeller {

    private static final int MIN_AGE = 13;
    private static final int MIN_HEIGHT = 140;

    void sellTicker(Visitor visitor) throws CannotBuyException {
        if(!canBuy(visitor)) {
            throw new CannotBuyException();
        }
        // otherwise sell
    }

    boolean canBuy(Visitor visitor) {
        return isLegalAge(visitor.getAge()) && isLegalHeight(visitor.getHeight());
    }

    private boolean isLegalHeight(final int height) {
        return height >= MIN_HEIGHT;
    }

    private boolean isLegalAge(final int age) {
        return age >= MIN_AGE;
    }

    static class CannotBuyException extends Exception {

    }

}
