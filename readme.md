# Adapter Pattern Example

Alejandro Hahn
A01561774

## Requirements

- Kotlin compiler (kotlinc), the command must be on the PATH
- Most recent version of JDK

## Running the project

### Powershell script (Windows)

Execute ```./run``` using powershell  in the root of the project

### Manual execute

Run the following commands on root

```
mkdir dist
kotlinc src -include-runtime -d dist/program.jar
java -jar dist/program.jar
```