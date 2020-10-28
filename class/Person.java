public class Person {
  public String name;
  public int age;
  public String designation = "Student";

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    this.designation = designation;
  }

  public Person(String name) {
    this.name = name;
  }

  public void display() {
    System.out.println("Name : " + this.name + "\nAge : " + this.age +"\nDesignation : " + this.designation);
  }

  public boolean isEligibleToVote() {
    return this.age >= 18;
  }

  public void updateDesignation(String designation) {
    this.designation = designation;
  }

  public static String scientificName() {
    return "Homo-sapience";
  }

  public static void main(String[] args) {
    Person person1 = new Person("Ramu", 20);
    // System.out.println(person1);

    person1.display();
    System.out.println(person1.isEligibleToVote());
    person1.updateDesignation("Developer");
    person1.display();

    System.out.println(Person.scientificName());
    System.out.println(person1.scientificName());

  }
}