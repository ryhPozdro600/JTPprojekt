package jtp;

public enum Animal
{
    Rabbit, Sheep, Pig, Cow, Horse;
    private int count;
    
    private Animal()
    {
        count = 0;
    }
    
    public void incCount()
    {
        count++;
    }
    
    public int getCount()
    {
        return count;
    }
}
