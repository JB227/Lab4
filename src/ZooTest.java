public class ZooTest{
	
	public void ConstructorTest() throws AssertException{
		Zoo Zoo = new Zoo(2);
		Assert.assertEquals(2,Zoo.getCapacity());
	}
	public void expandAddAnimalTest() throws AssertException{
		Zoo Zoo = new Zoo(2);
		Animal test1 = new Animal("Color1", "Name1", 100.0, 10.0);
		Animal test2 = new Animal("Color2", "Name2", 200.0, 20.0);
		Animal test3 = new Animal("Color2", "Name2", 200.0, 20.0);
		Zoo.addAnimal(test1);
		Zoo.addAnimal(test2);
		Zoo.addAnimal(test3);
		Assert.assertEquals(4, Zoo.getCapacity());
	}
	public void getStatisticsTest() throws AssertException{
		Zoo Zoo = new Zoo(2);
		Animal test1 = new Animal("Color1", "Name1", 50.0, 5.0);
		Animal test2 = new Animal("Color2", "Name2", 200.0, 20.0);
		Animal test3 = new Animal("Color2", "Name2", 200.0, 20.0);
		Animal test4 = new Animal("Color1", "Name3", 10.0, 5.0);
		Zoo.addAnimal(test1);
		Zoo.addAnimal(test2);
		Zoo.addAnimal(test3);
		Assert.assertEquals(150.0, Zoo.getAverageWeight(), 0.1);
		Assert.assertEquals(45.0, Zoo.getTotalHeight(), 0.1);
		Zoo.addAnimal(test4);
		Assert.assertEquals(30.0, Zoo.getAverageWeight("Color1"), 0.1);
	}
}