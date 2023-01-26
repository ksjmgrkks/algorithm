class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var digit = digits.size - 1
        while (digit <= digits.size) {
            if (digits[digit] == 9) {
                digits[digit] = 0
                if (digit == 0) {
                    val arr = digits.toMutableList()
                    arr.add(0, 1)
                    return arr.toIntArray()
                }
            } else {
                digits[digit] = digits[digit] + 1
                return digits
            }
            digit--
        }
        return digits
    }
}
