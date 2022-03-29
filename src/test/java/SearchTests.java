import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

    public class SearchTests {

        @Test
        void selenideSearchTest () {
            // Открыть https://google.com
            open("http://v2portal.gorod.proitr.ru");
            // Ввести "gorod" в поле name
            $("[name=q]").setValue("gorod");
            // Ввести "eUrK_2H3#?" в поле password
            $("[name=q]").setValue("eUrK_2H3#?").pressEnter();
            // Авторизоваться на портале
            $("[сообщить о проблеме]").click();


            // Проверить, что "selenide.org" появилось в результатах поиска
            $("[id=search]").shouldHave(text("selenide.org"));




            open("http://v2portal.gorod.proitr.ru");

        }

}
