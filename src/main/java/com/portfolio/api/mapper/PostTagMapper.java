package com.portfolio.api.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface PostTagMapper {

    @Insert("   INSERT INTO post_tag " +
            "   (id_tag, id_post) " +
            "   VALUES " +
            "   (#{idTag}, #{idPost})")
    public Boolean savePostTag(@Param("idtag") Long idTag, @Param("idPost") Long idPost);

}
