package first.project.controller;

import first.project.entity.Trainee;
import first.project.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/trainee")
    public class TraineeController {
        @Autowired
        private TraineeService traineeService;
        @PostMapping
        public Trainee addTrainee(@RequestBody Trainee trainee){

            return traineeService.save(trainee);
        }
        @GetMapping(path="/{id}")
        public Trainee getTrainee(@PathVariable int id) {

            return traineeService.getTrainee(id);
        }
        @PutMapping
        public Trainee updateTrainee(@RequestBody Trainee trainee) {

            return traineeService.update(trainee);
        }
        @DeleteMapping
        public String deleteEmployee(@PathVariable int id) {

            return traineeService.delete(id);
        }



    }





