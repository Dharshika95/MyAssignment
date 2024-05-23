package week3.day2assignment;

public class JavaConnection extends MySqlConnection implements DatabaseConnection  {

	@Override
	public void connect() {
		System.out.println("connect the device");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect the connection");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("update the device");
		
	}
	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();
	}

}
