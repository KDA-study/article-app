package articleProject.entity;

import articleProject.dto.ArticleDto;

import java.util.ArrayList;
import java.util.List;

public class Article extends CommonField{
    private Long id;
    private String name;
    private String title;
    private String content;
    private List<Comment> commentList = new ArrayList<>();

    public Article(Long id, String name, String title, String content) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.content = content;
    }

    public void addComments(Comment comment) {
        Long commentId = comment.getCommentId();
        String commentName = comment.getName();
        String commentContent = comment.getContent();
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public void fromDto(ArticleDto dto) {
        Article article = new Article(id, name, title, content);

    }
}
