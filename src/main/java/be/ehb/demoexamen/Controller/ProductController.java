package be.ehb.demoexamen.Controller;

import be.ehb.demoexamen.model.Product;
import be.ehb.demoexamen.model.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    public ProductDao productDao;

    @Autowired
    public ProductController(ProductDao productDao) {
        this.productDao = productDao;
    }


    @GetMapping(value = "products")
    public Iterable<Product>findAll(){
        return productDao.findAll();
    }

}
