
import br.edu.ifsul.pw2022_1_model.Estado;
import java.util.List;
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
public class TesteListarEstado {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoPW_2022PU");
        EntityManager em = emf.createEntityManager();
        List<Estado> lista
                = em.createQuery("from Estado order by id")
                        .setMaxResults(30).
                        setFirstResult(30).
                        getResultList();
        for (Estado e : lista) {
            System.out.println("ID: " + e.getId() + " Nome: " + e.getNome() + " UF: " + e.getUf());
        }

        em.close();
        emf.close();
    }
}
