package tw.gov.miaoli.lohas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tw.gov.miaoli.lohas.entity.AllPayHistory;

/**
 * 歐付寶支付歷程
 *
 * @author P-C Lin (a.k.a 高科技黑手)
 */
public interface AllPayHistoryRepository extends JpaRepository<AllPayHistory, Long> {
}
