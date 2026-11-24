package articleProject.dto;

import articleProject.entity.Article;
import articleProject.entity.CommonField;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ArticleDto extends CommonField {
    private Long id;
    private String name;
    private String title;
    private String content;
    private List<CommentDto> commentList = new ArrayList<>();

    public ArticleDto(Long id, String name, String title, String content) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.content = content;
    }

    public ArticleDto(Long id, String name, String title, String content, LocalDateTime insertedDate) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.content = content;
        super.setInsertedDate(insertedDate);
    }

    public ArticleDto(Long id, String name, String title, String content, LocalDateTime insertedDate, LocalDateTime updatedDate) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.content = content;
        super.setInsertedDate(insertedDate);
        super.setUpdatedDate(updatedDate);
    }

    public ArticleDto(Long id, String name, String title, String content, LocalDateTime insertedDate, LocalDateTime updatedDate, List<CommentDto> comments) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.content = content;
        super.setInsertedDate(insertedDate);
        super.setUpdatedDate(updatedDate);
        this.commentList = comments;
    }

    public void makeArticleDto(Long id, String name, String title, String content, LocalDateTime insertedDate) {
        ArticleDto articleDto = new ArticleDto(id, name, title, content, insertedDate);
    }

    public void fromArticle(Article article) {
        ArticleDto articleDto = new ArticleDto(id, name, title, content);
    }


}
