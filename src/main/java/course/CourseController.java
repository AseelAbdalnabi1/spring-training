package course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){

        return courseService.getAllCourses();
    }
    @RequestMapping("/topics/{id}")
    public Optional<Course> getCourse(@PathVariable String id){
        return courseService.getCourse(id);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public void updateCourse(@RequestBody Course course,@PathVariable String id){
        courseService.updateCourse(course);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public void deleteCourse(@PathVariable String id){
        courseService.deleteCourse(id);
    }
}
