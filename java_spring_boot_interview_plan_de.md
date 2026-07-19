# Підготовка до німецького інтерв'ю: Junior Java Backend Developer

> **Формат:** 14 днів, щодня 09:00–17:00 з перервами.  
> **Мета:** повторити Java та Spring Boot, відпрацювати практику і навчитися коротко відповідати німецькою.  
> **Орієнтир:** Junior Java Backend Developer у Німеччині, з фокусом на Java, Spring Boot, REST, PostgreSQL, JPA, тестування, Git, Maven, Docker та базовий CI/CD.

---

## 1. Короткий словник термінів для співбесіди

| Німецький термін | Що це означає | Коротка відповідь німецькою |
|---|---|---|
| **die Klasse** | Клас — шаблон для створення об'єктів | Eine Klasse beschreibt den Zustand und das Verhalten von Objekten. |
| **das Objekt** | Екземпляр класу | Ein Objekt ist eine konkrete Instanz einer Klasse. |
| **die Kapselung** | Приховування внутрішньої реалізації | Kapselung schützt interne Daten und stellt kontrollierte Zugriffsmethoden bereit. |
| **die Vererbung** | Наслідування властивостей і поведінки | Vererbung ermöglicht es einer Klasse, Eigenschaften einer anderen Klasse zu übernehmen. |
| **der Polymorphismus** | Один інтерфейс — різні реалізації | Polymorphismus erlaubt, verschiedene Implementierungen über einen gemeinsamen Typ zu verwenden. |
| **die Abstraktion** | Виділення важливого без деталей реалізації | Abstraktion zeigt nur die relevanten Eigenschaften und versteckt technische Details. |
| **die Schnittstelle — Interface** | Контракт без конкретної реалізації | Ein Interface definiert einen Vertrag, den implementierende Klassen erfüllen müssen. |
| **die abstrakte Klasse** | Частково реалізований базовий клас | Eine abstrakte Klasse kann gemeinsame Logik und abstrakte Methoden enthalten. |
| **das Überschreiben — Overriding** | Нова реалізація успадкованого методу | Beim Überschreiben implementiert eine Unterklasse eine geerbte Methode neu. |
| **das Überladen — Overloading** | Одна назва методу, різні параметри | Beim Überladen haben Methoden denselben Namen, aber unterschiedliche Parameterlisten. |
| **unveränderlich — immutable** | Об'єкт не змінюється після створення | Ein unveränderliches Objekt kann nach seiner Erzeugung nicht mehr verändert werden. |
| **die Ausnahme — Exception** | Помилка або виняткова ситуація | Eine Exception signalisiert einen Fehler oder eine unerwartete Situation zur Laufzeit. |
| **geprüfte Exception — checked** | Компілятор вимагає обробку | Checked Exceptions müssen behandelt oder mit `throws` weitergegeben werden. |
| **ungeprüfte Exception — unchecked** | RuntimeException, обробка не обов'язкова | Unchecked Exceptions erben von `RuntimeException` und müssen nicht explizit behandelt werden. |
| **die Collection** | Загальний інтерфейс для груп об'єктів | Collections speichern und verwalten mehrere Objekte. |
| **die Liste — List** | Впорядкована колекція з дублікатами | Eine List ist geordnet und kann doppelte Elemente enthalten. |
| **die Menge — Set** | Колекція без дублікатів | Ein Set enthält keine doppelten Elemente. |
| **die Zuordnung — Map** | Пари ключ-значення | Eine Map speichert Werte anhand eindeutiger Schlüssel. |
| **die HashMap** | Map на основі хешування | Eine HashMap bietet im Durchschnitt schnellen Zugriff über Schlüssel. |
| **equals und hashCode** | Логічне порівняння та хешування | Gleiche Objekte müssen denselben Hashcode haben. Deshalb müssen `equals` und `hashCode` zusammenpassen. |
| **die Generics** | Типобезпечні параметризовані типи | Generics erhöhen die Typsicherheit und vermeiden unnötige Casts. |
| **die Stream-API** | Декларативна обробка колекцій | Mit Streams kann man Daten filtern, transformieren und aggregieren. |
| **Optional** | Контейнер для значення, яке може бути відсутнім | `Optional` macht sichtbar, dass ein Ergebnis fehlen kann. |
| **der Heap** | Пам'ять для об'єктів | Objekte werden normalerweise im Heap gespeichert. |
| **der Stack** | Пам'ять викликів методів і локальних змінних | Der Stack enthält Methodenaufrufe und lokale Variablen. |
| **die Garbage Collection** | Автоматичне очищення непотрібних об'єктів | Der Garbage Collector gibt Speicher von nicht mehr erreichbaren Objekten frei. |
| **die Abhängigkeit — Dependency** | Об'єкт або сервіс, потрібний іншому компоненту | Eine Abhängigkeit ist eine Komponente, die von einer anderen Komponente benötigt wird. |
| **Dependency Injection** | Spring передає залежності ззовні | Bei Dependency Injection werden Abhängigkeiten von außen bereitgestellt. |
| **Inversion of Control — IoC** | Контейнер керує створенням об'єктів | Bei IoC übernimmt das Framework die Erstellung und Verwaltung von Komponenten. |
| **die Bean** | Об'єкт, яким керує Spring | Eine Bean ist ein Objekt, das vom Spring-Container verwaltet wird. |
| **die Komponente** | Клас, який знаходить Spring | Mit `@Component` wird eine Klasse als Spring-Komponente registriert. |
| **der Service** | Бізнес-логіка застосунку | Ein Service enthält normalerweise die Geschäftslogik der Anwendung. |
| **das Repository** | Доступ до бази даних | Ein Repository kapselt den Datenbankzugriff. |
| **der Controller** | Приймає HTTP-запити | Ein Controller verarbeitet HTTP-Anfragen und liefert HTTP-Antworten. |
| **die automatische Konfiguration** | Spring Boot конфігурує компоненти автоматично | Spring Boot konfiguriert viele Komponenten anhand der vorhandenen Abhängigkeiten automatisch. |
| **der Endpunkt — Endpoint** | Конкретна адреса API | Ein Endpunkt ist eine konkrete URL mit einer HTTP-Methode. |
| **die REST-Schnittstelle** | HTTP API для роботи з ресурсами | Eine REST-Schnittstelle verwendet HTTP-Methoden, Statuscodes und Ressourcen. |
| **das DTO** | Об'єкт для передачі даних через API | Ein DTO transportiert Daten zwischen API und Anwendung und schützt das interne Datenmodell. |
| **die Entität — Entity** | Об'єкт, пов'язаний із таблицею БД | Eine Entity repräsentiert normalerweise einen Datensatz in der Datenbank. |
| **die Validierung** | Перевірка вхідних даних | Validierung stellt sicher, dass eingehende Daten die fachlichen Regeln erfüllen. |
| **die Transaktion** | Група операцій як єдине ціле | Eine Transaktion wird vollständig ausgeführt oder vollständig zurückgerollt. |
| **die Persistenz** | Збереження даних | Persistenz bedeutet, Daten dauerhaft in einer Datenbank zu speichern. |
| **JPA** | Java-специфікація для ORM | JPA ist eine Spezifikation für die Abbildung von Java-Objekten auf relationale Datenbanken. |
| **Hibernate** | Популярна реалізація JPA | Hibernate ist eine verbreitete Implementierung der JPA-Spezifikation. |
| **Lazy Loading** | Дані завантажуються при зверненні | Beim Lazy Loading werden verbundene Daten erst bei Bedarf geladen. |
| **Eager Loading** | Дані завантажуються одразу | Beim Eager Loading werden verbundene Daten sofort mitgeladen. |
| **das N+1-Problem** | Надто багато SQL-запитів для зв'язків | Das N+1-Problem entsteht, wenn für eine Liste zusätzlich viele einzelne Abfragen ausgeführt werden. |
| **der Primärschlüssel** | Унікальний ідентифікатор рядка | Ein Primärschlüssel identifiziert einen Datensatz eindeutig. |
| **der Fremdschlüssel** | Посилання на іншу таблицю | Ein Fremdschlüssel stellt eine Beziehung zwischen Tabellen her. |
| **der Index** | Структура для пришвидшення пошуку | Ein Index beschleunigt Lesezugriffe, benötigt aber Speicher und verlangsamt Schreiboperationen. |
| **der Join** | Об'єднання рядків кількох таблиць | Mit einem Join werden zusammengehörige Daten aus mehreren Tabellen kombiniert. |
| **der Unit-Test** | Тест окремого класу або методу | Ein Unit-Test prüft eine kleine Einheit isoliert von externen Abhängigkeiten. |
| **der Integrationstest** | Тест взаємодії компонентів | Ein Integrationstest prüft das Zusammenspiel mehrerer Komponenten. |
| **der Mock** | Підроблена залежність у тесті | Ein Mock simuliert eine Abhängigkeit und ermöglicht isolierte Tests. |
| **die Authentifizierung** | Перевірка, хто користувач | Authentifizierung prüft die Identität eines Benutzers. |
| **die Autorisierung** | Перевірка прав доступу | Autorisierung prüft, auf welche Ressourcen ein Benutzer zugreifen darf. |
| **JWT** | Підписаний токен з даними користувача | Ein JWT ist ein signiertes Token, das Informationen und Berechtigungen enthalten kann. |
| **der Build** | Компіляція, тести та пакування | Beim Build wird der Quellcode kompiliert, getestet und paketiert. |
| **die Abhängigkeit in Maven** | Зовнішня бібліотека проєкту | Maven verwaltet Bibliotheken und den Build über die `pom.xml`. |
| **der Branch** | Окрема гілка розробки | Ein Branch ermöglicht, Änderungen getrennt vom Hauptzweig zu entwickeln. |
| **der Pull Request** | Запит на перевірку і злиття коду | Ein Pull Request dient der Codeüberprüfung vor dem Zusammenführen. |
| **der Container** | Ізольоване середовище запуску | Ein Docker-Container enthält die Anwendung und ihre Laufzeitabhängigkeiten. |
| **die CI/CD-Pipeline** | Автоматичний build, test і deployment | Eine CI/CD-Pipeline automatisiert Build, Tests und gegebenenfalls Deployment. |

