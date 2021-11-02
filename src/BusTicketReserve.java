import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusTicketReserve {
    public static void main(String[] args) throws ParseException {
        ArrayList<Bus> bus = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();
        bus.add(new Bus(1,true,2));
        bus.add(new Bus(2,false,5));
        bus.add(new Bus(3,true,8));

        int userOpt = 1;
        Scanner scan = new Scanner(System.in);
        for(Bus b:bus){
            b.displayBusInfo();
        }
        while (userOpt == 1)
        {
            System.out.println("Enter 1 to Book and 2 to exit");
            userOpt = scan.nextInt();
            if(userOpt == 1) {
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,bus)){
                    bookings.add(booking);
                    System.out.println("Your booking is confirm");
                }else {
                    System.out.println("Sorry. Bus is full. Try another bus or date");
                }
            }
        }
    }



}
