package first.project.service;

import first.project.entity.Trainee;
import java.util.List;

public interface TraineeService {
    Trainee save(Trainee trainee);

    Trainee getTrainee(int id);

    Trainee update(Trainee trainee);

    String delete(int id);

}

