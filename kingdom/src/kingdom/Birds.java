package kingdom;

public class Birds extends AbstractAnimals
{

    public Birds(int number, String name, int year)
    {
        super(number, name, year);
    }

    @Override
    public String move()
    {
        return "fly";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }
}