# Програма навчання Java Backend Developer

## 1. Мета програми

Мета: пройти курси з `CourseStructure.md`, закріпити матеріал самостійною
практикою та підготуватися до пошуку першої роботи на позицію
`Junior Java Backend Developer` у Німеччині.

Тривалість програми: **12 тижнів / 84 дні**.

Навчальне навантаження: **5-6 годин на день**, у середньому 38 годин на
тиждень. Це інтенсивна програма. Якщо накопичується втома, день повторення
наприкінці тижня треба скоротити до 2-3 годин, а не намагатися компенсувати
втрачений час нічною роботою.

Курси:

1. Ultimate Java Part 1: Fundamentals.
2. Ultimate Java Part 2: Object-oriented Programming.
3. Ultimate Java Part 3: Advanced Topics.
4. Spring Boot: Mastering the Fundamentals.
5. Spring Boot: Mastering REST API Development.

Додаткові теми, потрібні для працевлаштування:

- Git і GitHub;
- Maven;
- SQL і PostgreSQL;
- HTTP та REST;
- JUnit 5, Mockito та інтеграційні тести;
- Docker і Docker Compose;
- базові алгоритми та структури даних;
- документація API;
- технічна англійська та німецька лексика для співбесід;
- CV, GitHub-портфоліо та підготовка до технічної співбесіди.

## 2. Щоденний формат роботи

### 2.1. Стандартний день: 5 годин 30 хвилин

| Блок | Час | Зміст |
|---|---:|---|
| Повторення | 30 хв | Пояснити вголос учорашню тему без конспекту, відповісти на 5 запитань |
| Курс | 90 хв | Відео, нотатки, повторення коду викладача |
| Керована практика | 60 хв | Переписати приклади самостійно та змінити їхню поведінку |
| Самостійне завдання | 120 хв | Виконати денне завдання без копіювання готового рішення |
| Тести й рефакторинг | 30 хв | Перевірити крайні випадки, покращити назви та структуру |
| Підсумок | 20 хв | Записати в журнал: що вивчено, що не зрозуміло, що повторити |

Перерви не входять у ці 5 годин 30 хвилин. Після кожних 50-60 хвилин роботи
треба робити перерву 10-15 хвилин.

### 2.2. Правила проходження уроків

1. Не дивитися більше 30 хвилин відео без написання коду.
2. Спочатку самостійно виконувати вправу, потім дивитися рішення Mosh.
3. Після рішення Mosh закрити відео й відтворити рішення з пам'яті.
4. Не переходити далі, поки код не компілюється і не перевірені крайні випадки.
5. Наприкінці кожного дня робити окремий Git commit із конкретним повідомленням.
6. Кожну помилку, на яку витрачено понад 20 хвилин, записувати в
   `learning-journal.md`: причина, спосіб діагностики та виправлення.
7. Підказки й AI використовувати лише після власної спроби та опису проблеми.

### 2.3. Критерій завершення дня

День зараховується, якщо:

- пройдено заплановані уроки;
- денне завдання працює;
- є щонайменше 3 перевірені крайні випадки або автоматичні тести;
- код збережено в Git;
- тему можна пояснити своїми словами за 3-5 хвилин.

## 3. Наскрізні практичні проєкти

### 3.1. Проєкт 1: Personal Finance CLI

Консольний застосунок для обліку доходів, витрат і бюджетів.

Функції:

- додавання, редагування та видалення транзакцій;
- категорії доходів і витрат;
- місячний бюджет;
- пошук, фільтрація, сортування та статистика;
- імпорт і експорт даних;
- обробка помилок;
- автоматичні тести.

Проєкт розвивається протягом Java Part 1-3.

### 3.2. Проєкт 2: Job Application Tracker API

Spring Boot REST API для керування процесом пошуку роботи.

Основні сутності:

- `User`;
- `Company`;
- `Vacancy`;
- `Application`;
- `Interview`;
- `Skill`;
- `Note`.

Обов'язкові можливості:

- реєстрація, вхід, JWT і ролі;
- CRUD для вакансій та заявок;
- статуси `SAVED`, `APPLIED`, `INTERVIEW`, `OFFER`, `REJECTED`;
- пошук, фільтрація, сортування та пагінація;
- PostgreSQL і Flyway;
- validation і глобальна обробка помилок;
- OpenAPI/Swagger;
- unit та integration tests;
- Docker Compose;
- README з інструкцією запуску й прикладами запитів.

Цей проєкт має стати головною роботою в портфоліо.

## 4. Детальний план на 84 дні

## Тиждень 1. Java Fundamentals: діагностика та повторення

### День 1. Середовище, Java-програма та Git

**Курс:** Getting Started з Java Part 1.

**Практика:**

- перевірити JDK, IntelliJ IDEA, Maven і Git;
- створити структуру папок `exercises`, `finance-cli`, `job-tracker-api`;
- написати `HelloDeveloper`, скомпілювати й запустити його з IDE та термінала;
- пояснити різницю між JDK, JVM, JRE, source code і bytecode;
- створити Git-репозиторій та перший змістовний commit.

