package House;

public class House {
    private Material material = Material.WOOD;
    private int floors = 1;
    private int rooms = 1;

    public House(){}

    @Override
    public String toString() {
        return "House{" +
                "material=" + material +
                ", floors=" + floors +
                ", rooms=" + rooms +
                '}';
    }

    public House(Material material,int floors, int rooms){
        if (floors>3){
            System.out.println("FLOOR COUNT EXCEEDS THE LIMIT. SETTING IT TO MAX VALUE OF 3");
            floors = 3;
        }
        this.floors = floors;

        if (rooms>6){
            System.out.println("ROOM COUNT EXCEEDS THE LIMIT. SETTING IT TO MAX VALUE OF 6");
            rooms = 6;
        }
        this.rooms = rooms;

        this.material = material;


    }

    public Material getMaterial() {
        return material;
    }

    public int getFloors() {
        return floors;
    }

    public int getRooms() {
        return rooms;
    }

    public void setFloors(int floors) {
        if (floors>3){
            System.out.println("FLOOR COUNT EXCEEDS THE LIMIT. SETTING IT TO MAX VALUE OF 3");
            floors = 3;
        }
        this.floors = floors;
    }

    public void setRooms(int rooms) {
        if (rooms>6){
            System.out.println("ROOM COUNT EXCEEDS THE LIMIT. SETTING IT TO MAX VALUE OF 6");
            rooms = 6;
        }
        this.rooms = rooms;
    }


}

