package io.princedonkor.moviecatalogservice.Controller;

import io.princedonkor.moviecatalogservice.Model.CatalogoItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @GetMapping("/{userId}")
    public List<CatalogoItem> getCatalog(@PathVariable String userId) {
            return Collections.singletonList(new CatalogoItem("transformers","test",4 ));
    }
}
