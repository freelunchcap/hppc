package com.beijunyi.hppc.api;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.beijunyi.hppc.models.data.forms.BasicInformation;
import com.beijunyi.hppc.services.data.DataService;

@Named
@Singleton
@Path("/api/announcement")
public class AnnouncementApi extends DataApi<BasicInformation> {

  @Inject
  public AnnouncementApi(@Nonnull DataService<BasicInformation> service) {
    super(service);
  }

}
