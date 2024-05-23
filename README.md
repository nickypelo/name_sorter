# name_sorter
A java application that takes a Textfile filled with a list people's firstname and lastname, and sorts it in ascending order based on the lastname.

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
- Sample TextFile named "filename.txt" is provided. Run the following:
```bash
java -jar name-sorter.jar ./filename.txt
```

## Usage
- Ensure you have java-17 installed in your machine
- The jar package [name-sorter.jar](./name-sorter.jar) is to be used strictly with files with .txt extension 
    - That means a csv is not allowed (as instructed)
- Ensure the name-sorter.jar file is in the same directory as the .text file that has the names you want sorted.