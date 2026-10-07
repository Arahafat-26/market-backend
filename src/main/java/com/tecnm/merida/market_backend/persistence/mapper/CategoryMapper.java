package com.tecnm.merida.market_backend.persistence.mapper;

import com.tecnm.merida.market_backend.domain.Category;
import com.tecnm.merida.market_backend.persistence.entity.Categoria;
import com.tecnm.merida.market_backend.persistence.entity.Producto;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target="CategoryId"),
            @Mapping(source = "description", target="Category"),
            @Mapping(source = "estado", target="active")
    })
    Category toCategoty(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Category toCategory(Category category);
}
