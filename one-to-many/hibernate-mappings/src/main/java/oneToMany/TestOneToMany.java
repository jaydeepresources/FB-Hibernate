package oneToMany;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class TestOneToMany {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
//		--- All Data Nested ---
//		for (Company company : companies) {
//			System.out.println("---Company---");
//			System.out.println(company);
//			System.out.println("---Products---");
//			for (Product product: company.getProducts()) {
//				System.out.println(product);
//			}
//			System.out.println();
//		}
		
//		Product p = (Product)session.createCriteria(Product.class)
//		.add(Restrictions.eq("productName", "Parachute Oil"))
//		.list().get(0);
//		
//		System.out.println(p);
		

		transaction.commit();
		session.close();
	}

}
