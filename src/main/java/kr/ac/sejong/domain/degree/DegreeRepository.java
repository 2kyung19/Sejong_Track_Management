package kr.ac.sejong.domain.degree;

import kr.ac.sejong.domain.degree.Degree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DegreeRepository extends JpaRepository<Degree, Long> {

}