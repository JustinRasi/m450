### JUnit Features-Zusammenfassung

#### 1. Annotations

- Annotations in JUnit werden verwendet, um Tests zu kennzeichnen und bestimmte Aktionen auszuführen.

- *Beispiel:*
  ```java
  @Test
  public void testAddition() {
      // Test code here
  }
  ```

#### 2. Assertions

- Assertions prüfen, ob eine bestimmte Bedingung wahr ist. Falls nicht, wird der Test fehlschlagen.

- *Beispiel:*
  ```java
  assertEquals(4, calculator.add(2, 2));
  ```

#### 3. Test Suites

- Test-Suiten ermöglichen die Gruppierung mehrerer Testklassen, um sie gemeinsam auszuführen.

- *Beispiel:*
  ```java
  @RunWith(Suite.class)
  @SuiteClasses({TestClass1.class, TestClass2.class})
  public class TestSuite {
      // Suite definition
  }
  ```

#### 4. Parameterized Tests

- Parameterisierte Tests erlauben es, einen Test mehrmals mit unterschiedlichen Eingaben auszuführen.

- *Beispiel:*
  ```java
  @ParameterizedTest
  @ValueSource(ints = {1, 2, 3})
  public void testMultiply(int value) {
      // Test code with parameter
  }
  ```

#### 5. Before and After Hooks

- Diese Hooks ermöglichen das Ausführen von Code vor bzw. nach jedem Test.

- *Beispiel:*
  ```java
  @Before
  public void setUp() {
      // Setup code
  }

  @After
  public void tearDown() {
      // Cleanup code
  }
  ```

### Referenz

[JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
