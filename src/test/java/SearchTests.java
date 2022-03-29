import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

    public class SearchTests {

        @Test
        void selenideSearchTest () {
            // Открыть https://google.com
            open("http://v2portal.gorod.proitr.ru");
            // Ввести "Selenide" в поле поиска
            $("[name=q]").setValue("http://v2portal.gorod.proitr.ru").pressEnter();
            // Проверить, что "selenide.org" появилось в результатах поиска
            $("[id=search]").shouldHave(text("selenide.org"));




            open("http://v2portal.gorod.proitr.ru");

        }

}
