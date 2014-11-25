package com.beijunyi.hppc.config;

import java.io.File;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.Constants;
import com.beijunyi.hppc.models.api.UpdateAccountRequest;
import com.beijunyi.hppc.models.data.system.Announcement;
import com.beijunyi.hppc.services.SystemService;
import com.beijunyi.hppc.services.data.AnnouncementService;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

@Named
@Singleton
public class AppInitializer {

  @Inject
  private SystemService ss;

  @Inject
  private AnnouncementService as;

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
    ss.createAccount(new UpdateAccountRequest("admin", "Admin", "password", true));
    as.save(new Announcement(new Date(), "success", "Welcome to " + Constants.APP_NAME + "!", "Web portal " + Constants.APP_NAME + " is now online."));
  }

}