---

## 2. Базовий розклад кожного дня

| Час | Блок |
|---|---|
| **09:00–10:30** | Теорія: повторення основної теми дня |
| **10:30–10:45** | Перерва |
| **10:45–12:15** | Практика: невеликі задачі або код без підказок |
| **12:15–13:00** | Обід і повна перерва від екрана |
| **13:00–14:30** | Практика у власному Spring Boot-проєкті |
| **14:30–14:45** | Перерва |
| **14:45–16:15** | Питання співбесіди та відповіді німецькою |
| **16:15–16:30** | Перерва |
| **16:30–17:00** | Повторення, картки термінів, запис слабких місць |

**Чистий навчальний час:** приблизно 6 годин 30 хвилин.  
**Загальний час із перервами:** 8 годин.

### Щоденні правила

1. Не дивитися відповідь до того, як самостійно сформулюєш її вголос.
2. Кожну важливу тему пояснити німецькою щонайменше у 3–5 реченнях.
3. Щодня написати хоча б один невеликий фрагмент коду без автодоповнення або AI.
4. Наприкінці дня записати:
   - що можу пояснити без підказки;
   - де плутаюся;
   - що повторити завтра протягом перших 15 хвилин.
5. Не намагатися вивчити всі можливі технології. Пріоритет — міцна база та вміння пояснювати власні рішення.

