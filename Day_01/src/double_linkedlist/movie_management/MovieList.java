package double_linkedlist.movie_management;

public class MovieList {
    private Movie head;
    private Movie tail;

    public void addMovieAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    public void addMovieAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    public void removeMovieByTitle(String title) {
        Movie current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                if (current == head && current == tail) {
                    head = tail = null;
                } else if (current == head) {
                    head = head.next;
                    head.prev = null;
                } else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                System.out.println("Movie '" + title + "' removed.");
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found.");
    }

    public void searchByDirector(String director) {
        Movie current = head;
        boolean found = false;
        while (current != null) {
            if (current.director.equalsIgnoreCase(director)) {
                current.displayMovie();
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("No movies found by director " + director);
    }

    public void searchByRating(double rating) {
        Movie current = head;
        boolean found = false;
        while (current != null) {
            if (current.rating == rating) {
                current.displayMovie();
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("No movies found with rating " + rating);
    }

    public void updateMovieRating(String title, double newRating) {
        Movie current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                current.rating = newRating;
                System.out.println("Updated rating for '" + title + "' to " + newRating);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found.");
    }

    public void displayMoviesForward() {
        Movie current = head;
        System.out.println("\nMovies (Forward Order):");
        while (current != null) {
            current.displayMovie();
            current = current.next;
        }
    }

    public void displayMoviesReverse() {
        Movie current = tail;
        System.out.println("\nMovies (Reverse Order):");
        while (current != null) {
            current.displayMovie();
            current = current.prev;
        }
    }
}
