package ghostbusters.asturias.tests;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ghostbusters.asturias.model.Ghost;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

class GhostTest {

    private List<Ghost> ghosts;

    @BeforeEach
    void setUp() {
        ghosts = Arrays.asList(
            new Ghost(1, "Espíritu del Pescador", "Clase IV", "Bajo", "2023-10-01", "Aparece durante tormentas", "7/10")
        );
    }

    @Test
    void testGhostClass() {
        Ghost ghost = ghosts.get(0);

        assertThat(ghost, notNullValue());
        assertThat(ghost.getId(), is(1));
        assertThat(ghost.getGhostName(), is("Espíritu del Pescador"));
        assertThat(ghost.getGhostClass(), is("Clase IV"));
        assertThat(ghost.getDangerLevel(), is("Bajo"));
        assertThat(ghost.getCaptureDate(), is("2023-10-01"));
        assertThat(ghost.getSpecialAbility(), is("Aparece durante tormentas"));
        assertThat(ghost.getGhostAfinity(), is("7/10"));
    }
}