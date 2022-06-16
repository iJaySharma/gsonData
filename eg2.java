import com.google.gson.*;
class Student
{
public int rollNumber;
public String name;
transient public String gender;
//the above could have private properties followed setter getter
}
class psp
{
public static void main (String gg[])
{
try
{
Student s=new Student();
s.rollNumber=101;
s.name="Suresh";
s.gender="Male";
Gson g=new Gson();
String jsonString=g.toJson(s);
System.out.println(jsonString);
Student s2=g.fromJson(jsonString,Student.class);
System.out.println(s2.rollNumber+","+s2.name+","+s2.gender);
}catch(Exception e)
{
System.out.println(e);
}
}
}