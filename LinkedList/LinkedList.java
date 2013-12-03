package LinkedLists;

public class LinkedList {
        LinkedListNode head = null;
        
        public String print()
        {
                LinkedListNode nn = head;
                StringBuilder ret = new StringBuilder();
                while(nn!=null)
                {
                        if( ret.length() !=0)
                                ret.append(" -> ");
                        ret.append(nn.data);
                        nn = nn.next;
                }

                return ret.toString();
        }
        
        public LinkedListNode insertBeforeHead(int d){
                LinkedListNode end = new LinkedListNode(d);
                end.next = head;                                
                return head = end;
        }
        
        public LinkedListNode append(int d){
                LinkedListNode end = new LinkedListNode(d);                
                LinkedListNode n = head;
                if(head == null)
                        return head = end;
                
                while(n.next!=null)
                        n = n.next;        
                return n.next = end;                
        }        
        
        public LinkedListNode getHead(){
                return head;
        }
        
        public void delete(LinkedListNode position, LinkedListNode prev)
        {
                prev.next = position.next;
                position = null;
        }
        
        public boolean delete(LinkedListNode startposition, int d)
        {
                LinkedListNode n = startposition;
                LinkedListNode prev = null;
                while(n.next != null)
                {                        
                        prev= n;
                        n = n.next;
                        if(n.data != d)
                                continue;

                        prev.next = n.next;
                        n = null;
                        return true;                        
                }
                return false;                
        }
        
        public boolean delete(int d){
                return delete(head, d);
        }
        
        public class LinkedListNode {
                LinkedListNode next = null;
                int data;

                public LinkedListNode(int d) {
                        data = d;
                }

                void appendToTail(int d){
                        LinkedListNode end = new LinkedListNode(d);                
                        LinkedListNode n = this;
                        if(n.next!=null)
                                n = n.next;
                        
                        n.next = end;
                }
        }
}