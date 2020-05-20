class Display{
public void wish(String name){for(int i=1;i<=10;i++){
System.out.print("Good morning");
try { Thread.sleep(1000);
System.out.println(name);}
catch(Exception e){ }

class MyThread extends Thread{
Display d;
String name;
MyThread(Display d,String name){
this.d=d;
this.name=name;}
public void run(){

d.wish(name);}}



class MultiThread{ public static void main(String ar[])
{ Display d=new Display();
MyThread t=new MyThread(d,"sam");
MyThread m=new MyThread(d,"sam");
t.start();
m.start();}}
