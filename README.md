# ReadibilityScore
# Final Stage - (Hyper_Skill project)

Stage4 is a program that analyzes the readability of a text file and provides information about its content. It calculates various metrics such as the number of characters, words, sentences, and a readability score based on these metrics. Additionally, it estimates the age range of readers who can understand the text.

## Description

The Stage4 program takes an input file path as a command-line argument and reads the content of the specified file. It then performs the following operations:

1. Reads the text file and stores the content in a string.
2. Counts the number of characters in the text (excluding white spaces).
3. Counts the number of words in the text.
4. Counts the number of sentences in the text.
5. Calculates a readability score using the following formula:
   - `score = 4.71 * (characters / words) + 0.5 * (words / sentences) - 21.43`
6. Determines the age range of readers who can understand the text based on the calculated score.
7. Displays the text, word count, sentence count, character count, readability score, and the estimated age range.

## Usage

To run the Stage4 program, open a command prompt or terminal and navigate to the directory containing the compiled Java class file (`Stage4.class`). Then, execute the following command: java Stage4 <input_file_path>


Replace `<input_file_path>` with the path to the text file you want to analyze.

## Input File Format

The Stage4 program expects the input text file to be in plain text format (e.g., `.txt` file). The file should contain the text you want to analyze.

## Example Output

Here's some examples of the output produced by the Stage4 program:

The text is:
I like to go for walks in the park.
Words: 9
Sentences: 1
Characters: 31
The score is: 6.33
This text should be understood by readers in grades 7-8.

The text is:
The mesmerizing sunset painted the sky in a vivid tapestry of vibrant hues, casting a warm glow over the tranquil lake.
Words: 18
Sentences: 1
Characters: 98
The score is: 14.11
This text should be understood by readers in grades 9-10.



The output displays the text, the word count, the sentence count, the character count, the readability score, and the estimated age range.


## Author
Devnash Brahmbhatt

