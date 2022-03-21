package hello.core.member;

public class Member {
    // 회원의 세가지 속성
    private long id;
    private String name;
    private Grade grade;

    // alt + ins
    public Member(long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // 정보의 은닉화를 위해 getter, setter를 쓴다.
    // private로 필드를 정의하여 다른곳에서 접근하는것을 막아주고 setter로 입력 받는 값을 조절, getter로 정보를 은닉한 상태로 배출
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
