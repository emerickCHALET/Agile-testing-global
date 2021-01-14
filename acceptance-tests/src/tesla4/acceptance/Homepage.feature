Feature: Caractéristiques Tesla Model3
  Scenario Outline: Caractéristiques complètes de la model3
    Given je suis sur la page model 3 "https://www.tesla.com/fr_fr/model3"
    Then les caractere son "<Gamme>" et "<Poids>" et "<Accélération>" et "<Autonomie>"
    Examples:
      | Gamme                | Poids    | Accélération | Autonomie |
      | Performance          | 1,844 kg | 3,3 secondes | 567 km    |
      | Grande Automonie AWD | 1,844 kg | 4,4 secondes | 580 km    |
      | Standard Plus        | 1,745 kg | 5,6 secondes | 430 km    |




