package it.exercise.mycollection.controller;

import it.exercise.mycollection.model.Platform;
import it.exercise.mycollection.model.VideoGame;
import it.exercise.mycollection.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class CollectionController {

    @Autowired
    private CollectionService service;

    @GetMapping("/list")
    public String getList(Model model) {
        Map<Integer, VideoGame> collection = service.getCollection();
        model.addAttribute("collection", collection);
        return "view-list";
    }

    @GetMapping("/add")
    public String showAddView() {
        return "view-add";
    }

    @PostMapping("/add")
    public String addGame(@RequestParam("name") String title,
                          @RequestParam String publisher,
                          @RequestParam String year,
                          @RequestParam Platform platform,
                          Model model) {
        VideoGame newGame = new VideoGame(title, publisher, year, platform);
        service.add(newGame);

        model.addAttribute("title", title);
        return "view-success";
    }

}
