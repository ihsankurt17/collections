package Collections;

import java.util.*;

public class mainC   {
    public static void main(String[] args) {
        personel p=new personel();
        p.setIsim("Ali");
        p.setIdNum(12345);
        personel p1= new personel();
        p1.setIsim("Mehmet");
        p1.setIdNum(34567);



        ArrayList<personel> ilkList= new ArrayList() ;


       ilkList.add(p);
       ilkList.add(p1);

        ArrayList<ogrenci> ilkList1= new ArrayList() ;
        ogrenci o=new ogrenci();
        o.setName("omer");
        o.setDers("java");
        ilkList1.add(o);
        System.out.println(ilkList1);

        List<personel>lis=new LinkedList();
        LinkedList <personel> link=new LinkedList<>();
        link.offer(p);
        link.offer(p1);

        LinkedList <ogrenci> link1=new LinkedList<>();
        link1.offer(o);

        Set<personel> set=new HashSet<>();
        set.add(p);
        set.add(p1);

        Set<String> set1=new TreeSet<>();
        set1.add("ali");
        set1.add("veli");
        set1.add("mehmet");
        set1.add("osman");
        set1.add("berk");


    }
}
