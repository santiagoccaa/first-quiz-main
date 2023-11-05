package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

  private int balance;
  private Drink[] drinks;

  public VendingMachineImpl() {
    this.balance = 0;
    this.drinks = new Drink[] {
      new Drink("ScottCola", 75, true),
      new Drink("KarenTea", 100, false)
    };
  }

  public static VendingMachine getInstance() {
    return new VendingMachineImpl();
  }

  @Override
  public void insertQuarter() {
    balance += 25;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    Drink selectedDrink = null;

    for (Drink drink : drinks) {
      if (drink.getName().equals(name)) {
        selectedDrink = drink;
        break;
      }
    }

    if (selectedDrink == null) {
      throw new UnknownDrinkException();
    }

    if (balance >= selectedDrink.getPrice()) {
      // Se tiene suficiente dinero para comprar la bebida.
      balance -= selectedDrink.getPrice();
      return selectedDrink;
    } else {
      throw new NotEnoughMoneyException();
    }
  }
}
