package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.falabella.pages.PaginaLinio.IMAGE_LINIO;
import static co.com.falabella.pages.PaginaPrincipalPage.*;
import static co.com.falabella.pages.PaginaZonaGamer.ZONA_GAMER;


public class PaginaLinio {

    @Dado("{actor} comprueba que el boton Linio aparezca en la pagina principal")
    public void buscarElMenu(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(OK_SALTAR),
                Ensure.that(BOTON_LINIO).isDisplayed()

        );
    }
    @Cuando("{actor} da click en el Linio")
    public void daClickEnLinio(Actor actor) {
        actor.attemptsTo(
                Click.on(BOTON_LINIO),
                Click.on(OK_SALTAR)
        );
    }
    @Entonces("{actor} esta en la pagina principal de Linio")
    public void estarEnLaPaginaDeLinio(Actor actor) {
        actor.attemptsTo(
                Ensure.that(IMAGE_LINIO).isDisplayed()
        );
    }
}

