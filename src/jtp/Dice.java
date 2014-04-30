package jtp;

public class Dice
{
    private int value;
    public void throwDice()
    {
        value = (int) Math.floor(Math.random()*5);
    }
    
    public String result()
    {
        throwDice();
        if (value == 0)
            return "Rabbit";
        else if (value == 1)
            return "Sheep";
        else if (value == 2)
            return "Pig";
        else if (value == 3)
            return "Cow";
        else if (value == 4)
            return "Horse";
        return null;
    }
}
