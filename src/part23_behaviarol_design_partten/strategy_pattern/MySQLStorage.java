package part23_behaviarol_design_partten.strategy_pattern;

public class MySQLStorage implements UserStorage{
    @Override
    public void store(User user) {
        System.out.println("save data to MySQL with User " + user.getName());
    }
}
