package service.impl;

import domain.Horse;
import domain.Rider;
import org.springframework.stereotype.Service;
import service.HorseService;

@Service
public class HorseServiceImpl implements HorseService {

  @Override
  public void buyHorse(Rider rider, Horse horse) {
    rider.setHorse(horse);
  }
}
