### You can choose to code in python or java
#### How to read the dataset and API to develope is available in java and python (you can modify as you wish, output should be same as expected.
#### Data is available in data folder

#### Credit: The dataset is prepared using [Squad 2.0](https://rajpurkar.github.io/SQuAD-explorer/)

- Problem Details: You are given a list of questions and ranks associated with each question

- The problem is to implement an auto search fill algorithm, please try google 
- google search is contextual 
- this is in my word preogressive seach
- search what
- search what is
- search what is the 
  - result changes have you ever thought how, heree is a chance implement them

Say a sample dataset has the below data:

Q: What is the population of India?<br>
Rank: 3<br>
Q: What is the population of Indonesia?<br>
Rank: 1<br>
Q: Who is the Indian PM?<br>
Rank: 2<br>

- A query for the string 'what is' gives:
  - What is the population of Indonesia?<br>
  - What is the population of India?<br>

- A query for the string 'ind' has to be result in (has to be ordered by rank):
  - What is the population of Indonesia?<br>
  - Who is the Indian PM?<br>
  - What is the population of India?<br>

- A query for the string 'population of' gives:
  - What is the population of Indonesia?<br>
  - What is the population of India?<br>

A query for the string 'plation' gives no output as this is not a substring of any query 
  
- Dataset: is available in the data folder

- Evaluation: Time 500 ms per query
  - Max memory usage 512 MB
  
  
