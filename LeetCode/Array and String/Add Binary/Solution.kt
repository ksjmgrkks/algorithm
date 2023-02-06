class Solution {
    fun addBinary(a: String, b: String): String = (a.toBigInteger(2) + b.toBigInteger(2)).toString(2)
}
