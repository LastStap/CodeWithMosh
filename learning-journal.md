# Learning Journal

## День 1. Стартова діагностика

Що таке Java? - Java це мова програмування, на якій написаний Minecraft, а також на ній пишуть backend до вебсайтів. Вона об'єктно орієнтована.

Чим Java відрізняється від JavaScript? - JavaScript не об'єктно орієнтована мова програмування з іншим синтаксисом та призначена для розв'язання інших задач.

Що робить компілятор? - Перетворює код, який написала людина у машинний код, який розуміє комп'ютер.

Що таке JVM? - Це віртуальна машина джави, на якій запускається код, написаний на джаві.

Для чого потрібен метод main? - це основний метод, який запускає програму.

Чим вихідний файл .java відрізняється від .class? - .java - це код, який пише людина, а інший - це скомпільований код.

Що таке Maven? - це архів дефолтних бібліотек для джави, для полегшення роботи програмісту.

Що таке Git repository? - це сховище git`а для мого проекту.

Чим git add відрізняється від git commit? - git add додає всі зміни до репозиторію, а git commit зберігає ці зміни.

Як ти зазвичай шукаєш причину помилки в програмі? - читаю помилку в консолі, потім або зразу вмикаю debug, або продивляюсь імовірні файли на основі тексту помилки.

----

Java syntax; - 4 вчу джаву вже рік (неактивно)
робота з IntelliJ IDEA; - 4 (Багато працював в ній)
робота з терміналом; - 4 (Знаю основи)
Maven; - 3 (Знаю основи)
Git; - 4 (Знаю основи)
читання повідомлень про помилки; - 4 (Багато читав)
технічна англійська. - 5 (Просто розумію і можу говорити на англ, також читаю документацію на англ мові)

----------------
## День 1. Конспект курсу

| Поняття | Що це | Для чого потрібно |
|---|---|---|
| Source code | Вихідний код програми, написаний людиною у файлі `.java` | Для опису логіки програми мовою Java |
| Compiler | Програма `javac`, яка перетворює Java-код на bytecode | Для створення `.class`-файлів, які може виконати JVM |
| Bytecode | Проміжні інструкції у `.class`-файлі, а не машинний код конкретного процесора | Для виконання однієї програми різними реалізаціями JVM |
| JDK | Набір для розробки, який містить компілятор, інструменти та середовище виконання | Для написання, компіляції та запуску Java-програм |
| JVM | Віртуальна машина, яка завантажує та виконує Java-bytecode | Для виконання `.class`-файлів на конкретній операційній системі |
| JRE | JVM і бібліотеки, необхідні для виконання Java-програм | Для запуску Java-програм без повного набору інструментів розробника |
| `class` | Ключове слово для оголошення класу | Для опису нового типу, його стану та поведінки |
| `main` | Стандартна точка входу `public static void main(String[] args)` | JVM викликає цей метод для початку виконання звичайної Java-програми |
| `System.out.println` | Метод, який виводить значення у стандартний потік виводу та додає новий рядок | Для показу тексту й інших значень у консолі |

-------------------

HelloDeveloper.java - java файл
|
| javac - компілятор компілює файл в байткод
v
HelloDeveloper.class - скомпільований файл
|
| java / JVM - скомпільований файл запускається на віртуальній машині джави 
v
Результат у консолі

-----------------

Чому .class не є звичайним текстовим Java-кодом? - тому що він скомпільований у двійковий формат.

Яку роль виконує JVM під час запуску? - вона завантажує .class файли та виконує їхній байткод.

Чому Java-програму можна запускати на різних операційних системах? - тому що байткод виконується JVM.

Чи входить компілятор javac до JVM? - Ні, до jdk

Що станеться, якщо в програмі немає коректного методу main? - програма не запуститься.

-------
pwd  -  /home/laststap/IdeaProjects/CodeWithMosh

java -version  -  openjdk version "25.0.1" 2025-10-21 LTS

javac -version - javac 25.0.1

mvn -version - Apache Maven 3.9.10

git --version  -  git version 2.54.0

git status  -  modified:   learning-journal.md

active Git branch - main

-----

- `pom.xml` - це головний конфігураційний файл Maven-проєкту
- `src/main/java` - основна директорія проекту, де лежать всі основні файли
- `src/test/java` -  директорія для всіх тестів
- `target` - це директорія скомпільованого проекту


-------------------


groupId -  daniil.dumshenko

artifactId - CodeWithMosh

version - 1.0-SNAPSHOT

maven.compiler.source - 25

maven.compiler.target - 25

test dependency - junit

-------------------

java: ';' expected

-------------------

## День 1. Завдання 4.2 та 4.3

### Що створила `mvn compile`

Maven прочитав `pom.xml`, знайшов усі `.java` файли в `src/main/java`, запустив `javac` і поклав скомпільований `.class` файл у `target/classes`. По суті — це автоматизований `javac` з правильними параметрами.

### Навіщо `-cp target/classes`

`-cp` (classpath) — це вказівка JVM, де шукати скомпільовані класи. Без цього JVM не знає, де лежить `HelloDeveloper.class`. `target/classes` — директорія, куди Maven поклав результат компіляції.

### Чому повне ім'я `daniil.dumshenko.previousLessons.HelloDeveloper`

Тому що клас має `package daniil.dumshenko`. JVM шукає файл за шляхом `daniil/dumshenko/HelloDeveloper.class` відносно classpath. Якщо написати просто `HelloDeveloper` — JVM не знайде клас, бо він не в кореневому пакеті.

### Порівняння трьох способів запуску

IntelliJ IDEA:
- Автоматично: компіляція, пошук classpath, запуск, виведення в консоль
- Вручну: натиснути Run

Maven (`mvn compile` + `java`):
- Автоматично: пошук усіх `.java` файлів, classpath, розміщення в `target/`
- Вручну: написати дві команди

Ручний `javac`:
- Автоматично: `javac` компілює вказаний source code у bytecode.
- Вручну: викликати компілятор, указати шлях до файла та директорію виводу (`-d`), а потім окремо запустити клас із правильним classpath і повним ім'ям.

Коротко:
- IDEA — все за тебе, ти лише пишеш код.
- Maven — автоматизує компіляцію, але запуск все одно вручну.
- `javac` — повний контроль, але кожен крок вручну.

(у цих завданнях мені допомогла ai)

-----------------


Який файл є source code? - HelloDeveloper.java

Який файл містить bytecode? - HelloDeveloper.class

Яка команда компілює source code? - Безпосередньо це робить `javac`. Команда `mvn compile` запускає компіляцію через Maven.

Яка команда запускає клас у JVM? - java -cp /tmp/codewithmosh-day1 daniil.dumshenko.previousLessons.HelloDeveloper

Чим Maven допоміг порівняно з ручним javac? - Він сам знайшов усі джава файли

---------------

## День 1. Уточнення після навчання

1. **Що входить до JDK?** До JDK входять компілятор `javac`, JVM, стандартні бібліотеки та інші інструменти для розробки Java-програм.
2. **Яка різниця між JDK, JVM і JRE?** JDK потрібен для розробки й містить інструменти компіляції та запуску. JRE містить JVM і бібліотеки для виконання програми. JVM безпосередньо завантажує та виконує bytecode.
3. **Як `.java` перетворюється на `.class`?** Компілятор `javac` перевіряє source code і перетворює його на Java-bytecode у `.class`-файлі.
4. **Що робить команда `java`?** Вона запускає JVM, знаходить указаний клас у classpath і викликає коректний метод `public static void main(String[] args)`.
5. **Що Maven зробив під час `mvn compile`?** Maven прочитав `pom.xml`, визначив параметри компіляції, знайшов source code, викликав Java-компілятор і розмістив `.class`-файли в `target/classes`.

### Виправлення початкових відповідей

- JavaScript також підтримує об'єктно-орієнтоване програмування, але використовує прототипну модель об'єктів і суттєво відрізняється від Java.
- Java-компілятор створює Java-bytecode, а не машинний код конкретного процесора.
- Maven — це інструмент автоматизації збірки та керування залежностями, а не архів бібліотек.
- `git add` додає вибрані зміни до staging area, а `git commit` зберігає підготовлений snapshot в історії репозиторію.

---------------
Я завершив день 1, просто не написав всього.
## День 2. Повторення

Який шлях проходить HelloDeveloper.java до результату в консолі?
Спочатку компілятор компілює HelloDeveloper.java у HelloDeveloper.class, потім JVM безпосередньо завантажує та виконує bytecode.

Чим JDK відрізняється від JVM?
у JDK входять компілятор, JVM, стандартні бібліотеки та інші інструменти.

Що створює javac?
bytecode, .class файли

Для чого команді java потрібен classpath?
це шлях, де JVM шукає скомпільовані класи

Яка стандартна сигнатура точки входу Java-програми?
public static void main(String[] args) {}

---------------

До запуску коду передбач результат кожного фрагмента:

```java
int age = 25;
age = 26;
System.out.println(age);
```
result: 26

```java
int result = 5 / 2;
System.out.println(result);
```
result: 2

```java
double result = 5 / 2;
System.out.println(result);
```
result: 2.0

```java
double result = 5.0 / 2;
System.out.println(result);
```
result: 2.5

```java
char letter = 'A';
System.out.println(letter);
```
result: A

---------------------

| Тип | Що зберігає | Приклад | Коли обрати    |
|---|-------------|--|----------------|
| `byte` | 1 байт      | byte age = 25; | Майже не використовується |
| `short` |   2 байти          | short year = 2025; |      використовується, коли потрібна економія пам'яті          |
| `int` |      Цілі числа (4 байти)       | int count = 1000; |       Стандартний вибір для більшості цілих чисел         |
| `long` |      Великі цілі числа (8 байт)       | long population = 8000000000L; |      Коли int може бути замалим          |
| `float` |      Дробові числа одинарної точності (4 байти)       | float price = 19.99f; |         коли важлива економія пам'яті       |
| `double` |     Дробові числа подвійної точності (8 байт)        | double pi = 3.14159; |           Стандартний вибір для дробових чисел     |
| `char` |       Один символ Unicode (2 байти)      | char grade = 'A'; |     Для зберігання окремих символів           |
| `boolean` |       Логічне значення true або false      | boolean isActive = true; |     Для умов та логічних перевірок           |

--------------------------

1. Що безпосередньо зберігає primitive-змінна? - Значення, а не посилання на значення
2. Що концептуально зберігає reference-змінна? - посилання на значення
3. Чому `String` не є primitive type? - тому що це клас і він має методи
4. Чим одинарні лапки відрізняються від подвійних? - одинарні лапки використовуються для char, а подвійні лапки використовуються для String
5. Чому локальну змінну потрібно ініціалізувати перед читанням? - локальна змінна не отримує значення за замовчуванням
6. Що означає ключове слово `final`? - змінну, яку не можна переназначити
7. Чим declaration, initialization і assignment відрізняються між собою? - declaration це оголошення змінної, initialization це присвоєння значення змінній, а assignment це повторне призначення значення змінній

----------------------------

- `long` із суфіксом `L`; - 800000000L
- `float` із суфіксом `F`; - 1.56F
- читабельного числа з `_`; - 100_000_000
- символу `char`; - A
- рядка з `\n`; - "Hello \nWorld"
- рядка з `\t`; - "Hello \tWorld"
- рядка з `\"`; - "He said: \"Hello World\""
- Windows-шляху або іншого тексту з `\\`. - "C:\\Users\\Daniil\\Documents"

