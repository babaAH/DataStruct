class Stack<T>
{
    private Item top;

    public void Push(T pusher)
    {
        if(top == null)
        {
            Item t = new Item();
            t.Value = pusher;
            top = t;
        }
        else
        {
            Item t = new Item();
            t.Value = pusher;
            t.Next = top;
            top = t;
        }
    }

    public T Pop() throws IndexOutOfBoundsException
    {
        if (top != null)
        {
            Item ret = top;
            top = null;
            //top.Next = null;
            top = ret.Next;
            return (T) ret.Value;
        }
        else
        {
            throw new IndexOutOfBoundsException("Stack is Empty");
        }
    }

    class Item<T>
    {
        public Item Next;
        public T Value;
    }
}
