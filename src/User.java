public class User {
    public String userName;
    public String email;
    public double amountSpentMoney=0;
    boolean isActive;
    private int age;
    private String password;

    public User() {
    }
    public User(String userName) {
        this.userName= userName;
}
    public User(String userName, String password) {
        this.userName= userName;
        this.password= password;
    }
    public String getPassword() {
                return password;
    }
    public void setPassword(String password) {
                this.password = password;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void makePurchase(double purchasePrice) {
        System.out.println("Price of purchare is: "+ purchasePrice);
        amountSpentMoney +=purchasePrice;
    }
       public void PrintTotalAmountOfSpentMoney() {
           System.out.println("Total amount is "+ this.amountSpentMoney);
       }
    }



