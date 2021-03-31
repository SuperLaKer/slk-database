package source.mybatis.mappers;

import org.apache.ibatis.annotations.*;
import source.mybatis.Goods2;

import java.util.List;

@CacheNamespace  // 二级缓存需要手动提交才生效
public interface Goods2Mapper {
    @Select("select * from Goods2 where id = #{id}")
    Goods2 selectById(@Param("id") Integer id);

    @Select("select * from Goods2")List<Goods2> selectList();


    @Delete({
            "",
            "",
            "",
            "",
            ""})
    void deleteList(List<Goods2> Goods2List);


    /**
     * 注意#{}的用法，collection 不要·#{}, 异常
     *     private Integer status;
     *     private Long goodsNum;
     *     private String createTime;
     *     private String goodsName;
     *     private String goodsDesc;
     *     private String price;
     *     private Integer version;
     */
    @Insert({
            "<script>",
            "insert into Goods (`status`, `goods_num`, `create_time`, `goods_name`, `goods_desc`, `price`, `version`) values",
            "<foreach collection='Goods2List' index='index' item='item' separator=','>",
            "(#{item.status}, #{item.goodsNum}, #{item.createTime}, #{item.goodsName}, #{item.goodsDesc}, #{item.price}, #{item.version}) ",
            "</foreach>",
            "</script>"
    })
    void insertTo(@Param("Goods2List") List<Goods2> Goods2List);
}
