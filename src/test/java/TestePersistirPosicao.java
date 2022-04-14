
import br.edu.ifsul.pw2022_1_model.Posicao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 20192PF.CC0170
 */
public class TestePersistirPosicao {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoPW_2022PU");
        EntityManager em = emf.createEntityManager();
        Posicao p = new Posicao();
        p.setNome("Goleiro");
        Posicao p2 = new Posicao();
        p2.setNome("Zagueiro");
        Posicao p3 = new Posicao();
        p3.setNome("Lateral Direito");
        Posicao p4 = new Posicao();
        p4.setNome("Lateral Esquerdo");
        Posicao p5 = new Posicao();
        p5.setNome("Volante");
        Posicao p6 = new Posicao();
        p6.setNome("Meio Campo");
        Posicao p7 = new Posicao();
        p7.setNome("Atacante");
        em.getTransaction().begin();
        em.persist(p);
        em.persist(p2);
        em.persist(p3);
        em.persist(p4);
        em.persist(p5);
        em.persist(p6);
        em.persist(p7);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
