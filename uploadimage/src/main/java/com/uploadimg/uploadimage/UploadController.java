package com.uploadimg.uploadimage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/upload")
public class UploadController {
    @GetMapping({"", "/"})
    String doGet() {
        return "upload";
    }
}
