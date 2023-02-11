public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer dick = new SoccerPlayer("dick");

        Team fcBuk = new Team("fcBuck");
        fcBuk.addPlayer(joe);
        fcBuk.addPlayer(joe);
        fcBuk.addPlayer(pat);
        fcBuk.addPlayer(dick);

        System.out.println(fcBuk.getNumOfPlayers());

    }
}
