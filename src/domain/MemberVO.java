package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Getter
@Setter
@AllArgsConstructor

public class MemberVO {
	private String id;
	private String password;
	private String name;
	private String addr;
}
