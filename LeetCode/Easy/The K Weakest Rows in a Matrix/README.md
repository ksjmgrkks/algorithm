# [Easy] 1337. The K Weakest Rows in a Matrix

[문제 링크](https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/) 

### 성능 요약

메모리: 44.4 MB, 시간:  266 ms

### 분류

Array, Binary Search, Sorting, Heap (Priority Queue), Matrix

### 문제 설명

<p>You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians).</p>
<p>The soldiers are positioned in front of the civilians.</p>
<p>That is, all the 1's will appear to the left of all the 0's in each row.</p>

### A row i is weaker than a row j if one of the following is true:   

- The number of soldiers in row i is less than the number of soldiers in row j.
- Both rows have the same number of soldiers and i < j.

<p>Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.</p>
