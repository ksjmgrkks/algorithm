class MyLinkedList() {
    /* 여기서 데이터 구조를 초기화합니다. */
    private var head: Node? = null
    private var length = 0 // LinkedList의 길이

    /* LinkedList에서 인덱스에 해당하는 노드의 값을 가져옵니다. 인덱스가 올바르지 않으면 -1을 반환합니다. */
    fun get(index: Int): Int {
        return findAtIndex(index)?.value ?: -1
    }

    /* LinkedList의 첫 번째 요소 앞에 값 val 노드를 추가합니다.
        삽입 후 새 노드는 LinkedList의 첫 번째 노드가 됩니다. */
    fun addAtHead(`val`: Int) {
        addAtIndex(0, `val`)
    }

    /* 값 val의 노드를 LinkedList의 마지막 요소에 추가합니다. */
    fun addAtTail(`val`: Int) {
        addAtIndex(length, `val`)
    }

    /* LinkedList에서 인덱스의 세 번째 노드 앞에 값 val의 노드를 추가합니다.
        색인이 LinkedList의 길이와 같으면 노드가 연결된 목록의 끝에 추가됩니다.
        인덱스가 길이보다 크면 노드가 삽입되지 않습니다. */
    fun addAtIndex(index: Int, `val`: Int) {
        //인덱스가 길이보다 크면 노드가 삽입되지 않음.
        if (index > length) {
            return
        }
        val old = findAtIndex(index - 1)
        //`val`은 생성한 노드 안에 있는 '값'입니다.
        val node = Node(`val`)
        when {
            //값이 없을 때 삽입
            old == null -> head = node
            //인덱스가 0일때 삽입
            //기존 헤드를 생성한 노드의 다음 노드로 설정하고
            //해당 노드를 헤드로 설정함.
            index == 0 -> {
                node.next = head
                head = node
            }
            //그 외에는 생성한 노드의 next를 기존 노드의 next로 교체해주고
            //기존 노드의 next를 생성한 노드로 바꿔줍니다.
            else -> {
                node.next = old.next
                old.next = node
            }
        }
        //그 다음 배열 길이를 1 증가시켜줍니다.
        length++
    }
    
    fun deleteAtIndex(index: Int) {
        when {
            length == 0 || index > length - 1 || index < 0 -> return
            index == 0 -> head = head?.next
            else -> findAtIndex(index - 1)?.let {
                // 4를 삭제할 때 3을 찾고, 3의 next를 4가 아닌 5에 연결 시켜준 다음
                //...3 - 4 - 5..
                it.next = it.next?.next
            }
        }
        //길이를 1 감소시키면 끝
        length--
    }

    /* 인덱스를 가지고 해당 노드를 반환합니다. */
    private fun findAtIndex(index: Int): Node? =
        when {
            length == 0 || index > length - 1 -> null
            index <= 0 -> head
            else -> {
                var next = head?.next
                repeat(index - 1) {
                    next = next?.next
                }
                next
            }
        }

    private data class Node(val value: Int, var next: Node? = null)

}
