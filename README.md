# Install and using template

- IntelliJ
- Plugin:
  - Leetcode editor

**Note:** Remember turned on:
- Custom Template
- Cookie
- Multiline

```
$!velocityTool.camelCaseName(${question.titleSlug})
```
```java
package rocks.somesandwich.leetcode;

// ${question.frontendQuestionId}.${question.title}
public class $!velocityTool.camelCaseName(${question.titleSlug}) {
    public static void main(String[] args) {
        Solution solution = new $!velocityTool.camelCaseName(${question.titleSlug})().new Solution();
    }

    ${question.code}
}
```