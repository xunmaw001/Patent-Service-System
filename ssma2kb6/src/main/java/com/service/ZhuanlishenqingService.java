package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanlishenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanlishenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanlishenqingView;


/**
 * 专利申请
 *
 * @author 
 * @email 
 * @date 2021-04-26 14:01:32
 */
public interface ZhuanlishenqingService extends IService<ZhuanlishenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanlishenqingVO> selectListVO(Wrapper<ZhuanlishenqingEntity> wrapper);
   	
   	ZhuanlishenqingVO selectVO(@Param("ew") Wrapper<ZhuanlishenqingEntity> wrapper);
   	
   	List<ZhuanlishenqingView> selectListView(Wrapper<ZhuanlishenqingEntity> wrapper);
   	
   	ZhuanlishenqingView selectView(@Param("ew") Wrapper<ZhuanlishenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanlishenqingEntity> wrapper);
   	
}

