# Telco Subscription Visitor Pattern

This repository implements the **Visitor Design Pattern** to represent different telecommunication providers and their respective mobile plans. The implementation is based on the given scenario, where **Smart, Globe, and Ditto** offer distinct data and call/text packages.

## Problem Statement

You are looking for a new mobile plan for your smartphone. Three major telecommunication providers are offering different deals:

- **Smart**: 15 GB for **₱500** per month. No free calls or texts.
- **Globe**: 10 GB for **₱450** per month. Unlimited calls and texts within their network.
- **Ditto**: 8 GB for **₱400** per month. Unlimited calls and texts **to all networks**.

The **Visitor Design Pattern** is implemented to evaluate data allowance and call/text packages.

---

## Implementation

The program consists of the following key components:

1. **TelcoSubscription (Interface)**: Defines the basic structure for a telecom subscription.
2. **Telco (Class)**: Implements `TelcoSubscription` and holds the details of each telecom provider.
3. **UsagePromo (Visitor Interface)**: Defines a method for checking data allowances.
4. **TelcoAllowance (Concrete Visitor)**: Implements `UsagePromo` to show data allowance offers.
5. **UnliCallOffer (Visitor Interface)**: Defines a method for checking unlimited call/text offers.
6. **UnliCallTextPackage (Concrete Visitor)**: Implements `UnliCallOffer` to check unlimited call/text availability.

---

## Client Program

The following `TelcoPromo` class serves as the client program, demonstrating the functionality:

```java
public class TelcoPromo {
  public static void main(String[] args) {
    TelcoSubscription smart = new Telco(15, 500, "Smart", false);
    TelcoSubscription globe = new Telco(10, 450, "Globe", true);
    TelcoSubscription ditto = new Telco(8, 400, "Ditto", true);

    UsagePromo promo = new TelcoAllowance();
    UnliCallOffer unli = new UnliCallTextPackage();    

    System.out.println("Smart Data Usage Offer and price: " + promo.showAllowance(smart.getTelcoName(), smart.getPromoPrice()));
    System.out.println("Globe Data Usage Offer and price: " + promo.showAllowance(globe.getTelcoName(), globe.getPromoPrice()));
    System.out.println("Ditto Data Usage Offer and price: " + promo.showAllowance(ditto.getTelcoName(), ditto.getPromoPrice()));

    System.out.println("\nSmart unlimited calls and text package: " +
                                  unli.showUnliCallsTextOffer(smart.getTelcoName(), smart.getUnliCallText()));
    System.out.println("Globe unlimited calls and text package: " +
                                  unli.showUnliCallsTextOffer(globe.getTelcoName(), globe.getUnliCallText()));
    System.out.println("Ditto unlimited calls and text package: " +
                                  unli.showUnliCallsTextOffer(ditto.getTelcoName(), ditto.getUnliCallText()));
  }
}
