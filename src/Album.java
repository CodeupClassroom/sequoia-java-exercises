public class Album {
    public String albumName;
    public String artist;
    private static int numberOfAlbums = 0;

    // constructor
    public Album(String artist, String albumName) {
        this.artist = artist;
        this.albumName = albumName;
        Album.numberOfAlbums++;
    }

    public String describe() {
        return "The album: " + this.albumName + " is by " + this.artist;
    }

    public static int getNumberOfAlbums() {
        return Album.numberOfAlbums;
    }
}
