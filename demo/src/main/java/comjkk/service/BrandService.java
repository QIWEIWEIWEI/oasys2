package comjkk.service;

import comjkk.entity.Brand;

import java.util.List;

public interface BrandService {

    List<Brand> BrandList();

   void update(Brand brand);

    Brand findById(int id);

    void save(Brand brand);

    void delete(Brand brand);
}
