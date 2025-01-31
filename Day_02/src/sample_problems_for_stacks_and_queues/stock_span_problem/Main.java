package sample_problems_for_stacks_and_queues.stock_span_problem;

public class Main {
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        StockSpan stockSpan = new StockSpan();
        int[] span = stockSpan.calculateSpan(prices);

        System.out.print("Stock Span: ");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
