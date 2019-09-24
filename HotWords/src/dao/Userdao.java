package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import DUBtil.DBUtil;
import bean.Userbean;
public class Userdao {
	
	public List<Userbean> getListAll(String key1) {
		List<Userbean> list=new ArrayList<Userbean>();//创建list集合，用于保持User对象
		Connection conn=DBUtil.getConn();//通过工具类直接调用getConnection方法获取jdbc连接。
		Statement state=null;
		ResultSet rs=null;
		try {
		String sql="select * from info where key1='"+key1+"'";
		state=conn.createStatement();
		rs=state.executeQuery(sql);
		while(rs.next()){
		Userbean userbean=new Userbean();//创建User对象用于保持从数据看查出来的数据
		userbean.setId(rs.getInt(1));
		System.out.println(rs.getInt(1));
		userbean.setTitle1(rs.getString(2));
		System.out.println(rs.getString(2));
		userbean.setTitle2(rs.getString(3));
		userbean.setTitle3(rs.getString(4));
		userbean.setContent(rs.getString(5));
		userbean.setKey1(rs.getString(6));
		userbean.setAbstract1(rs.getString(7));
		userbean.setClasss(rs.getString(8));
		list.add(userbean);
		}
		} catch (Exception e) {

			e.printStackTrace();
		}
		finally
		{
			DBUtil.close(rs,state,conn);
		}
		return list;
		}

}
