public class EquipmentTest{
	
	public void constructorTest() throws AssertException{
		Equipment Equip = new Equipment("Name/1, 10.0, 15.0,Test Equipment");
		Assert.assertEquals("Name", Equip.getName());
		Assert.assertEquals(1, Equip.getCount(), 0.1);
		Assert.assertEquals(10.0, Equip.getTotalWeight(), 0.1);
		Assert.assertEquals(15.0, Equip.getTotalPrice(), 0.1);
		Assert.assertEquals("Test Equipment", Equip.getDescription());
	}
	public void EqualsTest() throws AssertException{
		Equipment Control = new Equipment("Name/1, 10.0, 15.0,Comparison Equipment");
		Equipment Compare = new Equipment("Name/1, 10.0, 15.0,Comparison Equipment");
		Equipment Compare2 = new Equipment("Name/1, 20.0, 30.0,Comparison Equipment");
		Assert.assertEquals(true, Control.equals(Compare));
		Assert.assertEquals(false, Control.equals(Compare2));
	}
}