**Результат:** програма запускається двома способами, а в конспекті є схема
виконання Java-коду.

### День 2. Змінні, primitive та reference types

**Курс:** Types 1-7.

**Практика:**

- створити програму `PersonalProfile`;
- використати всі primitive types, `String`, константи й escape sequences;
- написати 10 прикладів присвоєння та 5 прикладів casting;
- передбачити результат кожного прикладу до запуску;
- знайти й пояснити переповнення `byte` та проблему точності `double`.

**Результат:** таблиця типів і програма без magic numbers.

### День 3. Масиви, вирази та `Math`

**Курс:** Types 8-15.

**Практика:**

- реалізувати статистику масиву: min, max, sum, average;
- розвернути масив без готового методу;
- створити та вивести матрицю 3x3;
- реалізувати конвертер валют із форматуванням результату;
- розв'язати 5 виразів на порядок операцій до запуску коду.

**Результат:** `ArrayStatistics` і `CurrencyConverter`.

### День 4. Введення даних і Mortgage Calculator

**Курс:** Types 16-19 та проєкт Mortgage Calculator.

**Практика:**

- спочатку самостійно реалізувати Mortgage Calculator;
- перевірити нульову ставку, від'ємні значення та дуже великий строк;
- порівняти рішення з курсом;
- винести формулу й читання даних в окремі методи;
- додати форматований щомісячний платіж.

**Результат:** калькулятор не падає на некоректному вводі.

### День 5. Умови та логічні оператори

**Курс:** Control Flow 1-8.

**Практика:**

- виконати FizzBuzz без перегляду рішення;
- створити `TaxCalculator` із трьома податковими діапазонами;
- реалізувати категоризацію BMI;
- написати варіанти з `if`, ternary та `switch`;
- скласти таблицю істинності для складної умови.

**Результат:** 3 невеликі програми та пояснення short-circuit evaluation.

### День 6. Цикли

**Курс:** Control Flow 9-16.

**Практика:**

- реалізувати суму цифр, factorial, palindrome і prime check;
- знайти друге найбільше число в масиві;
- побудувати таблицю множення;
- переписати одну задачу через `for`, `while` і `do-while`;
- пояснити доречність `break`, `continue` і for-each.

**Результат:** 6 задач без дублювання основної логіки.

### День 7. Контрольна робота №1

**Без нових відео.**

**Практика:**

- за 90 хвилин створити консольний `NumberAnalyzer`;
- програма приймає числа до команди завершення;
- виводить кількість, min, max, average, парні та непарні числа;
- обробляє порожній ввід і нечислове значення;
- провести code review власного рішення;
- повторити 20 контрольних запитань тижня.

**Результат:** щонайменше 80% функцій працюють без підказок.

## Тиждень 2. Clean Code і основи OOP

### День 8. Методи та рефакторинг

**Курс:** Clean Coding 1-10.

**Практика:**

- завершити Payment Schedule;
- розділити довгий метод на короткі методи з одним обов'язком;
- прибрати дублювання, magic numbers і невиразні назви;
- порівняти код до та після рефакторингу;
- сформувати власний checklist clean code.

**Результат:** жоден метод навчального проєкту не перевищує приблизно 20 рядків
без обґрунтованої причини.

### День 9. Debugging, packaging і Maven

**Курс:** Debugging and Deploying Applications.

**Практика:**

- навмисно створити syntax, runtime і logic errors;
- знайти їх через breakpoints, step over, step into та watches;
- дослідити stack trace;
- зібрати Maven-проєкт командою `mvn package`;
- запустити створений JAR.

**Результат:** коротка інструкція діагностики помилок і працездатний JAR.

### День 10. Classes, objects і memory allocation

**Курс:** Java Part 2, Classes 1-6.

**Практика:**

- змоделювати `Transaction`, `Category` і `Money`;
- створити кілька об'єктів і простежити зміни стану;
- намалювати спрощену схему stack/heap;
- порівняти procedural та object-oriented рішення;
- почати `Personal Finance CLI`.

**Результат:** доменні класи не використовують глобальний mutable state.

### День 11. Encapsulation та abstraction

**Курс:** Classes 7-11.

**Практика:**

- зробити поля доменних класів private;
- забезпечити валідний стан через методи, а не довільні setters;
- заборонити транзакцію з нульовою сумою та порожньою категорією;
- знайти coupling між console input і business logic;
- розділити ці обов'язки.

**Результат:** неможливо створити невалідну транзакцію через public API класу.

### День 12. Constructors, overloading і static

**Курс:** Classes 12-17.

**Практика:**

- створити перевантажені constructors для `Transaction`;
- використати constructor chaining;
- додати factory method для income та expense;
- доречно використати static constant і static factory;
- пояснити, чому business state не має бути static.

**Результат:** класи мають зрозумілі способи створення та захищають invariants.

### День 13. OOP-рефакторинг

**Курс:** Refactoring Towards an Object-oriented Design.

**Практика:**