-----------------------

        // 1. int -> long
        int intValue1 = 100;
        long longValue = intValue1; // implicit casting
        System.out.println("1. int -> long");
        System.out.println("Casting: implicit");
        System.out.println("Predicted: 100");
        System.out.println("Actual: " + longValue);
        System.out.println("Information loss: no");
        System.out.println();

        // 2. int -> double
        int intValue2 = 100;
        double doubleValue = intValue2; // implicit casting
        System.out.println("2. int -> double");
        System.out.println("Casting: implicit");
        System.out.println("Predicted: 100.0");
        System.out.println("Actual: " + doubleValue);
        System.out.println("Information loss: no");
        System.out.println();

        // 3. double -> int
        double doubleValue2 = 10.99;
        int intValue3 = (int) doubleValue2; // explicit casting
        System.out.println("3. double -> int");
        System.out.println("Casting: explicit");
        System.out.println("Predicted: 10");
        System.out.println("Actual: " + intValue3);
        System.out.println("Information loss: yes, fractional part is lost");
        System.out.println();

        // 4. int -> byte у межах byte
        int intValue4 = 100;
        byte byteValue1 = (byte) intValue4; // explicit casting
        System.out.println("4. int -> byte within byte range");
        System.out.println("Casting: explicit");
        System.out.println("Predicted: 100");
        System.out.println("Actual: " + byteValue1);
        System.out.println("Information loss: possible in general, but not here");
        System.out.println();

        // 5. int -> byte поза межами byte
        int intValue5 = 130;
        byte byteValue2 = (byte) intValue5; // explicit casting
        System.out.println("5. int -> byte outside byte range");
        System.out.println("Casting: explicit");
        System.out.println("Predicted: -126");
        System.out.println("Actual: " + byteValue2);
        System.out.println("Information loss: yes");

---------------------

byte maximum = Byte.MAX_VALUE;
byte overflowed = (byte) (maximum + 1);
result: Maximum: -128

double sum = 0.1 + 0.2;
System.out.println(sum);
System.out.println(sum == 0.3);
result: 0.30000000000000004, false

--------------------

## День 2. Завдання 4.4. Пояснення вибору типів

| Змінна | Обраний тип | Чому цей тип |
|---|---|---|
| `args` | `String[]` | Це масив рядків, який Java передає в метод `main` як аргументи командного рядка. Це reference type. |
| `name` | `String` | Ім'я є текстом, тому потрібен рядок. `String` є reference type. |
| `fourname` | `String` | Прізвище є текстом, тому використано `String`. |
| `age` | `int` | Вік — це ціле число. `int` є стандартним вибором для більшості цілих чисел. |
| `height` | `float` | Зріст має дробову частину. `float` підходить для приблизного дробового значення, але менш точний за `double`. |
| `weight` | `double` | Вага має дробову частину. `double` є стандартним типом для дробових чисел у Java. |
| `firstNameLetter` | `char` | Зберігає один символ — першу літеру імені. |
| `studentStatus` | `boolean` | Зберігає логічне значення: студент чи ні. |
| `numberOfFinishedStudiedDays` | `byte` | Кількість завершених днів зараз маленька, тому `byte` підходить, але має малий діапазон. |
| `numberOfHours` | `short` | Кількість годин — ціле число, яке може бути більшим за `byte`, але ще не потребує `int`. |
| `roles` | `String` | Роль/опис є текстом, тому використано `String`. |
| `countries` | `String` | Назва країни є текстом, тому використано `String`. |
| `likedNumber` | `long` | Число дуже велике й не поміститься в `int`, тому потрібен `long` із суфіксом `L`. |
| `NUMBER_OF_MONTH_IN_YEAR` | `static final int` | Кількість місяців у році не повинна змінюватися. Це ціле число, тому `int`. |
| `NAME_OF_LEARNING_PROGRAMM` | `static final String` | Назва навчальної програми є текстом і не повинна змінюватися. |
| `NUMBER_OF_LEARNING_DAYS` | `static final int` | Загальна кількість навчальних днів не повинна змінюватися. Це ціле число, тому `int`. |

### 1. Які змінні є primitive?

Primitive-змінні:

- `age` — `int`
- `height` — `float`
- `weight` — `double`
- `firstNameLetter` — `char`
- `studentStatus` — `boolean`
- `numberOfFinishedStudiedDays` — `byte`
- `numberOfHours` — `short`
- `likedNumber` — `long`
- `NUMBER_OF_MONTH_IN_YEAR` — `int`
- `NUMBER_OF_LEARNING_DAYS` — `int`

### 2. Які змінні є reference?

Reference-змінні:

- `args` — `String[]`
- `name` — `String`
- `fourname` — `String`
- `roles` — `String`
- `countries` — `String`
- `NAME_OF_LEARNING_PROGRAMM` — `String`

`String` не є primitive type, бо це клас. Змінна типу `String` концептуально зберігає посилання на об'єкт рядка.

### 3. Які значення не повинні змінюватися?

Не повинні змінюватися значення, які оголошені через `final`:

- `NUMBER_OF_MONTH_IN_YEAR`
- `NAME_OF_LEARNING_PROGRAMM`
- `NUMBER_OF_LEARNING_DAYS`

Також логічно можна було б не змінювати такі значення, якщо профіль статичний:

- `name`
- `fourname`
- `firstNameLetter`
- `countries`

### 4. Де в програмі можливе переповнення або втрата точності?

Можливе переповнення:

- `byte numberOfFinishedStudiedDays` — тип `byte` має маленький діапазон. Якщо кількість днів стане більшою за `127`, може бути переповнення.
- `short numberOfHours` — якщо кількість годин стане дуже великою, `short` теж може переповнитися.
- `int age`, `NUMBER_OF_MONTH_IN_YEAR`, `NUMBER_OF_LEARNING_DAYS` — теоретично `int` теж може переповнитися, але для цих значень це майже нереально.
- `long likedNumber` — має великий діапазон, але теж має межу. Якщо число буде більше за максимальне значення `long`, буде помилка або переповнення при обчисленнях.

Можлива втрата точності:

- `float height = 1.9f;` — `float` зберігає дробові числа не абсолютно точно.
- `double weight = 111.5;` — `double` точніший за `float`, але також може мати проблеми з точністю для деяких десяткових дробів.

### 5. Чи є в коді число або текст, який краще зробити константою?

Так, у коді є значення, які краще зробити константами:

- `"================================"` — повторюється кілька разів, краще зробити константою, наприклад `SEPARATOR`.
- `"PERSONAL PROFILE"` — заголовок профілю, можна зробити константою `PROFILE_TITLE`.
- Тексти підписів у `System.out.println`, наприклад `"Name: "`, `"age: "`, `"height: "` — якщо вони часто повторювалися б або використовувалися в кількох місцях, їх теж можна було б винести в константи.
- Значення `10` у `NUMBER_OF_LEARNING_DAYS` вже правильно зроблено константою.
- Значення `12` у `NUMBER_OF_MONTH_IN_YEAR` вже правильно зроблено константою.

--------------------

/IdeaProjects/CodeWithMosh main +2 !6 ❯ java -cp target/classes daniil.dumshenko.previousLessons.PersonalProfile                                                                                                                                                                                                                              22:27:31
================================
PERSONAL PROFILE
================================
Name: Viktor
fourname: Yanukovich
age: 55
height: 1.9
weight: 111.5
first name: V
studentStatus: false
numberOfFinishedStudiedDays: 3
numberOfHours: 60
roles: loxpovniy
countries: Ukraine
likedNumber: 999999999999999999
Number of month: 12
Name of learning program: Kozachok
number of learning days: 10
remaining days: 7
special chars demo: tab:	here
newline above
"quoted"
backslash: \
================================

---------------------------

~/IdeaProjects/CodeWithMosh main +2 !6 ❯ mkdir -p /tmp/codewithmosh-day2                                                                                                                                                                                                                                                       22:27:31
javac -d /tmp/codewithmosh-day2 src/main/java/daniil/dumshenko/PersonalProfile.java
java -cp /tmp/codewithmosh-day2 daniil.dumshenko.previousLessons.PersonalProfile
================================
PERSONAL PROFILE
================================
Name: Viktor
fourname: Yanukovich
age: 55
height: 1.9
weight: 111.5
first name: V
studentStatus: false
numberOfFinishedStudiedDays: 3
numberOfHours: 60
roles: loxpovniy
countries: Ukraine
likedNumber: 999999999999999999
Number of month: 12
Name of learning program: Kozachok
number of learning days: 10
remaining days: 7
special chars demo: tab:	here
newline above
"quoted"
backslash: \
================================

--------------------

## День 2. Завдання 5.2. Перевірка compiler errors

1. **Присвоїв `double` змінній `int` без explicit cast**

Зміна в коді: `int brokenAge = 55.5;`

Головний рядок compiler error: `java: incompatible types: possible lossy conversion from double to int`

Причина: `double` може зберігати дробову частину, а `int` зберігає тільки ціле число. Java не робить таке перетворення автоматично, бо дробова частина може бути втрачена.

Виправлення: або зробити explicit cast `int brokenAge = (int) 55.5;`, або використати правильний тип `double brokenAge = 55.5;`.

2. **Присвоїв текст у подвійних лапках змінній `char`**

Зміна в коді: `char brokenLetter = "V";`

Головний рядок compiler error: `java: incompatible types: java.lang.String cannot be converted to char`

Причина: `char` зберігає один символ і записується в одинарних лапках. Подвійні лапки створюють `String`, навіть якщо всередині тільки один символ.

Виправлення: використати одинарні лапки `char brokenLetter = 'V';`, або якщо потрібен текст, тоді використати `String brokenLetter = "V";`.

3. **Спробував повторно присвоїти значення `final`-змінній**

Зміна в коді: `NUMBER_OF_LEARNING_DAYS = 20;`

Головний рядок compiler error: `java: cannot assign a value to final variable NUMBER_OF_LEARNING_DAYS`

Причина: `final` означає, що змінній можна присвоїти значення тільки один раз. Після ініціалізації її не можна переназначити.

Виправлення: прибрати повторне присвоєння й залишити тільки початкове значення `final int NUMBER_OF_LEARNING_DAYS = 10;`.

Висновок: `double` не можна автоматично присвоїти в `int`, бо можлива втрата точності; `char` і `String` — різні типи; `final`-змінну не можна змінювати після першого присвоєння. Після перевірки навмисні помилки в коді не залишені.

------------------------

Завдання 5.3. Фінальні команди - виконав.

--------------------

Назви 8 primitive types.
byte, short, int, long, float, double, char, boolean.
Чим primitive type відрізняється від reference type?
Primitive зберігає саме значення, а reference — посилання на об'єкт.
Чому String пишеться з великої літери?
Тому що String — це клас, а назви класів у Java пишуться з великої літери.

Коли Java виконує implicit casting?
Коли перетворення є безпечним, наприклад:

int a = 10;
long b = a;

Чим explicit casting може бути небезпечним?
Може призвести до втрати даних або точності.

double d = 10.9;
int i = (int) d; // 10
Чому byte може перейти з 127 до -128?
Через переповнення: byte має діапазон від -128 до 127.
Чому 0.1 + 0.2 може не дорівнювати точно 0.3?
Тому що float і double зберігають числа у двійковому форматі, де деякі десяткові дроби неможливо представити точно.
Для чого використовують final?
Щоб заборонити зміну значення змінної після її ініціалізації (створення констант).
Чому magic numbers ускладнюють підтримку коду?
Незрозуміло, що вони означають, і якщо значення треба змінити, доводиться шукати його по всьому коду.
Який тип ти обереш для грошей у майбутньому та чому не double?
BigDecimal, тому що він забезпечує точні обчислення без помилок округлення, які можливі у double.

---------------

## День 2. Щоденний звіт

**Що зробив сьогодні:**
- Повторив, як HelloDeveloper.java проходить шлях до консолі: javac → bytecode → JVM.
- Написав PersonalProfile: всі 8 примітивних типів, 3 `static final` константи, обчислення `remainingDays`, escape-послідовності (`\t`, `\n`, `\"`, `\\`).
- Написав TypeExperiments: 5 casting-прикладів (int→long, int→double, double→int, int→byte в межах, int→byte поза межами), overflow byte, демо `0.1 + 0.2 != 0.3`.
- Навмисно зламав і відновив код (compiler errors: lossy conversion, char/String, final reassign).
- Виконав фінальні команди `javac`/`java` з classpath.

**Що було складно:**
Narrowing casting між int→byte поза межами: не одразу зрозумів, чому 130 стає -126. Зрозумів після того, як подивився на бінарне представлення.

