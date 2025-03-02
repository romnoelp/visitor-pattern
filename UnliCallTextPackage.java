class UnliCallTextPackage implements UnliCallsTextOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean hasUnli) {
        if (hasUnli) return telcoName + " includes unlimited calls and texts.";
        return telcoName + " does not offer unlimited calls and texts.";
    }
}