- повторити рефакторинг Mortgage Calculator без копіювання;
- виділити console, report і calculator responsibilities;
- застосувати цей підхід до `Personal Finance CLI`;
- створити `Console`, `FinanceService` і `ReportPrinter`;
- перевірити, що business logic працює без console input.

**Результат:** UI відокремлений від розрахунків.

### День 14. Контрольна робота №2

**Практика:**

- за 3 години створити `Library CLI`;
- сутності: book, member, loan;
- реалізувати checkout і return із перевіркою правил;
- не використовувати public fields;
- після завершення провести рефакторинг і написати короткий README.

**Результат:** модель підтримує валідний стан і має чіткі responsibilities.

## Тиждень 3. Inheritance, interfaces та проєктування

### День 15. Inheritance та `Object`

**Курс:** Inheritance 1-6.

**Практика:**

- створити ієрархію `Transaction -> Income/Expense`;
- перевизначити `toString`;
- дослідити constructor chaining;
- перевірити package-private, protected і public access;
- визначити, чи справді inheritance кращий за composition у цій моделі.

**Результат:** письмове обґрунтування inheritance або composition.

### День 16. Casting, equality і polymorphism

**Курс:** Inheritance 7-10.

**Практика:**

- правильно реалізувати `equals` і `hashCode` для value object `Money`;
- показати upcasting і ризик downcasting;
- обробити різні типи транзакцій поліморфно;
- створити abstract class або interface для report generation;
- перевірити рівність об'єктів у `HashSet`.

**Результат:** рівні об'єкти мають однаковий hash code.

### День 17. Межі inheritance

**Курс:** Inheritance 11-15.

**Практика:**

- використати `final` там, де extension небажаний;
- замінити глибоку навчальну ієрархію composition;
- порівняти abstract class та interface;
- розв'язати quiz курсу без конспекту;
- написати 10 власних запитань із відповідями.

**Результат:** таблиця вибору між inheritance, composition та interface.

### День 18. Interfaces і dependency injection

**Курс:** Interfaces 1-8.

**Практика:**

- створити `TransactionRepository`;
- реалізувати in-memory repository;
- передати repository в service через constructor injection;
- окремо спробувати setter і method injection;
- пояснити, чому constructor injection є стандартним вибором.

**Результат:** `FinanceService` залежить від abstraction.

### День 19. ISP і MyTube

**Курс:** Interfaces 9-11.

**Практика:**

- виконати MyTube самостійно;
- знайти fat interface і розділити його за ISP;
- створити fake implementations для тестового запуску;
- намалювати dependency diagram;
- перенести ISP-підхід у Finance CLI.

**Результат:** жоден implementation не залежить від непотрібних методів.

### День 20. Сучасні можливості interfaces

**Курс:** Interfaces 12-18.

**Практика:**

- дослідити fields, static, default і private methods;
- створити два варіанти report generator;
- додати вибір реалізації під час запуску;
- завершити quiz;
- провести code review усіх OOP-класів.

**Результат:** взаємозамінні implementations працюють через один contract.

### День 21. OOP mini-project

**Практика:**

- створити систему повідомлень із Email, SMS та Console channels;
- додати template formatter і delivery service;
- використати interfaces, constructor injection і polymorphism;
- уникати `if`/`switch` за типом implementation;
- намалювати UML class diagram.

**Результат:** новий notification channel додається без зміни delivery service.

## Тиждень 4. Exceptions, generics і collections

### День 22. Основи exceptions

**Курс:** Exceptions 1-7.

**Практика:**

- створити приклади checked, unchecked і error;
- обробити некоректний ввід у Finance CLI;
- використати кілька `catch` блоків і `finally`;
- не приховувати exception порожнім `catch`;
- пояснити exception hierarchy.

**Результат:** UI показує зрозуміле повідомлення, а причина помилки не губиться.

### День 23. Resources і custom exceptions

**Курс:** Exceptions 8-13.

**Практика:**

- прочитати транзакції з CSV через try-with-resources;
- створити `InvalidTransactionException`;
- застосувати rethrow та exception chaining;
- відрізнити validation error від technical error;
- додати 5 негативних сценаріїв.

**Результат:** ресурси закриваються, exceptions мають корисні повідомлення.

### День 24. Generic classes

**Курс:** Generics 1-7.

**Практика:**

- реалізувати `Box<T>` і `Pair<K,V>`;
- перетворити in-memory repository на generic repository;
- застосувати bounded type parameter;
- перевірити роботу з wrapper types;
- пояснити type erasure.

**Результат:** repository повторно використовується для різних сутностей.

### День 25. Generic methods і wildcards

**Курс:** Generics 8-13.

**Практика:**

- реалізувати generic `max`;
- використати `Comparable`;
- написати приклади `? extends` і `? super`;
- сформулювати правило PECS;
- створити generic utility для друку колекцій.

**Результат:** 8 невеликих прикладів компілюються, а небезпечні варіанти
задокументовані.

### День 26. Iterable, Iterator і Collection

**Курс:** Collections 1-6.

**Практика:**

