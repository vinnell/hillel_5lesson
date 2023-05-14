public class Information extends User {
    public static void main(String[] args) {

        User firstUser = new User("Victor");
        firstUser.email = "victor.2023@gmail.com";
        firstUser.setPassword("pass2023");
        String firstPassword = firstUser.getPassword();
        firstUser.setAge(40);
        firstUser.isActive = true;

        System.out.println("User 1: name- " + firstUser.userName + "," + " email - " + firstUser.email + "," +
                " password - " + firstPassword + "," + " age-"+ firstUser.getAge());
        firstUser.makePurchase(150);
        firstUser.makePurchase(200);
        firstUser.PrintTotalAmountOfSpentMoney();

        User secondUser = new User("Petro", "pass2024");
        secondUser.email= "petro.2023@gmail.com";
        String secondPassword =secondUser.getPassword();
        secondUser.setAge(50);
        secondUser.isActive = true;

        System.out.println("User 2: name- " + secondUser.userName + "," + " email - " + secondUser.email + "," +
                " password - " + secondPassword + "," + " age-"+  secondUser.getAge());

        secondUser.makePurchase(300);
        secondUser.makePurchase(450);
        secondUser.PrintTotalAmountOfSpentMoney();
    }
}
