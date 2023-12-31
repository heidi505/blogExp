package shop.mtcoding.blogexp.reply;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;

import lombok.Builder;
import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;
import shop.mtcoding.blogexp.board.Board;
import shop.mtcoding.blogexp.user.User;

@NoArgsConstructor
@Setter
@Getter
@Table(name="reply_tb")
@Entity
public class Reply {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(nullable = false, length = 100)
    private String comment;

    @ManyToOne
    private User user;

    @ManyToOne
    private Board board;

    @CreationTimestamp
    private Timestamp createdAt;

    @Builder
    public Reply(Integer id, String comment, User user, Board board, Timestamp createrAt) {
        this.id = id;
        this.comment = comment;
        this.user = user;
        this.board = board;
        this.createdAt = createrAt;
    }
    
    
}
