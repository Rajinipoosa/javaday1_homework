import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Person passengers;

  @Before 
  public void before() {
    bus = new Bus();
    passengers = new Person();
  }

@Test 
public void busStartEmpty(){
  assertEquals(0, bus.passengerCount());

}
@Test 
public void addPassengersToBus(){
  this.bus.addPassenger(this.passengers);
      assertEquals(1,this.bus.passengerCount());
    }
@Test
 public void cannotAddPassengers(){
   for(int i = 0; i< 15; i++){
      this.bus.addPassenger(passengers);
   }
    assertEquals(10, this.bus.passengerCount());
 }

}