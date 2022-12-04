public class MainProgramHotel {
    public static void main(String[] args) {
        Hotels hotels ;
        int[][] overnights = {
                {120, 300, 250, 180, 421},
                {95, 186, 583, 200, 219},
                {231, 450, 369, 563, 371},
                {164, 213, 424, 178, 165}
        };
        hotels = new Hotels(overnights);
        hotels.calculateHotelOvernights();
        hotels.calculateRoomTypeOvernights();
        hotels.calculateAllHotelsOvernights();
    }
}
