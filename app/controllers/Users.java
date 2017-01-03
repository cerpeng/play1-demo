package controllers;

import com.alibaba.fastjson.JSON;
import com.google.gson.JsonObject;
import models.User;
import play.Play;
import play.data.validation.Required;
import play.mvc.Controller;

/**
 * Created by cerpengxi on 17/1/3.
 */

public class Users extends Controller {
    public static void add(String body) {
        User user1 = JSON.parseObject(body, User.class);
        User user = new User();
        user.name = user1.name;
        user.age = user1.age;
        user.save();
        renderJSON(user);
    }

    public static void delete(Long id) {
        User user = new User();
        user = user.findById(id);
        user.delete();
        response.status = 204;
    }

    public static void update(Long id,String body) {
        User user1 = JSON.parseObject(body, User.class);
        User user = new User();
        user = user.findById(id);
        user.name = user1.name;
        user.save();
        renderJSON(user);
    }
    public static void list() {
        renderJSON(User.findAll());
    }
}
