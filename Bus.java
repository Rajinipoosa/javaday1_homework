public class Bus{
  // private  String person;
  private Person[] passengers;
 
  public Bus(){
    this.passengers = new Person[10];
  }
  public void addPassenger(Person passengers){
    if(isBusFull()){
      return;
      // return from eat function
    }

    int passengercount = passengerCount();
    this.passengers[passengercount] = passengers;
  }
  public boolean isBusFull(){
    return passengerCount() == passengers.length;
  }


 public int passengerCount(){
    int count = 0;
    for(Person passengers : this.passengers ){
      if (passengers != null){
        count++;
      }
    }
   return count;
      
 }


}



