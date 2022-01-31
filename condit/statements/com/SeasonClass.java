package condit.statements.com;

public class SeasonClass {



    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN;

        public Season nextSeason() {
            if (this == Season.WINTER) return SPRING;
            if (this == Season.SPRING) return SUMMER;
            if (this == Season.SUMMER) return Season.AUTUMN;
            return Season.WINTER;
        }
    }

    public static void main(String[] args) {
        Season por_roku = Season.SUMMER;
        System.out.println(por_roku);

        por_roku.nextSeason();
        Season next = por_roku.nextSeason();
        System.out.println(next);
    }



}
