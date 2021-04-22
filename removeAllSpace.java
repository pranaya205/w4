public class removeAllSpace
{
public static void main(String a[ ])
{
String str="I AM A STUDENT";
String noSpaceStr=str.replaceAll("\\s"," ");
System.out.println(noSpaceStr);
}
}