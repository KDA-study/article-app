package articleProject.view;

import articleProject.dto.ArticleDto;
import articleProject.service.ArticleService;
import articleProject.service.CommentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArticleView {
    private Scanner sc = new Scanner(System.in);
    private ArticleService articleService;
    private CommentService commentService;
    private List<ArticleDto> articleDtos = new ArrayList<>();

    public ArticleView(ArticleService articleService){
        this.articleService = articleService;
    }

    public CommentService(CommentService commentService){
        this.commentService = commentService;
    }

    // 전체 게시글 보기 (댓글 포함)
    public void showAll(){
    }
}
