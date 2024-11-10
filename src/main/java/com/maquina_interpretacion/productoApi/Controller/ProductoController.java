package com.maquina_interpretacion.productoApi.Controller;

import com.maquina_interpretacion.productoApi.Models.ProductoV1;
import com.maquina_interpretacion.productoApi.Models.ProductoV2;
import com.maquina_interpretacion.productoApi.Models.ProductoV3;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

    @GetMapping("/v1")
    public ProductoV1 getProductoV1() {
        return new ProductoV1("ASUS VIVOBOOK 2023", "Laptop Gris teclado numerico", 575.0);
    }

    @GetMapping("/v2")
    public ProductoV2 getProductoV2() {
        return new ProductoV2("Iphone 16", 1200.0, 50, "Categoría A");
    }

    @GetMapping("/v3")
    public ProductoV3 getProductoV3() {
        return new ProductoV3("HP CPU 1200", "CPU 1200 CORE I9", "Categoría B", 10.0, 920.0);
    }
}
