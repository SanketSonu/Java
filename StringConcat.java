class StringConcat{
public static void main(String[] args){

String s1,s2;
s1="rama" + "sita";
s2="rama" + "sita";
System.out.println(s1);
System.out.println(s2);
if(s1==s2) {
System.out.println("s1 nd s2 are pointing same object");
}
else
{
System.out.println("s1 and s2 are pointing different object");
}

String s3,s4,s5,s6;
s3="rama";
s4="sita";
s5=s3+s4;
s6=s3+s4;
if(s5==s6) {
System.out.println("s5 nd s6 are pointing same object");
}
else
{
System.out.println("s5 and s6 are pointing different object");
}
}
}

