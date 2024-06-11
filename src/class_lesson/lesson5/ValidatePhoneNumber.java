package class_lesson.lesson5;

public class ValidatePhoneNumber {

    public static String phoneStart = "+375";

    public void validatePhoneNumber(String phone){
        String numberStart = "+7";
        numberStart = "8";
        String finalNumberStart = numberStart;
        class PhoneNumber{
            private String phoneNumber;

            PhoneNumber(String phoneNumber){
                this.phoneNumber = phoneNumber;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public void printRussianCode(){
                System.out.println(finalNumberStart);
            }
            public String getPhoneStart(){
                return phoneStart;
            }
        }
    }
}