- реалізувати власну колекцію з `Iterable`;
- написати iterator;
- пройти її через for-each;
- порівняти array і `Collection`;
- оцінити часову складність базових операцій.

**Результат:** власний iterator коректно завершує обхід.

### День 27. List, Queue, Set і Map

**Курс:** Collections 7-14.

**Практика:**

- зберігати транзакції в `List`;
- знайти унікальні категорії через `Set`;
- побудувати total by category через `Map`;
- створити чергу платежів через `Queue`;
- сортувати через `Comparable` і `Comparator`.

**Результат:** таблиця вибору collection за задачею та складністю операцій.

### День 28. Контрольна робота №3

**Практика:**

- імпортувати транзакції з CSV;
- відхиляти невалідні рядки, не припиняючи весь імпорт;
- групувати помилки за причиною;
- знаходити дублікати через `Set`;
- формувати звіт через `Map`;
- використати custom exception і generic result container.

**Результат:** звіт містить imported, rejected і duplicate records.

## Тиждень 5. Lambdas, Streams і concurrency

### День 29. Functional interfaces і lambdas

**Курс:** Lambda Expressions 1-7.

**Практика:**

- переписати anonymous classes як lambdas;
- створити власний functional interface;
- використати variable capture;
- застосувати method references;
- визначити випадки, де звичайний метод читабельніший.

**Результат:** 10 коротких прикладів і пояснення effectively final.

### День 30. Вбудовані functional interfaces

**Курс:** Lambda Expressions 8-17.

**Практика:**

- використати `Consumer`, `Supplier`, `Function`, `Predicate`;
- скомбінувати predicates для фільтра транзакцій;
- створити pipeline normalizing functions;
- застосувати `UnaryOperator` і `BinaryOperator`;
- прибрати непотрібні loops із report code.

**Результат:** фільтри комбінуються без дублювання.

### День 31. Основи Streams

**Курс:** Streams 1-9.

**Практика:**

- створювати streams із collection, array і generator;
- застосувати map, filter, limit, skip, sorted, distinct і peek;
- отримати витрати певної категорії;
- знайти top-5 транзакцій;
- не змінювати source collection усередині pipeline.

**Результат:** 10 запитів до даних через Stream API.

### День 32. Reduction і collectors

**Курс:** Streams 10-16.

**Практика:**

- обчислити total через reduce;
- зібрати результати в list, set і map;
- згрупувати за категорією;
- partition by income/expense;
- використати primitive streams для статистики.

**Результат:** місячний фінансовий звіт будується Stream API.

### День 33. Threads і race conditions

**Курс:** Concurrency 1-9.

**Практика:**

- створити та запустити кілька threads;
- використати sleep, join та interrupt;
- відтворити race condition на shared counter;
- пояснити visibility й atomicity;
- спробувати confinement як перше рішення.

**Результат:** race condition стабільно відтворена й задокументована.

### День 34. Thread safety

**Курс:** Concurrency 10-19.

**Практика:**

- виправити counter через lock, synchronized та atomic type;
- порівняти approaches;
- створити producer/consumer example;
- використати concurrent collection;
- перевірити програму під навантаженням.

**Результат:** фінальний counter стабільно має очікуване значення.

### День 35. Executors і Future

**Курс:** Executive Framework 1-6.

**Практика:**

- створити fixed thread pool;
- виконати `Runnable` і `Callable`;
- отримати результат із `Future`;
- коректно завершити executor;
- порівняти thread-per-task і pool.

**Результат:** паралельна обробка набору файлів із контрольованим pool.

## Тиждень 6. CompletableFuture і завершення Core Java

### День 36. CompletableFuture basics

**Курс:** Executive Framework 7-11.

**Практика:**

- створити async API;
- використати completion callbacks;
- трансформувати результат;
- обробити exception;
- вивести назви threads для кожного stage.

**Результат:** async pipeline не блокує main thread до моменту отримання
фінального результату.

### День 37. Composition, combination і timeout

**Курс:** Executive Framework 12-16.

**Практика:**

- застосувати compose та combine;
- дочекатися багатьох tasks;
- отримати перший результат;
- встановити timeout і fallback;
- пояснити різницю між `thenApply` та `thenCompose`.

**Результат:** 5 робочих сценаріїв CompletableFuture.

### День 38. Best Price Finder

**Курс:** Executive Framework 17-20.

**Практика:**

- спочатку реалізувати проєкт самостійно;
- запитувати ціни паралельно;
- обробляти падіння одного provider;
- додати timeout;
- виміряти sequential та parallel execution time.

**Результат:** один повільний або несправний provider не ламає весь результат.

### День 39. Тести Core Java

**Додаткова тема:** JUnit 5.

**Практика:**

- вивчити test structure, assertions і parameterized tests;
- додати тести для `Money`, `Transaction` і `FinanceService`;
- перевірити positive, negative та boundary cases;
- використовувати Arrange-Act-Assert;
- запустити всі тести через Maven.

**Результат:** не менше 20 змістовних unit tests.

### День 40. Алгоритми та складність