**Що дізнався нового:**
- `0.1 + 0.2` у double дає `0.30000000000000004` — IEEE 754 не може точно представити деякі десяткові дроби у двійковому форматі.
- `static final` на рівні класу відрізняється від локального `final`: `static` означає, що поле належить класу, а не екземпляру.
--------------------

1. Назви 8 primitive types. - byte, short, int, long, float, double, boolean, char.
2. Чим primitive value відрізняється від reference value? - primitive value зберігає значення, а не посилання на значення
3. Що означає `final`? - те, що значення в змінній незмінне.
4. Коли Java дозволяє implicit casting? - коли не буде втрати даних при casting
5. Чому explicit casting може втратити частину даних? - тому що розробник може перетворити значення із 8 bytes в 2 bytes
6. Що відбувається при `byte` overflow? - значення починається з протилежного краю діапазону
7. Чому `0.1 + 0.2` не завжди дає рівно `0.3`? - тому що double зберігає числа у двійковому форматі, а деякі десяткові дроби неможливо представити точно

--------------------

```java
int result = 10 + 3 * 2;
System.out.println(result);
```
result = 16;

```java
int result = (10 + 3) * 2;
System.out.println(result);
```
result = 26;

```java
double result = 10 / 4;
System.out.println(result);
```
result = 2.0;

```java
double result = 10.0 / 4;
System.out.println(result);
```
result = 2.5;

```java
int x = 5;
int y = ++x * 2;
System.out.println(x);
System.out.println(y);
```
resultx = 6;
resulty = 12;

--------------------

## День 3. Конспект курсу

1. Що таке масив? - це структура даних, яка зберігає кілька значень одного типу під одним ім'ям
2. Чому масив має фіксований розмір? - тому що під час його створення Java виділяє в пам'яті неперервний блок пам'яті для всіх елементів
3. Що означає індекс елемента? - це порядковий номер елемента в масиві
4. Чому перший елемент має індекс `0`? - індекс фактично означає зміщення від початку масиву
5. Що повертає `array.length`? - int - довжину масиву
6. Що станеться при зверненні до неіснуючого індексу? - exception
7. Чим `int[] numbers = new int[5]` відрізняється від
   `int[] numbers = {1, 2, 3, 4, 5}`? - в другому випадку ми задаємо значення, а в першому всі 0
8. Як у Java виглядає двовимірний масив? - матриця

---------------------

| Інструмент | Що робить | Власний приклад | Результат |
|---|---|---|---|
| `Math.round` | Округлює число до найближчого цілого | `Math.round(4.6)` | `5` |
| `Math.ceil` | Округлює число вгору | `Math.ceil(4.1)` | `5.0` |
| `Math.floor` | Округлює число вниз | `Math.floor(4.9)` | `4.0` |
| `Math.max` | Повертає більше з двох чисел | `Math.max(10, 25)` | `25` |
| `Math.min` | Повертає менше з двох чисел | `Math.min(10, 25)` | `10` |
| `Math.random` | Генерує випадкове число від `0.0` до `1.0`, не включаючи `1.0` | `(int) (Math.random() * 10) + 1` | Випадкове ціле число від `1` до `10` |
| `NumberFormat.getCurrencyInstance()` | Форматує число як гроші за поточною локаллю | `NumberFormat.getCurrencyInstance().format(12.5)` | Наприклад `$12.50` для US-локалі |
| `NumberFormat.getPercentInstance()` | Форматує число як відсоток | `NumberFormat.getPercentInstance().format(0.25)` | `25%` |

-------------------------

```java
int a = 10 + 2 * 3;
int b = (10 + 2) * 3;
int c = 20 / 4 + 6;
int d = 20 / (4 + 6);
double e = 5 + 2.0 * 4 / 3;
```

`a = 10 + 2 * 3`
- Порядок кроків: спочатку `2 * 3 = 6`, потім `10 + 6 = 16`.
- Прогнозований результат: `16`.
- Фактичний результат після запуску: `16`.

`b = (10 + 2) * 3`
- Порядок кроків: спочатку дужки `10 + 2 = 12`, потім `12 * 3 = 36`.
- Прогнозований результат: `36`.
- Фактичний результат після запуску: `36`.

`c = 20 / 4 + 6`
- Порядок кроків: спочатку `20 / 4 = 5`, потім `5 + 6 = 11`.
- Прогнозований результат: `11`.
- Фактичний результат після запуску: `11`.

`d = 20 / (4 + 6)`
- Порядок кроків: спочатку дужки `4 + 6 = 10`, потім `20 / 10 = 2`.
- Прогнозований результат: `2`.
- Фактичний результат після запуску: `2`.

`e = 5 + 2.0 * 4 / 3`
- Порядок кроків: спочатку `2.0 * 4 = 8.0`, потім `8.0 / 3 = 2.6666666666666665`, потім `5 + 2.6666666666666665 = 7.666666666666666`.
- Прогнозований результат: `7.666666666666666`.
- Фактичний результат після запуску: `7.666666666666666`.

--------------------

Письмово поясни, чому звичайний System.out.println(scores) не виводить масив як список чисел. - тому, що він виводить посилання на дані, а не самі дані

------------------------

- повну назву exception; - Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
- який індекс був неправильним; - 5
- яка фактична довжина масиву; - 4
- чому останній допустимий індекс дорівнює `length - 1`. - тому, що масив починається з 0

---------------------

- що означає `matrix.length`; - виводить довжину масиву в int
- що означає `matrix[0].length`; - довжина першого рядка, а не усього масиву
- чим `Arrays.toString` відрізняється від `Arrays.deepToString` для
  двовимірного масиву. - Arrays.toString для двовимірного масиву не виведе елементи, а виведе посилання на них

---------------------------

## День 3. Завдання 4.2. Перевірка `ArrayStatistics`

### Масив `onlyIncome`

```java
int[] onlyIncome = {100, 200, 300};
```

- Прогноз: `sum = 600`, `min = 100`, `max = 300`, `average = 200.0`.
- Фактичний результат за поточним кодом: `sum = 600`, `min = 300`, `max = 0`,
  `average = 200.0`.
- Reverse: `[300, 200, 100]`.
- Reverse працює правильно: так.

### Масив `onlyExpenses`

```java
int[] onlyExpenses = {-10, -20, -30};
```

- Прогноз: `sum = -60`, `min = -30`, `max = -10`, `average = -20.0`.
- Фактичний результат за поточним кодом: `sum = -60`, `min = 0`, `max = -30`,
  `average = -20.0`.
- Reverse: `[-30, -20, -10]`.
- Reverse працює правильно: так.

### Масив `singleValue`

```java
int[] singleValue = {42};
```

- Прогноз: `sum = 42`, `min = 42`, `max = 42`, `average = 42.0`.
- Фактичний результат за поточним кодом: `sum = 42`, `min = 42`, `max = 0`,
  `average = 42.0`.
- Reverse: `[42]`.
- Reverse працює правильно: так.

### Масив `withZero`

```java
int[] withZero = {0, 100, -50};
```

- Прогноз: `sum = 50`, `min = -50`, `max = 100`,
  `average = 16.666666666666668`.
- Фактичний результат за поточним кодом: `sum = 50`, `min = 100`, `max = -50`,
  `average = 16.666666666666668`.
- Reverse: `[-50, 100, 0]`.
- Reverse працює правильно: так.

### Що буде з порожнім масивом

Якщо масив порожній, то поточний код спочатку перевіряє:

```java
if (transactions.length == 0) {
    System.err.println("Error: Array length is 0");
    return;
}
```

Тому для порожнього масиву програма не буде рахувати `min`, `max` і
`average`. Вона виведе повідомлення:

```text
Error: Array length is 0
```

Після цього `return` завершить метод `main`, і ділення на `0` для `average` не
відбудеться.

Це правильно, бо в порожньому масиві немає мінімального, максимального і
середнього значення.
----------------------

## День 3. Самостійне завдання

1. Чому для `average` потрібно хоча б одне `double`-значення в обчисленні? - Бо інакше буде integer division
2. Чому останній індекс масиву — це `length - 1`? - тому що масив починається з 0
3. Як працює алгоритм розвороту масиву? - Беремо елементи з кінця оригінального масиву і записуємо в новий масив з початку
4. Чому оригінальний масив не повинен змінюватися під час створення reversed
   copy? -  Бо завдання саме на reversed copy. Оригінал має залишитися незмінним, а розвернута версія має бути окремим масивом.
5. Які значення краще винести в константи в `CurrencyConverter`? - У CurrencyConverter краще винести в константи:
   private static final double EUR_TO_USD = 1.5;
   private static final double EUR_TO_GBP = 0.85;
   private static final double EUR_TO_UAH = 45.0;
6. Чому `NumberFormat` краще за ручне додавання символу валюти до рядка? - NumberFormat враховує локаль: символ валюти, пробіли, коми/крапки, порядок запису. Ручний рядок типу amount + "€" легко зробити неправильно.
7. Де в цих задачах може виникнути integer division? - Integer division може бути тут:
   int average = sum / count;
   double average = sum / count;

------------------------------

## День 3. Завдання 4.5. Запуск

Команди з кореня проєкту:

```bash
mvn compile
java -cp target/classes daniil.dumshenko.previousLessons.ArrayExperiments
java -cp target/classes daniil.dumshenko.previousLessons.ArrayStatistics
java -cp target/classes daniil.dumshenko.previousLessons.CurrencyConverter
```

Результат `mvn compile`:

```text
BUILD SUCCESS
```

Результат `ArrayExperiments`:

```text
78
64
85
5
[78, 112, 64, 100, 85]
[112.0, 78.0, 92.0, 64.0]
85
[[1, 2, 3], [4, 5, 6, 7, 8], [7, 8]]
[1, 2, 3]
[4, 5, 6, 7, 8]
[7, 8]
5
2
15
15.0
14.0
0.8135941777144751
43
```

Результат `ArrayStatistics`:

```text
sum = 1025
min = -80
max = 700
average = 146.42857142857142
plusValue = 4
minusValue = 3
sumOfIncomes = 1170
sumOfExpenses = -145
[700, -20, 50, -80, 300, -45, 120]
[120, -45, 300, -80, 50, -20, 700]
```

Результат `CurrencyConverter`:

```text
================================
CURRENCY CONVERTER
================================
Rates type: training rates
Base amount: 100,00 €
EUR to USD: $150.00
EUR to GBP: ¤85.00
EUR to UAH: 4 500,00 ₴
Example Fee: 2%
Rounded amount: 150
================================
```

Ручна компіляція:

```bash
mkdir -p /tmp/codewithmosh-day3
javac -d /tmp/codewithmosh-day3 src/main/java/daniil/dumshenko/ArrayStatistics.java src/main/java/daniil/dumshenko/CurrencyConverter.java
java -cp /tmp/codewithmosh-day3 daniil.dumshenko.previousLessons.ArrayStatistics
java -cp /tmp/codewithmosh-day3 daniil.dumshenko.previousLessons.CurrencyConverter
```

Результат ручної компіляції:

```text
javac завершився без помилок.
```

`ArrayStatistics` через `/tmp/codewithmosh-day3`:

```text
sum = 1025
min = -80
max = 700
average = 146.42857142857142
plusValue = 4
minusValue = 3
sumOfIncomes = 1170
sumOfExpenses = -145
[700, -20, 50, -80, 300, -45, 120]
[120, -45, 300, -80, 50, -20, 700]
```

`CurrencyConverter` через `/tmp/codewithmosh-day3`:

```text
================================
CURRENCY CONVERTER
================================
Rates type: training rates
Base amount: 100,00 €
EUR to USD: $150.00
EUR to GBP: ¤85.00
EUR to UAH: 4 500,00 ₴
Example Fee: 2%
Rounded amount: 150
================================
```

## День 3. Завдання 5.2. Перевірка помилок

### 1. Звернення до індексу за межами масиву

Зміна в коді:

```java
System.out.println(transactions[transactions.length]);
```

Головний рядок exception:

```text
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
```

Причина: у масиві довжиною `7` останній допустимий індекс — `6`, бо індекси
починаються з `0`. Індекс `7` вже за межами масиву.

