
import br.edu.ifsul.pw2022_1_model.Estado;
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
public class TestePersistirEstado {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoPW_2022PU");
        EntityManager em = emf.createEntityManager();
        Estado e = new Estado();
        e.setNome("Rio Grande do Sul");
        e.setUf("RS");
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
