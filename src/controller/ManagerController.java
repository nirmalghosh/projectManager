package controller;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import util.HibernateUtil;

@Controller
public class ManagerController {
	
	 @RequestMapping(value="hello", method = RequestMethod.GET)
	   public String printHello(ModelMap model) {
	      model.addAttribute("message", "Welcome");
	      return "hello";
	   }

		/*	
	        @RequestMapping(value="addBook", method = RequestMethod.GET)
			public String addBook(@RequestParam("subtitle") String subtitle , @RequestParam("booktitle") String booktitle, ModelMap model){
				Session session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
			    Subject subject = new Subject();
			    subject.setSubtitle(subtitle);
			    subject.setDurationInHours(30);
			    session.save(subject);
				Book book = new Book(); 
			    book.setPrice(19.99);
			    book.setVolume(1);
			    book.setPublisgDate( new Date(new java.util.Date().getTime()));
			    book.setTitle(booktitle);
			    book.setSubject(subject);
			    subject.getReferences().add(book);
			    session.save(book);
			    session.getTransaction().commit();
			    model.addAttribute("message", "Book added");
			    return "hello";
			}
	        
	        @RequestMapping(value="searchForBook", method = RequestMethod.GET)
			public String searchForBook(@RequestParam("booktitle") String booktitle, ModelMap model){
	        	Session session = HibernateUtil.getSessionFactory().openSession();
		        boolean bookFound = false;
		        Criteria cr = session.createCriteria(Book.class);
		        cr.add(Restrictions.eq("title", booktitle));
		        List results = cr.list();
			        if(results != null && results.size() >0) {
			        	model.addAttribute("message", "Book found");
			        } else {
			        	model.addAttribute("message", "Book not found");
			        }
			        return "hello";
			}
	        
	        @RequestMapping(value="searchForSubject", method = RequestMethod.GET)
			public String searchForSubject(@RequestParam("subtitle") String subtitle, ModelMap model)  {
	        	Session session = HibernateUtil.getSessionFactory().openSession();
		        boolean subjectFound = false;
		        Criteria cr = session.createCriteria(Subject.class);
		        cr.add(Restrictions.eq("subtitle", subtitle));
		        List results = cr.list();
			        if(results != null && results.size() >0) {
			        	model.addAttribute("message", "Subject found");
			        } else {
			        	model.addAttribute("message", "Subject not found");
			        }
			        return "hello";

			}
			
	        @RequestMapping(value="deleteBook", method = RequestMethod.GET)
			public String  deleteBook(@RequestParam("booktitle") String booktitle, ModelMap model){
	        	Session session = HibernateUtil.getSessionFactory().openSession();
			    session.beginTransaction();
			    Criteria cr = session.createCriteria(Book.class);
		        cr.add(Restrictions.eq("title", booktitle));
		        List results = cr.list();
		        if(results != null && results.size() >0) {
		        	for(int i = 0; i< results.size(); i ++) {
		        		Book book = (Book)results.get(i);
		        		session.delete(book);
		        	}
		        	session.getTransaction().commit();
		        	model.addAttribute("message", "Book Deleted ");
		        } else {
		        	model.addAttribute("message", "Book not found "); 
		        }
		        return "hello";

			}
			
	        @RequestMapping(value="deleteSubject", method = RequestMethod.GET)
			public String deleteSubject(@RequestParam("subtitle") String subtitle, ModelMap model)  {
	        	Session session = HibernateUtil.getSessionFactory().openSession();
			    session.beginTransaction();
			    Criteria cr = session.createCriteria(Subject.class);
		        cr.add(Restrictions.eq("subtitle", subtitle));
		        List results = cr.list();
		        if(results != null && results.size() >0) {
		        	for(int i = 0; i< results.size(); i ++) {
		        		Subject subject = (Subject)results.get(i);
		        		session.delete(subject);
		        	}
		        	session.getTransaction().commit();
		        	model.addAttribute("message", "Subject Deleted "); 
		        } else {
		        	model.addAttribute("message", "Subject not found "); 
			        }
		        return "hello";
			}
			
			 */       


}
