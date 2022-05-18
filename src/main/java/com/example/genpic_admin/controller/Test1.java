package com.example.genpic_admin.controller;

import com.example.genpic_admin.dto.BoardDTO;
import com.example.genpic_admin.dto.CormediList;
//import com.example.genpic_admin.mapper.TestRepository;
import com.example.genpic_admin.model.rData;
import com.example.genpic_admin.model.rRoot;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


import lombok.extern.slf4j.Slf4j;

//import org.springframework.beans.factory.annotation.Autowired;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.data.annotation.Id;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Controller
//@RestController
public class Test1 {

    @GetMapping("/")
    public String Bootstrap() {

        return "/main_page/index.html";
    }


//    @PostMapping("/board_page2")
//    public String board_page_form2(){
//        return "";
//    }

    @GetMapping("board_page2")
    public String board_page2(HttpSession session,
                              HttpServletRequest request,
                              HttpServletResponse response,
                              Model model) {


//        String id = (String) session.getAttribute("Id");
//        rRoot rRoot = new rRoot();
//        rRoot.setData((rData) session.getAttribute("Id"));
//        String id = "id";
//        model.addAttribute("Id", rRoot.getData().getAdmin().getLoginId());

//        model.addAttribute("Id", ((rData) session.getAttribute("Id")).getAdmin().getLoginId());

//
//        byte[] fileContent = FileUtils.readFileToByteArray(new File(filePath));
//        String encodedString = Base64.getEncoder().encodeToString(fileContent);


        return "/board_page/board_write2.html";
    }

    @PostMapping("board_page2")
    @ResponseBody
    public String board_form(@ModelAttribute BoardDTO boardDTO) throws IOException {
        System.out.println("boardDTO = " + boardDTO);
        String encodedString = Base64.getEncoder().encodeToString(boardDTO.getThumbnail().getBytes());
        System.out.println("encodedString = " + encodedString);
        return "main_page/index";
    }


//    @GetMapping("/board_page")
//    public String board_page(HttpSession session,
//                             HttpServletRequest request,
//                             HttpServletResponse response,
//                             Model model) {
//
//
////        String id = (String) session.getAttribute("Id");
////        rRoot rRoot = new rRoot();
////        rRoot.setData((rData) session.getAttribute("Id"));
////        String id = "id";
////        model.addAttribute("Id", rRoot.getData().getAdmin().getLoginId());
//
//        model.addAttribute("Id", ((rData) session.getAttribute("Id")).getAdmin().getLoginId());
//
//        return "/board_page/board_write.html";
//    }

//
//    @PostMapping("/board_page")
//    public String board_page_form(){
//        return "";
//    }


    @GetMapping("/login_page")
    public String login_page() {
        return "/user_manage/login.html";
    }

    @PostMapping("/login_page")
    public String login_page_form(@RequestParam("strLoginId") String Id,
                                  @RequestParam("strPassword") String Password,
                                  HttpSession session, Model model

    ) throws IOException {


//      System.out.println("Id = " + Id);
//      System.out.println("password = " + Password);

//      주소 통신 및 데이터 가져오기
        String BaseUrl = "http://192.168.0.7:8099/api/Web";

        HttpHeaders httpHeaders = new HttpHeaders();
//      httpHeaders.add("sid",strsid);
        httpHeaders.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        Map<String, String> params = new HashMap<String, String>();
        params.put("strLoginId", Id);
        params.put("strPassword", Password);

//        HttpEntity entity = new HttpEntity(httpHeaders);
//        RestTemplate restTemplate = new RestTemplate();
//        String strAA = restTemplate.postForObject("http://192.168.0.7:8099/api/Web/Admin/AdminLogin", entity, String.class);
//        String jsonData = strAA;
//        System.out.println("jsonData = " + jsonData);
//      ResponseEntity<String> responseEntity = restTemplate.exchange(BaseUrl + "/Admin/AdminLogin", HttpMethod.POST, entity, String.class,params);
//      String jsonData = responseEntity.getBody();


        HttpEntity entity = new HttpEntity(params, httpHeaders);
        RestTemplate restTemplate = new RestTemplate();
//      ResponseEntity<String> responseEntity = restTemplate.postForEntity("http://192.168.0.7:8099/api/Web/Admin/UserCreate", entity, String.class, params);
        String strAA = restTemplate.postForObject("http://192.168.0.7:8099/api/Web/Admin/AdminLogin", entity, String.class);
        String jsonData = strAA;
        System.out.println("jsonData = " + jsonData);

//      모델에 가져온 Json Data 넣기
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        rRoot root = objectMapper.readValue(jsonData, rRoot.class);


//      모델에 넣은 Json Data를 mypage값과 매칭 시키기
//        model.addAttribute("Id", root.getData());
//      model.addAttribute("Name", root.adminName);

        session.setAttribute("Id", root.getData());


      return "redirect:/";
//        return "/wait/mypage";
    }


    @GetMapping("/register_page")
    public String register_page() {
        return "/user_manage/register";
    }

    @PostMapping("/register_page")
    public String register_page_form(@RequestParam("strLoginId") String strLoginId,
                                     @RequestParam("strPassword") String strPassword,
                                     @RequestParam("strName") String strName) throws IOException {

//      System.out.println("Id = " + Id);
//      System.out.println("password = " + password);
//      System.out.println("name = " + name);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        Map<String, String> params = new HashMap<String, String>();
        params.put("strLoginId", strLoginId);
        params.put("strPassword", strPassword);
        params.put("strName", strName);

//      request에 쓰기
        HttpEntity entity = new HttpEntity(params, httpHeaders);
        RestTemplate restTemplate = new RestTemplate();
//      ResponseEntity<String> responseEntity = restTemplate.postForEntity("http://192.168.0.7:8099/api/Web/Admin/UserCreate", entity, String.class, params);
        String strAA = restTemplate.postForObject("http://192.168.0.7:8099/api/Web/Admin/UserCreate", entity, String.class);
        String jsonData = strAA;

        System.out.println("jsonData = " + jsonData);


        return "/user_manage/login.html";
    }

    @GetMapping("/chart_page")
    public String chart_page() {

        return "/wait/charts.html";
    }

    @GetMapping("/table_page")
    public String table_page() {

        return "/wait/tables.html";
    }


}
