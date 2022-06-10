public class Main {

    public static void main(String[] args) {
        Team[] teams = {
                new Team("Тенгиз", 39),
                new Team("Арсен", 39),
                new Team("Леван", 26),
                new Team("Алексей", 35)

        };
        System.out.println(Team.getTeamName());

        for (Team team: teams) {
            System.out.println(team);
        }


        ObstacleCourse obstacles1 = new ObstacleCourse(55);
        ObstacleCourse obstacles2 = new ObstacleCourse(63);
        ObstacleCourse obstacles3 = new ObstacleCourse(65);


        for (Team team : teams) {
            System.out.println(team);
            team.run(obstacles1);
            team.run(obstacles2);
            team.run(obstacles3);
        }
    }
}