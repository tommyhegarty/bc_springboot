package org.ms3.lcstracker.teams;

import org.ms3.lcstracker.players.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {

    @Query("SELECT p FROM Player p WHERE p.tag=:tag")
    List<Player> findByTag(String tag);

}
