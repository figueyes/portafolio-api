package com.portfolio.api.mapper;

import com.portfolio.api.domain.Post;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PostMapper {
    @Select("   SELECT * " +
            "   FROM post ")
    @Results({
            @Result(column = "id_post", property = "idPost"),
            @Result(column = "title", property = "title"),
            @Result(column = "subtitle", property = "subtitle"),
            @Result(column = "body_text", property = "bodyText"),
            @Result(column = "createdat", property = "createdAt"),
            @Result(column = "updatedat", property = "updatedAt"),
            @Result(column = "photos", property = "photos")
    })
    public List<Post> getAllPost();

    @Select("   SELECT * " +
            "   FROM post " +
            "   WHERE id_post = #{id}")
    @Results({
            @Result(column = "id_post", property = "idPost"),
            @Result(column = "title", property = "title"),
            @Result(column = "subtitle", property = "subtitle"),
            @Result(column = "body_text", property = "bodyText"),
            @Result(column = "createdat", property = "createdAt"),
            @Result(column = "updatedat", property = "updatedAt"),
            @Result(column = "photos", property = "photos")
    })
    public Post getPostById(@Param("id") Long id);

    @Select("   SELECT * " +
            "   FROM post p" +
            "   JOIN tag t" +
            "   JOIN post_tag pt" +
            "   ON p.id_post = pt.id_post" +
            "   AND t.id_tag = pt.id_tag" +
            "   WHERE t.tag = #{tag}")
    @Results({
            @Result(column = "id_post", property = "idPost"),
            @Result(column = "title", property = "title"),
            @Result(column = "subtitle", property = "subtitle"),
            @Result(column = "body_text", property = "bodyText"),
            @Result(column = "createdat", property = "createdAt"),
            @Result(column = "updatedat", property = "updatedAt"),
            @Result(column = "photos", property = "photos")
    })
    public Post getPostByTag(@Param("tag") String tag);

    @Insert("    INSERT INTO post " +
            "    (title, subtitle, body_text, " +
            "    createdat, updatedat, photos) " +
            "    VALUES (" +
            "    #{post.title}, " +
            "    #{post.subtitle}, " +
            "    #{post.bodyText}, " +
            "    NOW(), " +
            "    NOW(), " +
            "    #{post.photos})")
    @Options(useGeneratedKeys = true, keyProperty = "idPost", keyColumn = "id_post")
    public Boolean insertPost(@Param("post") Post post);

    @Update("   UPDATE post " +
            "   SET title = #{post.title}," +
            "   SET subtitle = #{post.subtitle}," +
            "   SET body_text = #{post.bodyText}," +
            "   SET createdat = #{post.createdAt}," +
            "   SET updatedat = NOW()," +
            "   SET photos = #{post.photos}" )
    public Boolean updatePost(@Param("post") Post post);

    @Delete("   DELETE " +
            "   FROM post " +
            "   WHERE id_post = #{id}")
    public Boolean deletePostById(@Param("id") Long id);

}
