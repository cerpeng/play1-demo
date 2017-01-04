package controllers;

import com.alibaba.fastjson.JSON;
import models.User;
import play.mvc.Controller;

/** Created by cerpengxi on 17/1/3. */
public class Users extends Controller {
  public static void add(String body) {
    User input = JSON.parseObject(body, User.class);
    User user = new User();
    user.name = input.name;
    user.age = input.age;
    user.save();
    renderJSON(user);
  }

  public static void delete(Long id) {
    User user = new User();
    user = user.findById(id);
    user.delete();
    response.status = 204;
  }

  public static void update(Long id, String body) {
    User input = JSON.parseObject(body, User.class);
    User user = new User();
    user = user.findById(id);
    user.name = input.name;
    user.save();
    renderJSON(user);
  }

  public static void list() {
    renderJSON(User.findAll());
  }
}
