package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
public class BulletinBoardController {

    private static final Logger LOG = LoggerFactory.getLogger(BulletinBoardController.class);

    @ModelAttribute
    public List<Post> loadPosts() {
        return Arrays.asList(
                new Post("John Doe", "Captain from the board."),
                new Post("Jane Doe", "Greetings from server-side."));
    }

    @RequestMapping
    public String page() {
        return "bboard";
    }

    @RequestMapping(value = "post", method = RequestMethod.POST)
    public String postMessage(@ModelAttribute Post post) {
        LOG.info("Post posted on the bulletin board: {}", post);
        return "redirect:/";
    }
}
