package zerobase.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.weather.domain.Diary;
import zerobase.weather.domain.Memo;

/**
 * packageName    : zerobase.weather.repository
 * fileName       : DiaryRepository
 * author         : Hansu
 * date           : 2023-09-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-04        shn81       최초 생성
 */
@Repository
public interface DiaryRepository extends JpaRepository<Diary, Integer> {
}
