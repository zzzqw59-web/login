package hello.login.domain.login;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Member {
    private Long id;

    @NotBlank
    private String loginId;
    @NotBlank
    private String name;
    @NotBlank
    private String password;
}
