package java100.app.domain;

public class Room {
	protected String location;
	protected String name;
	protected int capacity;
	protected int no;
	
	public Room() {}
	
	public Room(String location, String name, int no, int capacity) {
		this.location = location;
		this.name = name;
		this.capacity = capacity;
		this.no = no;
	}
	

	@Override
    public String toString() {
        return "Room [location=" + location + ", name=" + name + ", capacity=" + capacity + ", no=" + no + "]";
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	
}
