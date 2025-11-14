package org.sebsy.demo.escaperooms.bll;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("calitiss")
public class Room3Service implements RoomService {

    @Override
    public String entreeSalle() {
        return "Perdu vous etes tombé sur Calitiss et il sait que le trésor est a gauche...";
    }

}
