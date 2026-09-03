# Lessen backend Java

Oefeningen voor het vak Backend (Java) van NOVI Hogeschool. Geen applicatie,
maar losse opdrachten per les.

## Structuur

Per les een map, met daarin steeds dezelfde driedeling:

```
src/nl/novi/lesN/
├── voorbereiding   opdrachten die je vóór de les maakt
├── lesinhoud       wat we tijdens de les behandelen
└── huiswerk        opdrachten na afloop
```

Die mappen worden aangemaakt zodra er iets in komt te staan, dus niet elke les
heeft ze alle drie. Git bewaart geen lege mappen.

Packages mogen geen streepje bevatten en niet met een cijfer beginnen. Een map
als `huiswerk/if-else` heet hier dus `huiswerk/conditionals`.

## Inhoud

| Les | Onderwerp | Opdrachten |
|---|---|---|
| les1 | Variabelen, datatypen, methodes | `huiswerk/methods` (beginner t/m senior), `huiswerk/personalia` |
| les2 | Klassen, objecten, if-statement | `voorbereiding/carclass`, `lesinhoud/classes`, `huiswerk/classes`, `huiswerk/supermarkt` |
| les3 | nog leeg | |

Opdrachtbeschrijvingen staan als `README.md` of `OPDRACHT.md` in de map van de
opdracht zelf.

## Opzet

| | |
|---|---|
| JDK | Amazon Corretto 25 |
| Language level | 25 |
| Build system | IntelliJ, dus geen Maven of Gradle en geen `pom.xml` |
| Bronmap | `src` |
| Build output | `out`, staat in `.gitignore` |
