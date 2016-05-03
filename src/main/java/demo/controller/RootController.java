package demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.model.Tbltodo;
import demo.repository.TbltodoRepository;

// In Spring’s approach to building RESTful web services, HTTP requests are
// handled by a controller. These components are easily identified by the
// @RestController annotation
// This code uses Spring 4’s new @RestController annotation, which marks the
// class as a controller where every method returns a domain object instead of a
// view. It’s shorthand for @Controller and @ResponseBody rolled together.
@RestController
public class RootController {

    // @Autowired
    private TbltodoRepository todoRepository;

    // The @RequestMapping annotation ensures that HTTP requests to /home are
    // mapped
    // to the home() method. @RequestMapping maps all HTTP operations by default
    // GET, PUT, POST,..
    @RequestMapping("/home")
    public List<Tbltodo> home() {
        // public String home() {

        // return todoRepository.findAll();
        return todoRepository.findByTblstatus_statusID(0);
        // return "ddd";
    }

    // @RequestMapping(method=GET) to narrow this mapping
}
