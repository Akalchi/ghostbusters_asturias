package ghostbusters.asturias.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Player {
private String playerName;
    private final List<Ghost> ghosts = new ArrayList<>();
    private int nextId = 1;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public void captureGhost(String ghostName, String ghostClass, String dangerLevel, String specialAbility, String ghostAfinity) {
        Ghost ghost = new Ghost(
            nextId++,
            ghostName,
            ghostClass,
            dangerLevel,
            LocalDate.now().toString(), // La fecha se guarda como String
            specialAbility,
            ghostAfinity
        );
        ghosts.add(ghost);
    }

    public boolean releaseGhostById(int id) {
        return ghosts.removeIf(ghost -> ghost.getId() == id);
    }

    public List<Ghost> filterGhostsByClass(String ghostClass) {
        return ghosts.stream()
                .filter(ghost -> ghost.getGhostClass().equalsIgnoreCase(ghostClass))
                .collect(Collectors.toList());
    }

    public List<Ghost> filterGhostsByDate(String captureDate) {
        return ghosts.stream()
                .filter(ghost -> ghost.getCaptureDate().equals(captureDate))
                .collect(Collectors.toList());
    }

    public List<Ghost> getGhosts() {
        return new ArrayList<>(ghosts);
    }

    public String getPlayerName() {
        return playerName;
    }
}
