# Testkonzept

## Software-Architektur und zu testende Komponenten

Die Software-Architektur besteht aus einer Java-Anwendung, die mit Gradle gebaut wird. Die Hauptkomponenten, die getestet werden sollen, sind:

- `Task` Klasse: Diese Klasse repräsentiert eine Aufgabe in der Anwendung. Sie hat Methoden zum Setzen und Abrufen von Kategorien und Benutzern.
- `Category` Klasse: Diese Klasse repräsentiert eine Kategorie in der Anwendung.
- `User` Klasse: Diese Klasse repräsentiert einen Benutzer in der Anwendung.

## Zu testende Features

Die folgenden Funktionen sollen getestet werden:

- Erstellung von Aufgaben
- Zuordnung von Kategorien zu Aufgaben
- Zuordnung von Benutzern zu Aufgaben

## Was nicht getestet wird

Die folgenden Funktionen werden nicht getestet:

- Datenbankoperationen: Da diese Anwendung Mock-Objekte für Tests verwendet, werden Datenbankoperationen nicht getestet.
- Benutzeroberfläche: Da dies eine Backend-Anwendung ist, wird die Benutzeroberfläche nicht getestet.

## Gewählte Testumgebung

Die Tests werden in einer lokalen Entwicklungsumgebung durchgeführt. Die Testumgebung besteht aus:

- Betriebssystem: Windows
- Entwicklungswerkzeug: IntelliJ IDEA 2023.3.3
- Testframework: JUnit 5
- Mocking-Framework: Mockito