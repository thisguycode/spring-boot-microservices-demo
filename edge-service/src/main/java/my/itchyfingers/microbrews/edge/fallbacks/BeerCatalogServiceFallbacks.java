package my.itchyfingers.microbrews.edge.fallbacks;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class BeerCatalogServiceFallbacks {

  @RequestMapping("/getBeersFallback")
  public Mono<FallbackResponse> getBeersFallback() {
    final var message = "API is down. Please try again";
    return Mono.just(new FallbackResponse(message));
  }
}