Виправлення: прибрати звернення до `transactions[transactions.length]` або
використовувати тільки індекси від `0` до `transactions.length - 1`.

### 2. Спроба змінити `static final` константу

Зміна в коді:

```java
EUR_TO_USD = 1.4;
```

Головний рядок compiler error:

```text
error: cannot assign a value to static final variable EUR_TO_USD
```

Причина: `static final` константа отримує значення один раз і після цього не
може бути змінена.

Виправлення: прибрати повторне присвоєння. Якщо потрібен інший курс, треба
змінити початкове значення константи.

### 3. Відсутній import для `NumberFormat`

Зміна в коді: тимчасово прибрав import:

```java
import java.text.NumberFormat;
```

Головний рядок compiler error:

```text
error: cannot find symbol
  symbol:   class NumberFormat
```

Причина: клас `NumberFormat` знаходиться в пакеті `java.text`, і без import
Java не знає, що означає назва `NumberFormat`.

Виправлення: повернути import:

```java
import java.text.NumberFormat;
```

У фінальному коді навмисні помилки не залишені.

## День 3. Завдання 5.3. Рефакторинг

Що переглянув і виправив:

- В `ArrayStatistics` `min` і `max` тепер стартують з першого елемента масиву,
  а не з `0`.
- Назви `plusValue` і `minusValue` замінені на зрозуміліші `positiveCount` і
  `negativeCount`.
- Вивід масивів підписаний: `reversedTransactions` і `transactions`.
- Вирівняне форматування в `ArrayStatistics`.
- В `CurrencyConverter` прибраний static import `forLanguageTag`, замість нього
  використано `Locale.forLanguageTag("uk-UA")`.

Команди:

```bash
mvn compile
java -cp target/classes daniil.dumshenko.previousLessons.ArrayExperiments
java -cp target/classes daniil.dumshenko.previousLessons.ArrayStatistics
java -cp target/classes daniil.dumshenko.previousLessons.CurrencyConverter
git diff --check
git status --short
git diff --stat
```

Результат `mvn compile`:

```text
BUILD SUCCESS
```

Результат `ArrayExperiments`:

```text
78
64
85
5
[78, 112, 64, 100, 85]
[112.0, 78.0, 92.0, 64.0]
85
[[1, 2, 3], [4, 5, 6, 7, 8], [7, 8]]
[1, 2, 3]
[4, 5, 6, 7, 8]
[7, 8]
5
2
15
15.0
14.0
0.7291344154305168
87
```

Результат `ArrayStatistics`:

```text
sum = 1025
min = -80
max = 700
average = 146.42857142857142
positiveCount = 4
negativeCount = 3
sumOfIncomes = 1170
sumOfExpenses = -145
reversedTransactions = [700, -20, 50, -80, 300, -45, 120]
transactions = [120, -45, 300, -80, 50, -20, 700]
```

Результат `CurrencyConverter`:

```text
================================
CURRENCY CONVERTER
================================
Rates type: training rates
Base amount: 100,00 €
EUR to USD: $150.00
EUR to GBP: ¤85.00
EUR to UAH: 4 500,00 ₴
Example Fee: 2%
Rounded amount: 150
================================
```

Результат `git diff --check`: помилок whitespace немає.

Результат `git status --short`:

```text
 M AGENTS.md
 M learning-journal.md
 M src/main/java/daniil/dumshenko/ArrayExperiments.java
AM src/main/java/daniil/dumshenko/ArrayStatistics.java
AM src/main/java/daniil/dumshenko/CurrencyConverter.java
```

Результат `git diff --stat`:

```text
 AGENTS.md                                          |   5 +
 learning-journal.md                                | 386 +++++++++++++++++++++
 .../java/daniil/dumshenko/ArrayExperiments.java    |   2 +-
 .../java/daniil/dumshenko/ArrayStatistics.java     |  69 ++++
 .../java/daniil/dumshenko/CurrencyConverter.java   |  40 +++
 5 files changed, 501 insertions(+), 1 deletion(-)
```
-----------------------

1. Що таке масив? - Масив — це структура даних, яка зберігає кілька значень одного типу.
2. Чому масив має фіксований розмір? - Тому що пам'ять для всіх елементів виділяється один раз під час створення масиву.
3. Чому перший індекс дорівнює `0`? - Бо індекс — це зміщення від початку масиву. Перший елемент має зміщення 0.
4. Що означає `array.length`? - Це кількість елементів у масиві.
5. Чому останній індекс — `array.length - 1`? - Бо індексація починається з 0.
6. Коли виникає `ArrayIndexOutOfBoundsException`? - Коли звертаються до індексу, якого не існує.
7. Як створити двовимірний масив? - int[][] matrix = new int[3][4];
8. Чим `Arrays.toString` відрізняється від `Arrays.deepToString`? - Arrays.toString() — для одновимірних масивів.
   Arrays.deepToString() — для багатовимірних масивів.
9. Як вручну знайти `min` і `max` у масиві? - Пройти циклом по всіх елементах і порівнювати їх із поточними min та max.
10. Як розвернути масив без готового методу? - Створити новий масив і копіювати елементи з кінця початкового масиву до початку нового.
11. Чому `average` може бути неправильним при integer division? - Бо при діленні двох int дробова частина відкидається.
12. Для чого використовують `Math.round`, `ceil` і `floor`? - round() — округлює до найближчого цілого.
    ceil() — округлює вгору.
    floor() — округлює вниз.
13. Для чого використовують `NumberFormat`? - Для форматування чисел, відсотків і валют відповідно до локалі (країни та мови).

--------------------------

## День 3. Підсумок

### Що я сьогодні вивчив

- Масиви мають фіксовану довжину, а індекси починаються з `0`.
- Для виводу масивів треба використовувати `Arrays.toString` або
  `Arrays.deepToString`.
- Статистику масиву можна рахувати вручну через цикл: `sum`, `min`, `max`,
  `average`, кількість додатних і від'ємних значень.
- `average` треба рахувати через `double`, щоб не втратити дробову частину.
- `NumberFormat` допомагає правильно форматувати валюту й відсотки.
- `Math.round`, `Math.ceil` і `Math.floor` використовуються для різних типів
  округлення.

### Що я зробив самостійно

- Написав `ArrayStatistics` для роботи з масивом транзакцій.
- Написав `CurrencyConverter` для конвертації EUR в USD, GBP і UAH.
- Перевірив крайні випадки для `ArrayStatistics`.
- Запустив програми через Maven і через ручний `javac`.
- Дослідив три типи помилок і виправив їх.

### Де мій прогноз не збігся з результатом

- У `ArrayStatistics` спочатку були неправильні результати для `min` і `max`,
  бо змінні стартували з `0`.
- У `CurrencyConverter` формат валюти залежить від локалі, тому символи й
  пробіли у виводі можуть виглядати не так, як очікувалось.
- У `ArrayExperiments` значення з `Math.random()` щоразу інше, тому його не
  можна точно передбачити до запуску.

### Які помилки я зустрів

- Помилка: `ArrayIndexOutOfBoundsException`.
  Причина: звернення до індексу `transactions.length`, якого в масиві немає.
  Виправлення: використовувати індекси від `0` до `transactions.length - 1`.

- Помилка: `cannot assign a value to static final variable`.
  Причина: спроба змінити значення константи `static final`.
  Виправлення: не переприсвоювати константу після ініціалізації.

- Помилка: `cannot find symbol` для `NumberFormat`.
  Причина: відсутній import `java.text.NumberFormat`.
  Виправлення: повернути правильний import.

### Що залишилося незрозумілим

- Треба ще краще розібратися з локалями в `NumberFormat`, особливо чому для
  GBP може виводитися символ `¤`.
- Треба повторити, коли краще використовувати `double`, а коли в майбутньому
  треба буде перейти на `BigDecimal` для грошей.

### Що потрібно повторити завтра

- Пошук `min` і `max` у масиві без готових методів.
- Розворот масиву через окрему reversed copy.
- Різницю між `Arrays.toString` і `Arrays.deepToString`.
- `NumberFormat` для валют і відсотків.
- Integer division і як уникати втрати дробової частини.

### Фактичний час

- Повторення і діагностика: точно не заміряв.
- Курс: точно не заміряв.
- Керована практика: точно не заміряв.
- Самостійне завдання: точно не заміряв.
- Перевірка та рефакторинг: точно не заміряв.
- Підсумок: точно не заміряв.
- Разом: точний час не записаний.

------------------

## День 4. Повторення Дня 3

1. Як створити масив `int` із 5 елементів? - int[] testArray = new int[5];
2. Чому останній індекс дорівнює `length - 1`? - тому що перший елемент - 0
3. Як вручну знайти `min` у масиві? - перебрати кожен елемент і зрівняти з поточним min, якщо елемент менше, то присвоюємо його min.
4. Як порахувати `average`, щоб не отримати integer division? - потрібно, щоб хоча би один елемент був double.
5. Чим `Arrays.toString` відрізняється від `Arrays.deepToString`? - `Arrays.toString` видасть некоректну відповідь для двовимірних масивів (та для більших вимірів)
6. Для чого потрібен `NumberFormat.getCurrencyInstance()`? - Щоб коректно форматувати числа, тому що вручну доданий $ не завжди є коректним.
7. Чим форматування числа відрізняється від математичного округлення? - Форматування числа змінює лише спосіб відображення, але не саме значення, математичне округлення змінює значення числа.

----------------------------

Перед переглядом курсу запиши відповіді:

1. Як, на твою думку, Java читає введення користувача з консолі? - Java зазвичай читає введення з консолі через Scanner
2. Що може піти не так, якщо користувач введе текст замість числа? - Якщо користувач введе текст замість числа, буде помилка
3. Чому калькулятор іпотеки не повинен працювати тільки з hardcoded числами? - Бо hardcoded числа роблять програму негнучкою. Користувач має сам вводити суму кредиту, відсоток і термін.
4. Які дані потрібні для розрахунку щомісячного платежу? - сума кредиту, річна відсоткова ставка, термін кредиту в роках або місяцях.

---------------------------------

## День 4. Конспект курсу

| Поняття | Що це | Типова помилка |
|---|---|---|
| `Scanner` | Клас Java для читання введення з різних джерел, зокрема з консолі. | Забути імпортувати `java.util.Scanner` або не створити об'єкт `Scanner`. |
| `System.in` | Стандартний потік введення, через який програма отримує дані з консолі. | Плутати `System.in` з `System.out`, який використовується для виведення. |
| `nextInt()` | Метод `Scanner`, який читає наступне введене ціле число. | Ввести текст або дробове число замість `int` і отримати помилку введення. |
| `nextDouble()` | Метод `Scanner`, який читає наступне дробове число. | Очікувати кому як десятковий роздільник, хоча часто потрібна крапка. |
| `nextLine()` | Метод `Scanner`, який читає весь рядок до кінця рядка. | Викликати після `nextInt()` або `nextDouble()` і випадково прочитати порожній рядок. |
| Principal | Початкова сума кредиту, яку користувач бере в банку. | Дозволити нульове або від'ємне значення без перевірки. |
| Annual interest rate | Річна відсоткова ставка за кредитом. | Використати відсоток напряму, наприклад `5`, замість `0.05`. |
| Monthly interest rate | Місячна ставка, отримана з річної ставки. | Забути поділити річну ставку на `12` і на `100`. |
| Period in years | Строк кредиту в роках. | Використати роки напряму у формулі, яка очікує кількість місяців. |
| Number of payments | Загальна кількість щомісячних платежів за весь строк кредиту. | Забути помножити кількість років на `12`. |

Окремі пояснення:

1. Річну ставку потрібно перетворити на місячну, бо платіж за іпотекою
   розраховується щомісяця. Якщо у формулі використати річну ставку напряму,
   результат буде неправильний, бо ставка не відповідатиме одному періоду
   платежу.
2. Строк у роках потрібно перетворити на кількість місяців, бо кількість
   платежів у формулі - це саме кількість щомісячних платежів. Наприклад,
   30 років означає `30 * 12`, тобто 360 платежів.
