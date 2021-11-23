package com.example.realworld.entity;

import com.example.realworld.entity.common.BaseDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Comment extends BaseDateTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // todo 하나의 유저가 여러개의 코멘트를 달 수 있으니깐 1(user):N(comments)?
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "article_id")
    private Article article;

    private String comment;
}

