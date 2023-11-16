# Tabelle mit abstrakten Testfällen
| Testfall | Beschreibung                          |
|----------|--------------------------------------|
| 1        | Kaufpreis < 15'000 CHF               |
| 2        | 15'000 CHF ≤ Kaufpreis ≤ 20'000 CHF |
| 3        | 20'000 CHF < Kaufpreis < 25'000 CHF |
| 4        | Kaufpreis ≥ 25'000 CHF               |

# Tabelle mit konkreten Testfällen
| Testfall | Kaufpreis   | Erwarteter Rabatt |
|----------|-------------|--------------------|
| 1        | 10'000 CHF  | 0%                 |
| 2        | 17'500 CHF  | 5%                 |
| 3        | 22'000 CHF  | 7%                 |
| 4        | 30'000 CHF  | 8.5%               |

* Testfall 1: Der Kaufpreis liegt unter 15'000 CHF, daher sollte kein Rabatt gewährt werden.
* Testfall 2: Der Kaufpreis liegt zwischen 15'000 CHF und 20'000 CHF, daher sollte ein Rabatt von 5% gewährt werden.
* Testfall 3: Der Kaufpreis liegt zwischen 20'000 CHF und 25'000 CHF, daher sollte ein Rabatt von 7% gewährt werden.
* Testfall 4: Der Kaufpreis liegt über 25'000 CHF, daher sollte ein Rabatt von 8.5% gewährt werden.