3. `periodInYears` і `numberOfPayments` можуть бути `int`, бо це цілі
   кількості років і платежів. `principal`, `annualInterestRate`,
   `monthlyInterestRate` і результат розрахунку краще зробити `double`, бо
   гроші та відсотки можуть мати дробову частину.
4. Результат платежу треба форматувати як валюту, щоб користувач бачив
   нормальний грошовий формат із символом валюти та правильною кількістю
   знаків після крапки.
5. Якщо користувач введе від'ємну principal amount, програма математично може
   порахувати від'ємний платіж, але в реальному житті така сума кредиту не має
   сенсу. Тому потрібно перевіряти введення і не дозволяти від'ємну principal
   amount.

### Формула

Формула розраховує щомісячний платіж за кредитом на основі суми кредиту,
місячної відсоткової ставки та загальної кількості платежів:

```text
M = P * (r * (1 + r)^n) / ((1 + r)^n - 1)
```

Де:

- `M` - щомісячний платіж. Це результат формули, який показує, скільки потрібно
  платити кожного місяця.
- `P` - principal, тобто сума кредиту. Одиниця виміру - гроші, наприклад
  долари або євро.
- `r` - monthly interest rate, тобто місячна відсоткова ставка. Перед
  розрахунком річну ставку потрібно поділити на `100`, щоб отримати десяткове
  число, і на `12`, щоб отримати ставку за один місяць.
- `n` - number of payments, тобто загальна кількість платежів. Перед
  розрахунком строк у роках потрібно помножити на `12`, бо платежі щомісячні.

До розрахунку `P` має бути сумою грошей, `r` має бути місячною ставкою у
десятковому форматі, а `n` має бути кількістю місяців. Якщо використати річну
ставку або кількість років напряму, формула дасть неправильний результат.

-----------------------------------

## День 4. Експерименти з введенням

### 1. Читання цілого числа

- Що я очікував побачити: якщо ввести ціле число, `scanner.nextInt()` прочитає
  його і програма виведе це саме число.
- Що сталося після запуску: після введення `1000` програма вивела
  `Ваше число: 1000`.
- Чи збігся прогноз: так, збігся.
- Висновок для Mortgage Calculator: principal або period можна читати як число,
  але потрібно перевіряти, що користувач ввів коректне значення.

### 2. Читання дробового числа

- Що я очікував побачити: якщо ввести дробове число через крапку, `nextDouble()`
  прочитає його як `double`.
- Що сталося після запуску: після введення `1000.50` програма вивела
  `Ваше дробове число: 1000.5`.
- Чи збігся прогноз: так, але формат виводу прибрав зайвий нуль у кінці.
- Висновок для Mortgage Calculator: annual interest rate краще читати як
  `double`, бо ставка може бути дробовою.

### 3. Читання одного слова

- Що я очікував побачити: `scanner.next()` прочитає одне слово до пробілу.
- Що сталося після запуску: після введення `hello` програма вивела
  `Ваше слово: hello`.
- Чи збігся прогноз: так, збігся.
- Висновок для Mortgage Calculator: `next()` підходить для одного короткого
  значення, але для цієї програми основні дані краще читати як числа.

### 4. Читання повного рядка

- Що я очікував побачити: `scanner.nextLine()` прочитає весь рядок разом із
  пробілами.
- Що сталося після запуску: після виправлення через додатковий
  `scanner.nextLine()` програма прочитала `full line here` повністю.
- Чи збігся прогноз: так, після очищення залишку рядка.
- Висновок для Mortgage Calculator: якщо змішувати `nextInt()`, `nextDouble()`,
  `next()` і `nextLine()`, потрібно пам'ятати про залишений кінець рядка.

### 5. `nextLine()` одразу після `nextInt()`

- Що я очікував побачити: я очікував, що `nextLine()` попросить користувача
  ввести новий рядок.
- Що сталося після запуску: `nextInt()` прочитав тільки число, а кінець рядка
  залишився в буфері. Після цього `nextLine()` одразу прочитав порожній рядок.
- Чи збігся прогноз: ні, не збігся.
- Висновок для Mortgage Calculator: після числового вводу не можна бездумно
  викликати `nextLine()`. Якщо треба читати рядок після числа, спочатку потрібно
  зробити додатковий `scanner.nextLine()`.

### 6. Текст там, де очікується число

- Що я очікував побачити: якщо ввести текст замість числа, програма не зможе
  перетворити його на `int` або `double`.
- Що сталося після запуску: коли там, де очікувалось число, було введено текст,
  програма падала з `InputMismatchException`.
- Чи збігся прогноз: так, збігся.
- Висновок для Mortgage Calculator: потрібно перевіряти введення користувача,
  інакше програма може впасти ще до розрахунку платежу.

--------------------------

## День 4. Дослідження помилок вводу

### 1. Input: `1000`

- Що програма очікувала: ціле число для `scanner.nextInt()`.
- Що отримала: коректне ціле число `1000`.
- Головний рядок exception: exception немає.
- Як це може вплинути на калькулятор: principal або period можна прочитати як
  число, якщо користувач вводить правильний формат.

### 2. Input: `1000.50`

- Що програма очікувала: дробове число для `scanner.nextDouble()`.
- Що отримала: коректне дробове число `1000.50`, яке Java вивела як `1000.5`.
- Головний рядок exception: exception немає.
- Як це може вплинути на калькулятор: annual interest rate можна читати як
  `double`, але відображення числа може не зберігати зайві нулі.

### 3. Input: `hello`

- Що програма очікувала: одне слово для `scanner.next()`.
- Що отримала: коректне слово `hello`.
- Головний рядок exception: exception немає.
- Як це може вплинути на калькулятор: текстові значення читаються нормально,
  але для Mortgage Calculator основні поля мають бути числами.

### 4. Input: порожній рядок

- Що програма очікувала: повний рядок для `scanner.nextLine()`.
- Що отримала: порожній рядок.
- Головний рядок exception: exception немає.
- Як це може вплинути на калькулятор: якщо користувач натисне Enter без
  значення, програма може отримати порожній input. Для числових полів це треба
  обробляти окремо.

### 5. Input: `10,5`

- Що програма очікувала: дробове число для `scanner.nextDouble()`.
- Що отримала: значення з комою замість крапки, яке `nextDouble()` не зміг
  прочитати як число.
- Головний рядок exception: `Exception in thread "main" java.util.InputMismatchException`.
- Як це може вплинути на калькулятор: якщо користувач введе ставку як `10,5`,
  програма може впасти. Потрібно або пояснювати формат введення, або додати
  перевірку input.

## День 4. Ручний приклад для формули

Вхідні дані:

- principal: `100000`;
- annual interest rate: `5`;
- period: `30` років.

Розрахунок:

- Місячна ставка: `5 / 100 / 12 = 0.004166666667`.
- Кількість платежів: `30 * 12 = 360`.
- Очікуваний щомісячний платіж: приблизно `536.82`.

Результат може трохи відрізнятися через округлення, бо місячна ставка має
багато знаків після крапки, а фінальний платіж зазвичай показують як валюту з
двома знаками після крапки.

### Завдання 3.4. Запуск
Програму запустив, помилок не виявив.

------------------------

## День 4. Перевірки Mortgage Calculator

### Завдання 4.2. Некоректні значення

1. Principal не може бути менше або дорівнювати `0`.
   У моїй програмі це перевіряється під час читання суми кредиту. Якщо ввести
   `0` або `-100000`, програма показує повідомлення
   `Введіть значення від 1000 до 1 000 000` і запитує значення ще раз.

2. Annual interest rate не може бути від'ємною.
   У моїй програмі ставка має бути більше `0` і не більше `30`. Якщо ввести
   `-5`, програма показує повідомлення
   `Введіть значення більше 0 і не більше 30` і запитує ставку ще раз.

3. Period in years не може бути менше або дорівнювати `0`.
   У моїй програмі строк має бути від `1` до `30` років. Якщо ввести `0`,
   програма показує повідомлення `Введіть значення від 1 до 30` і запитує
   строк ще раз.

4. Дуже великий строк має бути помічений як підозрілий.
   У моїй програмі значення `100` років не приймається, бо строк обмежений
   діапазоном від `1` до `30`.

5. Нульова ставка має оброблятися окремо, без ділення на нуль.
   У моїй поточній версії нульова ставка не приймається. Це не дає програмі
   дійти до формули й поділити на нуль, але окремої формули для `0%` ще немає.

### Завдання 4.3. Логіка в методах

- Читання суми кредиту: `readingPrincipal()`.
- Читання річної ставки: `readingAnnualInterestRate()`.
- Читання строку: `readingPeriodInMonths()`.
- Розрахунок щомісячного платежу: `calculateResult()`.
- Форматування результату: `formatResult()`.
- Вивід фінального повідомлення: зараз результат повертається з
  `calculateMortgage()` і друкується в `Main`.

Висновок: логіка вже розділена на методи, але назви можна покращити. Наприклад,
`readingPrincipal()` краще назвати `readPrincipal()`, а `calculateResult()` -
`calculateMortgagePayment()`.

### Завдання 4.4. Порівняння з рішенням курсу

1. Назви змінних у мене частково зрозумілі: `principal`, `annualInterest`,
   `monthlyInterest`, `periodInMonths`. Але `result` гірша назва, бо не ясно,
   що це саме щомісячний платіж.
2. Ставка і строк перетворені так само за змістом: річна ставка ділиться на
   `100` і `12`, а роки множаться на `12`.
3. `Math.pow` використаний для `(1 + monthlyInterest)^periodInMonths`, тобто
   ідея така сама.
4. У моїй версії нульова ставка не обчислюється окремо, а відхиляється під час
   вводу. Через це ділення на нуль не відбувається, але кредит із `0%` поки не
   підтримується.
5. Дві зміни, які варто забрати після порівняння: покращити назви методів у
   стилі дієслів `read...` і винести назву `result` у точнішу назву
   `monthlyPayment`.
6. Своїми я залишаю перевірки діапазонів і повторний запит через `while`, бо це
   робить програму стійкішою до неправильного вводу.

### Завдання 4.5. Ручні тестові сценарії

| Principal | Annual rate | Years | Фактичний результат | Чи очікуваний результат | Що виправив |
|---:|---:|---:|---|---|---|
| `100000` | `5` | `30` | Програма вивела приблизно `¤536.82`. | Так, результат близький до ручного прикладу. | Нічого. |
| `100000` | `0` | `30` | Програма показала `Введіть значення більше 0 і не більше 30` і попросила ставку ще раз. | Частково: ділення на нуль немає, але `0%` не рахується окремо. | Поки нічого. |
| `0` | `5` | `30` | Програма показала `Введіть значення від 1000 до 1 000 000` і попросила principal ще раз. | Так. | Нічого. |
| `-100000` | `5` | `30` | Програма показала `Введіть значення від 1000 до 1 000 000` і попросила principal ще раз. | Так. | Нічого. |
| `100000` | `-5` | `30` | Програма показала `Введіть значення більше 0 і не більше 30` і попросила ставку ще раз. | Так. | Нічого. |
| `100000` | `5` | `0` | Програма показала `Введіть значення від 1 до 30` і попросила строк ще раз. | Так. | Нічого. |
| `100000` | `5` | `100` | Програма показала `Введіть значення від 1 до 30` і попросила строк ще раз. | Так, програма помітила підозріло великий строк. | Нічого. |

Висновок після сценаріїв: базові перевірки працюють, але потрібно ще вирішити,
чи має калькулятор підтримувати нульову ставку як валідний сценарій із простою
формулою `principal / numberOfPayments`.

---------------------------

## День 4. Фінальна перевірка Mortgage Calculator

### Завдання 5.1. Функціональна перевірка

1. Prompt-и зрозумілі користувачу.
   Prompt-и перекладені українською: сума кредиту, річна ставка і строк у
   роках. Але є неточність: prompt каже `$1 тис. - $1 млн`, а перевірка в коді
   зараз приймає principal від `100`, не від `1000`.

2. Principal читається з консолі.
   Так, principal читається через `scanner.nextInt()` у методі
   `readPrincipal()`.

