package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

/**
 * Created by cerpengxi on 17/1/3.
 */
@Entity()
public class User extends Model {
    public String name;
    public Integer age;
}
