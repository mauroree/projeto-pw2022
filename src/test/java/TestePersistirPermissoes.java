
import br.edu.ifsul.pw2022_1_model.Permissao;
import br.edu.ifsul.pw2022_1_model.Usuario;
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
public class TestePersistirPermissoes {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoPW_2022PU");
        EntityManager em = emf.createEntityManager();
        Usuario u = em.find(Usuario.class, "MRX");
        Permissao p1 = em.find(Permissao.class, "ADMINISTRADOR");
        Permissao p2 = em.find(Permissao.class, "USUARIO");
        u.getPermissoes().add(p1);
        u.getPermissoes().add(p2);
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}