3. Annual interest rate читається як відсоток, а не готова decimal rate.
   Так, користувач вводить, наприклад, `5`, а програма перетворює це на
   decimal monthly rate через ділення на `100` і `12`.

4. Period читається в роках.
   Так, prompt просить `Строк кредиту (роки)`.

5. Period перетворюється на кількість місяців.
   Так, роки множаться на `monthsInYear`.

6. Annual rate перетворюється на monthly rate.
   Так, `annualInterest / percent / monthsInYear`.

7. При `0%` ставка обробляється окремою формулою.
   Ні. У поточній версії `0` не приймається як valid input. Це не дає
   програмі поділити на нуль, але окремої формули для `0%` ще немає.

8. Результат форматований як валюта.
   Так, використовується `NumberFormat.getCurrencyInstance()`. У моєму запуску
   результат виглядав як `¤536.82`, бо символ валюти залежить від локалі.

9. Немає випадкового `System.out.println` із проміжними debug-значеннями.
   Так, проміжні debug-значення не друкуються.

10. Назви методів і змінних зрозумілі без коментарів.
    Частково. `readPrincipal()` зрозуміла назва, але
    `readingAnnualInterestRate()`, `readingPeriodInMonths()` і `result` можна
    назвати краще.

### Завдання 5.2. Перевірка помилок

1. Прибрав import для `Scanner`.

- Що змінив: тимчасово видалив `import java.util.Scanner;`.
- Головний рядок помилки: `cannot find symbol`, `symbol: class Scanner`.
- Причина: клас `Scanner` лежить у пакеті `java.util`, тому без import Java не
  знає, що таке `Scanner`.
- Як виправив: повернув `import java.util.Scanner;`.
- Як уникнути наступного разу: не видаляти imports, які реально
  використовуються, і перевіряти код через `mvn compile`.

2. Ввів текст там, де програма очікує число.

- Що ввів: `abc` замість principal.
- Головний рядок помилки: `Exception in thread "main" java.util.InputMismatchException`.
- Причина: `scanner.nextInt()` очікує ціле число, а отримав текст.
- Як виправив: код не змінював, бо це була перевірка поведінки. Для справжнього
  виправлення потрібно перевіряти input перед `nextInt()` або обробляти
  exception.
- Як уникнути наступного разу: додати validation для нечислового input.

3. Тимчасово прибрав окрему обробку нульової ставки.

- Що змінив: нічого не прибирав, бо окремої обробки `0%` у поточному коді ще
  немає.
- Неправильний результат: програма не рахує кредит із `0%`, а показує
  `Введіть значення більше 0 і не більше 30` і просить ставку ще раз.
- Причина: validation дозволяє тільки `annualInterest > 0`.
- Як виправив: поки не виправляв у коді, тільки зафіксував проблему.
- Як уникнути наступного разу: додати окрему гілку для `annualInterest == 0`,
  де платіж рахується як `principal / numberOfPayments`.

### Завдання 5.3. Рефакторинг

- Magic numbers: частина вже винесена в `monthsInYear` і `percent`, але
  діапазони `100`, `1_000_000` і `30` ще краще винести в константи. Також
  потрібно виправити `100` на `1000`, щоб код відповідав prompt-у.
- Читання input, розрахунок і форматування частково розділені на методи.
  Вивід фінального результату зараз робить `Main`.
- Кожен метод має приблизно одну відповідальність, але назви методів ще можна
  зробити точнішими.
- Одиниці виміру частково зрозумілі з назв: `periodInMonths`,
  `annualInterest`, `monthlyInterest`. Але `result` треба перейменувати на
  `monthlyPayment`.
- Дублювання формули немає.
- Закоментованого коду немає, але є коментарі з англійськими оригіналами
  prompt-ів. Їх можна прибрати, коли переклад уже не потрібен.
- Imports використовуються: `NumberFormat` і `Scanner` потрібні.
- При некоректних числах програма поводиться передбачувано: показує
  повідомлення і повторює запит. Але при тексті замість числа падає з
  `InputMismatchException`.

Команди перевірки:

- `mvn compile` — `BUILD SUCCESS`.
- `java -cp target/classes daniil.dumshenko.MortgageCalculator` — не
  запускається, бо в `MortgageCalculator` немає `main` методу. Фактичний запуск
  зараз іде через `daniil.dumshenko.Main`.
- `git diff --check` — пройшов без помилок після виправлення trailing
  whitespace в `learning-journal.md`.
- `git status` — показав staged і unstaged зміни в проєкті.
- `git diff --stat` — показав зміни у 8 файлах.

---------------------------

## День 4. Контрольні запитання

### Завдання 6.1. Контрольні запитання

1. Для чого потрібен `Scanner`?

   `Scanner` потрібен, щоб читати дані з різних джерел, наприклад із консолі.
   У моєму випадку він використовується для читання того, що користувач вводить
   у терміналі.

2. Що означає `System.in`?

   `System.in` означає стандартний потік вводу. Найчастіше це клавіатура або
   дані, які користувач вводить у консоль.

3. Чим `nextInt()` відрізняється від `nextDouble()`?

   `nextInt()` читає ціле число типу `int`, наприклад `100000`. `nextDouble()`
   читає дробове число типу `double`, наприклад `5.5`. Якщо тип введення не
   підходить, може виникнути `InputMismatchException`.

4. Чому після `nextInt()` може виникнути проблема з `nextLine()`?

   `nextInt()` читає саме число, але залишає символ нового рядка після Enter у
   потоці вводу. Потім `nextLine()` може одразу прочитати цей порожній залишок,
   а не новий текст користувача.

5. Що станеться, якщо користувач введе текст замість числа?

   Якщо програма очікує число через `nextInt()` або `nextDouble()`, а користувач
   вводить текст, програма може впасти з `InputMismatchException`, якщо це не
   обробити окремо.

6. Які три значення потрібні для Mortgage Calculator?

   Потрібні сума кредиту (`principal`), річна відсоткова ставка
   (`annual interest rate`) і строк кредиту в роках (`period in years`).

7. Чому annual interest rate треба ділити на `100`?

   Користувач вводить ставку як відсоток, наприклад `5`. Для формули потрібне
   десяткове значення, тобто `0.05`, тому ставку треба поділити на `100`.

8. Чому annual interest rate треба ділити ще й на `12`?

   Формула рахує щомісячний платіж, тому потрібна місячна ставка. Якщо ставка
   річна, її треба поділити на `12`, щоб отримати ставку за один місяць.

9. Чому period in years множиться на `12`?

   Строк користувач вводить у роках, але платежі відбуваються щомісяця. Тому
   кількість років треба помножити на `12`, щоб отримати загальну кількість
   місячних платежів.

10. Для чого у формулі використовується `Math.pow`?

    `Math.pow` використовується для піднесення числа до степеня. У формулі
    Mortgage Calculator потрібно порахувати `(1 + monthlyInterest)` у степені
    кількості платежів.

11. Чому нульову ставку потрібно обробляти окремо?

    Якщо ставка `0%`, у стандартній формулі виникає проблема з діленням на нуль
    або неправильним результатом. Для нульової ставки платіж треба рахувати
    простіше: `principal / numberOfPayments`.

12. Чому результат треба форматувати через `NumberFormat`?

    `NumberFormat` робить результат читабельним для користувача: додає
    правильне округлення, розділювачі та формат валюти. Це краще, ніж вручну
    склеювати число й символ валюти через рядки.

13. Які частини програми краще винести в окремі методи?

    Краще окремо винести читання суми кредиту, читання ставки, читання строку,
    розрахунок щомісячного платежу, форматування результату і фінальний вивід.
    Так код легше читати, перевіряти й змінювати.

## День 4. Підсумок

### Що я сьогодні вивчив

- Навчився використовувати `Scanner` для читання даних із консолі.
- Зрозумів різницю між `nextInt()`, `nextDouble()` і `nextLine()`.
- Навчився перетворювати річну ставку та строк кредиту для формули
  щомісячного платежу.

### Що я зробив самостійно

- Створив експерименти з введенням даних і перевірив різні варіанти input.
- Реалізував Mortgage Calculator із читанням значень із консолі,
  розрахунком платежу та форматуванням результату.

### Де мій прогноз не збігся з результатом

- Я очікував, що `nextLine()` після `nextInt()` буде чекати новий ввід, але він
  може одразу прочитати залишений символ нового рядка.
- Я очікував, що `0%` можна буде просто підставити у формулу, але для нульової
  ставки потрібна окрема формула.

### Які помилки я зустрів

- Помилка: `InputMismatchException` при введенні тексту замість числа.
  Причина: `nextInt()` або `nextDouble()` очікує число, а отримує текст.
  Виправлення: потрібно додати перевірку input або окрему обробку помилки.

- Помилка: `0%` ставка не рахується як валідний сценарій.
  Причина: validation приймає тільки ставку більше `0`.
  Виправлення: потрібно дозволити `0` і рахувати платіж як
  `principal / numberOfPayments`.

- Помилка: запуск `java -cp target/classes daniil.dumshenko.MortgageCalculator`
  не працює напряму.
  Причина: у `MortgageCalculator` немає `main` методу, запуск іде через `Main`.
  Виправлення: або запускати `Main`, або додати `main` у правильний клас,
  якщо так вимагає завдання.

### Що я змінив після порівняння з рішенням курсу

- Краще розділив логіку на методи: читання даних, розрахунок і форматування.
- Звернув увагу на назви змінних, щоб було зрозуміло, де річна ставка, де
  місячна ставка, а де кількість платежів.

### Що залишилося незрозумілим

- Як найкраще обробляти текстовий input без падіння програми, якщо користувач
  вводить не число.
- Де краще розміщувати `main` метод, якщо програма вже розділена на кілька
  класів.

### Що потрібно повторити завтра

- `Scanner`, особливо різницю між `nextInt()`, `nextDouble()` і `nextLine()`.
- Обробку некоректного input.
- Умови `if`, `else`, логічні оператори й порівняння значень.

### Фактичний час

- Повторення і допуск: 30 хв
- Курс: 90 хв
- Керована практика: 60 хв
- Самостійне завдання: 120 хв
- Перевірка та рефакторинг: 30 хв
- Підсумок: 20 хв
- Разом: 5 год 30 хв
-------------------------------


1. Для чого потрібен `Scanner`? - для того, щоб зчитувати інпут юзера
2. Чому `nextInt()` може конфліктувати з `nextLine()`? - Тому що nextInt() не зчитує символ нового рядка (\n), який залишається після натискання Enter
3. Що таке `InputMismatchException`? - InputMismatchException — це виняток, який виникає, коли користувач вводить дані неправильного типу
4. Які три значення потрібні для Mortgage Calculator? - principal, annualInterest, periodInYears.
5. Чому annual interest rate треба перетворювати на monthly rate? - в формулі використовується значення в місяцях
6. Чому `0%` ставка є особливим випадком? - тому що виконається ділення на 0
7. Які частини Mortgage Calculator краще винести в окремі методи? - readPrincipal, readingAnnualInterestRate, readingPeriodInMonths, calculateMortgagePayment, formatMortgagePayment

-----------------


