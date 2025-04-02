package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhuanlishenqingDao;
import com.entity.ZhuanlishenqingEntity;
import com.service.ZhuanlishenqingService;
import com.entity.vo.ZhuanlishenqingVO;
import com.entity.view.ZhuanlishenqingView;

@Service("zhuanlishenqingService")
public class ZhuanlishenqingServiceImpl extends ServiceImpl<ZhuanlishenqingDao, ZhuanlishenqingEntity> implements ZhuanlishenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanlishenqingEntity> page = this.selectPage(
                new Query<ZhuanlishenqingEntity>(params).getPage(),
                new EntityWrapper<ZhuanlishenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanlishenqingEntity> wrapper) {
		  Page<ZhuanlishenqingView> page =new Query<ZhuanlishenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuanlishenqingVO> selectListVO(Wrapper<ZhuanlishenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuanlishenqingVO selectVO(Wrapper<ZhuanlishenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuanlishenqingView> selectListView(Wrapper<ZhuanlishenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanlishenqingView selectView(Wrapper<ZhuanlishenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
