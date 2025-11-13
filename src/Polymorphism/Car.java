package Polymorphism;

 class Car implements Vehicle {

     public int noOfDoors(){
         return 4;
     }

    @Override
    public void start() {
        System.out.println("Car is Starting.....");
    }
}
