/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ptaskk1;
/**
 * 
 * @author tmemx
 */
//فكرة البرنامج: برنامج  محاكي للقبول في تخصص علوم الحاسب
public class Student {
   private String id; //رقم الهويه برايفت سترنق
    double maoznah; //الدرجة الموزونه=30% قدرات,30%درجة الثنويه,40% درجة التحصيلي
   private String IDunv; // الرقم الجامعي
   String Major;  // التخصص هل هو علوم حاسب ام مستبعد
   String name;  // اسم الطالب
   int qoadrat;// درجاته لحساب الموزونه
   int thseley; // درجة التحصيلي
   int schhoolGrade; // درجة الثنويه
   public void Setid(String id){    // تم انشاء  السيت والقيت للقيم البرايفت لتعامل معها في كلاس التيست
       this.id=id;
   }
   public void SetIDunv(String IDunv){
       this.IDunv=IDunv;
   }
   public String Getid(){
       return id;
   }
   public String GetIDunv(){
       return IDunv;
   }
       public  double calclutMooanzh(){   // ميثود لحساب الدرجة الموزونه
      maoznah=qoadrat*0.30+schhoolGrade*0.30+thseley*0.40; 
      return maoznah;
       }
       
       public static void findTheTop3(Student a,Student t,Student m,Student ab,Student h){    // الميثود تجد اعلى ثلاث درجات موزونه تم عملها اذا كان في طالب اعلى من طالبين على الاقل فهو بتاكيد من افضل ثلاثه
    if(a.maoznah>t.maoznah&&a.maoznah>m.maoznah)  // مثلا في هذه الحاله لو تحققت فهو من افضل ثلاثه
        a.Major="Computer Science";  // فيكون كمبيوتر ساينس
    else if(a.maoznah>t.maoznah&&a.maoznah>ab.maoznah)  
        a.Major="Computer Science"; // السطور التي تليها لتغطية كل الاحتمالات الممكنه انه يكون افضل من اثنين على الاقل
    else if(a.maoznah>t.maoznah&&a.maoznah>h.maoznah)
         a.Major="Computer Science";
    
    else if(a.maoznah>m.maoznah&&a.maoznah>ab.maoznah)
         a.Major="Computer Science";
     else if(a.maoznah>m.maoznah&&a.maoznah>h.maoznah)
         a.Major="Computer Science";
    else if(a.maoznah>m.maoznah&&a.maoznah>t.maoznah)
         a.Major="Computer Science";
     
     
    else if(a.maoznah>ab.maoznah&&a.maoznah>t.maoznah)
         a.Major="Computer Science";
    else if(a.maoznah>ab.maoznah&&a.maoznah>m.maoznah)
         a.Major="Computer Science";
    else if(a.maoznah>ab.maoznah&&a.maoznah>h.maoznah)
         a.Major="Computer Science";
    
     else if(a.maoznah>h.maoznah&&a.maoznah>t.maoznah)
         a.Major="Computer Science";
      else if(a.maoznah>h.maoznah&&a.maoznah>m.maoznah)
         a.Major="Computer Science";
      else if(a.maoznah>h.maoznah&&a.maoznah>ab.maoznah)
           a.Major="Computer Science";
      else{
         a.Major=("Excluded");  // اذا لم تتحقق يكون مستبعد ولا يكون في تخصص كمبويتر ساينس
      }   
       if(t.maoznah>a.maoznah&&t.maoznah>m.maoznah)
           t.Major="Computer Science";
      else if(t.maoznah>a.maoznah&&t.maoznah>ab.maoznah)
           t.Major="Computer Science";
        else if(t.maoznah>a.maoznah&&t.maoznah>h.maoznah)
           t.Major="Computer Science";
          else if(t.maoznah>m.maoznah&&t.maoznah>ab.maoznah)
           t.Major="Computer Science";
        else if(t.maoznah>m.maoznah&&t.maoznah>h.maoznah)
           t.Major="Computer Science";
        else{
         t.Major=("Excluded");   
         
        }
         if(m.maoznah>a.maoznah&&m.maoznah>t.maoznah)
           m.Major="Computer Science";
         else if(m.maoznah>a.maoznah&&m.maoznah>ab.maoznah)
           m.Major="Computer Science";
        else if(m.maoznah>a.maoznah&&m.maoznah>h.maoznah)
           m.Major="Computer Science";
         else if(m.maoznah>t.maoznah&&m.maoznah>ab.maoznah)
           m.Major="Computer Science";
          else if(m.maoznah>t.maoznah&&m.maoznah>h.maoznah)
           m.Major="Computer Science";
         else if(m.maoznah>ab.maoznah&&m.maoznah>h.maoznah)
           m.Major="Computer Science";
       else{
         m.Major=("Excluded");   
        }
       
         if(ab.maoznah>a.maoznah&&ab.maoznah>t.maoznah)
           ab.Major="Computer Science";
         else if(ab.maoznah>a.maoznah&&ab.maoznah>m.maoznah)
           ab.Major="Computer Science";
         else if(ab.maoznah>a.maoznah&&ab.maoznah>h.maoznah)
           ab.Major="Computer Science";
         else if(ab.maoznah>t.maoznah&&ab.maoznah>m.maoznah)
           ab.Major="Computer Science";
         else if(ab.maoznah>t.maoznah&&ab.maoznah>h.maoznah)
           ab.Major="Computer Science";
         else if(ab.maoznah>m.maoznah&&ab.maoznah>h.maoznah)
           ab.Major="Computer Science";
         else{
         ab.Major=("Excluded"); 
        }
        if(h.maoznah>a.maoznah&&h.maoznah>t.maoznah)
           h.Major="Computer Science";
        else if(h.maoznah>a.maoznah&&h.maoznah>m.maoznah)
           h.Major="Computer Science";
        else if(h.maoznah>a.maoznah&&h.maoznah>ab.maoznah)
           h.Major="Computer Science";
        else if(h.maoznah>t.maoznah&&h.maoznah>m.maoznah)
           h.Major="Computer Science";
        else if(h.maoznah>t.maoznah&&h.maoznah>ab.maoznah)
           h.Major="Computer Science";
        else if(h.maoznah>m.maoznah&&h.maoznah>ab.maoznah)
           h.Major="Computer Science";
         else{
         h.Major=("Excluded"); 
        }
        
       }
       
        public static void Printinfo(Student a,Student t,Student m,Student ab,Student h){  // هذي الميثود تطبع معلومات الطالب في البرنامج
            Student[] printInfo = {a,t,m,ab,h};
            String newline = System.lineSeparator();
            for(int i=0;i<printInfo.length;i++){
               System.out.println(" The name is: "+printInfo[i].name+newline+" The id is: "+printInfo[i].Getid()+newline+" The university id is: "+printInfo[i].GetIDunv()+newline+"The maozonah is:  "+printInfo[i].maoznah+newline+" The major is: "+printInfo[i].Major);
            System.out.println("----------------------------------------------------------------------------------------------");
           } 
           
        }
   
          public static String PrintFileInfo(Student a){ // هذي الميثود ترجع معلومات الطالب كسترنق ليتم استعمالها في طباعتها في ملف خارجي 
           String newline = System.lineSeparator();
             return(newline+" The name is: "+a.name+newline+" The id is: "+a.Getid()+newline+" The university id is: "+a.GetIDunv()+newline+"The maozonah is:  "+a.maoznah+newline+" The major is: "+a.Major+newline+"----------------------------------------------------------------------------------------------");      
           
          }
    
        
     }
     
      
      
  