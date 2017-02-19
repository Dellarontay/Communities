package tree.test;

import java.util.List;

/**
 * Created by Dellarontay on 2/18/2017.
 */

public class User {

    private String name;
    private String email;
    private String issue;
    private List<User> matches;


    public User(){}

    public User(String name,String email,String issue){
        name = name;
        email = email;
        issue = issue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }
}
