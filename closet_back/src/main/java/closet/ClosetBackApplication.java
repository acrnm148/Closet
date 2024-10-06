package closet;

import closet.domain.display.entity._Member;
import closet.domain.display.entity._Team;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClosetBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClosetBackApplication.class, args);
        /*EntityManagerFactory emf = Persistence.createEntityManagerFactory("entityManager");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            _Team team = new _Team();
            team.setName("TeamA");

            _Member member = new _Member();
            member.setName("hello");
            member.setTeam(team);

            _Team team2 = member.getTeam();

        } catch (Exception e) {

        }*/

    }

}
