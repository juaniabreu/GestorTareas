package Logica;

public class Tarea {
/*tiene un título, una descripción, 
 * una fecha de vencimiento opcional y un 
 * estado que indica si la tarea está completada o no
*/
	private String title;
	private String description;
	private int date;
	private boolean complete;
	
	public Tarea(String title, String description, boolean complete) {
		this.title = title;
		this.description = description;
		this.complete = complete;
	}
	
	public Tarea(String title, String description, int date, boolean complete) {
		this.title = title;
		this.description = description;
		this.date = date;
		this.complete = complete;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	
	void testGitHub() {
		
	}
	
	
}
