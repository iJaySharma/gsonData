import com.google.gson.*;
import com.google.gson.annotations.*;
class Student implements java.io.Serializable
{
@Expose
public int rollNumber;
@Expose(serialize=true,deserialize=true)
public String name;
@Expose(serialize=true,deserialize=false)
public String gender;
//the above could have private properties followed setter getter
}
class psp3
{
public static void main (String gg[])
{
try
{
Student s=new Student();
s.rollNumber=101;
s.name="Suresh";
s.gender="Male";
Gson g=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
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