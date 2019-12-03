package cn.tedu.dongbaadmin.common.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@Accessors
public class Page<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    /**当前页的页码值*/
    private Integer pageCurrent=1;
    /**每页记录数*/
    private Integer pageSize=3;
    /**总行数(通过查询获得)*/
    private Integer rowCount=0;
    /**总页数(通过计算获得)*/
    private Integer pageCount=0;
    /**当前页记录*/
    private List<T> records;

    public Page(Integer pageCurrent, Integer pageSize, Integer rowCount, List<T> records) {
        super();
        this.pageCurrent = pageCurrent;
        this.pageSize = pageSize;
        this.rowCount = rowCount;
        this.records = records;
        this.pageCount=(rowCount-1)/pageSize+1;
    }
}
