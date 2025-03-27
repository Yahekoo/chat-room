package me.yahekoo.chat_room.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table("messages")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    @Id
    private Long id;

    @Column("user_id")
    private Long senderId;

    @Column("room_id")
    private Long roomId;

    @Column("content")
    private String content;

    @Column("created_at")
    private LocalDateTime createdAt;

}
