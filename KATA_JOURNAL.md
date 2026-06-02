# Kata Journal

Personal log of completed kata-style exercises.

---

## Kata 1 — "Loan Eligibility Checker" `6 kyu`

### Task

A bank needs a simple eligibility checker. Write a method `checkEligibility` that takes three parameters:

- `int age` — applicant's age
- `double annualIncome` — yearly income in USD
- `double existingDebt` — current total debt in USD

Return a `String` result:

- `"Approved"` — if age is between 18–65 (inclusive), income ≥ 30 000, and debt-to-income ratio (`existingDebt / annualIncome`) is below 0.4
- `"Rejected"` — otherwise

**Examples**

| Call | Result | Reason |
|---|---|---|
| `checkEligibility(25, 50000, 10000)` | `"Approved"` | ratio = 0.2 |
| `checkEligibility(17, 50000, 5000)` | `"Rejected"` | too young |
| `checkEligibility(30, 25000, 5000)` | `"Rejected"` | income too low |
| `checkEligibility(35, 40000, 18000)` | `"Rejected"` | ratio = 0.45 |

**Notes**
- Do not use any external libraries
- Handle edge case: `annualIncome == 0` must return `"Rejected"`

---

### My Solution

```java
public String checkEligibility(int age, double annualIncome, double existingDebt) {
    if (annualIncome == 0) return "Rejected";

    double debtToIncomeRatio = existingDebt / annualIncome;

    if (age >= 18 && age <= 65 && annualIncome >= 30_000 && debtToIncomeRatio < 0.4)
        return "Approved";
    else
        return "Rejected";
}
```

---

### Review

**Score: 7 / 10**

#### Mistakes

| # | Mistake | How it was fixed |
|---|---|---|
| 1 | `annualIncome == 0` check was placed **after** the division — caused incorrect behavior (`Infinity` instead of `"Rejected"`) | Moved the guard clause to the very top, before any division |
| 2 | Edge case return value was `"False input: income cannot be 0"` instead of `"Rejected"` as required by the spec | Changed to `"Rejected"` |
| 3 | Stray `;` after method closing brace | Removed |

#### What went well
- Condition logic was correct and readable
- Used `30_000` numeric literal separator — good Java habit
- `else return` kept the method concise

---

## Kata 2 — "Pyramid Number Pattern" `7 kyu`

### Task

Write a method `buildPyramid` that takes a positive integer `n` and returns a `String` representing a number pyramid.

Each row `i` (1-indexed) contains numbers from `1` to `i`, separated by spaces.
Rows are separated by `\n`. No trailing newline at the end.

**Examples**

```
buildPyramid(1) → "1"

buildPyramid(4) →
1
1 2
1 2 3
1 2 3 4
```

**Constraints**
- `1 <= n <= 20`
- No trailing spaces on any line
- No trailing newline at the end

---

### My Solution

```java
public String buildPyramid(int n) {
    if (n < 1 || n > 20) return "Invalid input";

    StringBuilder sb = new StringBuilder();

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            sb.append(j);
            if (j < i) sb.append(" ");
        }
        sb.append("\n");
    }

    return sb.deleteCharAt(sb.length() - 1).toString();
}
```

---

### Review

**Score: 9 / 10**

#### Mistakes

| # | Mistake | How it was fixed |
|---|---|---|
| 1 | Trailing `\n` was appended after the last row, violating the "no trailing newline" constraint | Used `sb.deleteCharAt(sb.length() - 1)` after the loop to remove the final `\n` |
| 2 | Stray `};` after class closing brace in first version | Removed |

#### What went well
- `StringBuilder` used correctly for efficient string building
- Trailing space handled cleanly with `if (j < i)` condition
- Self-corrected the trailing newline issue independently after a hint
