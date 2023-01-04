class Solution {
        fun maximumWealth(accounts: Array<IntArray>): Int {
            var maxWealth = 0
            accounts.forEach { customer ->
                if (customer.sum() > maxWealth)
                    maxWealth = customer.sum()
            }
            return maxWealth
        }
}
