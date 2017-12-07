package top.itlir.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import top.itlir.manager.service.ItemService;
import top.itlir.pojo.TbItem;

@Controller
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/findItemByID/{itemId}")
	@ResponseBody
	public TbItem findItemBuID(@PathVariable Long itemId) {
		TbItem item = itemService.findItemByID(itemId);
		return item;
	}

}
