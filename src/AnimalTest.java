/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    public void fullConstructorTest() throws AssertException{
    	Animal animal = new Animal("Color", "Name", 100.0, 200.0);
    	Assert.assertEquals("Color", animal.getColor());
    	Assert.assertEquals("Name", animal.getName());
    	Assert.assertEquals(100.0, animal.getWeight(), 0.1);
    	Assert.assertEquals(200.0, animal.getHeight(), 0.1);
    }
    public void equalsTest() throws AssertException{
    	Animal control = new Animal("Color", "Name", 50.0, 100.0);
    	Animal compare = new Animal("Color", "Name", 50.0, 100.0);
    	Animal compare2 = new Animal("Color", "Name", 100.0, 50.0);
    	Assert.assertEquals(true, control.equals(compare));
    	Assert.assertEquals(false, control.equals(compare2));
    }
}

