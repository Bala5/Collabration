package com.niit.UcBack;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;


	@Configuration
	@ComponentScan(basePackages = "com.niit")
	@EnableTransactionManagement

	public class DBConfig 
	{

		
		
		@Bean(name = "sf")
		LocalSessionFactoryBean m3() 
		{
			DriverManagerDataSource ds = new DriverManagerDataSource();
			ds.setDriverClassName("org.h2.Driver");
			ds.setUrl("jdbc:h2:~/Jocar");
			ds.setUsername("sa");
			ds.setPassword("sa");
			Properties p = new Properties();
			p.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
			p.setProperty("hibernate.show_sql", "true");
			p.setProperty("hibernate.hbm2ddl.auto", "update");
			LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
			lsfb.setDataSource(ds);
			lsfb.setHibernateProperties(p);
			lsfb.setPackagesToScan("com.niit.UcBack.Model");
			return lsfb;
		}

		@Bean(name = "mytrans")
		@Autowired
		HibernateTransactionManager m4(SessionFactory sf) {
			HibernateTransactionManager htm = new HibernateTransactionManager();
			htm.setSessionFactory(sf);
			return htm;

		}
		
		
	}


