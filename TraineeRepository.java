package first.project.repository;

import org.springframework.stereotype.Repository;
import first.project.entity.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface TraineeRepository extends JpaRepository<Trainee, Integer> {
    }

