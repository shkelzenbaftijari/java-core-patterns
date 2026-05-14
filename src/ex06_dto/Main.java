package ex06_dto;

import ex04_oop.Robot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ════════════════════════════════════════════════════════
// · MAIN · DTO pattern and mapping demo
// ════════════════════════════════════════════════════════
public class Main {
    static void main(String[] args) {

        // · ENTITIES — full internal objects ·····················
        List<Robot> realRobots = new ArrayList<>(Arrays.asList(
                new Robot("R2D2", 1),
                new Robot("C3PO", 2),
                new Robot("#R56", 3)
        ));

        // · DTOs — manually assembled (no mapping service) ·······
        List<RobotDTO> dtoRobots = new ArrayList<>();

        RobotDTO r1 = new RobotDTO();
        r1.setName("R2D2");
        r1.setVersion(1);
        dtoRobots.add(r1);

        RobotDTO r2 = new RobotDTO();
        r2.setName("C3PO");
        r2.setVersion(2);
        dtoRobots.add(r2);

        // · MAPPING SERVICE — entity ↔ DTO conversion ············
        MappingService service = new MappingService();

        List<RobotDTO> dtos = service.findAllAsDTOs(realRobots);
        for (RobotDTO d : dtos) {
            System.out.println(d.getName() + " " + d.getVersion());
        }
        System.out.println();

        List<Robot> entities = service.findAllAsEntities(dtoRobots);
        for (Robot r : entities) {
            System.out.println(r.getName() + " " + r.getVersion());
        }
        System.out.println();
    }
}

// ════════════════════════════════════════════════════════
// · MAPPING SERVICE · Converts between Robot and RobotDTO
// ════════════════════════════════════════════════════════
class MappingService {

    // · 1. ENTITY LIST → DTO LIST ·····························
    public List<RobotDTO> findAllAsDTOs(List<Robot> entities) {
        List<RobotDTO> dtoRobots = new ArrayList<>();
        for (Robot item : entities) {
            dtoRobots.add(mapToDTO(item));
        }
        return dtoRobots;
    }

    // · 2. DTO LIST → ENTITY LIST ·····························
    public List<Robot> findAllAsEntities(List<RobotDTO> dtos) {
        List<Robot> realRobots = new ArrayList<>();
        for (RobotDTO d : dtos) {
            realRobots.add(mapToEntity(d));
        }
        return realRobots;
    }

    // · 3. SINGLE MAPPERS ·····································
    public RobotDTO mapToDTO(Robot robot) {
        RobotDTO dto = new RobotDTO();
        dto.setName(robot.getName());
        dto.setVersion(robot.getVersion());
        return dto;
        // alternative: return new RobotDTO(robot.getName(), robot.getVersion());
    }

    public Robot mapToEntity(RobotDTO dto) {
        Robot realRobot = new Robot();
        realRobot.setName(dto.getName());
        realRobot.setVersion(dto.getVersion());
        return realRobot;
    }

}
