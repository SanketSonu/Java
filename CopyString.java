class CopyString{
public static void main(String[] args){

String s1=new String("rama");
String s2=s1.intern();
String s3="rama";
if(s2==s3) {
System.out.println("rama is copied to constant pool");
}
else
{
System.out.println("rama is not copied to constant pool");
}
}
}

