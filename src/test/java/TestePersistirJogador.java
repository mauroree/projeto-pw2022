
import br.edu.ifsul.pw2022_1_model.Jogador;
import br.edu.ifsul.pw2022_1_model.Posicao;
import br.edu.ifsul.pw2022_1_model.Time;
import java.util.Calendar;
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
public class TestePersistirJogador {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoPW_2022PU");
        EntityManager em = emf.createEntityManager();
        Jogador j = new Jogador();
        j.setNome("Taison");
        j.setAltura(1.78);
        j.setPeso(76.000);
        j.setCpf("069.417.290-15");
        j.setNascimento(Calendar.getInstance());
        j.setPosicao(em.find(Posicao.class, 7));
        j.setTime(em.find(Time.class, 1));
        em.getTransaction().begin();
        em.persist(j);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}
