package co.com.prueba.llaves.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LlavesLoginPage {

    public static final Target TXT_USER = Target.the("Campo de texto usuario").located(By.xpath("//input[@type='userName']"));
    public static final Target TXT_PASSWORD = Target.the("Campo de texto contraseña").located(By.xpath("//input[@id ='txtPassword']"));
    public static final Target BTN_SUBMIT = Target.the("Botón para iniciar sesión").located(By.xpath("//*[contains(text(),'INGRESAR')]"));
}
