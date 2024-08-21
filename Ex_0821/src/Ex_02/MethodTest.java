package Ex_02;

public class MethodTest {
	
	public static void Finder(int arr[])
	{
		int maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        System.out.println("최대값: " + maxValue);
	}
}
