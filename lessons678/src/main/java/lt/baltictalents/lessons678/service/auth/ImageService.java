package lt.baltictalents.lessons678.service.auth;

import lt.baltictalents.lessons678.model.Image;
import lt.baltictalents.lessons678.model.Product;

import java.util.List;

public interface ImageService {
    void save(Image Image);

    List<Image> findAll();
}