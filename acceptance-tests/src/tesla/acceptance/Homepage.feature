Feature: Fonctionnalités de ma page d'accueil
  Scenario: Titre de la Homepage
    Given je suis sur la homepage
    Then le titre doit être "Voitures électriques, énergie solaire et propre | Tesla France"

  Scenario: Description de la Homepage
    Given je suis sur la homepage
    Then la description contient "Tesla accélère la transition mondiale vers une énergie durable en proposant des véhicules électriques, des panneaux solaires et des solutions intégrées d'énergie renouvelable pour les particuliers et les entreprises."

  Scenario: Punchlines de la Homepage
    Given je suis sur la homepage
    Then la premiere punchline contient "Model S"
      And la deuxieme punchline contient "Model 3"
      And la troisieme punchline contient "Model X"
      And la quatrieme punchline contient "Model Y"
      And la cinquieme punchline contient "Systèmes d'énergie solaire et Powerwalls"
  


  Scenario Outline: Liens du menu de la Homepage
    Given je suis sur la homepage
    Then les liens du menus contiennent "<link>"
    Examples:
      | link                                  |
      | https://www.tesla.com/fr_FR/models    |
      | https://www.tesla.com/fr_FR/model3    |
      | https://www.tesla.com/fr_FR/modelx    |
      | https://www.tesla.com/fr_FR/modely    |
      | https://www.tesla.com/fr_fr/powerwall |
      | https://www.tesla.com/fr_FR/charging  |


  Scenario Outline: Liens du burger menu de la Homepage
    Given je suis sur la homepage
    Then les liens du burger menu contiennent "<link>"
    Examples:
      | link                   |
      | Véhicules disponibles  |
      | Véhicules d'occasion   |
      | Reprise                |
      | Cybertruck             |
      | Roadster               |
      | Energie                |
      | Essais                 |
      | Véhicules d'occasion   |
      | Flottes et entreprises |
      | Nous trouver           |
      | Evénements             |
      | Assistance             |