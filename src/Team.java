import java.util.ArrayList;

public class Team<T> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if(player == null) {
            System.out.println("Player must be a  not null value!");
            return false;
        }

        if(members.contains(player)) {
            System.out.println( ((Player) player).getName() + " is already in team " + name );
            return false;
        } else {
            members.add(player);
            System.out.println( ((Player) player).getName() + " joined team " + name);
            return true;
        }
    }
    public int getNumOfPlayers() {
        return members.size();
    }
    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if(ourScore > theirScore) {
            won++;
        } else if(ourScore == theirScore) {
            tied++;
        } else {
            lost++;
        }
        played++;
        if(opponent != null) {
            matchResult(this,theirScore,ourScore);
        }
    }
    public int ranking() {
        return won * 2 + tied;
    }
}
