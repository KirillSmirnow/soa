package thistle.auth.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "login"))
public class User extends BaseEntity {

    @NotNull
    @Pattern(regexp = "[A-Za-z0-9-_]{3,16}")
    private String login;

    @NotNull
    @NotBlank
    @Size(min = 3, max = 50)
    private String nickname;

    private String password;
}
