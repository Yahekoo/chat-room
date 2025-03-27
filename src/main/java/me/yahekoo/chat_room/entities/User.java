package me.yahekoo.chat_room.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private Long id;

    @Column("username")
    private String username;

    @Column("nickname")
    private String nickname;

    @Column("age")
    private Integer age;

    @Column("description")
    private String description;

}
