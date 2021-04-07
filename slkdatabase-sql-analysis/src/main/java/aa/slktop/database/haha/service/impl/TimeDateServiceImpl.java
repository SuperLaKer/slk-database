package aa.slktop.database.haha.service.impl;

import aa.slktop.database.haha.entity.TimeDate;
import aa.slktop.database.haha.mapper.TimeDateMapper;
import aa.slktop.database.haha.service.ITimeDateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * extends ServiceImpl<RoleMapper, Role> implements IRoleService
 *
 * @author jobob
 * @since 2021-03-31
 */
@Service
public class TimeDateServiceImpl extends ServiceImpl<TimeDateMapper, TimeDate> implements ITimeDateService {

    public TimeDate findTimeDateById(Long id){
        return baseMapper.selectById(id);
    }

}
