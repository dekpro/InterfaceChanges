package fr.lip6.meta.ComplexChangeDetection.AtomicChanges;

public class ChangeUpperBound extends AtomicChange{

	private String className = "";
	private String oldValue = "";
	private String newValue = "";
	
	public ChangeUpperBound() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChangeUpperBound(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public ChangeUpperBound(String name, String className, String oldValue, String newValue) {
		super(name);
		this.className = className;
		this.oldValue = oldValue;
		this.newValue = newValue;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getOldValue() {
		return oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public String getNewValue() {
		return newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	
	
}
