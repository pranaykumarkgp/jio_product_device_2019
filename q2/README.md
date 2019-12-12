### You can choose to code in python or java


- API Details which needes to be coded

  class Doc{
    String text;
    Object id;
  }

  - Python
    - Given a search (Question) one needs to output top n (1-10) relavant documnent_id
      - def search(query)
    
  - Java
    - public List<Doc> search(String query)
  

- Problem Details
  - Welcome to NLP Search hackathon.Given the data set with "document","question","title","document_id" attributes,One has to build a sophisticated document search system for the given question.
Every questions answers are avialable in one or more Documents,build a solution which finds apporiate document and rank as per thier relevancy scores. 

- Dataset
    - Refer nlp_hackathon_search.gz file.  
    - The dataset is prepared using Squad 2.0
- Evaluation
    - Your score is the percentage of documennt_id which are correctly predicted for a given questions, also know as accuracy.
  
 
