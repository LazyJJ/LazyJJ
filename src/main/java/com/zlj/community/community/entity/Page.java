package com.zlj.community.community.entity;


public class Page {

    /**
     * 当前第在几页
     */
    private Integer current = 1;

    /**
     * 一页最多显示几条
     */
    private Integer limit = 10;

    /**
     * 总共有多少条数据待处理
     */
    private Integer rows;

    /**
     * 请求路径
     */
    private String path;

    /**
     * 总共会有几页
     */
    private Integer totalPages;

    public Integer getCurrent() {
        return current;
    }

    public Page setCurrent(Integer current) {
        if(current >= 1){
            this.current = current;
        }
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public Page setLimit(Integer limit) {
        if (limit >= 1 && limit <= 100) {
            this.limit = limit;
        }
        return this;
    }

    public Integer getRows() {
        return rows;
    }

    public Page setRows(Integer rows) {
        if (rows >= 0) {
            this.rows = rows;
        }
        return this;
    }

    public String getPath() {
        return path;
    }

    public Page setPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 获取当前页起始行
     *
     * */
    public Integer getOffset(){
        return (current - 1) * limit;
    }

    public Page setTotalPages(Integer totalPages) {
        if (totalPages > 0) {
            this.totalPages = totalPages;
        }
        return this;
    }

    /**
     * 获取总的页数
     *
     * @Return 总页数
     */
    public Integer getTotalPages(){
        return rows % limit == 0 ? rows / limit : rows / limit + 1;
    }

    /**
     * 获取开始页码
     * @return
     */
    public Integer getFrom(){
        return current - 2 >= 1?current - 2 : 1;
    }

    /**
     * 获取结束页码
     * @return
     */
    public Integer getTo(){
        return  current + 2 > getTotalPages() ? getTotalPages() : current + 2;
    }
}
