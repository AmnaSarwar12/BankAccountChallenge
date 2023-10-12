public class MainImutable {

    public static void main(String[] args) {
        PersonImutable jane = new PersonImutable("Jane", "05/01/2020");
        PersonImutable Jim =  new PersonImutable("Jim","06/02/2022");
        PersonImutable joe =  new PersonImutable("Joe","08/06/2023");

        PersonImutable[] johnsKid = {jane, joe,Jim};
        PersonImutable john =  new PersonImutable("John","05/10/2023",johnsKid);

        System.out.println(john);
    }
}
