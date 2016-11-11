package Blogz;

public abstract class Entity {

	private final int UID;
	
	public Entity(int UID) {
		
		this.UID = UID;
	}
	
	public int getEntity() {
		return this.UID;
	}
}
