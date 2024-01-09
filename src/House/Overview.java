package House;

public class Overview {
    public static void main(String[] args) {
        House house1 = new House();
        System.out.println(house1.toString());
        House house2 = new House(Material.BRICK,1,2);
        System.out.println(house2.toString());
        House house3 = new House(Material.STONE,4,6);
        System.out.println(house3.toString());
        house3.setFloors(4);
        System.out.println(house3.getFloors());
        house2.setRooms(7);
        System.out.println(house2.getRooms());
    }
}
