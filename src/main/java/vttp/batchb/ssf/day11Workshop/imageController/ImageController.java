package vttp.batchb.ssf.day11Workshop.imageController;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//Can be anything you want, controller can use what it wants
@RequestMapping(path={"/","index.html"})

public class ImageController {
    
    @GetMapping()
    public String getImage(Model model) throws FileNotFoundException{

        String word = "Picture of the day";
        //String file = "desert.jpg";
        File file = new File(image());
        model.addAttribute("image", file);
        model.addAttribute("myWord", word);
        return "picture";
    }

    public String image(){
        RandomImage random = new RandomImage();
        List<String> list = random.addImage();
        Random rand = new Random();
        int ran = rand.nextInt(list.size());
        String randomImage = list.get(ran);

        return randomImage;
    }

    



}