| Поняття | Що це | Приклад | Типова помилка |
|---|---|---|---|
| `if` | Перевіряє умову і виконує код, якщо вона `true`. | `if (temperature > 30)` | Поставити `;` після умови: `if (x > 0);` |
| `else if` | Додає ще одну умову, якщо попередня була `false`. | `else if (temperature > 20)` | Писати багато незалежних `if`, коли потрібна одна гілка з кількох. |
| `else` | Виконується, якщо всі попередні умови були `false`. | `else` | Додати умову після `else`, хоча умова має бути в `else if`. |
| `>` / `<` | Порівнюють, чи число більше або менше за інше число. | `age > 18`, `price < 100` | Переплутати напрямок знака і отримати протилежну логіку. |
| `>=` / `<=` | Порівнюють з урахуванням рівності: більше або дорівнює, менше або дорівнює. | `score >= 50`, `age <= 30` | Використати `>` замість `>=` і випадково не включити граничне значення. |
| `==` | Перевіряє, чи два значення рівні. | `age == 18` | Написати `=` замість `==`, тобто присвоєння замість порівняння. |
| `!=` | Перевіряє, чи два значення не рівні. | `status != 0` | Забути, що результат теж `boolean`: або `true`, або `false`. |
| `&&` | Логічне AND: результат `true`, якщо обидві умови `true`. | `age >= 18 && hasPassport` | Використати `&&`, коли достатньо виконання хоча б однієї умови. |
| `||` | Логічне OR: результат `true`, якщо хоча б одна умова `true`. | `isStudent || hasCoupon` | Використати `||`, коли потрібно, щоб усі умови були виконані. |
| `!` | Заперечує boolean-значення: `true` стає `false`, а `false` стає `true`. | `!isValid` | Поставити `!` не там і зробити умову важкою для читання. |
| ternary operator | Коротка форма `if/else` для вибору одного з двох значень. | `String result = age >= 18 ? "adult" : "minor";` | Використовувати для складної логіки, де звичайний `if/else` читабельніший. |
| `switch` | Вибирає одну гілку виконання залежно від конкретного значення. | `switch (role)` | Забути `break` у старому синтаксисі й випадково перейти до наступного `case`. |


1. Чому для порівняння чисел використовують `==`, а не `=`? - == — порівнює значення, = — присвоює значення змінній.
2. Чим `&&` відрізняється від `||`? - && (І) — усі умови мають бути true, || (АБО) — достатньо, щоб хоча б одна умова була true.
3. Що таке short-circuit evaluation? - Це коли Java не перевіряє другу умову, якщо результат уже відомий
4. Коли ternary operator робить код кращим? - Коли потрібно коротко присвоїти одне з двох значень
5. Коли ternary operator робить код гіршим? - Коли умова довга або вкладена (?: всередині ?:)
6. Коли `switch` читабельніший за багато `else if`? - Коли потрібно порівняти одну змінну з багатьма можливими значеннями (наприклад, день тижня, номер місяця, команда меню)


---------------------

```java
boolean canApplyDiscount = isStudent && age < 30 || hasCoupon;
```

| `isStudent` | `age < 30` | `hasCoupon` | `canApplyDiscount` |
|---|---|---|---|
| `false` | `false` | `false` | `false` |
| `false` | `false` | `true` | `true` |
| `false` | `true` | `false` | `false` |
| `false` | `true` | `true` | `true` |
| `true` | `false` | `false` | `false` |
| `true` | `false` | `true` | `true` |
| `true` | `true` | `false` | `true` |
| `true` | `true` | `true` | `true` |

```java
boolean canApplyDiscount = (isStudent && age < 30) || hasCoupon;
```

-------------------------

## День 5. Керована практика

### Експерименти з умовами

| Експеримент | Input | Очікувано | Отримано | Читабельність |
|---|---|---|---|---|
| Категорія числа | `-4` | `negative` | `negative` | Послідовність `positive`, `negative`, `zero` зрозуміла. |
| Категорія віку | `16` | `teenager` | `teenager` | Межі перевіряються від меншої до більшої. |
| Парність | `-4` | `true` | `true` | Перевірка через `% 2` коротка й однозначна. |
| Діапазон | `15` | `true` | `true` | Обидві межі об'єднані через `&&`. |
| Доступ | admin: `false`, token: `true` | `true` | `true` | `||` показує, що достатньо однієї умови. |
| Заперечення token | `true` | `false` | `false` | `!hasValidToken` читається зрозуміло. |
| Ternary | `-4` | `even` | `even` | Доречний, бо вибір має лише два короткі значення. |
| `switch` | `3` | `Wednesday` | `Wednesday` | Доречний для фіксованих номерів днів. |

### Порядок `else if`

- Input: `92`.
- Правильний порядок `>= 90`, `>= 75`, `>= 60` дає `A`.
- Якщо поставити `score >= 60` першим, результат буде `C`.
- Причина: ланцюжок зупиняється на першій істинній умові, тому перевірки
  діапазонів мають іти від найвужчої верхньої категорії до нижчої.

### Short-circuit evaluation

Для `denominator = 0` умова
`denominator != 0 && 100 / denominator > 5` повернула `false` без помилки.
Ліва частина вже має значення `false`, тому Java не обчислює ділення.
Якщо замінити `&&` на `&`, обидві частини будуть обчислені й виникне
`ArithmeticException: / by zero`. Та сама властивість дозволяє спочатку
перевірити reference на `null`, а лише потім викликати його метод.

## День 5. Самостійні завдання

### FizzBuzz

| Input | Прогноз | Перевірений результат |
|---:|---|---|
| `15` | `FizzBuzz` | `FizzBuzz` |
| `10` | `Fizz` | `Fizz` |
| `9` | `Buzz` | `Buzz` |
| `7` | `7` | `7` |
| `0` | `FizzBuzz` | `FizzBuzz` |
| `-15` | `FizzBuzz` | `FizzBuzz` |

Нуль і від'ємні числа підтримують оператор `%`: `0` ділиться без остачі на
`3` і `5`, а `-15` також має нульову остачу для обох дільників.

### TaxCalculator

Податок у завданні рахується як одна ставка від усього доходу, а не як
прогресивна сума за частинами діапазонів.

| Income | Rate | Tax | Net income | Очікувано? |
|---:|---:|---:|---:|---|
| `0` | `0%` | `0.00` | `0.00` | Так |
| `10000` | `0%` | `0.00` | `10000.00` | Так |
| `10001` | `10%` | `1000.10` | `9000.90` | Так |
| `40000` | `10%` | `4000.00` | `36000.00` | Так |
| `40001` | `20%` | `8000.20` | `32000.80` | Так |
| `100000` | `20%` | `20000.00` | `80000.00` | Так |
| `100001` | `30%` | `30000.30` | `70000.70` | Так |

Негативний дохід відхиляється. У консольному виводі ставка форматується як
відсоток, а податок і чистий дохід — через `NumberFormat`.

### BmiCalculator

Перевірені категорії: `18.49` — `Underweight`, `18.5` — `Normal`,
`24.99` — `Normal`, `25` — `Overweight`, `29.99` — `Overweight`,
`30` — `Obese`. Нульова вага та нульовий зріст відхиляються до обчислення,
тому ділення на нуль неможливе.

### `if`, ternary і `switch`

- `switch` підходить, коли одна змінна порівнюється з фіксованими значеннями,
  наприклад номерами днів тижня.
- Для BMI потрібні порівняння діапазонів, тому `if / else if / else`
  читається природніше.
- Ternary доречний для короткого вибору одного з двох значень. Вкладені або
  довгі ternary-вирази краще замінити звичайним `if`.

## День 5. Перевірка та рефакторинг

### Досліджені логічні помилки

1. Якщо у FizzBuzz перевірити кратність `5` раніше за кратність `3` і `5`,
   input `15` дасть `Fizz`, бо перша істинна гілка зупинить ланцюжок.
   Виправлення: спочатку перевіряти обидва дільники.
2. Якщо першу межу TaxCalculator записати як `income > 10000`, input `0`
   потрапить не в той діапазон. Виправлення: перша умова — `income <= 10000`,
   наступні межі теж перевіряються через `<=`.
3. Без перевірки `height > 0` значення `height = 0` дасть нескінченний BMI
   замість коректної помилки. Виправлення: відхиляти вагу або зріст `<= 0`
   до виклику формули.

Фінальний код не містить цих навмисних помилок. Межі винесені в константи,
умови розташовані в правильному порядку, а розрахунки відокремлені від
консольного input для автоматичної перевірки.

### Виконані перевірки

- `mvn test` — успішна компіляція і тести.
- Запущені `ControlFlowExperiments`, `FizzBuzz`, `TaxCalculator` і
  `BmiCalculator`.
- `FizzBuzz`, `TaxCalculator` і `BmiCalculator` скомпільовані вручну через
  `javac` у `/tmp/codewithmosh-day5`.
- Граничні значення перевіряються у `Day5CalculatorsTest`.

## День 5. Контрольні запитання

1. `if` виконує блок коду лише тоді, коли його умова має значення `true`.
2. У ланцюжку `else if` виконується максимум одна гілка, а окремі `if`
   перевіряються незалежно.
3. `else` виконується, якщо всі попередні умови ланцюжка були `false`.
4. `=` присвоює значення, а `==` порівнює два значення.
5. `&&` потребує істинності обох частин, `||` — хоча б однієї.
6. `!` інвертує boolean-значення.
7. Short-circuit evaluation пропускає праву частину `&&` або `||`, якщо
   результат уже відомий з лівої частини.
8. У FizzBuzz спочатку потрібна перевірка на `3` і `5`, інакше `15`
   зупиниться на простішій перевірці й не дасть `FizzBuzz`.
9. Ternary варто використовувати для короткого вибору одного з двох значень.
10. Його не варто використовувати для довгих, вкладених або багатокрокових умов.
11. `switch` читабельніший для набору фіксованих значень однієї змінної.
12. BMI визначається діапазонами, які звичайний `switch` не описує природно.
13. У TaxCalculator треба перевірити самі межі та числа з обох боків:
    `10000/10001`, `40000/40001`, `100000/100001`, а також `0` і негативне число.
14. Перевірка `height > 0` захищає формулу від ділення на нуль і
    беззмістовних від'ємних даних.

## День 5. Підсумок

### Що я сьогодні вивчив

- Навчився керувати виконанням програми через `if`, `else if` і `else`.
- Розібрався з операторами `&&`, `||`, `!` та short-circuit evaluation.
- Зрозумів, коли краще використовувати ternary operator, а коли `switch`.

### Що я зробив самостійно

- Реалізував `FizzBuzz` і перевірив числа, кратні `3`, `5`, обом числам та
  жодному з них.
- Створив `TaxCalculator` і `BmiCalculator`, додав валідацію input та
  перевірив граничні значення.

### Де мій прогноз не збігся з результатом

- Спочатку очікував, що для `0` FizzBuzz виведе саме число. Після перевірки
  побачив `FizzBuzz`, тому що `0 % 3 == 0` і `0 % 5 == 0`.
- Не одразу врахував, що BMI рівно `25` уже належить до категорії
  `Overweight`, а не `Normal`.

### Які помилки я зустрів

- Помилка: у FizzBuzz проста перевірка кратності `5` стояла перед перевіркою
  кратності `3` і `5`.
  Причина: для `15` виконувалася перша істинна гілка й програма повертала
  `Fizz`.
  Виправлення: переніс комбіновану умову на початок ланцюжка.
- Помилка: граничне значення податкового діапазону потрапляло до наступної
  ставки.
  Причина: використав `<` замість `<=`.
  Виправлення: явно включив межі `10000`, `40000` і `100000`.
- Помилка: формула BMI допускала нульовий зріст.
  Причина: обчислення виконувалося до валідації input.
  Виправлення: додав перевірку ваги та зросту перед розрахунком.

### Що я змінив після порівняння з рішенням курсу

- Спростив FizzBuzz до одного впорядкованого ланцюжка `if / else if / else`.
- Залишив ternary operator лише для короткого вибору між двома значеннями.
- Виніс межі TaxCalculator і BmiCalculator у константи, щоб уникнути magic
  numbers.

### Що залишилося незрозумілим

- Потрібно краще закріпити різницю між short-circuit операторами `&&`, `||`
  і звичайними boolean-операторами `&`, `|`.

### Що потрібно повторити завтра

- Порядок перевірки умов у ланцюжках `else if`.
- Граничні значення діапазонів і використання `<`, `<=`, `>` та `>=`.
- Short-circuit evaluation на прикладах із `null` і діленням на нуль.

### Фактичний час

- Повторення і допуск: 30 хв.
- Курс: 90 хв.
- Керована практика: 65 хв.
- Самостійне завдання: 115 хв.
- Перевірка та рефакторинг: 30 хв.
- Підсумок: 20 хв.
- Разом: 5 год 30 хв.

---

## День 6. Цикли

### Повторення й ключові поняття

- `for` доречний, коли відомі initialization, condition та update лічильника.
- `while` зручний, коли кількість повторень наперед невідома, наприклад під
  час читання input до sentinel.
