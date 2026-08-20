class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();

        int left = 0;
        int right = 0;
        int index = 0;

        while (right < n) {

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[right]) {
                dq.pollLast();
            }

            dq.addLast(right);

            if (dq.peekFirst() < left) {
                dq.pollFirst();
            }

            if (right - left + 1 == k) {

                ans[index] = nums[dq.peekFirst()];
                index++;

                left++;
            }

            right++;
        }

        return ans;
    }
}