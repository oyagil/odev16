import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class ButtonsTest {

    @BeforeAll
    public static void setup() {
        Configuration.headless = true;
    }

    @Test
    public void testButtonClick() {
        // Sayfayı aç
        open("https://demoqa.com/elements");

        // "Buttons" öğesine tıkla
        $($x("Buttons")).click();

        // "Click Me" butonuna tıkla
        $($x("Click Me")).click();

        // Görünen mesajı doğrula
        $("#dynamicClickMessage").shouldHave(text("You have done a dynamic click"));
    }
}
