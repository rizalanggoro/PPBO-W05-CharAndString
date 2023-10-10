/*
  File logika bisnis dari program untuk melakukan beberapa validasi
  seperti:
  - tanggal lahir
  - nomor telepon
  - alamat email
 */

import java.util.regex.Pattern;

public class BusinessLogic {
  public boolean validateBirthDate(String date) {
    return validate(
        Pattern.compile("^((0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[12])/(\\d\\d\\d\\d))$"),
        date
    );
  }

  public boolean validatePhoneNumber(String number) {
    return validate(
        Pattern.compile("^((\\+|00)(\\d{1,3}) ([0-9]{10,15}))$"),
        number
    );
  }

  public boolean validateEmail(String email) {
    return validate(
        Pattern.compile("^[\\w.!#$%&'*+/=?^_`{|}~-]{1,64}@[\\w-]+\\.[\\w.-]{2,}$"),
        email
    ) && email.length() >= 5 && email.length() <= 50;
  }

  private boolean validate(Pattern pattern, String data) {
    return pattern.matcher(data).matches();
  }
}
