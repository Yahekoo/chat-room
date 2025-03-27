package me.yahekoo.chat_room.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;



@Table("room_users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoomUser {

    @Column("user_id")
    private Long userId;

    @Column("room_id")
    private Long roomId;
}
