Feature: Fonctionnalités de ma page d'accueil
  #Scenario: Titre de la Homepage
  #  Given je suis sur la homepage
  #  Then le titre doit être "Voitures électriques, énergie solaire et propre | Tesla France"

  #Scenario: Description de la Homepage
  #  Given je suis sur la homepage
  #  Then la description contient "Tesla accélère la transition mondiale vers une énergie durable en proposant des véhicules électriques, des panneaux solaires et des solutions intégrées d'énergie renouvelable pour les particuliers et les entreprises."

  #Scenario Outline: Punchlines de la Homepage
  #  Given je suis sur la homepage
  #  Then les punchlines contiennent "<punchline>"
  #  Examples:
  #    | punchline                                |
  #    | Model S                                  |
  #    | Model 3                                  |
  #    | Model X                                  |
  #    | Model Y                                  |
  #    | Systèmes d'énergie solaire et Powerwalls |


  #Scenario Outline: Liens du menu de la Homepage
  #  Given je suis sur la homepage
  #  Then les liens du menus contiennent "<link>"
  #  Examples:
  #    | link                                  |
  #    | https://www.tesla.com/fr_FR/models    |
  #    | https://www.tesla.com/fr_FR/model3    |
  #    | https://www.tesla.com/fr_FR/modelx    |
  #    | https://www.tesla.com/fr_FR/modely    |
  #    | https://www.tesla.com/fr_fr/powerwall |
  #    | https://www.tesla.com/fr_FR/charging  |


  #Scenario Outline: Liens du burger menu de la Homepage
  #  Given je suis sur la homepage
  #  Then les liens du burger menu contiennent "<link>"
  #  Examples:
  #    | link                   |
  #    | Véhicules disponibles  |
  #    | Véhicules d'occasion   |
  #    | Reprise                |
  #    | Cybertruck             |
  #    | Roadster               |
  #    | Energie                |
  #    | Essais                 |
  #    | Véhicules d'occasion   |
  #    | Flottes et entreprises |
  #    | Nous trouver           |
  #    | Evénements             |
  #    | Assistance             |

  Scenario: Le bouton commander du  Model S doit contenir "https://www.tesla.com/fr_fr/models/design"
    Given je suis sur la model S
    When je click sur commander Model S
    Then le site me renvoie sur "https://www.tesla.com/fr_fr/models/design"

  Scenario: Le prix affiché en LOA est de "à partir de 768 € /mois*"
    Given je suis sur Model S
    Then le prix affiché en LOA est de "A partir de 768 € /mois*"

  Scenario: Lorsque je sélectionne le modèle Grande Autonomie Plus, 108€/mois d'économies de carburant estimées
  et un montant total avec achat au terme du contrat de 94 841€
    Given je suis sur le model S
    Then Le prix affiché  est de "A partir de - 108 € /mois"
    And Quand je click sur "Voir détails"
    And Le prix du montant total avec achat au terme du contrat de "94 841 €"

  Scenario: Si j'ajoute l'option pilotage automatique le LOA est "a partir de 857 € / mois*"
    Given je suis sur commander Model S
    When je click sur "Pilotage automatique"
    Then je click sur l'option "Option ajoutée"
    Then le prix affiché en LOA est alors de "A partir de 857 € /mois*"


   Scenario: Lorsque je sélectionne le modèle "Performance", le prix en LOA est à 969€/mois et 108€/mois d'économies de carburant estimées
   et un montant total avec achat au terme du contrat de 114 052€.
    Given je suis sur commander Model S
    When je click sur Performance "Performance"
    Then le prix affiché en LOA PERFORMANCE est de "A partir de 969 € /mois*"
    And Le prix affiché  est de "A partir de - 108 € /mois"
    And Quand je click sur "Voir détails"
    And Le prix du montant total avec achat au terme du contrat de "114 052 €"
