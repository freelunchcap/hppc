package com.beijunyi.hppc.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Driver;
import java.util.Properties;
import javax.annotation.Nonnull;
import javax.sql.DataSource;

import com.beijunyi.hppc.Constants;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.h2.store.fs.FileUtils;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.dialect.H2Dialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

@Configuration
public class DatabaseConfig {

  public static String DATABASE_PROPERTIES = FilenameUtils.normalizeNoEndSeparator(FilenameUtils.concat(Constants.APP_HOME, "database.properties"), true);

  public static String H2_DIR = FilenameUtils.normalizeNoEndSeparator(FilenameUtils.concat(Constants.DATABASE_DIR, "h2/data"), true);

  private Properties cfg = new Properties();

  public DatabaseConfig() throws Exception {
    File cfgFile = new File(DATABASE_PROPERTIES);
    if(!cfgFile.exists()) {
      loadDefaultSetting(cfg);
      FileUtils.createDirectories(cfgFile.getParent());
      cfg.store(new FileOutputStream(cfgFile), null);
    } else
      cfg.load(new FileInputStream(cfgFile));
  }

  private void loadDefaultSetting(@Nonnull Properties cfg) {
    cfg.setProperty(AvailableSettings.DRIVER, org.h2.Driver.class.getCanonicalName());
    cfg.setProperty(AvailableSettings.URL, "jdbc:h2:file:" + H2_DIR);
    cfg.setProperty(AvailableSettings.USER, "k");
    cfg.setProperty(AvailableSettings.PASS, RandomStringUtils.randomAlphanumeric(16));
    cfg.setProperty(AvailableSettings.DIALECT, H2Dialect.class.getCanonicalName());
    cfg.setProperty(AvailableSettings.SHOW_SQL, Boolean.toString(true));
    cfg.setProperty(AvailableSettings.HBM2DDL_AUTO, "update");
  }

  @Bean
  public SessionFactory sessionFactory() throws Exception {
    DataSource ds = new SimpleDriverDataSource((Driver) Class.forName(cfg.getProperty(AvailableSettings.DRIVER)).newInstance(), cfg.getProperty(AvailableSettings.URL));
    LocalSessionFactoryBuilder sfb = new LocalSessionFactoryBuilder(ds);
    sfb.scanPackages("com.beijunyi.kangask.**");
    sfb.addProperties(cfg);
    return sfb.buildSessionFactory();
  }

  @Bean
  public HibernateTransactionManager transactionManager() throws Exception {
    return new HibernateTransactionManager(sessionFactory());
  }


}
