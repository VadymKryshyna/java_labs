package com.kryshyna.java1.lab04;

/**
 * @author Kryshyna Vadym
 */

public class DesignOffice {

	private Person [] staff;
	private Task tasks[];
	private int countTask = 0;
	private Invoice[] invoice;
	private Project[] projects;
	private double price;
	public Designer chief;
	
	public DesignOffice(){
		System.out.println("Make Design Office");
		staff = new Person[20];
		for (int i = 0; i < staff.length; i++){
			staff[i] = new Person("Engineer " + (i+1));
		}
		price = 5.0;
		tasks = new Task[5];
		projects = new Project[5];
		chief = new Designer();
		invoice = new Invoice[5];
	}
	
	class Designer{
		Designer() {
			System.out.println("Make Chief Designer");
		}
		
		public void registerTask(Task task){
			if(countTask < tasks.length){
				tasks[countTask] = task;
				System.out.println("Registered task " + (countTask+1));
				countTask++;
			}else{
				System.out.println("Not registered task. Count task is fill in.");
			}
		}
		
		public Invoice makeInvoice(){
			invoice[countTask-1] = new Invoice(tasks[countTask-1].getNumberOfFloors()*price);
			return invoice[countTask-1];
		}
		public void makeProject(){
			if(invoice[countTask-1].isAccept()){
			Person brig[] = new Person[tasks[countTask-1].getNumberOfFloors()];
			System.out.println("floors = " + tasks[countTask-1].getNumberOfFloors());
				for (int i = 0; i < brig.length; i++){	brig[i] = staff[i];	}
				projects[countTask-1] = new Project(brig);
			}
		}
		
		public void deleteTask(){
			if(projects[countTask-1]== null){	
				tasks[countTask-1] = null;
				invoice[countTask-1] = null;
				countTask--;
			}
		}
	}
}
