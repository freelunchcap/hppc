package com.beijunyi.hppc;

import static org.apache.commons.io.FileUtils.getUserDirectoryPath;
import static org.apache.commons.io.FilenameUtils.concat;
import static org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator;

public class Constants {


  public static final String USER_HOME = normalizeNoEndSeparator(getUserDirectoryPath(), true);

  public static final String APP_NAME = "hppc";
  public static final String HOME_DIR_NAME = "." + APP_NAME;
  public static final String APP_HOME = normalizeNoEndSeparator(concat(USER_HOME, HOME_DIR_NAME), true);

  public static final String DATABASE_DIR_NAME = "database";
  public static final String DATABASE_DIR = normalizeNoEndSeparator(concat(APP_HOME, DATABASE_DIR_NAME), true);
}
