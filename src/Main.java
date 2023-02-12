public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer dick = new SoccerPlayer("dick");

        Team<FootballPlayer> fcBuk = new Team<>("fcBuck");
        fcBuk.addPlayer(joe);
        fcBuk.addPlayer(joe);
//        fcBuk.addPlayer(pat);
//        fcBuk.addPlayer(dick);

        System.out.println(fcBuk.getNumOfPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("fcBat");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> fcSuccers = new Team<>("fcSuccers");
        fcSuccers.addPlayer(dick);

        Team<FootballPlayer> melbourne = new Team<>("Malbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(fcBuk,1,0);

        fcBuk.matchResult(fremantle,2,1);
//        fcBuk.matchResult(baseballTeam,1,1);

    }
}
