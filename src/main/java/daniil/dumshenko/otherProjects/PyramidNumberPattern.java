package daniil.dumshenko.otherProjects;

public class PyramidNumberPattern {
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
  }
