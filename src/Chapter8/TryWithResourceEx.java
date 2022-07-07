package Chapter8;

public class TryWithResourceEx {
	public static void main(String args[]) {
		try (CloseableResource cr = new CloseableResource()){
			cr.exceptionWork(false);
		} catch (WorkException e) {
			e.printStackTrace();
		} catch (CloseException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try (CloseableResource cr = new CloseableResource()){
			cr.exceptionWork(true);
		} catch (WorkException e) {
			e.printStackTrace();
		} catch (CloseException e) {
			e.printStackTrace();
		}
		System.out.println();
	}
}

class CloseableResource implements AutoCloseable{
	public void exceptionWork(boolean exception) throws WorkException{
		System.out.println("exceptionWork("+exception+")is called");
		if(exception)
			throw new WorkException("WorkException occured!");
	}
	public void close() throws CloseException{
		System.out.println("close() is called");
		throw new CloseException("CloseException occured");
	}
}
class WorkException extends Exception{
	WorkException(String msg){super(msg);}
}
class CloseException extends Exception{
	CloseException(String msg){super(msg);}
}
