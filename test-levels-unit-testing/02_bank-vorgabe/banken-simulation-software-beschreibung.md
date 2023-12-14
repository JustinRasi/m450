# Software-Dokumentation

## Sprachen und Frameworks
- Java
- Spring Boot
- Maven

## Klassen

### `Account`
- Verwaltet Informationen zu einem Bankkonto.

### `AccountBalanceComparator` und `AccountInverseBalanceComparator`
- Dienen zum Vergleich von Konten basierend auf ihrem Kontostand.

### `Bank`
- Verwaltet eine Sammlung von Konten.

### `Main`
- Der Einstiegspunkt für die Anwendung.

### `PromoYouthSavingsAccount`, `SalaryAccount`, `SavingsAccount`
- Verschiedene Arten von Konten, die von der Bank verwaltet werden.

### `BankUtils`
- Enthält Hilfsmethoden für Bankoperationen.

### `Booking`
- Verwaltet Informationen zu einer Banktransaktion.

## Allgemeiner Ablauf
Die Anwendung scheint eine Bankanwendung zu sein, die verschiedene Arten von Konten verwaltet. Jedes Konto kann verschiedene Buchungen haben, die Transaktionen darstellen. Es gibt Hilfsmethoden in `BankUtils`, um Bankdaten zu formatieren und andere gemeinsame Aufgaben auszuführen.