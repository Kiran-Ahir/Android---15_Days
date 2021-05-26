import java.util.*;

public class CmdRev
{
public static void main(String[] st)
{
String s=st[0];

StringBuffer sb=new StringBuffer(s);
//s=""+sb.reverse();

s=sb.reverse().toString();

System.out.println(s);

}}