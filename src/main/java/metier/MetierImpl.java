package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")  // Déclare cette classe comme un bean Spring avec l'identifiant "metier"
public class MetierImpl implements IMetier {
    
    // Injection de dépendance : Spring injectera la deuxième implémentation (DaoImpl2) grâce à @Qualifier("dao2")
    @Autowired
    @Qualifier("dao2")
    private IDao dao;
    
    @Override
    public double calcul() {
        // Utilise la méthode getValue() de l'implémentation injectée de IDao (DaoImpl2 -> 150.0)
        // et multiplie le résultat par 2
        return dao.getValue() * 2;
    }
    
    // Setter pour l'injection par setter (alternative à l'injection par champ)
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
