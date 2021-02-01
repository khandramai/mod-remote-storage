package org.folio.rs.client;

import feign.Client;
import feign.Request;
import feign.Request.Options;
import feign.Response;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.folio.spring.FolioExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

@Log4j2
public class EnrichHeadersClient extends Client.Default {

  @Autowired
  private FolioExecutionContext folioContext;

  public EnrichHeadersClient() {
    super(null, null);
  }

  @Override
  @SneakyThrows
  public Response execute(Request request, Options options) {

    Map<String, Collection<String>> headers = new HashMap<>(request.headers());
    FieldUtils.writeDeclaredField(request, "headers", headers, true);
    FieldUtils.writeDeclaredField(request, "url",
      request.url().replace("http://", folioContext.getOkapiUrl() +"/"), true);

    return super.execute(request, options);
  }
}
