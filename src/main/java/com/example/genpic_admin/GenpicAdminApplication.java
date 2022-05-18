package com.example.genpic_admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

@MapperScan(basePackages = "com.example.genpic_admin")
@SpringBootApplication
public class GenpicAdminApplication {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        SpringApplication.run(GenpicAdminApplication.class, args);


/*
    //1m=0.001km

        double km;
        double m;

        m =;
        Scanner scanner4 = new Scanner(System.in);

*/

       /*

       //이름,국어,영어,수학,코딩,전체점수,평균점수
        String name;
        int k_name;
        int e_name;
        int m_name;
        int s_name;
        int total;
        double avg;

        System.out.println("이름");
        name = scanner.next();
        System.out.println("국어");
        k_name = scanner.nextInt();
        System.out.println("영어");
        e_name = scanner.nextInt();
        System.out.println("수학");
        m_name = scanner.nextInt();
        System.out.println("코딩");
        s_name = scanner.nextInt();

        total = k_name+e_name+m_name+s_name;
        System.out.println("총점 :"+total);

        avg = total/4;
        System.out.println("평균 : "+ avg);
        */


      /*  String a="100";
        String b="200";

        int z = Integer.parseInt(a);
        int x = Integer.parseInt(b);

        int result = x*z;
        System.out.println("곱 결과:"+result);*/


       /*
        //기본급, 시간 당 수당, 세금, 실 수령액
        int c_sal = 1500000;
        int c_ins = 55000;
        int c_tax = c_sal/10;
        int c_money =  c_sal+c_ins-c_tax;

        System.out.println("급여명세서 조회 ");
        System.out.println("-----------------");
        System.out.println("기본급 : "+c_sal);
        System.out.println("시간 당 수당 : "+c_ins);
        System.out.println("세금 : "+c_tax);
        System.out.println("실수령액 : "+c_money);
        System.out.println("-----------------");*/

           /*
        //삼각혁 넓이 공식  : 밑변 * 높이 / 2
        // line_down=삼각형의 밑변, line_up = 삼각형의 높이
        int line_down;
        int line_up;
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("밑변의 길이");
        line_down = scanner2.nextInt();
        System.out.println("삼각형의 높이");
        line_up = scanner2.nextInt();

        //result = 삼각형의 넓이 (밑변*높이)
        double result = (line_down * line_up)/2;
        System.out.println("삼각형의 넓이 : "+result);*/


        /*        BufferedReader BF = new BufferedReader(new InputStreamReader(System.in));
        // a,b 의 형변환 전환 작업
        System.out.println("첫 번째 수 : ");
        String a = BF.readLine();
        int i_a = Integer.parseInt(a);
        System.out.println("두 번째 수 :");
        String b = BF.readLine();
        int i_b = Integer.parseInt(b);

        int max = i_a > i_b ? i_a : i_b;
        System.out.println("두개의 수 중 큰 값의 결과 : "+ max);*/

        /*     int test_value;
        Scanner scanner3 = new Scanner(System.in);
            System.out.println("값을 입력하세요. ");
            test_value = scanner.nextInt();

            if (test_value < 0) {
                System.out.println("입력 오류");
            } else if (test_value > 100) {
                System.out.println("입력 오류");
            } else {
                System.out.println("정상 출력");
            }
        */

        /*  //대문자, 소문자 변환 함수 사용
        String a = " Hello Java World";
        String test1 = a.toLowerCase();
        String test2 = a.toUpperCase();

        System.out.println(test1);
        System.out.println(test2);*/

    }



}