- `do-while` виконує body щонайменше один раз.
- `break` завершує цикл, а `continue` переходить до наступної iteration.
- For-each доречний, коли потрібні значення, але не index.
- У `while` після `continue` легко пропустити update й отримати infinite loop.

Для short-circuit виразу `denominator != 0 && 100 / denominator > 1`
результат `false`: права частина не виконується, тому division by zero немає.
Вираз `isStudent && 20 < 30 || hasCoupon` дає `true`: ліва conjunction стає
`false` без перевірки `20 < 30`, після чого `hasCoupon` робить disjunction
істинною.

### Виконані задачі

- `LoopExperiments` рахує суму `1..5` через `for`, `while` і `do-while` та
  демонструє `break`, `continue` і for-each.
- `DigitSum` арифметично відділяє останню цифру через `% 10`, додає її й
  відкидає через `/ 10`. Перехід до `long` перед `Math.abs` покриває
  `Integer.MIN_VALUE`.
- `FactorialCalculator` починає accumulator з `1`; `0! = 1`, а input поза
  `0..20` відхиляється, бо `21!` не поміщається в `long`.
- `PalindromeChecker` будує reversed value у `long`, не використовуючи String.
- `PrimeChecker` перевіряє divisors, поки `divisor <= number / divisor`.
  Далі перевіряти не треба: якщо число складене, хоча б один парний до нього
  дільник не перевищує квадратний корінь.
- `SecondLargestFinder` за один прохід підтримує два різні максимуми, не
  сортує й не змінює array.
- `MultiplicationTable` використовує nested loops для таблиці 10 × 10 та
  окремого ряду для заданого числа.

### Досліджені помилки

1. `i--` у зростаючому `for` віддаляє counter від умови завершення й створює
   infinite loop; виправлення — `i++`.
2. Factorial accumulator `0` робить результат будь-якого додатного input
   нульовим; multiplicative identity має бути `1`.
3. Якщо дозволити `value == largest` оновлювати другий максимум, `{9, 9, 7}`
   дасть `9`; equality треба виключити.

### Підсумок

- Основна логіка відокремлена від `main` та `Scanner`.
- Додані автоматичні normal, boundary і invalid scenarios.
- Найважливіші ризики: off-by-one, незмінний condition state і overflow.
- Ручний перегляд уроків Control Flow 9–16 та фіксація фактичного часу не
  підтверджувалися в CLI й залишаються особистим навчальним кроком.

---

## День 7. Контрольна робота №1

### План рішення

Input — послідовність integer tokens; `done` або EOF завершує введення.
Нечисловий token потрібно спожити, інакше `Scanner` нескінченно бачитиме те
саме значення. Output для непорожнього набору: count, min, max, average,
evenCount та oddCount. Для порожнього набору розрахунок відхиляється, а CLI
показує `No numbers entered`.

### Реалізація та review

- `NumberAnalyzer.main` відповідає лише за input/output.
- `analyze(List<Integer>)` обчислює статистику без console dependencies.
- `NumberStatistics` групує result values і не має mutable state.
- Перший елемент ініціалізує min/max, тому рішення працює для повністю
  від'ємного input.
- Сума має тип `long`, average використовує явне floating-point division.
- Нуль є even; дублікати беруть участь у count і average.
- Empty input відхиляється до division, тож division by zero неможливе.

Для `5 -2 8 8 0` отримуємо count `5`, min `-2`, max `8`, sum `19`, average
`3.8`, even `4`, odd `1`. Для `-3` min і max дорівнюють `-3`, average `-3.0`.

### Відповіді для повторення

1. `javac` компілює source у bytecode, JVM завантажує й виконує `.class`.
2. Primitive містить value, reference variable посилається на object.
3. Narrowing потребує explicit cast і може втратити дані.
4. Десяткові дроби часто не мають точного binary floating-point подання.
5. Array створюється з фіксованою length і читається через index або for-each.
6. `toString` форматує один dimension, `deepToString` — вкладені arrays.
7. Precedence визначає порядок operators без parentheses.
8. Неправильний token треба перевірити й спожити перед повтором Scanner loop.
9. Validation захищає invariants і не допускає беззмістовний calculation.
10. `NumberFormat` форматує currency, percent та number для locale.
11. `if` природний для ranges, `switch` — для discrete cases одного selector.
12. `&&`/`||` не виконують праву частину, якщо result уже відомий.
13. Обидва боки boundary знаходять `<` проти `<=` errors.
14. `for` — коли iteration structure відома.
15. `while` — коли завершення залежить від події або input.
16. `do-while` виконає body хоча б один раз.
17. `break` завершує loop, `continue` пропускає залишок iteration.
18. For-each не підходить, якщо потрібен index або зміна структури.
19. Off-by-one — зайва або пропущена iteration на межі.
20. Calculation приймає parameters і повертає result; I/O лишається caller-у.

### Підсумок

Реалізовані всі шість показників, invalid і empty input обробляються явно,
логіка має regression tests. Обмеження «90 хв без підказок» та фактичний час
є особистою частиною контрольної й автоматично не підтверджувалися.

---

## День 8. Методи та рефакторинг

### Аналіз до рефакторингу

Початковий `MortgageCalculator` зберігав principal, interest, period і result у
mutable fields, тому formula залежала від попереднього порядку calls. Межа
principal у condition була `100`, хоча prompt вимагав `1000`. `nextInt` і
`nextDouble` падали на неправильному token. Calculation, formatting та input
були сильно зв'язані, а Payment Schedule був відсутній.

### Зміни після рефакторингу

- Межі `1000..1000000`, `(0..30]`, `1..30`, months/year і percent винесені в
  named constants.
- `calculatePayment` є pure static calculation із parameters.
- `remainingBalance` і `paymentSchedule` не залежать від console state.
- `readInt` та `readDouble` споживають invalid token і повторюють prompt.
- Проміжні mutable fields видалені; formatting виконується після calculation.
- Для `100000`, `6%`, `30 років` payment приблизно `599.55`, schedule містить
  `360` balances і завершується нулем у межах floating-point tolerance.

### Власний Clean Code checklist

1. Назва передає intent і не потребує пояснювального коментаря.
2. Метод має одну відповідальність.
3. Calculation відокремлений від input/output і formatting.
4. Magic numbers замінені named constants.
5. Validation rules не дублюються.
6. Немає mutable fields для локального проміжного стану.
7. Public method явно визначає invalid input.
8. Boundary cases покриті tests.
9. Коментар пояснює причину, а не переказує syntax.
10. Рефакторинг зберігає поведінку, підтверджену regression tests.

### Підсумок

Payment Schedule завершено, formula testable без Scanner, invalid console
input більше не спричиняє `InputMismatchException`. Відеоуроки Clean Coding
1–10 і фактичний час не можна підтвердити інструментально; їх треба пройти й
зафіксувати особисто.

---

## День 9. Debugging, packaging і Maven

### Три типи помилок

1. Compile-time: тестовий `/tmp/codewithmosh-day9/BrokenSyntax.java:3` без
   `;` дав `error: ';' expected`; виконання не починається. Фінальний source
   проєкту має коректний syntax.
2. Runtime: тестовий `RuntimeFailure.divide(RuntimeFailure.java:3)` виконав
   integer division на zero й дав `ArithmeticException: / by zero`; метод
   `divide` тепер перевіряє divisor і повертає зрозумілий
   `IllegalArgumentException`. Regression test перевіряє цю поведінку.
3. Logic: condition `number < limit` для inclusive sum пропускає `limit`, тому
   для `5` результат `10` замість `15`. Correct condition — `<=`; regression
   test очікує `15`.

### Як читати stack trace й діагностувати помилку

1. Відтворити її мінімальним стабільним input.
2. Прочитати exception type та message.
3. Знайти перший frame із власного package: це найкорисніша стартова точка,
   але не завжди root cause.
4. Перевірити values і branch до проблемного line.
5. Використати breakpoint, Step Over, Step Into, Step Out і watches.
6. Внести мінімальний fix, додати regression test, повторити весь relevant set.

### Maven packaging

- `compile` створює production `.class` у `target/classes`.
- `test` також компілює tests у `target/test-classes` і запускає їх.
- `package` після перевірок створює JAR у `target`.
- `META-INF/MANIFEST.MF` містить `Main-Class: daniil.dumshenko.LearningApp`.
- `LearningApp` не очікує interactive input, тому JAR можна стабільно запускати
  командою `java -jar target/CodeWithMosh-1.0-SNAPSHOT.jar`.

### Ручний debugger checklist

- Breakpoint перед зміною `sum`.
- Watch: `number`, `limit`, `sum`.
- Step Over для iteration, Step Into/Out для method calls.
- Conditional breakpoint `number == limit`.
- Frames для визначення caller та callee.

Ці IDE-дії залишаються ручною перевіркою: CLI не підтверджує, що breakpoint-и
фактично були пройдені. Так само перегляд курсу й фактичний навчальний час має
внести користувач після власного проходження.
----------------------------------------


| Поняття | Власне пояснення | Приклад |
|---|---|---|
| Class |Шаблон (опис), за яким створюються об'єкти. |class Car {} |
| Object / instance |Об'єкт - конкретна реалізація класу. |Car car = new Car(); |
| Field |Змінна, яка зберігає дані в об'єкті. |int speed; |
| Method |Функція, яка виконує дії з об'єктом. |void accelerate() {} |
| Constructor |Спеціальний метод, який викликається при створенні нового об'єкта. |Car(int speed) {} |
| Reference |Змінна, яка містить посилання на об'єкт. |Car car; |
| State |Состояння об'єкта, яке визначає його поточний стан. |int speed = 0; |
| Behavior |Дії, які можуть виконуватися об'єктом. |accelerate() |
| Stack |Стек викликів, де зберігаються інформація про поточний виклик та локальні змінні. | |
| Heap |Пам'ять для зберігання об'єктів. | |
| Garbage collection |Автоматичне збірка непотрібних об'єктів, щоб звільнити пам'ять. | |

-------------------

## День 10. Керована практика: objects, references і пам'ять

### Два незалежні objects

Створено два objects окремими викликами `new`:

```java
Money salary = new Money(2500, "EUR");
Money savings = new Money(1000, "EUR");
```

Після `salary.changeAmount(5000)` стан `salary` змінився на `5000 EUR`, а
стан `savings` залишився `1000 EUR`. Кожен виклик `new` створив у heap окремий
object із власними fields, тому зміна першого object не впливає на другий.

```text
Stack frame main                 Heap

salary  -----------------------> Money { amount=5000, currency="EUR" }
savings -----------------------> Money { amount=1000, currency="EUR" }
```

### Дві references на один object

Після `Money sameReference = salary;` новий `Money` не створюється. Значення
reference із `salary` копіюється в `sameReference`, тому обидві local variables
ведуть до того самого object:

```text
Stack frame main                 Heap

salary -----------+
                   +-----------> Money { amount=5000, currency="EUR" }
sameReference ----+

savings -----------------------> Money { amount=1000, currency="EUR" }
```

Після `sameReference.changeAmount(3000)` читання через `salary` також показало
`3000 EUR`: змінено один спільний object, а не самі references.

### Коли object стає недосяжним

Після `salary = null` object ще досяжний через `sameReference`:

```text
Stack frame main                 Heap

salary: null
sameReference ----------------> Money { amount=3000, currency="EUR" }
```

Після `sameReference = null` у програмі більше немає reference, через яку можна
дістатися цього object:

```text
Stack frame main                 Heap

salary: null                     Money { amount=3000, currency="EUR" }
sameReference: null              (немає доступної reference)
```

Object став недосяжним і придатним для подальшого garbage collection. Це не
означає негайного видалення: JVM самостійно визначає момент запуску garbage
collector.

### Фактичний результат запуску

```text
Initial state:
2500 EUR
1000 EUR
After changing salary only:
5000 EUR
1000 EUR
After changing the object through sameReference:
3000 EUR
The object is still reachable through sameReference:
3000 EUR
The Money object is now unreachable and eligible for garbage collection.
```
