import java.util.*;

public class Amazon {



    private static int maxQuality = 0;

    public static int findMaximumQuality(int[] packets, int channels) {
        maxQuality = 0;
        List<List<Integer>> distribution = new ArrayList<>();
        for (int i = 0; i < channels; i++) {
            distribution.add(new ArrayList<>());
        }
        backtrack(packets, 0, distribution, channels);
        return maxQuality;
    }

    private static void backtrack(int[] packets, int index, List<List<Integer>> distribution, int channels) {
        if (index == packets.length) {
            int currentQuality = calculateQuality(distribution);
            maxQuality = Math.max(maxQuality, currentQuality);
            return;
        }

        for (int i = 0; i < channels; i++) {
            distribution.get(i).add(packets[index]);
            backtrack(packets, index + 1, distribution, channels);
            distribution.get(i).remove(distribution.get(i).size() - 1);
        }
    }

    private static int calculateQuality(List<List<Integer>> distribution) {
        int totalQuality = 0;

        for (List<Integer> channel : distribution) {
            if (!channel.isEmpty()) {
                Collections.sort(channel);
                int median = channel.get(channel.size() / 2);
                totalQuality += median;
            }
        }

        return totalQuality;
    }

    public static void main(String[] args) {
        int[] packets = {2, 2, 1, 3, 5};
        int channels = 2;

        int result = findMaximumQuality(packets, channels);
        System.out.println("Maximum possible sum of qualities: " + result);
    }
}