package com.boii_projects.KartIn.service.product;

import com.boii_projects.KartIn.dto.ProductDto;
import com.boii_projects.KartIn.model.Product;
import com.boii_projects.KartIn.request.AddProductRequest;
import com.boii_projects.KartIn.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {

    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product , Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String name, String brand);
    Long countProductsByBrandAndName(String brand, String name );


    List<ProductDto> getConvertedProducts(List<Product> products);

    ProductDto convertToDto(Product product);
}