**Додаткова тема:** Big O, arrays, strings, hash maps.

**Практика:**

- оцінити складність пошуку, сортування та вкладених loops;
- розв'язати Two Sum, valid parentheses і frequency counter;
- реалізувати binary search;
- пояснити trade-off time/space;
- не використовувати Stream API в алгоритмічних задачах.

**Результат:** 4 задачі з тестами й аналізом складності.

### День 41. Завершення Personal Finance CLI

**Практика:**

- завершити всі основні use cases;
- додати CSV import/export;
- додати monthly report;
- покрити business logic тестами;
- підготувати README, приклади запуску та список рішень.

**Результат:** проєкт можна клонувати, зібрати та запустити за README.

### День 42. Core Java assessment

**Практика:**

- 60 хвилин: письмово відповісти на 30 запитань;
- 90 хвилин: розв'язати 2 алгоритмічні задачі;
- 90 хвилин: пояснити й покращити незнайомий Java-код;
- 60 хвилин: усно презентувати Finance CLI;
- скласти список слабких тем на повторення.

**Результат:** не менше 75% правильних відповідей і робочі задачі.

## Тиждень 7. Spring Boot і Dependency Injection

### День 43. Старт Spring Boot

**Курс:** Spring Boot Fundamentals, Introduction і Getting Started 1-6.

**Практика:**

- створити `job-tracker-api`;
- дослідити `pom.xml` та project structure;
- пояснити starter, auto-configuration і embedded server;
- налаштувати application properties;
- створити профілі `dev` і `test`.

**Результат:** застосунок запускається з різними profiles.

### День 44. Перший controller

**Курс:** Getting Started 7-12.

**Практика:**

- створити health/welcome endpoints;
- запустити й debug Spring Boot application;
- перевірити endpoints через curl або Postman;
- дослідити generated JAR;
- описати request lifecycle.

**Результат:** endpoint повертає JSON і правильний status code.

### День 45. Dependency Injection

**Курс:** Dependency Injection 1-7.

**Практика:**

- створити service і repository interfaces;
- використати constructor injection;
- дослідити IoC container;
- створити дві bean implementations;
- вибрати implementation через qualifier або primary.

**Результат:** controller не створює dependencies через `new`.

### День 46. Configuration і beans

**Курс:** Dependency Injection 8-10.

**Практика:**

- виконати Notification Service;
- externalize configuration;
- створити type-safe configuration properties;
- оголосити third-party-style bean через Java config;
- не зберігати secrets у Git.

**Результат:** конфігурація змінюється без перекомпіляції.

### День 47. Scope і lifecycle

**Курс:** Dependency Injection 11-15.

**Практика:**

- дослідити lazy initialization;
- порівняти singleton і prototype;
- додати lifecycle hooks лише в навчальному прикладі;
- виконати User Registration Service;
- перевірити кількість створених bean instances.

**Результат:** пояснення scope і ризику mutable state у singleton.

### День 48. HTTP і REST

**Додаткова тема.**

**Практика:**

- вивчити methods, headers, body, status codes та idempotency;
- зіставити CRUD operations з HTTP methods;
- спроєктувати URL для Job Tracker;
- визначити request/response DTO;
- скласти API contract до написання controller.

**Результат:** `api-design.md` із ресурсами, endpoint-ами й status codes.

### День 49. Spring review project

**Практика:**

- створити in-memory CRUD для companies;
- розділити controller, service і repository;
- використати constructor injection;
- додати dev/test configuration;
- перевірити всі endpoints вручну.

**Результат:** перший vertical slice `Company` працює без бази даних.

## Тиждень 8. SQL, PostgreSQL, JPA та Flyway

### День 50. SQL fundamentals

**Додаткова тема.**

**Практика:**

- створити таблиці company, vacancy та application;
- виконати `SELECT`, `INSERT`, `UPDATE`, `DELETE`;
- використати WHERE, ORDER BY, LIMIT та aggregate functions;
- написати 15 SQL-запитів;
- пояснити primary key, foreign key, unique і not null.

**Результат:** SQL-скрипт схеми та запитів зберігається в репозиторії.

### День 51. Relational design і JOIN

**Додаткова тема.**

**Практика:**

- нормалізувати модель Job Tracker;
- створити one-to-many і many-to-many relations;
- написати INNER та LEFT JOIN;
- знайти applications без interviews;
- порахувати applications за company і status.

**Результат:** ER diagram і 10 JOIN queries.

### День 52. JDBC, JPA і Flyway

**Курс:** Database Integration 1-6.5.

**Практика:**

- порівняти JDBC, JPA і Spring Data JPA;
- підключити PostgreSQL або навчальну БД курсу;
- створити першу Flyway migration;
- змінити schema новою migration;
- ніколи не редагувати вже застосовану migration.

**Результат:** порожня база відтворюється всіма migrations.

### День 53. Entities

**Курс:** Database Integration 7-7.3.

**Практика:**

- створити `Company`, `Vacancy`, `Application` entities;
- налаштувати id generation і column constraints;
- не використовувати Lombok без розуміння generated methods;
- відокремити entity від API DTO;
- перевірити створені таблиці.

