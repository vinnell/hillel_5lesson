public class User {
    public String userName;
    public String email;
    public double amountSpentMoney = 0;
    boolean isActive;
    private int age;
    private String password;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
        public String getPassword() {
            if (password.length() > 15 || password.length() < 8) {
                System.out.println("Password must be less than 15 and more than 8 characters in length.");
                password = String.valueOf(false);
            }
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public int getAge() {
        if (age < 18) {
            System.out.println("You can't log in until you're 18");
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makePurchase(double purchasePrice) {
        System.out.println("Price of purchare is: " + purchasePrice);
        amountSpentMoney += purchasePrice;
    }

    public void printTotalAmountOfSpentMoney() {
        System.out.println("Total amount is " + this.amountSpentMoney);
    }

    public void addDiscount(int percent) {
        System.out.println("Percent is: " + percent + "%");
        double discountAmount = (double) ((amountSpentMoney * percent) / 100);
        System.out.println("The discount amount is: " + discountAmount);
    }
}



