package TASK2;

public class Main {

    public static void main(String[] args) {
        String nameParticipant = "";
        String nameObstacle;

        System.out.println("\n \"Бег с препятствиями\"...");

        Object[] participants = new Object[9];
        participants[0] = new Cat("Кот Копчик", 2.5, 400);
        participants[1] = new Cat("Кот Масик", 2.6, 4000);
        participants[2] = new Cat("Кот Юнга", 3.7, 15000);
        participants[3] = new Human("Атлет", 2.1, 3000);
        participants[4] = new Human("Футболист", 2.2, 5000);
        participants[5] = new Human("Бегун", 2.5, 10000);
        participants[6] = new Robot("Robocop", 1.8, 15000);
        participants[7] = new Robot("Roborobo", 1.3, 5000);
        participants[8] = new Robot("Alice", 2.5, 10000);

        Object[] obstacles = new Object[6];
        obstacles[0] = new Begdor("Без препятствий ", 500);
        obstacles[1] = new Wall("Стенка низкая ", 1.2);
        obstacles[2] = new Begdor("Пересеченная местность ", 3000);
        obstacles[3] = new Wall("Стенка средняя", 1.8);
        obstacles[4] = new Begdor("Грязь ", 1000);
        obstacles[5] = new Wall("Стенка высокая", 2.3);
       

        System.out.println("В забеге участвуют все");
        
        for (Object participant : participants) {
            int vMaxRun = 0;
            double vMaxHeight = 0;

            System.out.print("Забег по ролям ");
            if (participant instanceof Cat) {
                nameParticipant = ((Cat) participant).getName();
                vMaxRun = ((Cat) participant).getMaxRun();
                vMaxHeight = ((Cat) participant).getMaxHeight();
            }
            if (participant instanceof Human) {
                nameParticipant = ((Human) participant).getName();
                vMaxRun = ((Human) participant).getMaxRun();
                vMaxHeight = ((Human) participant).getMaxHeight();
            }
            if (participant instanceof Robot) {
                nameParticipant = ((Robot) participant).getName();
                vMaxRun = ((Robot) participant).getMaxRun();
                vMaxHeight = ((Robot) participant).getMaxHeight();
            }

            System.out.println(nameParticipant + " Результаты: бег " + vMaxRun + " прыжок " + vMaxHeight);
            boolean failure = false;
            for (int y = 0; y < obstacles.length; y++) {
                int tRun = 0;
                double tHeight = 0;
                if (obstacles[y] instanceof Begdor) {
                    nameObstacle = ((Begdor) (obstacles[y])).getName();
                    tRun = ((Begdor) (obstacles[y])).getDistance();
                    if (tRun > vMaxRun) {
                        System.out.println(" Участник: " + nameParticipant + " сошел с дистанции на препятствии №" +
                                (y + 1) + " " + nameObstacle + "(" + tRun + "м.) \n");
                        failure = true;
                        break;
                    }
                }
                if (obstacles[y] instanceof Wall) {
                    nameObstacle = ((Wall) (obstacles[y])).getName();
                    tHeight = ((Wall) (obstacles[y])).getHeight();
                    if (tHeight > vMaxHeight) {
                        System.out.println(" Участник: " + nameParticipant + " сошел с дистанции на препятствии №" +
                                (y + 1) + " " + nameObstacle + "(" + tHeight + "м.) \n");
                        failure = true;
                        break;
                    }

                }
            }
            if (!failure) {
                System.out.println(" Участник: " + nameParticipant + " успешно выдержал все испытания!!!\n\n");
            }
        }
    }
}