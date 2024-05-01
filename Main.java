import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Movie> hmovies=new ArrayList<Movie>();

        System.out.println(hmovies.isEmpty());
        System.out.println(hmovies.size());

        hmovies.add(new Movie("3-idiots",3.4,2011,"james"));
        hmovies.add(new Movie("5-transformers",3.8,2014,"alexa"));
        hmovies.add(new Movie("6-idiots",3.6,2019,"alex"));

        //prints all three objects
        System.out.println("PRINTING ALL LIST");
        for (Movie temp:hmovies)
            System.out.println(temp);
//remove by object


        hmovies.remove(new Movie("5-transformers",3.8,2014,"alexa"));

        System.out.println("REMOVING BY OBJECT");
        for(Movie temp:hmovies)
            System.out.println(temp);

///remove by index
        hmovies.remove(0);
        System.out.println("REMOVING BY INDEX");
        for(Movie temp:hmovies)
            System.out.println(temp);
        hmovies.add(0,new Movie("snoden",3.6,2011,"taqi"));

//SETTING INDEX OR UPDATING
        hmovies.set(0,new Movie("12-idiots",4,2099,"soman"));
        System.out.println("UPDATING");
        for(Movie temp:hmovies)
            System.out.println(temp);



    //get and set rating

        for(Movie temp:hmovies)
            temp.setrating(temp.getrating()+1);
        System.out.println("RATING INCRETMENT");
        for(Movie temp:hmovies)
            System.out.println(temp);

      //INDEX OF
        System.out.println( hmovies.indexOf(3.6));

    }



    }




