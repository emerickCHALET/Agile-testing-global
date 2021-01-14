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



# Story 2

  # Scenario: Le bouton commander du  Model S doit contenir "https://www.tesla.com/fr_fr/models/design"
  #   Given je suis sur la model S
  #   When je click sur commander Model S
  #   Then le site me renvoie sur "https://www.tesla.com/fr_fr/models/design"

  # Scenario: Le prix affiché en LOA est de "à partir de 768 € /mois*"
  #   Given je suis sur commander Model S
  #   Then le prix affiché en LOA est de "A partir de 768 € /mois*"

  Scenario: Une fois que j'ai configuré mon modèle S, je souhaiterais connaitre la liste des localisations de vente
  Given  je suis sur la page  model S
  Then je configure mon modèle S
    And je clic donc sur le logo en haut à gauche de la page puis en bas de page sur le lien Localisations j'arrive sur la page dont l'url est : "https://www.tesla.com/fr_FR/findus/list" 