---

# 3. Двотижнева програма

## Тиждень 1 — Java, SQL та основи Spring Boot

## День 1 — Java Core та ООП

### 09:00–10:30 — Теорія

- class, object, constructor;
- access modifiers: `private`, package-private, `protected`, `public`;
- encapsulation, inheritance, polymorphism, abstraction;
- interface vs abstract class;
- composition vs inheritance;
- `static`, `final`, `this`, `super`;
- overloading vs overriding.

### 10:45–12:15 — Java-практика

Реалізувати без Spring:

- `User`, `AdminUser`, `RegularUser`;
- інтерфейс `NotificationSender`;
- реалізації `EmailNotificationSender` і `ConsoleNotificationSender`;
- сервіс, який отримує `NotificationSender` через конструктор.

### 13:00–14:30 — Практика у власному проєкті

Взяти одну частину `To-Do List` або `Dev Events Aggregator` і пояснити:

- де використовується інтерфейс;
- де використовується композиція;
- чому поля закриті;
- чому контролер не повинен містити бізнес-логіку.

### 14:45–16:15 — Питання німецькою

Підготувати відповіді:

1. Was sind die vier Grundprinzipien der objektorientierten Programmierung?
2. Was ist der Unterschied zwischen einem Interface und einer abstrakten Klasse?
3. Was ist der Unterschied zwischen Overloading und Overriding?
4. Warum bevorzugt man häufig Komposition statt Vererbung?
5. Was bedeutet Kapselung?

### Результат дня

- можеш пояснити ООП без визначень із підручника;
- можеш навести приклад зі свого проєкту;
- маєш 5 коротких відповідей німецькою.

---

## День 2 — Collections, Generics, equals/hashCode

### 09:00–10:30 — Теорія

- `Collection`, `List`, `Set`, `Map`;
- `ArrayList` vs `LinkedList`;
- `HashSet`;
- `HashMap`;
- `equals()` і `hashCode()`;
- mutable key у `HashMap`;
- `Comparable` vs `Comparator`;
- Generics;
- `? extends T` і `? super T` на базовому рівні.

### 10:45–12:15 — Java-практика

- видалити дублікати подій через `Set`;
- порахувати кількість подій за категоріями через `Map`;
- відсортувати події за датою;
- створити власний `Comparator`;
- перевірити поведінку `HashSet`, коли `equals/hashCode` реалізовані неправильно.

### 13:00–14:30 — Практика у проєкті

Для `Dev Events Aggregator`:

- пояснити, як відбувається дедуплікація;
- визначити, що є логічною рівністю двох подій;
- описати ризик mutable-полів у ключі;
- додати або перевірити тести для дедуплікації.

### 14:45–16:15 — Питання німецькою

1. Was ist der Unterschied zwischen `List`, `Set` und `Map`?
2. Wie funktioniert eine `HashMap` vereinfacht?
3. Warum müssen `equals` und `hashCode` zusammenpassen?
4. Wann würden Sie ein `Set` verwenden?
5. Was ist der Vorteil von Generics?

### Результат дня

- розумієш вибір колекції;
- можеш пояснити `HashMap` без занурення у внутрішню реалізацію JVM;
- не плутаєш логічну рівність із `==`.

---

## День 3 — Exceptions, Streams, Optional, Date/Time

### 09:00–10:30 — Теорія

- checked vs unchecked exceptions;
- `try`, `catch`, `finally`, `throw`, `throws`;
- custom exceptions;
- try-with-resources;
- Stream API: `filter`, `map`, `flatMap`, `sorted`, `collect`, `reduce`;
- intermediate vs terminal operation;
- `Optional`;
- `LocalDate`, `LocalDateTime`, `Instant`.

### 10:45–12:15 — Java-практика

- відфільтрувати майбутні події;
- згрупувати події за країною;
- знайти найближчу подію;
- перетворити `Event` на `EventDto`;
- написати custom exception `EventNotFoundException`;
- не використовувати `Optional.get()` без перевірки.

### 13:00–14:30 — Практика у проєкті

- перевірити exception handling;
- створити або покращити `@RestControllerAdvice`;
- повертати єдину структуру помилки;
- перевірити коректність HTTP status codes.

