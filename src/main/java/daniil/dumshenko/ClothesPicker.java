package daniil.dumshenko;

import java.util.Scanner;

public class ClothesPicker {
    final String hotDayMessage = "It`s hot outside, wear T-short and shorts";
    final String normalDayMessage = "It`s normal day, wear Hemd and jeans";
    final String coldDayMessage = "It`s cold outside, wear Jacket";

  public String clothesPicker() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Temperature: ");
    double temperature = scanner.nextDouble();

    if (temperature > 30) {
      return hotDayMessage;

        } else if (temperature <= 30 && temperature > 20) {
      return normalDayMessage;

    } else {
      return coldDayMessage;
        }
  }

  @Override
public String toString(){
      return "What should i wear? "
              + "\n" + clothesPicker();
  }
}
