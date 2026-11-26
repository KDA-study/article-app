package articleProject.repository;

import articleProject.crudInterface.CrudInterface;
import articleProject.entity.Article;
import articleProject.entity.Comment;

import java.util.ArrayList;
import java.util.List;

public class ArticleRepository implements CrudInterface {
    static Long articleId = 1L;
    static Long commentId = 1L;
    static List<Article> articleList = new ArrayList<>();


    @Override
    public List<Article> all() {
        System.out.println(">>> ArticleRepository.all() <<<");
        List<Article> articleAll = new ArrayList<>(articleList.size());
        for (int i = 0; i < articleList.size(); i++) {
            articleAll.set(i, articleList.get(i));
        }
        return articleAll;
    }

    @Override
    public void newArticle(Article article) {
        System.out.println(">>> ArticleRepository.newArticle() <<<");
        articleList.add(article);
        articleId++;
    }

    @Override
    public Article detail(Long id) {
        System.out.println(">>> ArticleRepository.detail() <<<");
        int index = findIndex(id);
        if (index == -1) {
            return null;
        }
        return articleList.get(index);
    }

    @Override
    public boolean delete(Long id) {
        System.out.println(">>> ArticleRepository.delete() <<<");
        int index = findIndex(id);
        if (index == -1) {
            return false;
        }
        articleList.remove(index);
        return true;
    }

    @Override
    public void update(Article article) {
        System.out.println(">>> ArticleRepository.update() <<<");
        int index = findIndex(article.getId());
        articleList.set(index, article);
    }

    @Override
    public void insertComment(Comment comment) {
        System.out.println(">>> ArticleRepository.insertComment() <<<");
        detail(articleId).addComments(comment);
        commentId++;
    }

    @Override
    public void updateComment(Comment comment) {
        System.out.println(">>> ArticleRepository.updateComment() <<<");
        for (int i = 0; i < articleList.size(); i++) {
            if (articleList.get(i).getCommentList().equals(comment.getCommentId())) {
            }
        }
    }

    @Override
    public void deleteComment(Long deleteCommentId) {
        System.out.println(">>> ArticleRepository.deleteComment() <<<");
        articleList.g
    }

    // 추가 메서드
    // 찾는 id가 존재하는 게시글 리스트의 인덱스
    private int findIndex(Long id) {
        System.out.println(">>> ArticleRepository.findIndex() <<<");
        for (int i = 0; i < articleList.size(); i++) {
            if (articleList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}