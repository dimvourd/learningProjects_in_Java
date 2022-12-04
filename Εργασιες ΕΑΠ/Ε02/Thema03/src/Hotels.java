public class Hotels {
    public int[][] overnights;
    public int hotels_count,rooms_type_count;
    Hotels(int[][] overnights){
        for(int i = 0; i <overnights.length;i++){
            for (int j=0; j< overnights[i].length; j++){
                if (overnights[i][j]<0){
                    System.out.println("Overnights["+i+"]["+j+"] < 0");
                    System.exit(0);
                }
            }
        }
        this.overnights = overnights;
        this.hotels_count =overnights.length;
        this.rooms_type_count = overnights[0].length;
    }
    public void calculateHotelOvernights(){
        System.out.println("Hotels\nAnnual Overnights per Hotel");
        for ( int i=0;i<this.hotels_count;i++){
            int sum =0;
            for (int j=0; j<this.rooms_type_count;j++){
                sum += overnights[i][j];
            }
            System.out.println("Hotel No: "+(i+1));
            System.out.println("Total annual overnights are: "+sum);
        }
        System.out.println();
    }

    public void calculateRoomTypeOvernights(){
        System.out.println("Annual Overnights per Room Type");
        for (int j=0; j<this.rooms_type_count;j++){
            int sum = 0;
            for ( int i=0;i<this.hotels_count;i++){
                sum += overnights[i][j];
            }
            System.out.println("Room Type No: "+(j+1));
            System.out.println("Total annual overnights are: "+sum);
        }
        System.out.println();
    }
    public void calculateAllHotelsOvernights(){
        System.out.println("Annual Total Overnights");
        int sumAll = 0;

        double averageperroom =0;
        for (int j = 0; j < this.rooms_type_count; j++) {
            int sumperroom=0;
            for ( int i=0;i<this.hotels_count;i++) {
                sumAll += overnights[i][j];
                sumperroom += overnights[i][j];
            }
            averageperroom+= (double) sumperroom/rooms_type_count;
        }
        System.out.println("The total annual overnights in all Hotels are "+sumAll);
        System.out.println("Average annual overnights per Room Type are "+ averageperroom);
        // μέσο όρο των ετήσιων διανυκτερεύσεων ανά τύπο δωματίου

    }

}
