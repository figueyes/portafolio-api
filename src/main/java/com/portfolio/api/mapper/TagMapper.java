package com.portfolio.api.mapper;

import com.portfolio.api.domain.Post;
import com.portfolio.api.domain.Tag;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TagMapper {

    @Select("   SELECT *" +
            "   FROM tag")
    @Results({@Result(column = "id_tag", property = "idTag"),
              @Result(column = "tag", property = "tag"),
              @Result(column = "category_tag", property = "categoryTag")})
    public List<Tag>getTags();

    @Select("   SELECT " +
            "   id_tag" +
            "   FROM tag" +
            "   WHERE tag = #{tag}")
    @Results({
            @Result(column = "id_tag", property = "idTag")
    })
    public Long getTagIdByTag(@Param("tag") String tag);

    @Select("   SELECT * " +
            "   FROM tag " +
            "   WHERE tag = #{tag}")
    @Results({
            @Result(column = "id_tag", property = "idTag"),
            @Result(column = "tag", property = "idTag"),
            @Result(column = "category_tag", property = "idTag")
    })
    public Tag getTagByTag(@Param("tag") String tag);

    @Select("   SELECT " +
            "   category_tag" +
            "   FROM tag" +
            "   WHERE id_tag = #{id}")
    @Results(@Result(column = "category_tag", property = "categoryTag"))
    public String getCategoryTag(@Param("id") Long id);

    @Insert("   INSERT INTO tag (tag, category_tag) VALUES " +
            "   #{tag}, #{category}" +
            "   category_tag = #{post.category}")
    public Boolean insertTag(@Param("tag") String tag, @Param("category") Post post);

}
