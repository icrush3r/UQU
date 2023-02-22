/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ptaskk1;

import java.io.FileWriter;

/**
 *
 * @author Immon
 */
public class StudentTest  {
    
    
public static void main(String[] args){  // في هذا الكلاس توجد المين ميثود
      
    Student a=new Student();
      Student t=new Student(); // انشاء اوبجكت
      Student m=new Student();
      Student ab=new Student();
      Student h=new Student();
     
      a.SetIDunv("3001");  // وضع قيم عشوائية لكل اوبجكت
     a.Setid("1121");
     a.maoznah=0;
     a.name="Ahmed";
     a.qoadrat=68;
     a.thseley=80;
     a.schhoolGrade=99;
     
     t.SetIDunv("3002");
     t.Setid("1122");
     t.maoznah=0;
     t.name="Tameem";
     t.qoadrat=82;
     t.thseley=85;
     t.schhoolGrade=98;
    
     m.SetIDunv("3003");
     m.Setid("1123");
     m.maoznah=0;
     m.name="Mohamed";
     m.qoadrat=77;
     m.thseley=79;
     m.schhoolGrade=86;
     
     ab.SetIDunv("3004");
     ab.Setid("1124");
     ab.maoznah=0;
     ab.name="Abdullah";
     ab.qoadrat=74;
     ab.thseley=69;
     ab.schhoolGrade=85;
      
     h.SetIDunv("3005");
     h.Setid("1125");
     h.maoznah=0;  
     h.name="Hamed";
     h.qoadrat=95;
     h.thseley=100;
     h.schhoolGrade=88;
    
     Student[] studInfo = {a,t,m,ab,h}; // وضع الاوبجت في  ارريي ليتم وضعهم في فور لوب واستعمال الميثود التي تحسب الدرجة الموزونه
     
     
     for(int i=0;i<studInfo.length;i++){
        studInfo[i].calclutMooanzh();
     }
     Student.findTheTop3(a,t,m,ab,h); // استعمال الميثود التي تقوم بالمقارنه وايجاد اعلى ثلاث طلاب
    
    Student.Printinfo(a,t,m,ab,h); // طباعة معلوماتهم
      
         
 
            String file = "output.txt";
  
        try {
            // Creates a FileWriter
            FileWriter output
                = new FileWriter("output.txt");
            // Writes the string to the file
            output.write(Student.PrintFileInfo(a)+Student.PrintFileInfo(t)+Student.PrintFileInfo(h)+Student.PrintFileInfo(ab)+Student.PrintFileInfo(m)); // استعمال ميثود طباعة المعلومات ليتم كتابتها في ملف خارجي
              
            // Closes the writer
            output.close();
            
        }
  
        catch (Exception e) {
            e.getStackTrace();
        }
            
            
}
}
