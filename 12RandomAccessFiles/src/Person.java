
public class Person {
//Свойства
private int id;
private String name;
private String phone;
private String email;
//Конструктори
public Person() {
this(0,"","","");
}
public Person(int id, String name, String phone, String email) {
setID(id);
setName(name);
setPhone(phone);
setEmail(email);
}
//Гетъри
public int getID(){
return id;
}
public String getName(){
return name;
}
public String getPhone(){
return phone;
}
public String getEmail(){
return email;
}
//Сетъри
public void setID(int id){
this.id=id;
}
public void setName(String name){
this.name=name;
}
public void setPhone(String phone){
this.phone=phone;
}
public void setEmail(String email){
this.email = email;
}
@Override
public String toString() {
return "Person: id=" + id + ", name="+ name + ", phone=" + phone + ", email=" + email;
}
}
