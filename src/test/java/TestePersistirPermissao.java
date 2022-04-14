
import br.edu.ifsul.pw2022_1_model.Permissao;
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
public class TestePersistirPermissao {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoPW_2022PU");
        EntityManager em = emf.createEntityManager();
        Permissao p1 = new Permissao();
        p1.setNome("ADMINISTRADOR");
        p1.setDescricao("Permissão para adminstradores");

        Permissao p2 = new Permissao();
        p2.setNome("USUARIO");
        p2.setDescricao("Permissão para usuários comuns");
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
