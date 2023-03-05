package tw.gov.miaoli.lohas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tw.gov.miaoli.lohas.entity.Mofo;

/**
 * 攤商分類
 *
 * @author P-C Lin (a.k.a 高科技黑手)
 */
@Repository
public interface MofoRepository extends JpaRepository<Mofo, Short> {
}
