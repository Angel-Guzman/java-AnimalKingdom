package kingdom;

abstract class AbstractAnimals 
{
    protected int number;
    protected String name;
    protected int year;

    // constructor 
    public AbstractAnimals(int number, String name, int year)
    {
        this.number = number;
        this.name = name;
        this.year = year;
    }
    
    abstract String move();
    abstract String breath();
    abstract String reproduce();

    public String getName() 
    {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getNumber() 
    {
        return number;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setYear(int year) 
    {
        this.year = year;
    }

    public void setNumber(int number) 
    {
        this.number = number;
    }

    @Override
    public String toString()
    {
        return "Id:" + number + " Name:" + name + " Year:" + year;
    }
}