Приклад відповіді API:

```json
{
  "timestamp": "2026-07-17T12:00:00Z",
  "status": 404,
  "error": "Not Found",
  "message": "Event not found",
  "path": "/api/events/123"
}
```

### 14:45–16:15 — Питання німецькою

1. Was ist der Unterschied zwischen checked und unchecked Exceptions?
2. Wann würden Sie eine eigene Exception erstellen?
3. Was ist der Unterschied zwischen `map` und `flatMap`?
4. Warum sollte man `Optional` nicht überall verwenden?
5. Warum ist `LocalDate` für ein reines Datum besser als `LocalDateTime`?

### Результат дня

- можеш написати Stream-ланцюжок без копіювання;
- розумієш, де ловити exception, а де передавати вище;
- можеш пояснити глобальну обробку помилок у Spring.

---

## День 4 — JVM, пам'ять, immutability, concurrency basics

### 09:00–10:30 — Теорія

- JDK, JRE, JVM;
- compilation: `.java` → bytecode `.class`;
- stack vs heap;
- garbage collector;
- pass-by-value у Java;
- immutable objects;
- `String` immutability;
- thread, race condition, thread safety;
- `synchronized`, `volatile`, `AtomicInteger` — лише базове розуміння.

### 10:45–12:15 — Java-практика

- продемонструвати pass-by-value;
- створити immutable-клас;
- написати маленький приклад race condition;
- виправити лічильник через `AtomicInteger`;
- пояснити, чому `StringBuilder` підходить для багаторазової конкатенації.

### 13:00–14:30 — Практика у проєкті

- перевірити, чи singleton Spring beans не зберігають mutable request-specific state;
- знайти потенційно небезпечні shared-поля;
- пояснити, чому REST service повинен бути stateless;
- перевірити scheduler у `Dev Events Aggregator`.

### 14:45–16:15 — Питання німецькою

1. Was ist der Unterschied zwischen JDK, JRE und JVM?
2. Was wird im Stack und was im Heap gespeichert?
3. Ist Java pass-by-reference oder pass-by-value?
4. Warum ist `String` unveränderlich?
5. Was ist eine Race Condition?

### Результат дня

- можеш намалювати просту схему JVM;
- не кажеш, що Java передає об'єкти by reference;
- розумієш базовий ризик стану в singleton bean.

---

## День 5 — SQL та PostgreSQL

### 09:00–10:30 — Теорія

- relational database;
- primary key, foreign key;
- one-to-one, one-to-many, many-to-many;
- `SELECT`, `WHERE`, `ORDER BY`, `GROUP BY`, `HAVING`;
- `INNER JOIN`, `LEFT JOIN`;
- aggregate functions;
- indexes;
- normalization до 3NF на базовому рівні;
- transactions та ACID;
- isolation levels — знати ідею, не вчити всі деталі напам'ять.

### 10:45–12:15 — SQL-практика

На схемі `users`, `tasks`, `categories`, `comments` написати:

1. усі незавершені задачі користувача;
2. кількість задач у кожній категорії;
3. користувачів без задач через `LEFT JOIN`;
4. п'ять користувачів із найбільшою кількістю задач;
5. пошук задач за частиною назви;
6. транзакцію створення задачі та підзадач.

### 13:00–14:30 — Практика у проєкті

- відкрити Liquibase changelog;
- пояснити всі constraints;
- перевірити індекси;
- виконати `EXPLAIN` для одного запиту;
- пояснити, коли індекс допомагає, а коли ні;
- перевірити, чи немає зайвих many-to-many зв'язків.

### 14:45–16:15 — Питання німецькою

1. Was ist der Unterschied zwischen `INNER JOIN` und `LEFT JOIN`?
2. Was ist ein Index und welche Nachteile hat er?
3. Was bedeutet ACID?
4. Was ist der Unterschied zwischen Primär- und Fremdschlüssel?
5. Warum verwendet man Datenbankmigrationen?

### Результат дня

- можеш написати основні SQL-запити без ORM;
- розумієш призначення індексів;
- можеш пояснити структуру своєї БД німецькою.

---

## День 6 — Spring Core та Spring Boot

### 09:00–10:30 — Теорія

- Spring Framework vs Spring Boot;
- IoC container;
- Dependency Injection;
- bean lifecycle на загальному рівні;
- `@Component`, `@Service`, `@Repository`, `@Controller`, `@RestController`;
- constructor injection;
- component scanning;
- auto-configuration;
- starter dependencies;
- `application.yml`;
- profiles;
- configuration properties.

### 10:45–12:15 — Практика

Створити маленький Spring Boot API:

- `GET /api/health`;
- service interface та implementation;
- залежність через конструктор;
- окремі `dev` і `test` profiles;
- конфігурацію через `@ConfigurationProperties`.

### 13:00–14:30 — Практика у проєкті

Намалювати потік:

```text
HTTP Request
    ↓
Controller
    ↓
Service
    ↓
Repository
    ↓
PostgreSQL
```

Для кожного шару пояснити:

- відповідальність;
- що не повинно там знаходитися;
- які залежності він має;
- як його тестувати.

### 14:45–16:15 — Питання німецькою

