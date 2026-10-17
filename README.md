# SonarSumProject

Java sample based on the sum-of-numbers program, with repeated statements included for a SonarQube duplicate-code demonstration.

## Run locally
Requires a JDK:
```bash
javac src/main/java/Main.java
java -cp src/main/java Main
```
Enter an integer such as `10`.

## Analyze with SonarQube
1. Compile the Java source first:
   ```bash
   mkdir -p target/classes
   javac -d target/classes src/main/java/Main.java
   ```
2. Make sure SonarQube Server is running and SonarScanner CLI is installed.
3. From the project root, run:
   ```bash
   sonar-scanner -Dsonar.host.url=http://localhost:9000 -Dsonar.token=YOUR_TOKEN
   ```
4. Open the project in the SonarQube dashboard and inspect Measures / Duplications.

Note: Duplication detection is based on SonarQube's thresholds and may not flag every repeated-looking snippet. Do not include your token in this repository.
