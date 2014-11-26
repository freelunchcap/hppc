package com.beijunyi.hppc.api;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.Path;

import com.beijunyi.hppc.models.data.system.Announcement;
import com.beijunyi.hppc.services.data.DataService;

@Named
@Singleton
@Path("/api/announcement")
public class AnnouncementApi extends DataApi<Announcement> {

  @Inject
  public AnnouncementApi(@Nonnull DataService<Announcement> service) {
    super(service);
  }

}
