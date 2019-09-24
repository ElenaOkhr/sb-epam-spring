package domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Rider {

  private String name;

  private Horse horse;

 /* @Override
  public String toString() {
    return "Rider " + name  +
        ", horse " + horse.getName() +
        ", breed " + horse.getBreed().getName();
  }*/
}
