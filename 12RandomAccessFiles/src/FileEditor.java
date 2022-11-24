import java.io.*;
public class FileEditor {
private RandomAccessFile file;//��������� ����� �� ��� "���� � ���������� ������"
public FileEditor(String fileString) throws IOException {
file = new RandomAccessFile(fileString, "rw"); //�������� �� �����
//(� ������ � �� ����� � �����
}
public void close() throws IOException {
if (file != null) file.close(); //��������� �� �������� ����
}
//������ �� ����� �� ������������� (��� ������� � ������ �� ������)
public PersonRecord getRecord(int id) throws IOException {
PersonRecord record = new PersonRecord();
if (id < 1) throw new IllegalArgumentException("Invalid ID");//�������� �� ����� �� 1
try{
file.seek((id - 1) * PersonRecord.SIZE);
record.readFromFile(file);
}catch(Exception e){
}
return record;
}
//����� �� �������� �� �����
public void addRecord(PersonRecord record) throws IllegalArgumentException,
IOException{
if (getRecord(record.getID()).getID() != 0)
throw new IllegalArgumentException("Record number exists, adding illegal");
else {
file.seek((record.getID() - 1) * PersonRecord.SIZE);
record.writeToFile(file);
}
}
//����� �� ������� �� ����� (�� �������� - �� �����)
public void updateRecord(PersonRecord record)throws IllegalArgumentException,
IOException {
if (getRecord(record.getID()).getID() == 0)
throw new IllegalArgumentException("Record does not exist, update illegal");
else {
file.seek((record.getID() - 1) * PersonRecord.SIZE);
record.writeToFile(file);
}
}
//����� �� "���������" �� ����� (�� �������� - �� �����)
public void deleteRecord(PersonRecord record) throws IllegalArgumentException,
IOException {
if (getRecord(record.getID()).getID() == 0)
throw new IllegalArgumentException("Record does not exist, delete illegal");
else {
file.seek((record.getID() - 1) * PersonRecord.SIZE);
record.setID(0);//"����������" �� ������
record.writeToFile(file);
}
}
public void showAllRecords() {//��������� �� ������ ������
PersonRecord record = new PersonRecord();
try{
file.seek(0); //� �������� �� �����
while (true) {
do {
record.readFromFile(file);
} while (record.getID() == 0); //������ �����
System.out.println(record);
}
}catch (EOFException ex1) {
return;
}catch (IOException ex2) {
System.err.println("Error reading file");
}
}
}