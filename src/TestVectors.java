
public class TestVectors {

	public static void main(String[] args) {
		
		new TestVectors();
	}
	
	public TestVectors()
	{
		Vector2D v= new Vector2D();
		System.out.println("Hello!");
		v.x=1; v.y=2;
		v=Vector2DArithmetic.doubleSize(v);
		System.out.println("Result v.x="+v.x + "v.y="+v.y);
	}
}
