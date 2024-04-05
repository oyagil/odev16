import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class WebTablesTest {

    @BeforeAll
    public static void setup() {
        Configuration.headless = true;
    }

    @Test
    public void testAddAndEditRecord() {
        // WebTables sayfasını aç
        open("https://demoqa.com/webtables");

        // "Add" butonuna tıkla
        $("#addNewRecordButton").click();

        // Yeni kayıt bilgilerini gir
        $("#firstName").setValue("Oya");
        $("#lastName").setValue("Demirtola");
        $("#userEmail").setValue("oyademirtola@gmail.com");
        $("#age").setValue("30");
        $("#salary").setValue("50000");
        $("#department").setValue("QA");

        // Kaydı kaydet
        $("#submit").click();

        // Eklenen kaydı doğrula
        $(".rt-tbody").shouldHave(text("Oya"), text("Demirtola"), text("oyademirtola@gmail.com"));




    }
}
