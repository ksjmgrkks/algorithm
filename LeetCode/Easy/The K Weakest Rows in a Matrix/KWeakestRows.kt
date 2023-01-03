    class Solution {
        fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
            //Input: mat =
            //[[1,0,0,0],
            // [1,1,1,1],
            // [1,0,0,0],
            // [1,0,0,0]],
            //k = 2
            //Output: [0,2]
            //sortedMap이 핵심! sortedMap.keys.forEach 했을 때
            //key에 대한 오름차순으로 value가 리턴되기 때문에 아래와 같은 코드를 짤 수 있다.
            val sortedMap = sortedMapOf<Int, ArrayList<Int>>()
            for (i in mat.indices){
                var soldiers = 0
                var j = 0
                while (j < mat[i].size) {
                    if (mat[i][j++] == 1) soldiers++
                    else break
                }
                sortedMap.computeIfAbsent(soldiers) { ArrayList() }.add(i)
                //1. i=0, soldiers = 1
                //   map = [1, [0]]
                //2. i=1, soldiers = 4
                //   map = [1, [0]],[4, [1]]
                //3. i=2, soldiers = 1
                //   map = [1, [0,2]],[4, [1]]
                //4. i=3, soldiers = 1
                //   map = [1, [0,2,3]],[4, [1]]
            }
            var count = k //k=2
            val result = arrayListOf<Int>()
            sortedMap.keys.forEach {
                //1. it = 0, list=[0,2,3] -> count가 2이기 때문에 0,2 까지만 추가됨.
                //2. it = 1, list=[1] -> count가 0이 되었으므로 result에 추가되지 않음.
                val list = sortedMap[it]!!
                var i = 0
                while(count > 0 && i < list.size){
                    //1. result = [0,2]
                    result.add(list[i++])
                    count--
                }
            }
            //result = [0,2]
            return result.toIntArray()
        }
    }
