package controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController//相当于声明Controller - 提共restful 风格
@EnableAutoConfiguration//自动配置，不需要写spring的配置文件
public class HelloController {
	@RequestMapping("/hello/{id}.html")//映射路径
	@ResponseBody//响应体
	public String hello(@PathVariable String id) {
		return id+"Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloController.class,args);
	}
	

}
