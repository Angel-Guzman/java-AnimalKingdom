package kingdom;

import java.util.ArrayList;
import java.util.List;

public class Main
{

    // another method
    public static void forEach(List<AbstractAnimals> animals, CheckAnimal tester)
    {
        for (AbstractAnimals a : animals)
        {
            if (tester.test(a))
            {
                System.out.println(a.toString());
            }
        }
    }
    // with lambda expression to go through list

    public static void main(String[] args)
    {
        System.out.println("Animal Kingdom running");

        // create animals
    Mammals panda = new Mammals(1, "Panda", 1869);
    Mammals zebra = new Mammals(2, "Zebra", 1778);
    Mammals koala = new Mammals(3, "Koala", 1816);
    Mammals sloth = new Mammals(4, "Sloth", 1804);
    Mammals armadillo = new Mammals(5, "Armadillo", 1758);
    Mammals raccoon = new Mammals(6, "Raccoon", 1758);
    Mammals bigfoot = new Mammals(7, "Bigfoot", 2021);

    Birds pigeon = new Birds(8, "Pigeon", 1837);
    Birds peacock = new Birds(9, "Peacock", 1821);
    Birds toucan = new Birds(10, "Toucan", 1758);
    Birds parrot = new Birds(11, "Parrot", 1824);
    Birds swan = new Birds(12, "Swan", 1758);

    Fish salmon = new Fish(13, "Salmon", 1758);
    Fish catfish = new Fish(14, "Catfish", 1817);
    Fish perch = new Fish(15, "Perch", 1758);
        // add to arraylist
    List<AbstractAnimals> animals = new ArrayList<>();
    animals.add(panda);
    animals.add(zebra);
    animals.add(koala);
    animals.add(sloth);
    animals.add(armadillo);
    animals.add(raccoon);
    animals.add(bigfoot);
    animals.add(pigeon);
    animals.add(peacock);
    animals.add(toucan);
    animals.add(parrot);
    animals.add(swan);
    animals.add(salmon);
    animals.add(catfish);
    animals.add(perch);
    
    System.out.println(animals.toString());
    
    // Sort by year
    animals.sort((a1, a2) -> {
        return a1.getYear() - a2.getYear();
    });

    forEach(animals, (a) -> {
        return true;
    });

    System.out.println();
    // Sort alphabetically
    animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));

    forEach(animals, (a) -> {
        return true;
    });

    System.out.println();
    // Sort by move
    animals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
    
    forEach(animals, (a) -> {
        return true;
    });

    // Sort by lungs 
    System.out.println();
    forEach(animals, (a) -> {
        return a.breath().equalsIgnoreCase("lungs");
    });

    // lungs and named in 1758
    System.out.println();
    forEach(animals, (a) -> {
        return a.breath().equalsIgnoreCase("lungs") && a.getYear() == 1758;
    });

    // lay eggs and breath lungs
    System.out.println();
    forEach(animals, (a) -> {
        return a.breath().equalsIgnoreCase("lungs") && a.reproduce().equalsIgnoreCase("eggs");
    });

    // alphabetically and 1758
    System.out.println();
    animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    forEach(animals, (a) -> {
        return a.getYear() == 1758;
    });

//  List all the animals in descending order by year named
//  List all the animals alphabetically
//  List all the animals order by how they move
//  List only those animals the breath with lungs
//  List only those animals that breath with lungs and were named in 1758
//  List only those animals that lay eggs and breath with lungs
//  List alphabetically only those animals that were named in 1758


    }   
}