# Получение файла `properties` из `pom.xml`

Используется плагин `properties-maven-plugin`. Его нужно установить как показано в `pom.xml`.
После запуска команды

```bash
mvn generate-test-resources
```

в папке `target` появляется файл со свойствами, извлеченными из секции `properties`.
