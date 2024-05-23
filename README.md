# name-sorter

## Project Overview
This application reads a list of names from a specified text file, sorts them by last name (and by first name if last names are identical), and outputs the sorted list both to the console and to a new file called `sorted-names-list.txt`.

## Prerequisites
- Java 17 installed on your machine.

## Installation
- in Linux, open the terminal/command line
```bash
# navigate to desired directory then use the following command
git clone https://github.com/nickypelo/name_sorter
cd name_sorter
ls

# your output will be something like this 
filename.txt  MANIFEST.MF  name-sorter.jar  pom.xml  README.md  src  target

```

### Building from the source
If you prefer to build the project from source, ensure you have Maven installed:
```bash
mvn clean install
# This will compile the project and create the JAR file in the target directory.
```

## Usage
- Ensure you have java-17 installed in your machine
- Use the provided JAR package `name-sorter.jar` with files having the `.txt` extension.
    - Note: CSV or other file formats are not supported.
- Ensure the `name-sorter.jar` file is in the same directory as the `.txt` file that has the names you want sorted.

### Running the Application
- To sort the names in the file `filename.txt`, use the following command:
```bash
# use this code in terminal
java -jar name-sorter.jar ./filename.txt
```

## Example
- Given an input file `filename.txt` containing:
```bash
Janet Parsons
Vaugh Lewis
Adonis Julius Archer
Shelby Nathan Yoder
Marin Alvarez
London Lindsey
Beau Tristan Bentley
Leo Gardner
Hunter Uriah Mathew Clarke
Mikayla Lopez
Frankie Conner Ritter
```

- Running the application will produce the following output in `sorted-names-list.txt` and print it to the console:

```bash
# output
Marin Alvarez
Adonis Julius Archer
Beau Tristan Bentley
Hunter Uriah Mathew Clarke
Leo Gardner
Vaughn Lewis
London Lindsey
Mikayla Lopez
Janet Parsons
Frankie Conner Ritter
Shelby Nathan Yoder
```

## Additional Notes
- The application handles names with up to three given names and 1 lastname
- Names with more than 3 given names will be ignored and skipped in the output.
- Ensure the `.txt` file strictly follows the format of having at least one given name and one last name.
- Ensure that the `.txt` file has 1 fullname (given names and last names) on each line
