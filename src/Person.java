public class Person {
    /*Person klassini yarating. Hamda ushbu klassga mantiqan xos bo’lgan atributlar qo’shing.*/

    public String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public byte age(byte age) {
        return age;
    }

    public String gender(boolean isMale) {
        if (isMale) return "M";
        else return "F";
    }

    public String isMarried(boolean isMarried) {
        if (isMarried) return "Married";
        else return "Single";
    }

}
