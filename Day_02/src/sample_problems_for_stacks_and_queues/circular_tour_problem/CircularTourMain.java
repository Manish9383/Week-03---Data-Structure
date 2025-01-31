package sample_problems_for_stacks_and_queues.circular_tour_problem;

import java.util.LinkedList;
import java.util.Queue;

public class CircularTourMain {
    public static void main(String[] args) {
        CircularTour[] pumps = {
                new CircularTour(4, 6),
                new CircularTour(6, 5),
                new CircularTour(7, 3),
                new CircularTour(4, 5),
                new CircularTour(5, 4)
        };

        int start = findStartingPoint(pumps);

        if (start == -1) {
            System.out.println("No solution exists.");
        } else {
            System.out.println("Start at pump: " + start);
        }
    }

    public static int findStartingPoint(CircularTour[] pumps) {
        int totalSurplus = 0;
        int currentSurplus = 0;
        int start = 0;

        Queue<CircularTour> queue = new LinkedList<>();

        for (int i = 0; i < pumps.length; i++) {
            queue.offer(pumps[i]);

            totalSurplus += pumps[i].surplusPetrol();
            currentSurplus += pumps[i].surplusPetrol();

            if (currentSurplus < 0) {
                start = i + 1;
                currentSurplus = 0;
                queue.clear();
            }
        }

        return totalSurplus >= 0 ? start : -1;
    }
}
