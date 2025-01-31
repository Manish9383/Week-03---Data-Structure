package sample_problems_for_stacks_and_queues.circular_tour_problem;


public class CircularTour {
    int petrol;
    int distance;

    public CircularTour(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }

    public int surplusPetrol() {
        return petrol - distance;
    }
}
