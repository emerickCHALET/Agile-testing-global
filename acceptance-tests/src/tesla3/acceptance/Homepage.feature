Feature: Fonctionnalités de ma page Evenements
  Scenario: accéder aux événements depuis le burger menu
    Given je suis sur la page "https://www.tesla.com/fr_fr"
    Then je clique sur "Burger Menu" puis sur "Événement" je dois etre redirégé sur "https://www.tesla.com/fr_fr/events"

  Scenario: La page doit contenir les 15 prochains événement autour de chez soi, une fois que l'on choisi un lieu dans le monde
    Given je suis sur la page "https://www.tesla.com/fr_FR/events"
    Then il doit y avoir 15 événement

  Scenario: Vérifier le lien afficher tout et afficher plus
    Given Je suis dans "https://www.tesla.com/fr_FR/events"
    Then vérifier si afficher tout est présent et afficher plus aussi

  Scenario: remplir de la page evenements
    Given je suis sur la page event
    Then je remplis le champ prénom avec "Emerick"
    And je remplis le champ nom avec "CHALET"
    And je remplis le champ téléphone avec "0640459520"
    And je remplis le champ code postal avec "95370"
    And je click sur "Suivant"
    Then le message d'erreur "obligatoire" apparait