1. Was ist der Unterschied zwischen Spring und Spring Boot?
2. Was bedeutet Dependency Injection?
3. Warum bevorzugen Sie Constructor Injection?
4. Was ist eine Spring Bean?
5. Was macht die Auto-Konfiguration von Spring Boot?
6. Was ist der Unterschied zwischen `@Component`, `@Service` und `@Repository`?

### Результат дня

- можеш пояснити запуск Spring Boot application;
- розумієш, що анотації не замінюють архітектуру;
- можеш пояснити constructor injection.

---

## День 7 — REST API, DTO, validation та HTTP

### 09:00–10:30 — Теорія

- REST constraints на практичному рівні;
- resource-oriented URLs;
- HTTP methods;
- idempotency;
- request params, path variables, request body;
- HTTP status codes;
- DTO vs Entity;
- Bean Validation;
- pagination, sorting, filtering;
- API versioning — базова ідея;
- OpenAPI/Swagger.

### 10:45–12:15 — Практика

Спроєктувати CRUD API для задач:

```text
POST   /api/tasks
GET    /api/tasks/{id}
GET    /api/tasks?page=0&size=20&status=PENDING
PUT    /api/tasks/{id}
PATCH  /api/tasks/{id}/status
DELETE /api/tasks/{id}
```

Для кожного endpoint визначити:

- request DTO;
- response DTO;
- validation;
- HTTP status;
- можливі помилки.

### 13:00–14:30 — Практика у проєкті

- не повертати Entity напряму;
- додати `@Valid`;
- перевірити `@NotBlank`, `@Size`, `@Email`, `@FutureOrPresent`;
- додати pagination для списку;
- перевірити OpenAPI specification;
- протестувати endpoint через Swagger UI або Postman.

### 14:45–16:15 — Питання німецькою

1. Was ist REST?
2. Was ist der Unterschied zwischen `PUT` und `PATCH`?
3. Welche HTTP-Methoden sind idempotent?
4. Warum verwenden Sie DTOs statt Entities im Controller?
5. Wann geben Sie `400`, `401`, `403`, `404` oder `409` zurück?
6. Wie implementieren Sie Pagination in Spring Boot?

### Контроль наприкінці першого тижня

Ти повинен уміти без підказок:

- пояснити Java OOP;
- вибрати правильну Collection;
- написати простий Stream;
- пояснити exception handling;
- написати SQL із JOIN;
- пояснити DI та Spring Bean;
- спроєктувати CRUD REST API;
- розповісти німецькою про один власний endpoint.

---

# Тиждень 2 — JPA, тести, Security, Docker та повна симуляція

## День 8 — JPA та Hibernate

### 09:00–10:30 — Теорія

- ORM;
- JPA vs Hibernate;
- entity states: transient, managed, detached, removed;
- `@Entity`, `@Id`, `@GeneratedValue`;
- relations;
- owning side і `mappedBy`;
- cascade types;
- orphan removal;
- fetch types;
- N+1 problem;
- JPQL;
- derived query methods;
- pagination;
- optimistic locking — загальна ідея.

### 10:45–12:15 — Практика

Створити модель:

```text
User 1 ─── * Task
Task 1 ─── * Comment
Task * ─── 1 Category
```

Потім:

- визначити owning side;
- налаштувати `mappedBy`;
- не використовувати `CascadeType.ALL` автоматично всюди;
- написати repository query;
- відтворити N+1 у тесті або логах SQL;
- усунути його через fetch join або entity graph.

### 13:00–14:30 — Практика у проєкті

- перевірити всі relations;
- перевірити `equals/hashCode` entities;
- увімкнути SQL logging у dev profile;
- знайти зайві запити;
- перевірити межі транзакцій;
- пояснити, чому `open-in-view` може приховувати проблему архітектури.

### 14:45–16:15 — Питання німецькою

1. Was ist der Unterschied zwischen JPA und Hibernate?
2. Was bedeutet die besitzende Seite einer Beziehung?
3. Was ist der Unterschied zwischen Lazy und Eager Loading?
4. Was ist das N+1-Problem?
5. Was macht `@Transactional`?
6. Warum sollte man Entities nicht direkt als API-Response zurückgeben?

### Результат дня

- можеш пояснити ORM без фрази «воно саме працює»;
- розумієш N+1;
- можеш пояснити транзакційну межу service method.

---

## День 9 — JUnit 5, Mockito та інтеграційні тести

### 09:00–10:30 — Теорія

- test pyramid;
- unit vs integration vs end-to-end;
- Arrange–Act–Assert;
- JUnit 5 annotations;
- assertions;
- Mockito: mock, stub, verify;
- `@Mock`, `@InjectMocks`;
- `@SpringBootTest`;
- `@WebMvcTest`;
- `@DataJpaTest`;
- MockMvc;
- test data;
- H2 vs PostgreSQL/Testcontainers — переваги та ризики.

### 10:45–12:15 — Практика

Написати unit tests для service:

- успішний сценарій;
- resource not found;
- duplicate;
- validation/business rule;
- repository method викликається правильно;
- repository method не викликається при помилці.

### 13:00–14:30 — Практика у проєкті

Додати:

- `@WebMvcTest` для одного controller;
- `@DataJpaTest` для custom query;
- один `@SpringBootTest` happy path;
- test profile;
- зрозумілі назви тестів.

Приклад:

```java
shouldReturn404WhenTaskDoesNotExist()
```

