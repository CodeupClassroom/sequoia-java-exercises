/**
 * Created by moon on 11/27/17.
 */
public class AlbumApp {
    public static void main(String[] args) {
        System.out.println("Ok, we're in business");
        System.out.println("we have produced" + Album.getNumberOfAlbums());

        Album album1 = new Album("Bon Jovi", "Greatest Hits");
        System.out.println(album1.describe());

        Album album2 = new Album("Rush", "Hemispheres");
        System.out.println(album2.describe());

        Album album3 = new Album("Tammy Wynette", "Country's Greatest Hits");
        System.out.println(album3.describe());

        System.out.println("Our record company has produced: " + Album.getNumberOfAlbums() + " albums!");

    }
}
