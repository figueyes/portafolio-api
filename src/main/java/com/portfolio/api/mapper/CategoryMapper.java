package com.portfolio.api.mapper;

import com.portfolio.api.domain.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CategoryMapper {

    @Select("   SELECT * " +
            "   FROM categoria")
    @Results({
            @Result(column = "id_category", property = "idCategory"),
            @Result(column = "category", property = "category"),
            @Result(column = "createdat", property = "createdAt"),
            @Result(column = "updatedat", property = "updatedAt")
    })
    public List<Category> getCategories(Category category);

    @Select("   SELECT * " +
            "   FROM categoria" +
            "   WHERE categoria = #{categoria}")
    @Results({
            @Result(column = "id_category", property = "idCategory"),
            @Result(column = "category", property = "category"),
            @Result(column = "createdat", property = "createdAt"),
            @Result(column = "updatedat", property = "updatedAt")
    })
    public Category getByCategory(@Param("categoria") String categoria);

    @Insert("   INSERT INTO category " +
            "   (category, createdat, updatedat)" +
            "   VALUES " +
            "   (#{category}, NOW(), NOW())")
    @Options(useGeneratedKeys = true, keyProperty = "idCategory", keyColumn = "id_category")
    public Boolean createCategory(Category category);

    @Update("   UPDATE TABLE category " +
            "   SET" +
            "   category = #{category}," +
            "   updatedat = NOW()")
    public Boolean updateCategory(Category category);

    @Insert("   INSERT INTO post_category" +
            "   (id_post, id_category) " +
            "   VALUES" +
            "   (#{idPost}, #{idCategory})")
    public Boolean addAuthorPost(Long idPost, Long idCategory);
}
