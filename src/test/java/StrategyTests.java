import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.app.task2.*;

public class StrategyTests {

    private final Client client = new Client("Vitalii", 19, Gender.MALE, "Vitalii's mail");;

    @Test
    public void clientTest() {
        Client second = new Client("Olena", 21, Gender.FEMALE, "Olena's mail");
        Assertions.assertEquals(client.getName(), "Vitalii");
        Assertions.assertEquals(client.getAge(), 19);
        Assertions.assertEquals(client.getSex(), Gender.MALE);
        Assertions.assertEquals(client.getEmail(), "Vitalii's mail");

        Assertions.assertEquals(second.getName(), "Olena");
        Assertions.assertEquals(second.getAge(), 21);
        Assertions.assertEquals(second.getSex(), Gender.FEMALE);
        Assertions.assertEquals(second.getEmail(), "Olena's mail");
    }

    @Test
    public void giftTest() {
        GiftMail giftMail = new GiftMail();
        Assertions.assertInstanceOf(MailCode.class, giftMail);
        Assertions.assertEquals(giftMail.generate(client),
                "Vitalii, you have received a gift. "
                + "Contact us for more information");
    }

    @Test
    public void MailInfo() {
        GiftMail giftMail = new GiftMail();
        MailInfo mInfo = new MailInfo(client, giftMail);
        Assertions.assertEquals(giftMail.generate(client), mInfo.generate());
        Assertions.assertEquals(mInfo.getClientEmail(), "Vitalii's mail");
        Assertions.assertEquals(mInfo.getClientName(), "Vitalii");
    }
}
