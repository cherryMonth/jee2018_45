package controller;

import java.io.IOException;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class ExDemo extends ActionSupport {
 @Override public String execute() throws Exception{
   double num=Math.random();
   if(num<0.5 )throw new SQLException("�Ҳ����� ");
   else throw new IOException("�Ҳ����ļ�");
  }
}
