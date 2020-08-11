package my.itchyfingers.microbrews.catalog.beer.repository;

import my.itchyfingers.microbrews.catalog.beer.model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BeerRepository extends JpaRepository<Beer, Long> {
}
