package aa.slktop.database.haha.service;

import aa.slktop.database.haha.entity.TimeDate;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2021-03-31
 */
public interface ITimeDateService extends IService<TimeDate> {
    TimeDate findTimeDateById(Long id);
}
