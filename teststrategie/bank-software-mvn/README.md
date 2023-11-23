# Black-Box Testfälle:

| Testfall | Beschreibung           | Eingabe                                                                                                  | Erwartete Ausgabe                                                                                                                                                      |
|----------|------------------------|----------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1        | Erstellen eines Kontos | Der Benutzer wählt "e", um ein neues Konto zu erstellen.                                                 | Ein neues Konto wird erstellt, und die Details werden angezeigt.                                                                                                       |
| 2        | Geld einzahlen         | Der Benutzer wählt ein vorhandenes Konto und entscheidet sich, Geld einzuzahlen.                         | Der Benutzer wird aufgefordert, den Einzahlungsbetrag einzugeben, und der Kontostand wird aktualisiert.                                                                |
| 3        | Geld abheben           | Der Benutzer wählt ein vorhandenes Konto und entscheidet sich, Geld abzuheben.                           | Der Benutzer wird aufgefordert, den Abhebungsbetrag einzugeben, und der Kontostand wird aktualisiert, wenn die Abhebung möglich ist.                                   |
| 4        | Kontostand abfragen    | Der Benutzer wählt ein vorhandenes Konto und entscheidet sich, den Kontostand abzufragen.                | Der aktuelle Kontostand des ausgewählten Kontos wird angezeigt.                                                                                                        |
| 5        | Geld überweisen        | Der Benutzer wählt ein vorhandenes Konto und entscheidet sich, Geld auf ein anderes Konto zu überweisen. | Der Benutzer wird aufgefordert, das Empfängerkonto auszuwählen, den Überweisungsbetrag einzugeben, und die Kontostände beider Konten werden entsprechend aktualisiert. |
| 6        | Konto löschen          | Der Benutzer wählt ein vorhandenes Konto und entscheidet sich, es zu löschen.                            | Der Benutzer wird um Bestätigung gebeten, und wenn bestätigt, wird das Konto gelöscht.                                                                                 |
| 7        | Alle Konten anzeigen   | Der Benutzer wählt "a", um alle Konten anzuzeigen.                                                       | Eine Liste aller Konten mit ihren Nummern, Nachnamen und Währungen wird angezeigt.                                                                                     |
| 8        | Wechselkurs prüfen     | Der Benutzer wählt "w", um den Wechselkurs zu prüfen.                                                    | Der Benutzer wird aufgefordert, die Währungen einzugeben, und der Wechselkurs wird angezeigt.                                                                          |

# White-Box Testfälle:

| Testfall | Beschreibung                                                        | Eingabe                                                              | Erwartete Ausgabe                                                                                                                           |
|----------|---------------------------------------------------------------------|----------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------|
| 1        | Testen der Einzahlungsmethode in der Account-Klasse                 | Ein positiver Betrag wird auf ein Konto eingezahlt.                  | Der Kontostand sollte um den eingezahlten Betrag erhöht werden.                                                                             |
| 2        | Testen der Abhebungsmethode in der Account-Klasse                   | Ein gültiger Betrag wird von einem Konto abgehoben.                  | Der Kontostand sollte um den abgehobenen Betrag verringert werden.                                                                          |
| 3        | Testen der transferAmount-Methode in der Counter-Klasse             | Ein gültiger Betrag wird von einem Konto auf ein anderes überwiesen. | Der Kontostand des Quellkontos sollte verringert werden, und der Kontostand des Zielkontos sollte um den überwiesenen Betrag erhöht werden. |
| 4        | Testen der getExchangeRate-Methode in der ExchangeRateOkhttp-Klasse | Gültiges Währungspaar für den Abruf des Wechselkurses.               | Der Wechselkurs sollte ein positiver, nicht null Wert sein.                                                                                 |

# Code-Verbesserungen und bewährte Praktiken:

| Verbesserung         | Beschreibung                                                                                                                  |
|----------------------|-------------------------------------------------------------------------------------------------------------------------------|
| Encapsulation        | Instanzvariablen in der Account-Klasse privat und stellen Sie öffentliche Getter-Methoden bereit.                             |
| Eingabevalidierung   | Implementieren einer robusteren Eingabevalidierung, insbesondere bei Benutzerinteraktionen.                                   |
| Modularisierung      | Teilen von große Methoden in kleinere, fokussiertere Methoden auf, um die Lesbarkeit und Wartbarkeit des Codes zu verbessern. |
| Kommentare           | Hinzufügen von Kommentaren, um komplexe Logik zu erklären oder zukünftigen Entwicklern zusätzlichen Kontext zu geben.         |
| Konstanten           | Verwenden von Konstanten für Währungsumrechnungsraten in der Methode convertCurrency.                                         |
| Namenskonventionen   | Befolgen von konsistenten Namenskonventionen für Variablen, Methoden und Klassen.                                             |
| Code-Duplizierung    | Identifizieren und entfernen von Code-Duplizierung, wo möglich.                                                               |
| Enums                | Erwägen Sie die Verwendung eines aussagekräftigeren Namens für das Currency-Enum.                                             |
| Benutzeroberfläche   | Verbessern der Benutzeroberfläche durch Formatierung der Ausgabe für eine bessere Lesbarkeit.                                 |
| Tests                | Entwickeln von zusätzlichen Unit-Tests, insbesondere für Grenz- und Randwerte.                                                |
