package co.com.prueba.llaves.tasks;


import co.com.prueba.llaves.models.Credentials;
import com.gargoylesoftware.htmlunit.javascript.host.security.Credential;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.prueba.llaves.userinterfaces.LlavesLoginPage.*;


public class Login implements Task {

   Credentials credentials;

   public Login(Credentials credentials){
       this.credentials = credentials;
   }
    public static Login inThePage(Credentials credentials){
        return Tasks.instrumented(Login.class, credentials);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(credentials.getUser()).into(TXT_USER));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(TXT_PASSWORD));
        actor.attemptsTo(Click.on(BTN_SUBMIT));
    }
}
