package introToJava;

public class AsteriskLogger implements Logger{

	public static void main(String[] args) {
		AsteriskLogger test = new AsteriskLogger();
		test.Log("message");
		test.Error("message");

	
		
	}
	
	
	@Override
	public void Log(String message) {
		// TODO Auto-generated method stub
		System.out.println("***"+ message + "***");
		
		
	}

	@Override
	public void Error(String message) {
		// TODO Auto-generated method stub
	// TODO calculate the amount of stars needed and use for loop
		System.out.println("****************");
		System.out.println("***Error: " + message + "***" );
		System.out.println("****************");
	}	
	
	
	
}
