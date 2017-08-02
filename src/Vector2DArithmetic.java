
public class Vector2DArithmetic {
	
	public static Vector2D add(Vector2D v1, Vector2D v2) 
	{
		Vector2D v3 = new Vector2D();
		v3.x = v1.x + v2.x;
		v3.y = v1.y + v2.y;
		return v3;
	}
}