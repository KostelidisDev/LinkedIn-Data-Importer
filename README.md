# LinkedIn Data Importer

## Overview

The LinkedIn Data Importer is a Maven module designed to simplify the extraction of biographical information from LinkedIn Export ZIP files. This library provides a convenient way to parse the exported data and convert it into a Java object, making it easier for developers to integrate LinkedIn data into their applications.

## Features

- **LinkedIn Export ZIP Parsing:** Efficiently parses LinkedIn Export ZIP files.
- **Biographical Information:** Extracts and organizes biographical information, including personal details, education, work experience, skills, and more.
- **Java Object Representation:** Returns a structured Java object for easy integration into your applications.
- **Maven Compatibility:** Easily include the library in your Maven projects.

## Usage

### 0. Install

Clone this repository and install the library:

```bash
git clone https://github.com/KostelidisDev/LinkedIn-Data-Importer.git
cd LinkedIn-Data-Importer
mvn package install
```

### 1. Add Dependency

Add the following dependency to your Maven project:

```xml
<dependency>
    <groupId>gr.ihu.ict</groupId>
    <artifactId>linkedin-data-importer</artifactId>
    <version>2.1-SNAPSHOT</version>
</dependency>
```

### 2. Parse LinkedIn Export ZIP

```java
import java.io.File;

import gr.ihu.ict.linkedin.data.importer.model.LinkedInData;
import gr.ihu.ict.linkedin.data.importer.service.LinkedInDataImporter;
import gr.ihu.ict.linkedin.data.importer.service.LinkedInDataImporterImpl;

public class Demo {
    public static void main(String[] args) {
        final File zipFile = new File("src/test/resources/Basic_LinkedInDataExport_01-29-2022.zip");
        final LinkedInDataImporter linkedInDataImporter = new LinkedInDataImporterImpl();
        final LinkedInData linkedInData = linkedInDataImporter.parseZip(zipFile);
        final String firstName = linkedInData.getProfile().getFirstName();
        System.out.println(firstName);
    }
}
```

## Contribution

Contributions are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

## License

This Library (LinkedIn Data Importer) is licensed under the [MIT License](LICENSE). See the [LICENSE](LICENSE) file for more details.

## Acknowledgments

This README.md has generated using OpenAI's ChatGPT and modified by [me](https://github.com/IordanisKostelidis)
