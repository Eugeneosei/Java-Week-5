package introToJava;

public class SpacedLogger implements Logger{
	
	public static void main(String[] args) {
	SpacedLogger test = new SpacedLogger();
		test.Log("Hello");
		System.out.print(": ");
		test.Error("Error");
		
}

	@Override
	public void Log(String message) {
		// TODO Auto-generated method stub
		// for loop from 1 to message.length -1, put a space between another
		for(int i = 0; i < message.length(); i++) {
			
			System.out.print(message.charAt(i));
			System.out.print(" ");
			
		}
			
	}
	

	@Override
	public void Error(String message) {
		// TODO Auto-generated method stub
		for(int i = 0; i < message.length(); i++) {
			
			System.out.print(message.charAt(i));
			System.out.print(" ");
		}
	}
	
	
	

}
