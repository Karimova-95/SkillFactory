package Tasks.Stream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ggg {
    public static void main(String[] args) {
    }
}

class Cat
{
    public Cat parent;
    public Cat getMyParent()
    {
        return this.parent;
    }
    public void setMyParent(Cat cat)
    {
        this.parent = cat;
    }
}

class Tiger extends Cat
{
    public Tiger getMyParent()
    {
        return (Tiger) this.parent;
    }
}
