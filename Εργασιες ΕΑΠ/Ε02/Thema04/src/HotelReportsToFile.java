import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HotelReportsToFile extends Hotels{
    static String hotelName;

    private String country;

    public HotelReportsToFile(int[][] overnights, String country) {
        super(overnights);
        this.country = country;
    }
    public static void setHotelName(String hotelN){
        hotelName = hotelN;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public void calculateHotelOvernights(){
        // create file if it doesn't exist
        try {
            File myObj = new File(country+".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        // write to file
        try {
            FileWriter myWriter = new FileWriter(country+".txt");
            myWriter.write(hotelName+"\n\nCountry: "+country+"\n\n");
            myWriter.write("Annual Overnights per Hotel.\n");
            for ( int i=0;i<this.hotels_count;i++){
                int sum =0;
                for (int j=0; j<this.rooms_type_count;j++){
                    sum += overnights[i][j];
                }
                myWriter.write("Hotel No: "+(i+1)+"\n");
                myWriter.write("Total annual overnights are: "+sum+"\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
