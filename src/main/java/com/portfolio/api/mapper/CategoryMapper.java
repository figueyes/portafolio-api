package com.portfolio.api.mapper;

import org.apache.ibatis.annotations.Insert;

public interface CategoryMapper {

    @Insert("   INSERT INTO post_category" +
            "   (id_post, id_category) " +
            "   VALUES" +
            "   (#{idPost}, #{idCategory})")
    public Boolean addAuthorPost(Long idPost, Long idCategory);
}
