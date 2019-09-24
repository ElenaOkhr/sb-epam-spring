import domain.Breed;
import domain.Horse;
import domain.Race;
import domain.Rider;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.EmulationService;
import service.RaceService;

public class HorseRaceApp {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");

    Breed breed1 = context.getBean(Breed.class);
    breed1.setName("backend");
    Breed breed2 = context.getBean(Breed.class);
    breed2.setName("frontend");
    Breed breed3 = context.getBean(Breed.class);
    breed3.setName("fullstack");

    Rider rider1 = context.getBean(Rider.class);
    Rider rider2 = context.getBean(Rider.class);
    Rider rider3 = context.getBean(Rider.class);
    Rider rider4 = context.getBean(Rider.class);
    ArrayList<Rider> ridersList = Stream.of(rider1, rider2, rider3, rider4)
        .collect(Collectors.toCollection(ArrayList::new));
    Horse horse1 = context.getBean(Horse.class);
    Horse horse2 = context.getBean(Horse.class);
    Horse horse3 = context.getBean(Horse.class);
    Horse horse4 = context.getBean(Horse.class);
    ArrayList<Horse> horsesList = Stream.of(horse1, horse2, horse3, horse4)
        .collect(Collectors.toCollection(ArrayList::new));
    RaceService raceService= context.getBean("raceService", RaceService.class);
    System.out.println("Race participants:");
    Race race = raceService.getRace(ridersList,horsesList);
    EmulationService emulator = context.getBean("emulationService", EmulationService.class);
    emulator.putMoneyOn();
    emulator.startRace();
  }

  }
