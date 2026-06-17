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

