class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, int price) {
        return telcoName + " offers a data plan for ₱" + price;
    }
}