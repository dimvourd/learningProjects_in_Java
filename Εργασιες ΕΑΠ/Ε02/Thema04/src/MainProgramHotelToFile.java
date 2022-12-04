public class MainProgramHotelToFile {
    public static void main(String[] args) {
        Hotels hotels ;
        int[][] overnights1 = {
                {120, 300, 250, 180, 421},
                {95, 186, 583, 200, 219},
                {231, 450, 369, 563, 371},
        };


        HotelReportsToFile italy = new HotelReportsToFile(overnights1,"Italy");
        HotelReportsToFile.setHotelName("Hilton");
        italy.calculateHotelOvernights();
        int [][] overnights2 = {
                {95,186,5883,200,219},
                {164,213,424,178,165}
        };

        HotelReportsToFile spain = new HotelReportsToFile(overnights2,"Spain");
        spain.calculateHotelOvernights();



    }
}
