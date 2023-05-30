package first.project.service;


import first.project.entity.Trainee;
import first.project.repository.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraineeServiceImpl implements TraineeService {
    @Autowired
    private TraineeRepository traineeRepository;


    public Trainee save(Trainee train) {

        return traineeRepository.save(train);
    }
    public Trainee getTrainee(int id) {

        return traineeRepository.findById(id).get();
    }
    public Trainee update(Trainee trainee) {
        Trainee train = traineeRepository.findById(trainee.getId()).get();
        train.setName(trainee.getName());
        train.setAge(trainee.getAge());
        return traineeRepository.save(train);
    }

    public String delete(int id) {
        traineeRepository.deleteById(id);
        return "Entity deleted" + id;


    }

    public TraineeRepository getTraineeRepository() {

        return traineeRepository;
    }

    public void setTraineeRepository(TraineeRepository traineeRepository) {
        this.traineeRepository = traineeRepository;
    }
}

