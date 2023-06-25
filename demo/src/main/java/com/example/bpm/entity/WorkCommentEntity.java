package com.example.bpm.entity;

import com.example.bpm.dto.WorkCommentDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "work_comment")
public class WorkCommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "work_comment_id")
    private Long workCommentId;

    @Column(name = "comment")
    private String comment;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "work_id")
    private WorkEntity workIdToComment;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "uuid")
    private UserEntity userIdToComment;

}
