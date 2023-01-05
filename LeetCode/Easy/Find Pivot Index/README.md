# [Easy] 724. Find Pivot Index

[문제 링크](https://leetcode.com/problems/find-pivot-index/) 

### 성능 요약

메모리: 61.2 MB, 시간:  550 ms

### 분류

Array, Prefix Sum

### 문제 설명

<p>Given an array of integers nums, calculate the pivot index of this array.</p>

The pivot index is the index where the sum of all the numbers   
strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

<p>If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.</p>
<p>This also applies to the right edge of the array.</p>
<p>Return the leftmost pivot index. If no such index exists, return -1.</p>
