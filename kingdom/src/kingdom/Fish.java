package kingdom;

public class Fish extends AbstractAnimals
{

    public Fish(int number, String name, int year)
    {
        super(number, name, year);
    }

    @Override
    public String move()
    {
        return "swim";
    }

    @Override
    public String breath()
    {
        return "gills";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }
}