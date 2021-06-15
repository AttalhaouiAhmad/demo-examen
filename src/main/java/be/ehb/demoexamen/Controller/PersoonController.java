package be.ehb.demoexamen.Controller;

import be.ehb.demoexamen.model.Persoon;
import be.ehb.demoexamen.model.PersoonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersoonController {

    private PersoonDao persoonDao;

    @Autowired
    public PersoonController(PersoonDao persoonDao){
        this.persoonDao = persoonDao;
    }

    @ModelAttribute("all")
    public Iterable<Persoon>findAll(){
        return persoonDao.findAll();
    }

    @RequestMapping(value = {"/"},method = RequestMethod.POST)
        public String showIndex(ModelMap map){
        return "it works";
    }


}
