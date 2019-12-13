### You can choose to code Recomender System in Python or JAVA


### Data is available in .csv files

- Problem Details
  - One needs to build a Top n (n is parameter) recommendation model using any recommendation algorithm of their choice.
  
  - <h5>API</h5>
  You need to build 2 APIs :
  <ul>
  <li>Take userid and movieid as input and predict the rating for the movie by the user</li>
  <li>Take userid and an integer N as input and display N movie reccomendations for that user.</li>
  </ul>
  
  <h4> Finally generate the predicted ratings for (userid,movieid) pairs mentioned in input_for_validation.csv </h4>
  
- Dataset
  - The Data set is taken from [Movie Lens Small](http://files.grouplens.org/datasets/movielens/ml-latest-small.zip).
  - go to [Movie Lens](https://grouplens.org/datasets/movielens/). to understand more about the data set.
      
- Evaluation
  - Offline Evaluation Metric
      - Its good if you can implement RMSE Accuracy metric for your code
      - Its good if you can implement ARHR (Avarage Reciprocal Hit Rate) on your top N recommendation
      - Use some trick to include novelty and diversity in your recommendation (Top n)
