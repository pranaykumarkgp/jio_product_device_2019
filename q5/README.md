Big Data/Data Base Problem   

<h4>input:</h4>
 There are 2 files in data directory with the following schema :
<ul>
<li>*orders – order_id, order_date, order_customer_id, order_status


<li>*order_items – order_item_id, order_item_order_id, order_item_product_id, order_item_quantity, order_item_subtotal, order_item_product_price
</ul>
<i> "order_item_order_id" in order_items would serve as foreign key that can be mapped to "order_id" in orders.
</i>



<h4>Requirement:</h4>
You need to save top N (where N is a parameter) products_ids and their total revenue for each day.Consider orders with status "complete" or "closed" only.
Ranking for a day is decided based on the total revenue of that product on that day.


<h4>Output Specification:</h4>

output columns would be :
“date” and “top_products”
the column delimiter would be "^"

For each date there would be 1 row in output and the column "top_products" will hold a list of N pairs. 
Each pair would be of form [product_id,total_revenue] .
The list has to be sorted in descending order based on total_revenue.
The whole output file itself should be sorted by date in ascending order.

<h5>Sample:</h5>

input N=3<br>
output:<br><br>
date ^ top_products<br>
27-07-2013 ^ [[1,500],[2,600],[5,800]]<br>    
28-07-2013 ^ [[4,600],[5,800],[7,900]]<br>



here top_product has 3 pairs in both rows. Pairs like [1,500] are of form [product_id,total_revenue]


<h4>Bonus:</h4>
Add another column to output called "total_revenue_N" which is the total revenue of the top N products for the day.
Change "top_product" column from earlier to include a ratio which is (total revenue of that product / total revenue of top n products)
in [product_id,product_revenue_of_day,ratio]




<h5>Sample:</h5>

input N=3<br>
output:<br><br>
date ^ top_products ^ total_revenue_N<br>
27-07-2013 ^ [[1,500,0.26],[2,600,0.31],[5,800,0.42]] ^ 1900 <br>    
28-07-2013 ^ [[4,600,0.26],[5,800,0.34],[7,900,0.39]] ^ 2300 <br>

Here, for 27-07-2013 for top 3 products the "total_revenue"= 500 + 600 + 800 = 1900

The first entry in top products [1,500,0.26] represents product=id 1 ,its total revenue for day 500 and 0.26 is the ratio of its revenue with total revenue of N products for the day (500/1900).





