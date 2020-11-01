package jsample;

import java.util.PriorityQueue;

public class Solution1 {

    class Node implements Comparable<Node> {

        private int element;

        private int arrayIndex;

        private int elementIndex;

        @Override
        public int compareTo(Node other) {
            return Integer.compare(element, other.element);
        }
    }

    public int[] solve(int k, int n, int[][] arr) {
        Node[][] nodeArray = new Node[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                Node node = new Node();
                node.arrayIndex = i;
                node.elementIndex = j;
                node.element = arr[i][j];
                nodeArray[i][j] = node;
            }
        }
        PriorityQueue<Node> queue = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            if (nodeArray[i].length > 0) {
                queue.add(nodeArray[i][0]);
            }
        }
        int[] outputArray = new int[n * k];
        int i = 0;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            outputArray[i++] = node.element;
            if (nodeArray[node.arrayIndex].length > node.elementIndex + 1) {
                queue.add(nodeArray[node.arrayIndex][node.elementIndex + 1]);
            }
        }
        return outputArray;
    }
}
