package me.zeph.spring.jsonapi.demo;

import java.util.List;
import java.util.Map;

public class JsonApiParams {

    private List<String> sort;
    private Map<String, Integer> page;
    private Map<String, List<String>> filter;

    public List<String> getSort() {
        return sort;
    }

    public void setSort(List<String> sort) {
        this.sort = sort;
    }

    public Map<String, Integer> getPage() {
        return page;
    }

    public void setPage(Map<String, Integer> page) {
        this.page = page;
    }

    public Map<String, List<String>> getFilter() {
        return filter;
    }

    public void setFilter(Map<String, List<String>> filter) {
        this.filter = filter;
    }
}