import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking() throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter passenger Name: ");
        passengerName = scan.next();
        System.out.println("Enter Bus number: ");
        busNo = scan.nextInt();
        System.out.println("Enter Date in dd-MM-yyyy");
        String dateInput = scan.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        date = dateFormat.parse(dateInput);
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses)
    {
        int capacity = 0;
        for(Bus bus:buses) {
            if(bus.getBusNo() == busNo)
            {
                capacity = bus.getCapacity();
            }
        }
        int booked = 0;
        for (Booking book : bookings) {
            if(book.busNo == busNo && book.date.equals(date))
            {
                booked++;
            }
        }

        return booked<capacity?true:false;
    }
}
