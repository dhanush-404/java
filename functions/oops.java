public class oops{
    void carStart(String carBrand){
        System.out.println(carBrand+" car is moving.");
    }
    void carStop(String carBrand){
        System.out.println(carBrand+" car is stoped.");
    }
    public static void main(String args[]){
        String carBrand="Porsche";
        String color="Black";
        int speed=200;
        oops ob=new oops();
        ob.carStart(carBrand);
        ob.carStop(carBrand);
    }
}