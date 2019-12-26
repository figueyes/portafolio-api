package com.portfolio.api.mapper;

import com.portfolio.api.domain.Author;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AuthorMapper {

    @Insert("   INSERT INTO AUTHOR " +
            "   (author, name, surname, description, createdat, updatedat)" +
            "   VALUES " +
            "   (#{author}, #{name}, #{surname}, #{description}, #{createdat}, #{updatedat})")
    @Options(useGeneratedKeys = true, keyProperty = "idAuthor", keyColumn = "id_author")
    public Boolean createAuthor(Author author);

    @Update("   UPDATE TABLE AUTHOR " +
            "   SET" +
            "   author = #{author}" +
            "   name =  #{name}" +
            "   surname = #{surname}" +
            "   description = #{description}" +
            "   createdat = #{createdat}" +
            "   updatedat = #{updatedat}" +
            "   WHERE id_author = #{idAuthor}")
    public Author updateAuthor(Author author);

    @Select("   SELECT *" +
            "   FROM author")
    @Results({
            @Result(column = "id_author", property = "idAuthor"),
            @Result(column = "author", property = "author"),
            @Result(column = "name", property = "name"),
            @Result(column = "surname", property = "surname"),
            @Result(column = "description", property = "description"),
            @Result(column = "createdat", property = "createdat"),
            @Result(column = "updatedat", property = "updatedat")
    })
    public List<Author> getAuthors();

    @Select("   SELECT * " +
            "   FROM author" +
            "   WHERE id_author = #{id}")
    @Results({
            @Result(column = "id_author", property = "idAuthor"),
            @Result(column = "author", property = "author"),
            @Result(column = "name", property = "name"),
            @Result(column = "surname", property = "surname"),
            @Result(column = "description", property = "description"),
            @Result(column = "createdat", property = "createdat"),
            @Result(column = "updatedat", property = "updatedat")
    })
    public Author getAuthorById(@Param("id") Long id);

    @Select("   SELECT * " +
            "   FROM author" +
            "   WHERE author = #{author}")
    @Results({
            @Result(column = "id_author", property = "idAuthor"),
            @Result(column = "author", property = "author"),
            @Result(column = "name", property = "name"),
            @Result(column = "surname", property = "surname"),
            @Result(column = "description", property = "description"),
            @Result(column = "createdat", property = "createdat"),
            @Result(column = "updatedat", property = "updatedat")
    })
    public Author getAuthor(@Param("author") String author);

    @Delete("   DELETE FROM AUTHOR " +
            "   WHERE id_author = #{id}")
    public Boolean deleteAuthor(@Param("id") Long id);

    @Insert("   INSERT INTO post_author" +
            "   (id_post, id_author) " +
            "   VALUES" +
            "   (#{idPost}, #{idAuthor})")
    public Boolean addAuthorPost(Long idPost, Long idAuthor);
}
