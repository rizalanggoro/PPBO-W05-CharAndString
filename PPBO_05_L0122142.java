// Nama   : Rizal Dwi Anggoro
// NIM    : L0122142
// GitHub : https://github.com/rizalanggoro/PPBO-W05-CharAndString

/*
  File UI atau tampilan menu.
 */

import java.util.Scanner;

public class PPBO_05_L0122142 {
  public static void main(String[] args) {
    final BusinessLogic logic = new BusinessLogic();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      int option = printMainMenu(scanner);

      if (option == 1) validateBirthDate(scanner, logic);
      else if (option == 2) validatePhoneNumber(scanner, logic);
      else if (option == 3) validateEmail(scanner, logic);
      else {
        System.out.println("\nKeluar program...");
        break;
      }
    }

    scanner.close();
  }

  private static void validateBirthDate(Scanner scanner, BusinessLogic logic) {
    System.out.println("\nValidasi Tanggal Lahir\n");

    System.out.println("Petunjuk:");
    System.out.println("- Masukkan tanggal lahir Anda dengan format");
    System.out.println("  berikut \"dd/mm/yyyy\" (hari/bulan/tahun).");
    System.out.println("- Gunakan kata kunci \"done\" untuk mengakhiri");
    System.out.println("  validasi/perulangan.\n");

    while (true) {
      System.out.print("> ");
      String input = scanner.nextLine();
      if (input.equalsIgnoreCase("done")) break;

      final boolean result = logic.validateBirthDate(input);
      System.out.printf(
          " [%s]: %s\n",
          result ? "Success" : "Error",
          result ? "Tanggal lahir valid" : "Tanggal lahir tidak valid"
      );
    }
  }

  private static void validatePhoneNumber(Scanner scanner, BusinessLogic logic) {
    System.out.println("\nValidasi Nomor Telepon\n");

    System.out.println("Petunjuk:");
    System.out.println("- Masukkan nomor telepon Anda dengan format");
    System.out.println("  berikut \"<kode_negara> <no_telepon>\".");
    System.out.println("  Contoh: \"+62 89612345678\"");
    System.out.println("          \"0044 91234567891\"");
    System.out.println("- Gunakan kata kunci \"done\" untuk mengakhiri");
    System.out.println("  validasi/perulangan.\n");

    while (true) {
      System.out.print("> ");
      String input = scanner.nextLine();
      if (input.equalsIgnoreCase("done")) break;

      final boolean result = logic.validatePhoneNumber(input);
      System.out.printf(
          " [%s]: %s\n",
          result ? "Success" : "Error",
          result ? "Nomor telepon valid" : "Nomor telepon tidak valid"
      );
    }
  }

  private static void validateEmail(Scanner scanner, BusinessLogic logic) {
    System.out.println("\nValidasi Alamat Email\n");

    System.out.println("Petunjuk:");
    System.out.println("- Masukkan alamat email Anda dengan ketentuan");
    System.out.println("  berikut.");
    System.out.println("  * Dimulai dengan huruf / angka.");
    System.out.println("  * Mengandung satu \"@\".");
    System.out.println("  * Setidaknya memiliki satu titik setelah \"@\".");
    System.out.println("- Gunakan kata kunci \"done\" untuk mengakhiri");
    System.out.println("  validasi/perulangan.\n");

    while (true) {
      System.out.print("> ");
      String input = scanner.nextLine();
      if (input.equalsIgnoreCase("done")) break;

      final boolean result = logic.validateEmail(input);
      System.out.printf(
          " [%s]: %s\n",
          result ? "Success" : "Error",
          result ? "Alamat email valid" : "Alamat email tidak valid"
      );
    }
  }

  private static int printMainMenu(Scanner scanner) {
    System.out.println("\nInput Validator\n");
    System.out.println("1. Validasi tanggal lahir");
    System.out.println("2. Validasi nomor telepon");
    System.out.println("3. Validasi alamat email");
    System.out.println("4. Keluar");

    System.out.print("> ");
    int option = scanner.nextInt();
    scanner.nextLine();

    return option;
  }
}
