package controllers;

import org.apache.commons.collections.map.HashedMap;
import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        Map<String,String> data=new HashedMap();
        data.put("id","1");
        data.put("name","joy");
        renderJSON(data);
    }

}