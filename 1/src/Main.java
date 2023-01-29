//пример посылки сообщений между объектами
//example of sending messages between objects
public class Main {
    public static void main(String[] args) {
        Employee people1 = new Employee("man");
        Employee people2 = new Employee("women");

        MilitaryBase base = new MilitaryBase();

        base.writeGender(people1);
        base.writeGender(people2);

        people1.setGender("trans");

        System.out.println(base.getGenders().toString() + "\n");
        System.out.println(people1.getGender() + " " + people2.getGender());
    }

}