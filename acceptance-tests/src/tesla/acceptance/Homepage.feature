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


  Scenario: Liens du burger menu de la Homepage
    Given je suis sur la homepage
    Then le premier lien contient burger menu contient "Véhicules disponibles"
      And le deuxieme lien contient burger menu contient "Véhicules d'occasion"
      And le troisieme lien contient burger menu contient "Reprise"
      And le quatrieme lien contient burger menu contient "Cybertruck"
      And le cinquieme lien contient burger menu contient "Roadster"
      And le sixieme lien contient burger menu contient "Énergie"
      And le septieme lien contient burger menu contient "Essais"
      And le huitieme lien contient burger menu contient "Flottes & Entreprises"
      And le neuvieme lien contient burger menu contient "Nous trouver"
      And le dixieme lien contient burger menu contient "Événements"
      And le onzieme lien contient burger menu contient "Assistance"