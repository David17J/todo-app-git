# TaskFlow

TaskFlow ist ein kleines Übungsprojekt zur Aufgabenverwaltung.

Das Hauptziel des Projekts war nicht, eine möglichst große Anwendung zu entwickeln, sondern Git und GitHub in einem echten Entwicklungsworkflow zu lernen und gleichzeitig die Grundlagen von Java und Spring Boot praktisch anzuwenden.

## Ziele

- Git praktisch und professioneller anwenden
- GitHub kennenlernen
- Grundlagen von Spring Boot lernen
- Verstehen, wie ein Backend aufgebaut ist
- Datenbanken mit Spring Data JPA kennenlernen
- Einen echten Entwicklungsworkflow mit Branches, Commits und Pull Requests durchlaufen

---

## Features

### Tasks

- Tasks erstellen
- Alle Tasks abrufen
- Tasks aktualisieren
- Tasks löschen
- Tasks einer Person zuweisen
- Input Validation

### Cars

- Cars erstellen
- Alle Cars abrufen
- Einzelnes Car über die ID abrufen
- Cars aktualisieren
- Cars löschen
- Input Validation
- `404 Not Found` Error Handling

### Persons

- Personen erstellen
- Alle Personen abrufen
- Personen mit Tasks verbinden
- Input Validation

---

## Backend-Struktur

Während des Projekts habe ich gelernt, wie die verschiedenen Komponenten eines Spring-Boot-Backends zusammenarbeiten.

Die grundlegende Struktur ist:

Client
→ Controller
→ Service
→ Repository
→ Datenbank

### Entity

Eine Entity beschreibt die Daten und deren Struktur.

Beispiele aus TaskFlow:

- `Task`
- `Person`
- `Car`

### Repository

Das Repository ermöglicht den Zugriff auf die Datenbank.

Mit Spring Data JPA konnte ich unter anderem Methoden wie diese verwenden:

- `save()`
- `findAll()`
- `findById()`
- `delete()`

### Service

Im Service befindet sich die Logik der Anwendung.

Hier wird beispielsweise entschieden:

- welche Daten gesucht werden
- welche Daten verändert werden
- was gespeichert wird
- wie eine Person mit einem Task verbunden wird

### Controller

Der Controller nimmt HTTP-Requests entgegen und ruft die entsprechenden Methoden im Service auf.

Dabei habe ich mit verschiedenen HTTP-Methoden gearbeitet:

- `GET`
- `POST`
- `PUT`
- `DELETE`

---

## Spring Boot

In Spring Boot habe ich gelernt, was Beans sind, welchen Nutzen sie haben und wie Spring Objekte und Abhängigkeiten verwaltet.

Ich habe mich besonders damit beschäftigt, welche Komponenten benötigt werden, um eine Funktion vollständig umzusetzen.

Die Struktur aus Entity, Repository, Service und Controller habe ich bei verschiedenen Bereichen des Projekts mehrfach angewendet.

Dadurch konnte ich mein Verständnis für den grundlegenden Aufbau eines Spring-Boot-Backends festigen.

Zusätzlich habe ich gelernt:

- CRUD-Funktionen umzusetzen
- Constructor Injection zu verwenden
- Daten mit Spring Data JPA zu speichern
- eine H2-Datenbank zu verwenden
- Eingaben mit Jakarta Validation zu validieren
- Exceptions zu verwenden
- `404 Not Found` zurückzugeben
- Entities miteinander zu verbinden
- mit Foreign Keys und JPA-Beziehungen zu arbeiten
- Code übersichtlicher zu strukturieren

---

## Datenbank

TaskFlow verwendet eine H2-Datenbank zusammen mit Spring Data JPA.

Im Projekt werden unter anderem folgende Entities gespeichert:

- Task
- Person
- Car

`Task` und `Person` wurden außerdem miteinander verbunden.

Dadurch kann ein Task einer bestimmten Person zugewiesen werden.

Beispiel:

PERSON
id = 1

TASK
id = 5
person_id = 1

Damit habe ich praktisch gelernt, wie zwei Tabellen über einen Foreign Key miteinander verbunden werden können.

---

## Git

Git war eines der Hauptlernziele dieses Projekts.

Anstatt Git-Befehle nur einzeln zu lernen, habe ich sie während der Entwicklung von TaskFlow praktisch eingesetzt.

Zu den Befehlen, mit denen ich gearbeitet habe, gehören unter anderem:

- `git add`
- `git commit`
- `git status`
- `git log`
- `git switch`
- `git push`
- `git pull`
- `git fetch`
- `git commit --amend`
- `git rebase`
- `git push -u`
- `git push --force-with-lease`

Ich habe außerdem gelernt:

- Commits zu bearbeiten
- Commit-Messages nachträglich zu ändern
- mehrere Commits zusammenzufassen
- mit Rebase zu arbeiten
- meine Git-History aufzuräumen
- lokale und Remote-Branches zu verwalten
- `.gitignore` richtig einzusetzen

---

## GitHub

Bei GitHub habe ich gelernt, wie ein grundlegender Entwicklungsworkflow funktioniert.

Dazu gehören:

- Issues erstellen und verwenden
- Feature-Branches erstellen
- Änderungen auf Remote-Branches pushen
- Pull Requests erstellen
- Pull Requests mergen
- Merge-Konflikte lösen
- Branches nach einem Merge löschen
- den lokalen `main` mit dem Remote synchronisieren
- GitHub Boards verwenden
- Grundlagen von GitHub Actions kennenlernen
- sinnvolle Commit-Messages schreiben

Ein typischer Workflow während TaskFlow war:

Issue
→ Feature Branch
→ Änderungen
→ Commit
→ Push
→ Pull Request
→ Merge
→ main aktualisieren
→ Branch aufräumen

---

## Technologien

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Jakarta Validation
- H2 Database
- Maven
- Git
- GitHub

---

## Was ich aus dem Projekt mitnehme

Durch TaskFlow habe ich Git und GitHub nicht nur über einzelne Befehle gelernt, sondern verstanden, wie sie während der Entwicklung eines Projekts zusammenarbeiten.

Gleichzeitig habe ich die grundlegende Struktur eines Spring-Boot-Backends kennengelernt und mehrfach selbst angewendet.

Besonders wichtig war für mich das Verständnis der Verbindung:

Client
→ Controller
→ Service
→ Repository
→ Datenbank

Durch die Umsetzung von Task, Person und Car konnte ich diese Struktur mehrfach anwenden und dadurch mein Grundlagenwissen festigen.

TaskFlow war bewusst ein kleines Lernprojekt. Das Ziel war nicht, eine möglichst große oder produktionsreife Anwendung zu entwickeln, sondern die Grundlagen praktisch anzuwenden, Fehler zu machen, sie zu beheben und den Entwicklungsprozess mit Git und GitHub zu verstehen.
