import java.util.Arrays;

public class PersonImutable {
   private final String name;
   private final String dob;
   private final PersonImutable[] kids;

    public PersonImutable(String name, String dob, PersonImutable[] kids) {
        this.name = name;
        this.dob = dob;
        this.kids = kids == null? null: Arrays.copyOf(kids, kids.length);
    }

    public PersonImutable(String name, String dob) {
        this(name, dob, null);
    }

    public String getName() {
        return name;
    }



    public String getDob() {
        return dob;
    }



    public PersonImutable[] getKids() {
        return kids == null ? null : Arrays.copyOf(kids, kids.length);
    }



    @Override
    public String toString() {
        String kidString = "n/a";
        if(kids != null){
            String[] names = new String[kids.length];
            Arrays.setAll(names, i -> names[i] = kids[i] == null ? "" : kids[i].name);
            kidString = String.join(", ", names);
        }
        return name + ", dob = " + dob + ", Kids = " +kidString;
    }
}
