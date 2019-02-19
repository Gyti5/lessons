package lt.baltictalents.lessons678.service.auth;

import lt.baltictalents.lessons678.model.Image;
import lt.baltictalents.lessons678.model.Product;
import lt.baltictalents.lessons678.repository.auth.ImageRepository;
import lt.baltictalents.lessons678.repository.auth.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageRepository imageRepository;
    @Override
    public void save(Image image){
        imageRepository.save(image);
    }


    @Override
    public List<Image> findAll() {
        return imageRepository.findAll();
	}
}
