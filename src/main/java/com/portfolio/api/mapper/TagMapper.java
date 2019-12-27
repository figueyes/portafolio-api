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
              @Result(column = "createdat", property = "createdAt"),
              @Result(column = "updatedat", property = "updatedAt")
    })
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
            @Result(column = "tag", property = "tag"),
            @Result(column = "createdat", property = "createdAt"),
            @Result(column = "updatedat", property = "updatedAt")
    })
    public Tag getTagByTag(@Param("tag") String tag);

    @Insert("   INSERT INTO tag " +
            "   (tag, createdat, updatedat) " +
            "   VALUES " +
            "   (#{tag}, " +
            "   NOW(), " +
            "   NOW() )")
    @Options(useGeneratedKeys = true, keyProperty = "idTag", keyColumn = "id_tag")
    public Boolean insertTag(Tag tag);

    @Insert("   INSERT INTO post_tag" +
            "   (id_post, id_tag) " +
            "   VALUES" +
            "   (#{idPost}, #{idTag})")
    public Boolean addTagPost(Long idPost, Long idTag);

}
