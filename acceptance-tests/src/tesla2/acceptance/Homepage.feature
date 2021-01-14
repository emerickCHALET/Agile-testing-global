Feature: Fonctionnalités de ma Configurateur Tesla Model S
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