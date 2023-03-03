//kareem elshafey 1st code with builder pattern

public class car {
private String brand;
private String model;
private int year;

private car(CarBuilder builder) {
  

this.brand = builder.brand;
this.model = builder.model;
this.year = builder.year;
}

public class carBuilder() {
private String brand;
private String model;
private int year;

public carBuilder(String brand , String model , int year) 
{
            this.brand = brand;
            this.model = model;
            this.year = year;
}
public carBuilder setmodel (String model){
this.model = model ; 
return this ;
}

   // now i will make the get prop
   
   public String getbrand() {
   return brand;
   }
   public String getmodel() {
   return model;
   }
   
   public int getyear()
   return year; 
}

 //make builder now
 
 car.carBuilder carBuilder = new car.carBuilder("mercides" , "be12" , 2020);
 carBuilder.setmodel(xv50) ;
 
 Car car = carBuilder.build();
 
 // i will do the last step to print it with using get
 System.out.println ("brand is" + car.getbrand() ) ; 
  System.out.println ("model is"  + car.getmodel) ; 






}