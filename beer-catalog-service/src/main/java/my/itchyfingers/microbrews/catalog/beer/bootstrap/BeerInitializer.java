package my.itchyfingers.microbrews.catalog.beer.bootstrap;

import java.util.stream.Stream;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import my.itchyfingers.microbrews.catalog.beer.model.Beer;
import my.itchyfingers.microbrews.catalog.beer.repository.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class BeerInitializer implements CommandLineRunner {

  private final BeerRepository beerRepository;

  private void logBeer(Beer beer) {
    log.info("Beer: {}", beer);
  }

  @Override
  public void run(String... args) throws Exception {
    Stream.of(
        "Kentucky Brunch Brand Stout",
        "Good Morning", "Very Hazy", "King Julius",
        "Budweiser", "Coors Light", "PBR")
        .forEach(beer -> beerRepository.save(new Beer(beer)));

    beerRepository.findAll().forEach(this::logBeer);
  }
}
