package pl.com.clockworkgnome.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.com.clockworkgnome.domain.Book;

@RepositoryRestResource(collectionResourceRel = "books", path="books")
public interface BookRepository extends PagingAndSortingRepository<Book,Long> {
    
}
