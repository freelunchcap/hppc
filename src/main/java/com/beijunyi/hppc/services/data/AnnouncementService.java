package com.beijunyi.hppc.services.data;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.dao.Dao;
import com.beijunyi.hppc.models.data.system.Announcement;

@Named
@Singleton
public class AnnouncementService extends DataService<Announcement> {

  @Inject
  public AnnouncementService(@Nonnull Dao<Announcement> dao) {
    super(dao);
  }

}
