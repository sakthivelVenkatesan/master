package com.example.demo;

import java.util.Iterator;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mss")
public class Myusers 
{
	@Autowired
	private Userservice ser;

	public Userservice getSer() 
	{
		return ser;
	}

	public void setSer(Userservice ser) 
	{
		this.ser = ser;
	}
	
	
//	@RequestMapping(method=RequestMethod.GET, value = "/create")
//
//	public void create()
//	{
//		System.out.println("saving to user details...");
//		
//		Userdetails user=new Userdetails();
//		user.setUid(100);
//		user.setUname("sakthi");
//		user.setCity("tvm");
//		user.setPass("qwerty");
//		user.setConfirmpass("qwerty");
//		user.setAddress("tpet");
//		user.setPhone(638053962);
//		user.setFlag(0);
//		user.setImage(null);
//		
//		ser.saveuser(user);
//		System.out.println("userdetails obj created......");
//	}
//	
	
	@RequestMapping(method = RequestMethod.GET,value="/mcc")
	public ModelAndView login1()
	{
		ModelAndView man=new ModelAndView();
		man.setViewName("login");
		return man;
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/mcc")

	public ModelAndView loginn(HttpServletRequest request)
	{
		ModelAndView manss=new ModelAndView();
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		List<Userdetails> list=ser.checkuser(uname, pass);
		Iterator<Userdetails> itl=list.iterator();
		while(itl.hasNext())
		{
			manss.setViewName("welcome");
			return manss;
		}
		manss.setViewName("error");
		return manss;

	}
	
	@RequestMapping(method = RequestMethod.GET,value=("/mpvs"))
	public ModelAndView loadform()
	{
		ModelAndView man=new ModelAndView();
		Userdetails user=new Userdetails();
		user.setFlag(0);
		man.addObject("userObj",user);
		man.setViewName("Register");
		return man;
	}
	
	@RequestMapping(method = RequestMethod.POST,value=("/mpvs"))

	public ModelAndView processform(@ ModelAttribute("userObj") Userdetails userdetalis,HttpServletRequest request) 
	{
		
		ModelAndView mans=new ModelAndView();
		String pass1=request.getParameter("pass");
		String pass2=request.getParameter("confirmpass");
		if(pass1.equals(pass2))
		{
			List<Userdetails> list=ser.checkid(userdetalis);
			Iterator<Userdetails> itl=list.iterator();
			
			int s=0;
			while(itl.hasNext())
			{
				s=itl.next().getUid();
			}
			int a=s+1;
			userdetalis.setPass(pass2);
			userdetalis.setUid(a);
			mans.addObject("userObj",userdetalis);
			ser.saveuser(userdetalis);	
			
			mans.setViewName("welcome");
			return mans;
		}
		
		mans.setViewName("error");
		return mans;
		
	
	}
	
	
}
