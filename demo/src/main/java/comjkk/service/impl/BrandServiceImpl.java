package comjkk.service.impl;

import comjkk.dao.BrandDao;
import comjkk.entity.Brand;
import comjkk.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService{

    @Autowired
    private BrandDao brandDao;
    @Override
    public List<Brand> BrandList() {
        return brandDao.findAll();
    }

    @Override
    public void update(Brand brand) {
        brandDao.save(brand);
    }

    @Override
    public Brand findById(int id) {
        return brandDao.findOne(id);
    }

    @Override
    public void save(Brand brand) {
        brandDao.save(brand);
    }

    @Override
    public void delete(Brand brand) {
        brandDao.delete(brand.getId());
    }
}