**Результат:** entities відповідають migration schema.

### День 54. JPA relationships

**Курс:** Database Integration 7.4-7.11.

**Практика:**

- створити one-to-many, many-to-many та one-to-one examples;
- додати `Skill` та `Interview`;
- визначити owning side;
- уникнути recursive `toString`/JSON;
- створити migration для всіх relations.

**Результат:** relations зберігаються і читаються без нескінченної рекурсії.

### День 55. Repositories і transactions

**Курс:** Database Integration 8-8.4.

**Практика:**

- створити Spring Data repositories;
- реалізувати create application use case;
- дослідити entity states;
- позначити business transaction через `@Transactional`;
- перевірити rollback при exception.

**Результат:** частково виконана операція не залишається в базі.

### День 56. Fetching і related entities

**Курс:** Database Integration 8.5-8.9.

**Практика:**

- порівняти LAZY та EAGER;
- відтворити `LazyInitializationException` у навчальному тесті;
- зберігати та видаляти related entities;
- налаштувати cascade лише там, де ownership це виправдовує;
- перевірити SQL logs.

**Результат:** задокументоване рішення щодо fetching і cascade для кожного relation.

## Тиждень 9. Advanced JPA і Spring MVC

### День 57. Derived та custom queries

**Курс:** Database Integration 9-9.3.

**Практика:**

- створити derived queries за status, company і date;
- написати JPQL через `@Query`;
- створити projection для application summary;
- порівняти entity та projection result;
- додати repository tests.

**Результат:** щонайменше 8 queries з тестами.

### День 58. EntityGraph і N+1

**Курс:** Database Integration 9.4-9.7.

**Практика:**

- відтворити N+1;
- порахувати виконані SQL queries;
- виправити проблему через fetch join або `@EntityGraph`;
- порівняти результат;
- не робити всі relations EAGER.

**Результат:** конкретний тест або log демонструє усунення N+1.

### День 59. Dynamic queries

**Курс:** Database Integration 10-10.3.

**Практика:**

- реалізувати filtering applications;
- порівняти Query by Example, Criteria API та Specifications;
- обрати Specifications для composable filters;
- підтримати optional company, status і date range;
- протестувати комбінації filters.

**Результат:** filters комбінуються без множини окремих repository methods.

### День 60. Sorting і pagination

**Курс:** Database Integration 10.4-11.

**Практика:**

- додати pageable query;
- обмежити допустимі sort fields;
- повернути page metadata;
- перевірити першу, середню, останню та порожню page;
- завершити JPA section review.

**Результат:** великі списки не завантажуються повністю.

### День 61. Spring MVC

**Курс:** REST API Development, Getting Started та Introduction to Spring MVC.

**Практика:**

- пояснити web request lifecycle;
- створити простий MVC example;
- створити JSON API endpoint;
- порівняти `@Controller` і `@RestController`;
- перевірити content type та status.

**Результат:** схема Client -> DispatcherServlet -> Controller -> Service.

### День 62. REST controllers і DTO

**Курс:** Building RESTful APIs 1-8.

**Практика:**

- створити Company endpoints;
- використовувати правильні status codes;
- додати request/response DTO;
- налаштувати MapStruct або manual mapper;
- не повертати JPA entity з controller.

**Результат:** persistence model не витікає в API contract.

### День 63. Query parameters і product exercise

**Курс:** Building RESTful APIs 9-10.

**Практика:**

- виконати product exercise;
- додати Job Tracker search parameters;
- нормалізувати й валідовувати filters;
- поєднати controller params із JPA specifications;
- додати pagination links або metadata.

**Результат:** `/applications` підтримує filtering, sorting і pagination.

## Тиждень 10. CRUD, validation і Shopping Cart

### День 64. Request data і CRUD

**Курс:** Building RESTful APIs 11-18.

**Практика:**

- реалізувати create, update і delete для vacancies;
- прочитати headers і body;
- додати partial action-based status update;
- повертати `201 Created` із location;
- обробити nonexistent resource.

**Результат:** повний Vacancy CRUD відповідає HTTP semantics.

### День 65. Validation

**Курс:** Validating API Requests 1-3.

**Практика:**

- додати Jakarta Validation до DTO;
- перевірити required fields, size, URL і dates;
- сформувати стабільний error response;
- не дублювати validation у controller;
- написати негативні API tests.

**Результат:** невалідний request повертає `400` і список field errors.

### День 66. Global errors і business rules

**Курс:** Validating API Requests 4-7.

**Практика:**

- створити global exception handler;
- реалізувати custom validation;
- заборонити нелогічний перехід status;
- розрізняти `400`, `401`, `403`, `404` і `409`;
- додати correlation-friendly error fields без stack trace для client.

**Результат:** усі API errors мають один формат.

### День 67. Shopping Cart, частина 1

**Курс:** Capstone Shopping Cart 1-6.

**Практика:**

