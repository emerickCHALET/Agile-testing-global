Feature: Fonctionnalités de ma page d'accueil
  Scenario: Titre de la Homepage
    Given je suis sur la homepage
    Then le titre doit être "Voitures électriques, énergie solaire et propre | Tesla France"

  Scenario: Description de la Homepage
    Given je suis sur la homepage
    Then la description contient "Tesla accélère la transition mondiale vers une énergie durable en proposant des véhicules électriques, des panneaux solaires et des solutions intégrées d'énergie renouvelable pour les particuliers et les entreprises."

  Scenario: Punchlines de la Homepage
    Given je suis sur la homepage
    Then les punchlines contiennent "Model 3, Model S, Model X, Model Y", Systèmes d'énergie solaire et Powerwalls"

  Scenario: Liens du menu de la Homepage
    Given je suis sur la homepage
    Then les liens du menus contiennent " https://www.tesla.com/fr_FR/models, https://www.tesla.com/fr_FR/model3, https://www.tesla.com/fr_FR/modelx, https://www.tesla.com/fr_FR/modely, https://www.tesla.com/fr_fr/powerwall, https://www.tesla.com/fr_FR/charging"

  Scenario: Liens du burger menu de la Homepage
    Given je suis sur la homepage
    Then les liens du burger menu contiennent "Véhicules disponibles, Véhicules d'occasion, Reprise, Cybertruck, Roadster, Energie, Essais, Flottes et entreprises, Nous trouver, Evénements, Assistance"