### 14:45–16:15 — Питання німецькою

1. Was ist der Unterschied zwischen Unit- und Integrationstest?
2. Was ist ein Mock?
3. Was sollte man nicht mocken?
4. Was prüft `@WebMvcTest`?
5. Wann würden Sie `@SpringBootTest` verwenden?
6. Warum ist eine hohe Testabdeckung allein kein Qualitätsnachweis?

### Результат дня

- можеш написати unit test без Spring context;
- розумієш, коли потрібен integration test;
- можеш пояснити власну test strategy.

---

## День 10 — Spring Security, JWT та OWASP basics

### 09:00–10:30 — Теорія

- authentication vs authorization;
- password hashing і BCrypt;
- Spring Security filter chain;
- stateless authentication;
- JWT structure: header, payload, signature;
- access token;
- roles та authorities;
- `401` vs `403`;
- CORS vs CSRF;
- input validation;
- SQL injection;
- broken access control;
- секрети та environment variables.

### 10:45–12:15 — Практика

Намалювати потік JWT:

```text
Login request
    ↓
AuthenticationManager
    ↓
UserDetailsService
    ↓
Password verification
    ↓
JWT creation
    ↓
Client sends Bearer token
    ↓
JWT filter validates token
    ↓
SecurityContext
    ↓
Controller
```

Потім пояснити кожний крок німецькою.

### 13:00–14:30 — Практика у проєкті

- перевірити password hashing;
- перевірити token expiration;
- не зберігати secret у Git;
- додати перевірку ownership ресурсу;
- протестувати `401` та `403`;
- перевірити, чи користувач не може читати чужі задачі через зміну ID.

### 14:45–16:15 — Питання німецькою

1. Was ist der Unterschied zwischen Authentifizierung und Autorisierung?
2. Wie funktioniert JWT vereinfacht?
3. Warum darf man Passwörter nicht im Klartext speichern?
4. Was ist der Unterschied zwischen `401` und `403`?
5. Was ist der Unterschied zwischen CORS und CSRF?
6. Wie stellen Sie sicher, dass ein Benutzer nur seine eigenen Daten ändern kann?

### Результат дня

- можеш пояснити security flow;
- розумієш, що валідний JWT ще не гарантує доступ до конкретного ресурсу;
- можеш назвати типові backend security risks.

---

## День 11 — Maven, Git, Docker та CI/CD

### 09:00–10:30 — Теорія

- Maven lifecycle: `clean`, `compile`, `test`, `package`, `verify`, `install`;
- dependency scopes;
- semantic versioning на базовому рівні;
- Git working tree, staging area, repository;
- commit, branch, merge, rebase;
- pull request і code review;
- merge conflict;
- Docker image vs container;
- Dockerfile;
- Docker Compose;
- environment variables;
- CI pipeline.

### 10:45–12:15 — Практика

Виконати без IDE-кнопок:

```bash
mvn clean verify
git checkout -b feature/interview-preparation
git status
git add .
git commit -m "Add interview preparation changes"
git log --oneline
```

Потім:

- створити конфлікт у тестовому repository;
- самостійно його вирішити;
- пояснити різницю між merge і rebase.

### 13:00–14:30 — Практика у проєкті

- перевірити Dockerfile;
- перевірити `docker-compose.yml`;
- підняти application + PostgreSQL;
- виконати health check;
- перевірити, що tests запускаються в CI;
- переглянути GitHub Actions pipeline;
- пояснити шлях від commit до готового artifact.

### 14:45–16:15 — Питання німецькою

1. Was passiert bei `mvn clean verify`?
2. Was ist der Unterschied zwischen einem Docker-Image und einem Container?
3. Warum verwendet man Docker Compose?
4. Wie lösen Sie einen Merge-Konflikt?
5. Was ist der Zweck eines Pull Requests?
6. Was sollte eine einfache CI-Pipeline ausführen?

### Результат дня

- можеш зібрати проєкт із термінала;
- можеш підняти проєкт у Docker;
- можеш пояснити базовий development workflow.

---

## День 12 — Архітектура, debugging та розповідь про проєкти

### 09:00–10:30 — Теорія

- separation of concerns;
- layered architecture;
- SOLID — практичний зміст, без механічного заучування;
- clean code;
- logging levels;
- debugging;
- code review;
- monolith vs microservices;
- synchronous vs asynchronous communication;
- caching — базова ідея;
- resilience — timeout, retry, circuit breaker на рівні розуміння.

### 10:45–12:15 — Debugging practice

Навмисно створити або знайти:

- `NullPointerException`;
- неправильний HTTP status;
- помилку mapping DTO;
- failing test;
- SQL constraint violation;
- LazyInitializationException або N+1;
- неправильну конфігурацію profile.

Для кожної проблеми пройти процес:

1. відтворити;
2. прочитати stack trace;
3. локалізувати;
4. сформувати гіпотезу;
5. перевірити;
6. виправити;
7. додати regression test.

### 13:00–14:30 — Підготовка двох проєктів

Підготувати розповідь про:

1. **Dev Events Aggregator**;
2. **To-Do List Web Application**.

Структура розповіді німецькою:

