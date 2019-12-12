### You can choose to code in python or java


- API Details which needes to be coded

- class Doc{
- String text;
-   Object id;
- }

  - Python
    - Given a search (Question) one needs to output top n (1-10) relavant documnent_id
      - def search(query, n)
    
  - Java
    - public List<Doc> search(String query, int n)
  

- Problem Details
  - Welcome to NLP Search hackathon.Given the data set with "document","question","title","document_id" attributes,One has to   - build a sophisticated document search system for the given question
  - The answer to a question is might be available in one or more Documents
  - build a search which finds apporiate document and rank as per thier relevancy scores
  - Sample Input and expected output are:
    - I/P:"What is the date that Cyrpus attained independence?" ,O/P:"42840a9c1bfe11ea8f2b656571b1b549"
    - I/P:"What other species can be seen close to the shores of Norfolk Island?",O/P:"4272a11c1bfe11ea8f2b656571b1b549"
    - I/P: "What serves as the collective Head of State?",O/P: "428bbc421bfe11ea8f2b656571b1b549"

- Dataset
    - Refer nlp_hackathon_search.gz file.  
    - The dataset is prepared using [Squad 2.0](https://rajpurkar.github.io/SQuAD-explorer/)
- Evaluation
    - If the correct document to a question pops up in your top 1-5 searched documents (Manual evaluation)
  
 
