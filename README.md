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

JDK-versie wijzigen: `File > Project Structure > Project`, en voor de
commandline de omgevingsvariabele `JAVA_HOME` aanpassen. `PATH` verwijst naar
`%JAVA_HOME%\bin`, dus die hoeft niet mee.

## Java 25 versus de Java 21 van het vak

Het vak draait op **Java 21**, dit project bewust op 25. Wie de repo op een
JDK 21 opent, loopt tegen twee verschillende problemen aan:

| Wat je schrijft | Op JDK 21 |
|---|---|
| `void main()` zonder class, met `IO.println` | compileert niet: *unnamed classes are a preview feature* |
| `static void main()` binnen een class, zonder `String[] args` | compileert wél, maar faalt bij het draaien: *Main method not found in class ...* |

Dat tweede geval is de vervelende: je krijgt geen compile-fout, alleen een
runtime-melding die eruitziet alsof er iets met je class mis is.

Schrijf daarom `public static void main(String[] args)` in alles wat je
inlevert of deelt. Dat werkt op 21 en op 25.

## Structuur

De indeling die ik per les aanhoud, naar het voorbeeld van mijn Python-lesrepo
(https://github.com/MVelden1/novi-python):

```
src/nl/novi/lesN/
├── voorbereiding   opdrachten die je vóór de les maakt
├── lesInhoud       wat we tijdens de les behandelen
└── huiswerk        opdrachten na afloop
```

Die mappen worden per les aangemaakt zodra er iets in komt te staan, dus niet
alle lessen hebben ze alle drie. Git bewaart geen lege mappen.

Packages mogen geen streepje bevatten en niet met een cijfer beginnen. Een
Python-map als `huiswerk/if-else` wordt hier dus `huiswerk.conditionals`.

Voor niet-code bestanden (`.txt`, `.json`) is nog geen aparte map ingericht.
Zodra dat nodig is: map aanmaken in de projectroot, rechtsklikken en
`Mark Directory as > Resources Root`. Ze horen niet in `src` tussen de
packages.

## Draaien

Elk bestand met een `main`-methode is los uitvoerbaar: groene pijl in de
kantlijn van de editor, of `Ctrl+Shift+F10`.
