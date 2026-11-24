package articleProject.dto;

import articleProject.entity.Comment;

public class CommentDto {
    private Long commentId;
    private Long articleId;
    private String name;
    private String content;

    public CommentDto(Long commentId, Long articleId, String name, String content) {
        this.commentId = commentId;
        this.articleId = articleId;
        this.name = name;
        this.content = content;
    }

    public void fromEntity(Comment comment) {
        CommentDto commentDto = new CommentDto(commentId, articleId, name, content);
    }

    @Override
    public String toString() {
        return "\t🏷️ " + commentId + "\t" + name + "\t" + content;
    }
}
