### You can choose to code in python or java
### How to read the dataset and API to develope is available in respective python java folder
### Data is available in data folder

- Problem Details: You are given a list of questions and ranks associated with each question

The problem is to implement an auto fill algorithm for the data set such that, the search query may match beginning of the words anywhere in the question

Say a sample dataset has the below data:

Q: What is the population of India?<br>
Rank: 3<br>
Q: What is the population of Indonesia?<br>
Rank: 1<br>
Q: Who is the Indian PM?<br>
Rank: 2<br>

A query for the string 'ind' has to be result in (has to be ordered by rank):

What is the population of Indonesia?<br>
Who is the Indian PM?<br>
What is the population of India?<br>

A query for the string 'population of' gives:

What is the population of Indonesia?<br>
What is the population of India?<br>

A query for the string 'pulation' gives no output
  
- Dataset: is available in the data folder

- Evaluation: Time 500 ms per query
              Max memory usage 512 MB
  
  
