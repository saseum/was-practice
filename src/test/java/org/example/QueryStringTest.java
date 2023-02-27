package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QueryStringTest {

    // operand1=11&operator=*&operand2=55
    // 쿼리스트링은 키, 밸류가 하나인 형태를 가지는 객체
    // 여러개인 경우 List<QueryString> --> 일급 컬렉션
    @Test
    void createTest() {
        QueryString queryString = new QueryString("operand1", "11");
        assertThat(queryString).isNotNull();
    }
}
