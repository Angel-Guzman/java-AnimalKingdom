package kingdom;

public class Mammals extends AbstractAnimals
{

    // constructor
    public Mammals(int number, String name, int year)
    {
        super(number, name, year);
    }

    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live birth";
    }

}