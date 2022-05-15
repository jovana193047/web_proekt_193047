package mk.ukim.finki.db.library.repository;

import mk.ukim.finki.db.library.model.ReservationBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationBookRepository extends JpaRepository<ReservationBook, Long> {
}
