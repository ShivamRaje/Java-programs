class PVRmovies{
    private static PVRmovies mTicket;
    private static boolean status=false;

    private PVRmovies(){
        System.out.println("Ticket Booking in progress");
    }
    public static PVRmovies bookTickets(){
        if(!status){
            mTicket=new PVRmovies();
            status=true;
        }
        return mTicket;
    }

}

public class SingleTon {
    public static void main(String[] args){
        PVRmovies cust1= PVRmovies.bookTickets();
        PVRmovies cust2= PVRmovies.bookTickets();

        System.out.println("cust1 hashcode : "+cust1.hashCode());
        System.out.println("cust2 hashcode : "+cust2.hashCode());

        
    }
}
