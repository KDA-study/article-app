package articleProject.entity;

import articleProject.dto.CommentDto;

public class Comment {
    private Long commentId;
    private Long articleId;
    private String name;
    private String content;

    public Comment(Long commentId, Long articleId, String name, String content) {
        this.commentId = commentId;
        this.articleId = articleId;
        this.name = name;
        this.content = content;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public void fromDTO(CommentDto dto) {
        Comment comment = new Comment(commentId, articleId, name, content);
    }

    @Override
    public String toString() {
        return "\t🏷️ " + commentId + "\t" + name + "\t" + content;
    }
}