- пройти таблиці, entities, create cart та add product;
- спочатку реалізовувати кожен крок самостійно;
- перевірити quantity і product availability;
- порівняти з рішенням курсу;
- виписати reusable design ideas.

**Результат:** cart створюється, товар додається й читається.

### День 68. Shopping Cart, частина 2

**Курс:** Capstone Shopping Cart 7-12.

**Практика:**

- update, remove і clear cart;
- виділити service;
- провести OOP refactoring;
- документувати API зі Swagger;
- перенести підхід до Job Tracker.

**Результат:** Swagger UI показує contract і приклади.

### День 69. Testing Spring applications

**Додаткова тема:** JUnit 5, Mockito, MockMvc.

**Практика:**

- unit test service з mocked repository;
- controller test через MockMvc;
- repository test;
- перевірити happy path, validation і not found;
- не тестувати private methods напряму.

**Результат:** test pyramid для одного complete feature.

### День 70. Integration testing

**Практика:**

- створити integration test від HTTP до database;
- використовувати окремий test profile;
- перевірити migrations у test environment;
- уникати залежності тестів від порядку запуску;
- сформувати test data builders або fixtures.

**Результат:** `mvn test` відтворювано проходить з чистого стану.

## Тиждень 11. Security, orders і payment architecture

### День 71. Spring Security basics

**Курс:** Securing APIs 1-6.

**Практика:**

- пояснити authentication та authorization;
- додати Spring Security;
- налаштувати public і protected routes;
- hash passwords;
- почати login API.

**Результат:** пароль ніколи не зберігається і не повертається як plain text.

### День 72. AuthenticationManager і JWT

**Курс:** Securing APIs 7-12.

**Практика:**

- завершити authentication;
- генерувати й валідовувати JWT;
- винести secret у environment;
- дослідити security filter chain;
- реалізувати JWT filter.

**Результат:** protected endpoint доступний лише з валідним token.

### День 73. Current user і refresh tokens

**Курс:** Securing APIs 13-18.

**Практика:**

- отримати current user;
- додати потрібні claims;
- реалізувати refresh token;
- externalize JWT settings;
- протестувати expired, invalid і missing token.

**Результат:** access token оновлюється без повторного введення пароля.

### День 74. Roles і logout

**Курс:** Securing APIs 19-24.

**Практика:**

- додати roles `USER` і `ADMIN`;
- налаштувати role-based authorization;
- відрефакторити JWT service;
- реалізувати logout/revocation за підходом курсу;
- перевірити різницю між `401` і `403`.

**Результат:** authorization rules покриті integration tests.

### День 75. Checkout and Orders

**Курс:** Checkout and Order APIs 1-5.

**Практика:**

- створити tables та entities;
- реалізувати transactional checkout;
- організувати Postman collection;
- перевірити rollback;
- перенести transactional thinking у Job Tracker bulk operation.

**Результат:** checkout або завершується повністю, або відкочується.

### День 76. Orders і refactoring

**Курс:** Checkout and Order APIs 6-10.

**Практика:**

- покращити error handling;
- виділити service;
- створити get orders і get order;
- перевірити ownership: користувач не бачить чужі orders;
- провести security review.

**Результат:** object-level authorization перевіряється в service.

### День 77. Payment processing

**Курс:** Payment Processing 1-6.

**Практика:**

- зрозуміти checkout flow;
- створити payment abstraction;
- інтеграцію Stripe виконувати лише з test credentials;
- обробити provider errors;
- не прив'язувати business service до Stripe SDK.

**Результат:** payment provider можна замінити fake implementation у тестах.

## Тиждень 12. Webhooks, deployment і вихід на ринок

### День 78. Webhooks і feature packaging

**Курс:** Payment Processing 7-12.

**Практика:**

- реалізувати та протестувати webhook;
- перевірити signature;
- зробити handler idempotent;
- оновити order status;
- організувати код by feature та завершити refactoring.

**Результат:** повторна webhook-подія не дублює операцію.

### День 79. Deployment fundamentals

**Курс:** Deployment 1-6.

**Практика:**

- підготувати production database concept;
- налаштувати profiles;
- зібрати production JAR;
- перевірити запуск лише через environment configuration;
- підготувати репозиторій до CI/deployment.

**Результат:** застосунок збирається командою Maven і не залежить від IDE.

### День 80. Production configuration

**Курс:** Deployment 7-13.

**Практика:**

- налаштувати production environment variables;
- створити Postman environments;
- переглянути security rules;
- модульно організувати security config;
- скласти checklist logging, monitoring і health checks.

**Результат:** secrets відсутні в Git, production checklist додано в README.

### День 81. Docker

**Додаткова тема.**

**Практика:**

- створити Dockerfile для Job Tracker;
- створити Docker Compose для application і PostgreSQL;
- використати environment variables;
- перевірити health та persistent data;
- задокументувати команди запуску й зупинки.

**Результат:** проєкт запускається однією командою Docker Compose.

### День 82. Фіналізація портфоліо

**Практика:**

