package top.itlir.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import top.itlir.manager.service.ItemService;
import top.itlir.mapper.TbItemMapper;
import top.itlir.pojo.TbItem;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private TbItemMapper tbItemMapper;

	@Override
	public TbItem findItemByID(Long uid) {
		return tbItemMapper.selectByPrimaryKey(uid);
	}

}
