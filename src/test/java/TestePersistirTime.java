
import br.edu.ifsul.pw2022_1_model.Cidade;
import br.edu.ifsul.pw2022_1_model.Pessoa;
import br.edu.ifsul.pw2022_1_model.Time;
import br.edu.ifsul.pw2022_1_model.Usuario;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
public class TestePersistirTime {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoPW_2022PU");
        EntityManager em = emf.createEntityManager();
        Time time = new Time();
        time.setNome("Sport Club Internacional");
        time.setHistoria("Clube do Povo fundado em 04/04/1909 em Porto Alegre - RS");
        time.setDataFundacao(new GregorianCalendar(1909, Calendar.APRIL, 04));
        time.setCidade(em.find(Cidade.class, 4));
        time.setTecnico(em.find(Pessoa.class, 3));
        time.setUsuario(em.find(Usuario.class, "MRX"));

        em.getTransaction().begin();
        em.persist(time);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}
