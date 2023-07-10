package com.ftaveiradev.swplanetapi.domain;
import static com.ftaveiradev.swplanetapi.common.PlanetConstants.PLANET;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = PlanetService.class)
public class PlanetServiceTest {
    //operacao_estado_resultado

    @Autowired
    private PlanetService planetService;
    @Test
    public void createPlanet_WithValidData_ReturnPlanet() {
        //system under test
        Planet sut = planetService.create(PLANET);

        assertThat(sut).isEqualTo(PLANET);

    }
}
