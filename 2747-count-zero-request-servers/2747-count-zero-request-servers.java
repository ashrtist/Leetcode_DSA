
import java.util.*;

class Solution {

    public int[] countServers(int n, int[][] logs, int x, int[] queries) {

        // Step 1: Sort logs according to time
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));

        // Step 2: Store queries with their original indices
        int q = queries.length;

        int[][] sortedQueries = new int[q][2];

        for (int i = 0; i < q; i++) {
            sortedQueries[i][0] = queries[i]; // Query time
            sortedQueries[i][1] = i;           // Original index
        }

        // Sort queries according to query time
        Arrays.sort(sortedQueries,
            (a, b) -> Integer.compare(a[0], b[0]));

        // Step 3: HashMap to maintain server request counts
        Map<Integer, Integer> map = new HashMap<>();

        int[] answer = new int[q];

        // Sliding window pointers
        int left = 0;
        int right = 0;

        // Step 4: Process queries in sorted order
        for (int i = 0; i < q; i++) {

            int queryTime = sortedQueries[i][0];
            int originalIndex = sortedQueries[i][1];

            int start = queryTime - x;

            // Add logs whose time <= queryTime
            while (right < logs.length &&
                   logs[right][1] <= queryTime) {

                int server = logs[right][0];

                // Increase request count of server
                map.put(server, map.getOrDefault(server, 0) + 1);

                right++;
            }

            // Remove logs whose time < start
            while (left < right &&
                   logs[left][1] < start) {

                int server = logs[left][0];

                int count = map.get(server);

                // Decrease request count
                if (count == 1) {
                    // No requests remaining for this server
                    map.remove(server);
                } else {
                    map.put(server, count - 1);
                }

                left++;
            }

            // Total servers - Active servers
            answer[originalIndex] = n - map.size();
        }

        return answer;
    }
}
