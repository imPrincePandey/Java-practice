package abstraction;

public class ProjectManagement {

	public static void main(String[] args) {
		AgileManager agile = new AgileManager();
		WaterfallManager water = new WaterfallManager();
		
		conductMeeting(agile);
		conductMeeting(water);

	}
	
	// that’s runtime polymorphism, powered by abstraction.
	public static void conductMeeting(ProjectManager manager) {
		manager.manageProject();
		manager.scheduleTask();
		manager.reportProgress(); // concrete method (common for all managers)
	}

}

abstract class ProjectManager {
	public abstract void manageProject(); // abstract method(with no body)
	public abstract void scheduleTask();
	
	public void reportProgress() { // concrete method
        System.out.println("Reporting daily progress to stakeholders...");
    }
}

// let child classes decide implementation (how).
class AgileManager extends ProjectManager {
	
	public void manageProject() { // Concrete with body
		System.out.println("Manage project using Agile methodologies...");
	}
	
	public void scheduleTask() {
		System.out.println("Schedule tasks based on sprints...");
	}
}

class WaterfallManager extends ProjectManager {
	public void manageProject() { // Concrete with body
		System.out.println("Manage project using Waterfall methodologies...");
	}
	
	public void scheduleTask() {
		System.out.println("Schedule tasks in a sequential phase...");
	}
}