package rocks.somesandwich.leetcode;

public class DesignAStackWithIncrementOperation {
    public static void main(String[] args) {
        CustomStack stk = new DesignAStackWithIncrementOperation().new CustomStack(3);
        stk.push(1);                          // stack becomes [1]
        stk.push(2);                          // stack becomes [1, 2]
        stk.pop();                            // return 2 --> Return top of the stack 2, stack becomes [1]
        stk.push(2);                          // stack becomes [1, 2]
        stk.push(3);                          // stack becomes [1, 2, 3]
        stk.push(4);                          // stack still [1, 2, 3], Do not add another elements as size is 4
        stk.increment(5, 100);                // stack becomes [101, 102, 103]
        stk.increment(2, 100);                // stack becomes [201, 202, 103]
        stk.pop();                            // return 103 --> Return top of the stack 103, stack becomes [201, 202]
        stk.pop();                            // return 202 --> Return top of the stack 202, stack becomes [201]
        stk.pop();                            // return 201 --> Return top of the stack 201, stack becomes []
        stk.pop();                            // return -1 --> Stack is empty return -1.
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class CustomStack {

        public int[] arr;
        public int len;
        public int capacity;

        public CustomStack(int maxSize) {
            capacity = maxSize;
            arr = new int[maxSize];
            len = 0;
        }

        public void push(int x) {
            if (len + 1 > capacity) {
                return;
            }

            arr[len++] = x;
        }

        public int pop() {
            if (len == 0) {
                return -1;
            }

            return arr[--len];
        }

        public void increment(int k, int val) {
            for (int i = 0; i < k && i < len; i++) {
                arr[i] += val;
            }
        }
    }

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
//leetcode submit region end(Prohibit modification and deletion)

}