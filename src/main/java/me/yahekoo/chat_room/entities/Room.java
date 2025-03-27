package me.yahekoo.chat_room.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table(name="rooms")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Id
    private Long id;

    @Column("room_name")
    private String roomName;

    @Column("description")
    private String description;

    @Column("admin_only")
    private Boolean adminOnly = false;

    @Column("suspended")
    private Boolean suspended = false;

    @Column("max_users")
    private Integer maxUsers = 255;

    @Column("created_by")
    private String createdBy;

    @Column("created_at")
    private LocalDateTime createdAt;
}
