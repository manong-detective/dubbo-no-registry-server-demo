package app.nebula.demo;

import app.nebula.demo.api.GreetingsService;

public class GreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayHi(String name) {
        System.out.println("receive req, name: " + name);
        return "hello world " + name;
    }
}
