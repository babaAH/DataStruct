class Queue<T>
{
    private Item top;
    private Item bottom;

    public void Enqueue(T input)
    {
        Item p = new Item();
        p.Value = input;
        if(bottom == null)
        {
            bottom = p;
            top = p;
        }
        else
        {
            p.Next = top;
            top = p;
        }
    }

    public T Dequeue() throws IndexOutOfBoundsException
    {
        if(bottom == null)
        {
            throw new IndexOutOfBoundsException("Queue is empty");
        }

        Item p = top;
        if(p.Next== null)
        {
            bottom = null;
            top = null;
            return (T)p.Value;
        }
        else
        {
            while (p.Next.Next != null)
                p = p.Next;

            Item ret = bottom;
            p.Next=null;
            bottom = p;
            return (T)ret.Value;
        }
    }

    class Item<T>
    {
        public Item Next;
        public T Value;
    }
}
