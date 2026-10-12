### 1. Preuve d'Exécution Principale : `Presentation2` (Spring Annotations)

Cette exécution valide le fonctionnement complet du conteneur d'Inversion de Contrôle (IoC) de Spring Framework basé sur la configuration Java et les annotations :

1. **Initialisation du conteneur :** Démarrage du contexte d'application (`AnnotationConfigApplicationContext`) piloté par la classe de configuration `Presentation2`[cite: 17].
2. **Détection et Injection :** Grâce à `@ComponentScan`, Spring scanne les packages, instancie le composant `DaoImpl` (`@Component("dao")`) et l'injecte automatiquement dans `MetierImpl` (`@Autowired`)[cite: 17].
3. **Exécution Métier :** La méthode `calcul()` récupère la valeur du DAO (`100.0`) et applique la règle de calcul ($100.0 \times 2$), affichant le résultat attendu : **200.0**[cite: 17].
4. **Terminaison sans erreur :** Le programme s'achève avec succès sans lever d'exception (`Process finished with exit code 0`)[cite: 17].


<img width="586" height="360" alt="Capture d’écran 2026-10-12 114135" src="https://github.com/user-attachments/assets/6367f309-7603-4998-8c7c-acf7cb2488bf" />


### 2. Deuxième Preuve d'Exécution : Validation de la Configuration (`Presentation2`)

Cette seconde exécution confirme la reproductibilité du conteneur Spring et la résolution sans ambiguïté des composants injectés :

* **Stabilité du contexte applicatif :** L'initialisation du contexte Spring (`AnnotationConfigApplicationContext`) s'effectue sans conflit de beans (`NoUniqueBeanDefinitionException`), confirmant la bonne prise en compte du bean qualifié (`@Qualifier("dao")`)[cite: 18].
* **Cohérence du traitement :** Le composant `MetierImpl` accède à la valeur du DAO (`100.0`) et produit à nouveau le résultat attendu : **200.0**[cite: 18].
* **Validation de l'état final :** Fin d'exécution nominale (`Process finished with exit code 0`) sans blocage ni fuite de ressources[cite: 18].

<img width="582" height="340" alt="Capture d’écran 2026-10-12 113859" src="https://github.com/user-attachments/assets/49c7bcd6-281c-45cb-9f36-4d7b26844149" />
