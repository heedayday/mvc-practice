
package com.heeday.mvc.model;

import java.util.Objects;

public class User {
    private String userId;
    private String name;

    //생성자
    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    //lombok을 안쓰고 gettter setter를 사용하는 경우
    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    //@Overide annotation을 통해서 재정의된 메서드를 확인할 수 있음 https://xonmin.tistory.com/23
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name);
    }
}