```text
1. Ziel des Projekts
2. Meine konkrete Verantwortung
3. Technischer Stack
4. Architektur
5. Eine schwierige technische Aufgabe
6. Meine Lösung
7. Tests und Qualitätssicherung
8. Was ich heute verbessern würde
```

### 14:45–16:15 — Питання німецькою

1. Können Sie eines Ihrer Projekte erklären?
2. Warum haben Sie diese Architektur gewählt?
3. Welche technische Herausforderung war besonders schwierig?
4. Wie haben Sie einen Fehler analysiert und behoben?
5. Was würden Sie an Ihrem Projekt heute verbessern?
6. Wann würden Sie Microservices statt eines Monolithen verwenden?

### Результат дня

- маєш дві 3–5-хвилинні розповіді про проєкти;
- кожна розповідь містить конкретну проблему і твоє рішення;
- не перебільшуєш власний внесок.

---

## День 13 — Coding interview та перша повна симуляція

### 09:00–10:30 — Алгоритмічна практика

Розв'язати без AI:

1. знайти дублікати у списку;
2. підрахувати частоту слів;
3. знайти перший неповторюваний символ;
4. перевірити palindrome;
5. згрупувати об'єкти за полем;
6. знайти top-N значень;
7. реалізувати простий LRU лише якщо базові задачі вже легкі.

Пріоритет на співбесіді:

- проговорити припущення;
- назвати edge cases;
- спочатку запропонувати просте рішення;
- оцінити time і space complexity;
- написати тестові приклади.

### 10:45–12:15 — Backend design task

Спроєктувати API для однієї системи:

- URL shortener;
- task manager;
- event aggregator;
- booking service.

Описати:

- entities;
- endpoints;
- database relations;
- validation;
- error handling;
- authentication;
- tests;
- Docker deployment;
- можливі bottlenecks.

### 13:00–14:30 — Mock interview №1

60–75 хвилин без конспекту:

- 10 хвилин — Vorstellung;
- 20 хвилин — Java;
- 20 хвилин — Spring/SQL;
- 15 хвилин — проєкт;
- 10 хвилин — твої запитання компанії.

Решта часу — розбір помилок.

### 14:45–16:15 — Виправлення слабких місць

Створити таблицю:

| Питання | Моя відповідь | Чого бракувало | Правильна коротка відповідь |
|---|---|---|---|
|  |  |  |  |

### Результат дня

- знаєш три найбільші прогалини;
- можеш розв'язати junior coding task із поясненням;
- можеш пройти 60 хвилин інтерв'ю без постійного переходу на українську.

---

## День 14 — Фінальне повторення та повна симуляція

### 09:00–10:30 — Rapid review

Без підказок відповісти по 2–3 речення:

- OOP principles;
- interface vs abstract class;
- `==` vs `equals`;
- `List` vs `Set` vs `Map`;
- checked vs unchecked exception;
- stack vs heap;
- DI та IoC;
- Spring vs Spring Boot;
- DTO vs Entity;
- JPA vs Hibernate;
- Lazy vs Eager;
- N+1;
- transaction;
- `INNER JOIN` vs `LEFT JOIN`;
- unit vs integration test;
- mock;
- authentication vs authorization;
- `401` vs `403`;
- image vs container;
- CI pipeline.

### 10:45–12:15 — Практичний mini-project challenge

За 90 хвилин додати невелику функцію до проєкту:

- новий endpoint;
- DTO;
- validation;
- service method;
- repository query;
- exception handling;
- unit test;
- controller test.

Не копіювати готове рішення зі старого коду.

### 13:00–14:30 — Mock interview №2

Повна симуляція німецькою:

1. Selbstvorstellung;
2. Berufserfahrung und Weiterbildung;
3. Java Core;
4. Spring Boot;
5. SQL/JPA;
6. Testing;
7. проєкт;
8. невелика coding task;
9. behavioral questions;
10. запитання до компанії.

### 14:45–16:15 — Фінальне виправлення

Повторити лише теми, де відповідь була:

- неправильною;
- довшою за 90 секунд;
- без прикладу;
- нечіткою німецькою;
- відірваною від власного проєкту.

### 16:30–17:00 — Фінальний чекліст

- [ ] Я можу представитися німецькою за 60–90 секунд.
- [ ] Я можу 3–5 хвилин розповідати про кожний із двох проєктів.
- [ ] Я можу пояснити Java OOP на прикладах.
- [ ] Я можу пояснити `HashMap`, `equals` і `hashCode`.
- [ ] Я можу написати базовий SQL JOIN.
- [ ] Я можу пояснити DI, Bean і auto-configuration.
- [ ] Я можу спроєктувати REST CRUD API.
- [ ] Я можу пояснити JPA relations і N+1.
- [ ] Я можу написати unit test із Mockito.
- [ ] Я розумію JWT flow, `401` та `403`.
- [ ] Я можу пояснити Docker і CI/CD.
- [ ] Я можу чесно сказати, чого ще не знаю, і описати, як би це дослідив.

---

# 4. Готові конструкції для відповідей німецькою

## Коли знаєш відповідь

```text
Unter ... verstehe ich ...
Ein typisches Beispiel aus meinem Projekt ist ...
Der wichtigste Vorteil ist ...
Ein möglicher Nachteil ist ...
In diesem Fall würde ich ... verwenden, weil ...
```

## Коли потрібно подумати

