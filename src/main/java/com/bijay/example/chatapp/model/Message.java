package com.bijay.example.chatapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

/**
 * @Author Bijay Thapa
 * @Project chatapp
 * @created 3/31/21 - 10:47 AM
 */

@Entity
@Getter
@Setter
public class Message extends AbstractEntity<Long> {

    @NotNull
    private String message;

    private String imageUrl;

    @NotNull
    private String sentBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @Nullable
    @JsonIgnore
    private Conversation conversation;

<<<<<<< HEAD
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
=======
    //    @ManyToOne(fetch = FetchType.LAZY, optional = false)
>>>>>>> ab25700f10cbf2572ff13d77940e617a5d1a5ad5
//    @JsonIgnore
//    private User fromUser;
    @NotNull
    private Long fromUserId;

<<<<<<< HEAD
//    @ManyToOne(fetch = FetchType.LAZY)
=======
    //    @ManyToOne(fetch = FetchType.LAZY)
>>>>>>> ab25700f10cbf2572ff13d77940e617a5d1a5ad5
//    @JsonIgnore
//    private User toUser;
    @Nullable
    private Long toUserId;

<<<<<<< HEAD
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
=======
    //    @ManyToOne(fetch = FetchType.LAZY, optional = false)
>>>>>>> ab25700f10cbf2572ff13d77940e617a5d1a5ad5
//    @NotNull
//    @JsonIgnore
//    private Bank bank;
    @NotNull
    private Long bankId;

    @NotNull
    private Status status = Status.PENDING;

    @OneToOne
    private Document document;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Transient
    private MultipartFile file;

//    @Transient
//    @NonNull
//    private Long toUserId;

}
