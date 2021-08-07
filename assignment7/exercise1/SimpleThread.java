
public class SimpleThread implements Runnable{	//<----modified to Runnable

	Resource resource;
	
	public void run() {
		for(int i = 0; i<10; i++){
			try {
				synchronized(resource){
					System.out.println(resource.increment());

					Thread.sleep(1);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	SimpleThread(Resource resource){
		this.resource = resource;
	}

	public static void main(String args[]) {
		Resource resource = new Resource();
		SimpleThread thread1 = new SimpleThread(resource);	//<---added this line
		SimpleThread thread2 = new SimpleThread(resource);  //<---added this line
		Thread t = new Thread(thread1);
		Thread s = new Thread(thread2);
		
		t.start();
		s.start();
	}

}