package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipalPage {
    public static Target CLICKEAR_LINK_GAMING = Target.the("Clickear link").locatedBy("//div[@id=\"main-CollapsedCards-8e7c2335-e558-40db-b15f-aebc1eb55240-desktop-card-3\"]//a[@data-testid=\"card-link\"]");
    public static Target OK_SALTAR = Target.the("Saltar").located(By.id("testId-onboarding-desktop-skip"));

    public static Target SECCION_GAMING = Target.the("Busca el link de gaming").locatedBy("//div[@id=\"main-CollapsedCards-8e7c2335-e558-40db-b15f-aebc1eb55240-desktop-card-3\"]//a//div//div[@class=\"w-100 Card-module_title__Hv8yR Card-module_title-16__KDT3e\"]");

    public static Target BOTON_LINIO = Target.the("Boton de Linio").locatedBy("//div[@class=\"NavbarLinks-module_store-icon-wrapper__3Pvd3 NavbarLinks-module_last-store-icon__9XeAm\"]//a");

    public static Target BOTON_Carrito = Target.the("Boton de Carrito").locatedBy("//a[@id=\"testId-UserAction-basket\"]");


}