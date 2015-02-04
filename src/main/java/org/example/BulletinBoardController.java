package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class BulletinBoardController {

    private static final Logger LOG = LoggerFactory.getLogger(BulletinBoardController.class);

    @Autowired
    private PostRepository postRepository;

    @ModelAttribute
    public List<Post> loadPosts() {
        return postRepository.findAll();
    }

    @RequestMapping
    public String page() {
        return "bboard";
    }

    @RequestMapping(value = "post", method = RequestMethod.POST)
    public String postMessage(@ModelAttribute Post post) {
        //LOG.info("Post posted on the bulletin board: {}", post);
        postRepository.save(post);
        return "redirect:/";
    }
}
