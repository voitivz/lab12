import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import  ua.edu.ucu.app.task1.User;

public class BuilderTest {
    @Test
    public void testIvan() {
        User ivan = User.builder().name("Ivan").age(18).age(19).weight(80).height(180).build();
        Assertions.assertEquals(ivan.getName(), "Ivan");
        Assertions.assertEquals(ivan.getAge(), 19);
        Assertions.assertEquals(ivan.getWeight(), 80);
        Assertions.assertEquals(ivan.getHeight(), 180);
    }

    @Test
    public void testPetro() {
        User petro = User.builder().name("Petro").age(27).build();
        Assertions.assertEquals(petro.getName(), "Petro");
        Assertions.assertEquals(petro.getAge(), 27);
        Assertions.assertEquals(petro.getWeight(), 0);
        Assertions.assertEquals(petro.getHeight(), 0);
    }

    @Test
    public void testAlice() {
        User alice = User.builder().name("Alice").age(21).build();
        Assertions.assertEquals(alice.getName(), "Alice");
        Assertions.assertEquals(alice.getAge(), 21);
        Assertions.assertEquals(alice.getWeight(), 0);
        Assertions.assertEquals(alice.getHeight(), 0);
    }

    @Test
    public void testDefault() {
        User defaultUser = User.builder().build();
        Assertions.assertNull(defaultUser.getName());
        Assertions.assertEquals(defaultUser.getAge(), 0);
        Assertions.assertEquals(defaultUser.getWeight(), 0);
        Assertions.assertEquals(defaultUser.getHeight(), 0);
    }
}