```text
Ich würde die Frage kurz strukturieren.
Zuerst würde ich die Anforderungen klären.
Danach würde ich eine einfache Lösung vorschlagen und anschließend mögliche Verbesserungen betrachten.
```

## Коли не знаєш точно

```text
Ich habe damit noch keine tiefe praktische Erfahrung.
Mein aktuelles Verständnis ist, dass ...
Ich würde zuerst die offizielle Dokumentation prüfen, ein kleines Beispiel erstellen und das Verhalten mit einem Test verifizieren.
```

## Коли виправляєш себе

```text
Ich möchte meine Antwort korrigieren.
Der entscheidende Unterschied ist nicht ..., sondern ...
```

## Коли пояснюєш вибір технології

```text
Ich habe mich für ... entschieden, weil ...
Für dieses Projekt war das ausreichend, da ...
Bei höheren Anforderungen würde ich zusätzlich ... prüfen.
```

---

# 5. Самопрезентація: структура на 60–90 секунд

Не вчи текст слово в слово. Підготуй блоки:

1. хто ти і на яку позицію подаєшся;
2. Java/Spring Boot stack;
3. комерційний досвід або Weiterbildung;
4. 1–2 релевантні проєкти;
5. що шукаєш у наступній ролі;
6. чому ця компанія.

Шаблон структури:

```text
Guten Tag, mein Name ist Daniil Dumshenko.
Ich bewerbe mich als Junior Java Backend Developer.
Mein Schwerpunkt liegt auf Java, Spring Boot, REST-APIs und PostgreSQL.

Während meiner Weiterbildung und meiner bisherigen praktischen Erfahrung habe ich mehrere Backend-Projekte umgesetzt.
Dazu gehören unter anderem ein Event-Aggregator und eine To-do-Anwendung mit Spring Boot, JPA, PostgreSQL, Liquibase, Docker und automatisierten Tests.

Besonders wichtig sind mir sauber strukturierter Code, nachvollziehbare APIs und zuverlässige Tests.
In meiner nächsten Position möchte ich meine Backend-Kenntnisse in einem professionellen Team weiter vertiefen und schrittweise mehr Verantwortung übernehmen.
```

Адаптуй останні 1–2 речення під конкретну вакансію.

---

# 6. Behavioral-питання, які потрібно підготувати

Підготуй по одному реальному прикладу за схемою **STAR**:

```text
Situation → Task → Action → Result
```

Питання:

1. Erzählen Sie von einem schwierigen technischen Problem.
2. Wie gehen Sie mit einem Fehler um, den Sie selbst verursacht haben?
3. Wie reagieren Sie auf kritisches Feedback im Code Review?
4. Was tun Sie, wenn eine Aufgabe unklar ist?
5. Wie priorisieren Sie mehrere Aufgaben?
6. Erzählen Sie von einer Situation, in der Sie etwas Neues schnell lernen mussten.
7. Wie arbeiten Sie mit Git und Pull Requests im Team?
8. Warum möchten Sie gerade bei unserem Unternehmen arbeiten?
9. Warum suchen Sie eine Junior-Position?
10. Was erwarten Sie von Ihrem zukünftigen Team?

---

# 7. Запитання, які можна поставити компанії

Обери 4–5, а не став усі:

```text
Wie sieht die Einarbeitung für Junior-Entwickler aus?

Wie werden Aufgaben im Team geplant und verteilt?

Wie läuft der Code-Review-Prozess ab?

Welche Erwartungen haben Sie an einen Junior-Entwickler in den ersten drei Monaten?

Wie hoch ist der Anteil von Neuentwicklung und Wartung?

Welche Teststrategie verwendet das Team?

Wie sieht Ihre aktuelle Backend-Architektur aus?

Welche Möglichkeiten gibt es für Weiterbildung und Mentoring?
```

---

# 8. Пріоритети, якщо часу стане менше

## Обов'язково — P0

1. Java OOP;
2. Collections, `equals/hashCode`;
3. Exceptions;
4. SQL JOIN, indexes, transactions;
5. Spring DI, Beans, layers;
6. REST, DTO, validation, HTTP status codes;
7. JPA relations, Lazy/Eager, N+1;
8. JUnit та Mockito;
9. Git і Maven;
10. розповідь про власні проєкти німецькою.

## Важливо — P1

1. Spring Security та JWT;
2. Docker і Docker Compose;
3. CI/CD;
4. concurrency basics;
5. integration tests;
6. debugging;
7. basic system design.

## Достатньо знати концептуально — P2

1. Kafka;
2. Kubernetes;
3. advanced JVM tuning;
4. distributed transactions;
5. advanced microservices patterns;
6. advanced concurrency;
7. cloud architecture.

На junior-інтерв'ю краще впевнено пояснити P0, ніж поверхнево перелічити всі P2-технології.

---

# 9. Критерій готовності до інтерв'ю

Ти готовий подаватися і проходити інтерв'ю, коли можеш:

1. дати коротку відповідь на базове питання протягом 30–90 секунд;
2. навести приклад зі свого коду;
3. пояснити trade-off, а не лише визначення;
4. написати невеликий Java/SQL фрагмент без AI;
5. пройти 60-хвилинну симуляцію німецькою;
6. чесно пояснити межі своїх знань;
7. поставити компанії змістовні технічні запитання.

