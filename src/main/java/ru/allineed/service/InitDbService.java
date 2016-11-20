package ru.allineed.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.allineed.entity.Blog;
import ru.allineed.entity.Item;
import ru.allineed.entity.Role;
import ru.allineed.entity.User;
import ru.allineed.repository.BlogRepository;
import ru.allineed.repository.ItemRepository;
import ru.allineed.repository.RoleRepository;
import ru.allineed.repository.UserRepository;

@Transactional
@Service
public class InitDbService {

	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@PostConstruct
	public void init() {
		
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);
		
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);		
		
		User userAdmin = new User();
		userAdmin.setName("admin");
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		
		userRepository.save(userAdmin);
		
		Blog blog = new Blog();
		blog.setName("MyBlog");
		blog.setUrl("http://ya.ru");
		blog.setUser(userAdmin);
		
		blogRepository.save(blog);
		
		Item item1 = new Item();
		item1.setBlog(blog);
		item1.setTitle("first");
		item1.setLink("http://javavids.com");
		item1.setPublishedDate(new Date());
		
		Item item2 = new Item();
		item2.setBlog(blog);
		item2.setTitle("second");
		item2.setLink("http://google.com");
		item2.setPublishedDate(new Date());
		
		Item item3 = new Item();
		item3.setBlog(blog);
		item3.setTitle("third");
		item3.setLink("http://third.com");
		item3.setPublishedDate(new Date());
		
		
		itemRepository.save(item1);
		itemRepository.save(item2);
		itemRepository.save(item3);
		
	}
}
