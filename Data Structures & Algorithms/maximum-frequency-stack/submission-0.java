class FreqStack {

    HashMap<Integer, Integer> freq;
    HashMap<Integer, Stack<Integer>> group;
    int maxFreq;

    public FreqStack() {
        freq = new HashMap<>();
        group = new HashMap<>();
        maxFreq = 0;
    }

    public void push(int val) {

        int f = freq.getOrDefault(val, 0) + 1;
        freq.put(val, f);

        if (!group.containsKey(f)) {
            group.put(f, new Stack<>());
        }

        group.get(f).push(val);

        maxFreq = Math.max(maxFreq, f);
    }

    public int pop() {

        int ans = group.get(maxFreq).pop();

        freq.put(ans, freq.get(ans) - 1);

        if (group.get(maxFreq).isEmpty()) {
            maxFreq--;
        }

        return ans;
    }
}