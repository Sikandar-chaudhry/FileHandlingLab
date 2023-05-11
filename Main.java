import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> data=new ArrayList<>();
        data=Utils.readFromFile(new File("src/movies.txt"));
        //System.out.println(data);

        ArrayList<movieInfo> moviesList=new ArrayList<>();

        for (String temp:data){
            String[] tempArray=temp.split(" ");
            String movieName=tempArray[0];
            int yearOfRelease=Integer.parseInt(tempArray[1]);
            Double rating=Double.parseDouble(tempArray[2]);
            int budget=Integer.parseInt(tempArray[3]);

            moviesList.add(new movieInfo(movieName,yearOfRelease,rating,budget));
        }
        for (movieInfo movie:moviesList){
            System.out.println(movie);
        }


    }
}