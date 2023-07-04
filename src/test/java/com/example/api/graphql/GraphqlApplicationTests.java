package com.example.api.graphql;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.api.graphql.controller.ActorController;
import com.example.api.graphql.record.Actor;

@SpringBootTest
class GraphqlApplicationTests {

	@Autowired
    private ActorController actorController;

    @Test
    void queryActorById() {
        Actor actor = actorController.actorById(1L);
        assert actor.name().equals("Keanu Reeves");
    }

}
