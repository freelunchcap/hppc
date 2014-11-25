package com.beijunyi.hppc.dao;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.beijunyi.hppc.models.data.system.Announcement;
import org.hibernate.SessionFactory;

@Named
@Singleton
public class AnnouncementDao extends AbstractDao<Announcement> {

  @Inject
  public AnnouncementDao(@Nonnull SessionFactory sf) {
    super(sf);
  }

  @Nonnull
  @Override
  protected Class<Announcement> getPersistentClass() {
    return Announcement.class;
  }
}
