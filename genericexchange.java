public class genericexchange
{
public static<E>void printArray(E[ ]inputArray)
{
for(E element:inputArray)
{
System.out.printf("%s",element);
}
System.out.println( );
}
public static void main(String[ ] args,int i)
{
Integer [ ] iList={1,6,3,9};
swap (iList, 3, 4);
for(Integer i:iList)
System.out.println(i+" ,");
}
}