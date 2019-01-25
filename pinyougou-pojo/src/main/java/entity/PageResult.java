package entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Mugen 2019/1/15
 */
@Data
public class PageResult implements Serializable {
    /**
     * 总记录数
     */
    private Long total;

    /**
     * 当前页每条结果数据
     */
    private List rows;

    public PageResult(Long total, List rows) {
        this.total = total;
        this.rows = rows;
    }
}