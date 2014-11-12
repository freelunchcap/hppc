package com.beijunyi.hppc.config;

import java.io.File;
import javax.annotation.Nonnull;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.Constants;
import com.beijunyi.hppc.models.data.admin.Account;
import com.beijunyi.hppc.services.AccountService;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

@Named
@Singleton
public class DatabaseInitializer {

  private final AccountService as;

  @Inject
  public DatabaseInitializer(@Nonnull AccountService as) {
    this.as = as;
  }

  @PostConstruct
  private void ensureInitialization() {
    File initFile = new File(FilenameUtils.concat(Constants.APP_HOME, ".init"));
    if(!initFile.exists()) {
      try {
        init();
        FileUtils.touch(initFile);
      } catch(Exception e) {
        throw new IllegalStateException(e);
      }
    }
  }

  private void init() throws Exception {
    as.save(new Account("admin", "password", true));
  }

}