- завершити Job Application Tracker;
- видалити dead code і виправити naming;
- запустити всі тести;
- додати ER diagram, architecture diagram та API examples;
- оформити README англійською;
- перевірити історію commits і відсутність secrets.

**Результат:** сторонній розробник може запустити й перевірити API за README.

### День 83. Підготовка до співбесіди

**Практика:**

- підготувати 2-хвилинну самопрезентацію англійською та німецькою;
- пояснити Java memory, OOP, collections, exceptions, streams і concurrency;
- пояснити DI, REST, JPA, transactions, security та testing;
- розв'язати 2 прості алгоритмічні задачі вголос;
- провести mock interview і записати слабкі відповіді.

**Результат:** банк із 100 запитань і коротких відповідей.

### День 84. CV, GitHub і план пошуку роботи

**Практика:**

- створити односторінкове CV німецькою або англійською;
- описувати результати проєктів, а не лише перелік технологій;
- закріпити 2 найкращі repositories у GitHub;
- підготувати шаблон Anschreiben без масового однакового розсилання;
- створити таблицю відстеження вакансій;
- відібрати перші 10 релевантних вакансій і адаптувати CV під ключові вимоги.

**Результат:** готові CV, GitHub profile, application tracker і перша хвиля
якісних заявок.

## 5. Щотижнева перевірка прогресу

Наприкінці кожного тижня виставити собі оцінку від 0 до 2 за кожним пунктом:

| Критерій | 0 | 1 | 2 |
|---|---|---|---|
| Розуміння | Не можу пояснити | Пояснюю з підказками | Пояснюю самостійно |
| Практика | Завдання не працює | Працює частково | Працює та перевірене |
| Самостійність | Копіював рішення | Потрібні значні підказки | Виконав самостійно |
| Якість коду | Сильне дублювання | Потрібен рефакторинг | Читабельний структурований код |
| Тести | Відсутні | Лише happy path | Є негативні й boundary cases |
| Git | Немає історії | Великі нечіткі commits | Малі змістовні commits |

Якщо результат нижче **9 із 12**, не прискорювати курс. Наступний день
повторення використати для закриття прогалин.

## 6. Мінімальні вимоги до готовності подаватися на вакансії

Перед активною подачею на Junior Java Backend вакансії треба вміти:

- написати Java-програму без постійного копіювання;
- пояснити OOP, interfaces, collections, generics, exceptions і streams;
- написати простий SQL query з `JOIN`, grouping і pagination;
- створити Spring Boot REST API за шарами controller/service/repository;
- працювати з DTO, validation, error handling і status codes;
- створити JPA relations і пояснити LAZY/EAGER, N+1 та transactions;
- реалізувати базову authentication/authorization;
- написати unit та integration tests;
- користуватися Git, Maven, Postman, Docker і debugger;
- пояснити архітектуру власного проєкту та прийняті trade-offs;
- прочитати stack trace і системно знайти помилку;
- комунікувати про технічну задачу англійською; для німецькомовних вакансій
  системно покращувати німецьку.

Не потрібно чекати ідеального знання всіх тем. Подачу на вакансії варто
починати після готовності Job Tracker MVP, приблизно з 10-11 тижня, і
продовжувати паралельно з навчанням.

## 7. Режим після завершення 84 днів

До отримання роботи щоденний блок 5-6 годин розподіляється так:

- 90 хвилин: 2-4 адаптовані заявки;
- 60 хвилин: Java/Spring interview questions;
- 60 хвилин: алгоритми або SQL;
- 120 хвилин: покращення portfolio project чи новий feature;
- 30 хвилин: англійська/німецька технічна лексика;
- 30 хвилин: аналіз відповідей роботодавців і корекція CV.

Щотижневі цілі:

- 15-20 якісних, адаптованих заявок;
- 1 mock interview;
- 5 алгоритмічних задач;
- 10 SQL-запитів;
- 1 завершений portfolio feature;
- 1 перегляд CV/GitHub за отриманим feedback.

## 8. Рекомендована структура репозиторію

```text
CodeWithMosh/
├── CourseStructure.md
├── CourseProgramm.md
├── learning-journal.md
├── exercises/
│   ├── fundamentals/
│   ├── oop/
│   ├── advanced-java/
│   ├── sql/
│   └── algorithms/
├── personal-finance-cli/
└── job-application-tracker-api/
```

Навчальні приклади не треба змішувати з portfolio projects. У портфоліо має
бути чиста історія, зрозумілий README та лише код, який можна пояснити на
співбесіді.

## 9. Основні джерела для перевірки знань

- Java documentation: <https://docs.oracle.com/en/java/>
- Spring Boot documentation: <https://docs.spring.io/spring-boot/>
- Spring Security documentation: <https://docs.spring.io/spring-security/>
- PostgreSQL documentation: <https://www.postgresql.org/docs/>
- Docker documentation: <https://docs.docker.com/>
- JUnit 5 documentation: <https://junit.org/junit5/docs/current/user-guide/>
- Maven documentation: <https://maven.apache.org/guides/>

Документація використовується як джерело істини, а відеокурс — як
структуроване пояснення та демонстрація.
