package ex03_method;

public class MethodTest {
	
	public int maxFinder(int[] value) {
		
		int maxValue = value[0];
		
		for(int i = 0; i < value.length; i++)
		{
			if(maxValue < value[i])
			{
				maxValue = value[i];
			}
		}
		
		return maxValue;
	}
}
