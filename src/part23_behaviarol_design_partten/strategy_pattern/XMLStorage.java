package part23_behaviarol_design_partten.strategy_pattern;

public class XMLStorage implements UserStorage{

    @Override
    public void store(User user) {
        System.out.println("save data to XMLStore with User : " + user.getName());
    }
}
