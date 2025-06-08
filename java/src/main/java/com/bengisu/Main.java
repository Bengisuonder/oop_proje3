package com.bengisu;

import com.bengisu.enum_.Gun;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        //JA-1 (ENUM)
        /*
        Gun bugun = Gun.CUMA;
        System.out.println("Bugün günlerden: "+bugun);
         */
        //JA-2 ArrayList
        /*
        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("İzmir");
        sehirler.add("Ankara");
        sehirler.add("İstabul");

        for (String s : sehirler)
        {
            System.out.println(s);
        }
         */
        //JA-3 HashSet
        /*
        HashSet<String> meyveler = new HashSet<>();
        meyveler.add("elma");
        meyveler.add("elma");
        meyveler.add("muz");
        meyveler.add("kiraz");

        for (String meyve : meyveler)
        {
            System.out.println(meyve);
        }
        */
        //JA-4 HashMap
        /*
        HashMap<String, Integer> ogrenci = new HashMap<String, Integer>();
        ogrenci.put("Ahmet: ", 90);
        ogrenci.put("Ayşe: ", 85);
        ogrenci.put("Mehmet: ", 75);

        for (Map.Entry<String,Integer>entry:ogrenci.entrySet())
        {
            System.out.println(entry.getKey()+entry.getValue());
        }
         */
        //JA-5 Try-Catch
        /*
        try
        {
            Scanner input = new Scanner(System.in);
            System.out.println("1. sayıyı giriniz: ");
            int ilksayi = input.nextInt();
            System.out.println("2. sayıyı giriniz: ");
            int ikincisayi = input.nextInt();
            int bolum=ilksayi/ikincisayi;
            System.out.println("Bölme işleminin sonucu: "+bolum);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        */
        //JA-6 Lambda Expressions
        /*
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        sayilar.add(50);

        sayilar.forEach(sayı -> System.out.println(sayı));
         */
        //JA-7 Wrapper Sınıfları
        /*
        int sayi = 3;
        Integer sayiAuto = sayi;
        int sayiUn = sayiAuto;

        System.out.println("Değişken: "+sayi);
        System.out.println("Autoboxing Değişken: "+sayiAuto);
        System.out.println("Unboxing Değişken: "+sayiUn);
        */
    }
}