# Lessen backend Java

Oefeningen voor het vak Backend (Java) van NOVI Hogeschool. Geen applicatie,
maar losse opdrachten per les.

## Opzet

| | |
|---|---|
| JDK | Amazon Corretto 25 (`C:\Users\Mick\.jdks\corretto-25.0.4.1`) |
| Language level | 25 |
| Build system | IntelliJ, dus geen Maven of Gradle en geen `pom.xml` |
| Bronmap | `src` |
| Build output | `out`, staat in `.gitignore` |

Het vak zelf draait op **Java 21**. Dit project staat bewust op 25, dus code
met nieuwe syntax (`void main()` zonder class, `IO.println`) compileert of
draait niet op een JDK 21. Schrijf in bestanden die je inlevert gewoon
`public static void main(String[] args)`, dat werkt op beide.

JDK-versie wijzigen: `File > Project Structure > Project`, en voor de
commandline de omgevingsvariabele `JAVA_HOME` aanpassen. `PATH` verwijst naar
`%JAVA_HOME%\bin`, dus die hoeft niet mee.

## Structuur

```
src/nl/novi/lesN/
├── voorbereiding   opdrachten die je vóór de les maakt
├── lesInhoud       wat we tijdens de les behandelen
└── huiswerk        opdrachten na afloop
```

Nagebouwd naar de opzet van mijn Python-lesrepo:
https://github.com/MVelden1/novi-python

Packages mogen geen streepje bevatten en niet met een cijfer beginnen. Een
Python-map als `huiswerk/if-else` wordt hier dus `huiswerk.conditionals`.
Niet-code bestanden (`.txt`, `.json`) horen niet in `src`, maar in een aparte
map die als Resources Root is gemarkeerd.

## Draaien

Elk bestand met een `main`-methode is los uitvoerbaar: groene pijl in de
kantlijn van de editor, of `Ctrl+Shift+F10`.
