package org.tanzu.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SensorsUiController {

    private final SensorRepository sensorRepository;

    @Value("${title}")
    private String title;

    public SensorsUiController(final SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    @GetMapping
    public String fetchUI(Model model) {
        model.addAttribute("sensors", sensorRepository.findAll());
        model.addAttribute("title", title);
        return "index";
    }
}

