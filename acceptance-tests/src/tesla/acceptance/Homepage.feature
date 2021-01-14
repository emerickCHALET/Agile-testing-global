Feature: Fonctionnalités de ma page d'accueil
  Scenario: Titre de la Homepage
    Given je suis sur la homepage
    Then le titre doit être "Voitures électriques, énergie solaire et propre | Tesla France"

  Scenario: Description de la Homepage
    Given je suis sur la homepage
    Then la description contient "Tesla accélère la transition mondiale vers une énergie durable en proposant des véhicules électriques, des panneaux solaires et des solutions intégrées d'énergie renouvelable pour les particuliers et les entreprises."

  Scenario Outline: Punchlines de la Homepage
    Given je suis sur la homepage
    Then les punchlines contiennent "<punchline>"
    Examples:
      | punchline                                |
      | Model S                                  |
      | Model 3                                  |
      | Model X                                  |
      | Model Y                                  |
      | Systèmes d'énergie solaire et Powerwalls |


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

  Scenario:Quand je clique sur le bouton commander, l'url du configurateur de la Model S doit être "https://www.tesla.com/fr_FR/models/design"
    Given je suis sur le modelS
    Then je click sur le bouton commander avec lurl "https://www.tesla.com/fr_fr/models/design"

  Scenario: Le prix affiché en LOA est de "à partir de 768 € /mois*"
    Given je suis sur Model S
    Then le prix affiché en LOA est de "A partir de 768 € /mois*"

  Scenario: Lorsque je sélectionne le modèle Grande Autonomie Plus, 108€/mois d'économies de carburant estimées
  et un montant total avec achat au terme du contrat de 94 841€
    Given je suis sur le model S
    Then Le prix affiché  est de "A partir de - 108 € /mois"
    And Quand je click sur "Voir détails"
    And Le prix du montant total avec achat au terme du contrat de "94 841 €"

  Scenario: Lorsque je sélectionne le modèle "Performance", le prix en LOA est à 969€/mois et 108€/mois d'économies de carburant estimées
  et un montant total avec achat au terme du contrat de 114 052€.
    Given je suis sur commander Model S
    When je click sur Performance "Performance"
    Then le prix affiché en LOA PERFORMANCE est de "A partir de 969 € /mois*"
    And Le prix affiché est "A partir de - 108 € /mois"
    And Quand je click sur le bouton "Voir détails"
    And Le prix du montant total avec achat au terme du contrat est alors de "114 052 €"

  Scenario: Si j'ajoute l'option pilotage automatique le LOA est "a partir de 857 € / mois*"
    Given je suis sur commander ModelS
    When je click sur "Pilotage automatique"
    Then je click sur l'option "Option ajoutée"
    Then le prix affiché en LOA est alors de "A partir de 857 € /mois*"

  Scenario: Une fois que j'ai configuré mon modèle S, je souhaiterais connaitre la liste des localisations de vente
    Given  je suis sur la page  model S
    Then je configure mon modèle S
    And je clic donc sur le logo en haut à gauche de la page puis en bas de page sur le lien Localisations j'arrive sur la page dont l'url est : "https://www.tesla.com/fr_FR/findus/list" 