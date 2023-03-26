package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueryStrings {

    private List<QueryString> queryStrings = new ArrayList<>();

    public QueryStrings(String queryStringLine) {
        String[] split = queryStringLine.split("&");
        Arrays.stream(split)
                .forEach(
                        s -> {
                            String[] values = s.split("=");
                            if(values.length != 2) {
                                throw new IllegalArgumentException("잘못된 파라미터를 가진 문자열");
                            }
                            queryStrings.add(new QueryString(values[0], values[1]));
                        }
                );
    }

    public String getValue(String key) {
        return this.queryStrings.stream()
                .filter(queryString -> queryString.exists(key))
                .map(QueryString::getValue)
                .findFirst()
                .orElse(null);
    }
}
