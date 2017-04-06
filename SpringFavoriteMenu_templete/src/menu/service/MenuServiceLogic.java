package menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import menu.domain.Menu;
import menu.store.MenuDao;

@Service
public class MenuServiceLogic implements MenuService{
	
	@Autowired
	private MenuDao store;

	@Override
	public void create(Menu menu) {
		store.create(menu);
	}

	@Override
	public Menu findMenu(String id) {
		return store.retrieve(id);
	}

	@Override
	public List<Menu> findAllMenus() {
		return store.retrieveAllMenus();
	}

}
