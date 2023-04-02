package User;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public class Query{
        public void printToLog(){
            System.out.println("User wth login: "+login+" and password: "+password+" sent request");
        }
    }

    public void createQuery(){
       Query query=new Query();
       query.printToLog();
    }
}
