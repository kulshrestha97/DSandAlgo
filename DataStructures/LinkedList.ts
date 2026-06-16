class ListNode<T> {
  data: T;
  next: ListNode<T> | null;
  constructor(data: T) {
    this.data = data;
  }
}

class LinkedList<T> {
    private head: ListNode<T> | null = null;

    append(data: T) {
        const node = new ListNode<T>(data);
        if(!this.head) {
            this.head = node;
            this.head.next = null;
            return;
        } else {
            let current = this.head;
            while(current.next !== null) {
                current = current.next;
            }
            current.next = node;
            current.next.next = null;
        }
    }
    prepend(data: T ) {
        const node = new ListNode<T>(data);
        
    }
}


