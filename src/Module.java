public class Module
{
    private String name; // name field: the name of the module
    private int capacity; // capacity field: the max number of students who can take the module

    public Module(String aName, int aCapacity)
    {
        this.name = aName;
        this.capacity = aCapacity;
    }

    public String getName()
    {
        return this.name;
    }

    public int getCapacity()
    {
        return this.capacity;
    }


}
