package sample_problems_for_hash_maps_and_hash_functions.implement_a_custom_hash_map;
public class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Mango", 30);
        map.put("Banana", 25); // Update value

        System.out.println("Apple Value: " + map.get("Apple"));
        System.out.println("Banana Value: " + map.get("Banana"));
        System.out.println("Mango Value: " + map.get("Mango"));

        map.remove("Apple");

        System.out.println("\nAfter Removing 'Apple':");
        map.display();
    }
}
