public class MainRecord {
    public static void main(String[] args) {
        PersonRecord jane = new PersonRecord("Jane", "05/01/2020");
        PersonRecord Jim =  new PersonRecord("Jim","06/02/2022");
        PersonRecord joe =  new PersonRecord("Joe","08/06/2023");

        PersonRecord[] johnsKid = {jane, joe,Jim};
        PersonRecord john =  new PersonRecord("John","05/10/2023",johnsKid);

        System.out.println(john);

        PersonRecord johnCopy =  new PersonRecord("John", "04/10/2021");
        System.out.println(johnCopy);

    }


}
