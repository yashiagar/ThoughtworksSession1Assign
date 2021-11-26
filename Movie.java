public class movie {

   
    private final String studio;
    private final String title;
    private final String rating;

    public movie(String title, String studio, String rating){
        this.title=title;
        this.studio=studio;
        this.rating =rating;
    }
    public movie(String t, String s){
        title=t;
        studio=s;
        rating="PG";
    }
    String getTitle(movie m){
        return m.title;
    }
    String getStudio(movie m){
        return  m.studio;
    }
    public static movie[] getPg(movie[] m){
        movie[] arr =new movie[m.length];
        int size=0;
        for (movie movie : m) {
            if (movie.rating.equals("PG")) {
                arr[size] = movie;
                size++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        movie m1 = new movie("Casino Royale", "Eon Productions", "PG-13");
        movie m2 = new movie("MNP", "ABC");
        movie m3 = new movie("XYZ", "ABCDE");
        movie[] m_array={m1,m2,m3};
        movie[] moviePGrating=movie.getPg((m_array));
        System.out.println("Movies with PG ratings are:");
        for(movie m: moviePGrating){
            if(m==null){
                break;
            }
            System.out.println(m.getTitle(m));
        }
        System.out.println("Movies with studio rating are:");
        for(movie m: moviePGrating){
            if(m==null){
                break;
            }
            System.out.println(m.getStudio(m));
        }
    }
}
