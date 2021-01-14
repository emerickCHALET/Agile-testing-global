Feature: Fonctionnalités de ma page Evenements
  Scenario: remplir de la page evenements
    Given je suis sur la page event
    Then je remplis le champ prénom avec "Emerick"
    And je remplis le champ nom avec "CHALET"
    And je remplis le champ téléphone avec "0640459520"
    And je remplis le champ code postal avec "95370"
    And je click sur "Suivant"
    Then le message d'erreur "obligatoire" apparait