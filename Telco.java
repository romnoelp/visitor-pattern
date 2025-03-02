class Telco implements TelcoSubscription {
    private final String telcoName;
    private final int dataAllowance;
    private final int promoPrice;
    private final boolean unliCallText;

    public Telco(String telcoName, int dataAllowance, int promoPrice, boolean unliCallText) {
        this.telcoName = telcoName;
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo) {
        return promo.showAllowance(telcoName, promoPrice);
    }

    @Override
    public String accept(UnliCallsTextOffer offer) {
        return offer.showUnliCallsTextOffer(telcoName, unliCallText);
    }
}