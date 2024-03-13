import java.util.ArrayList;

public class Student
{
    private String name; // String field belonging to the Student class
    private int age; // int field belonging to the Student class
    private ArrayList<String> nickNames;

    /**
     * Constructor of the Student class: constructs new Student objects
     */
    public Student(String aName, int anAge) // constructor takes 2 parameters: a String for name and an int for age
    {
        this.name = aName; // sets the field name to the value of the parameter
        this.age = anAge;
        this.nickNames = new ArrayList<>();
    }

    /**
     * Getter method: returns the value of the name field to the caller
     * @return
     */
    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setAge(int anAge)
    {
        this.age = anAge;
    }

    public void birthday()
    {
        //age = age + 1;
        age++;
    }

    public void addNickname(String newNickname)
    {
        this.nickNames.add(newNickname);
    }

    public void printNicknames()
    {
        for (String eachNickname : this.nickNames)
        {
            System.out.println(eachNickname);
        }
    }



}
