SELECT
  ROUND(SUM(IF(min_order_date = min_customer_pref_delivery_date, 1, 0)) * 100 / COUNT(*), 2) AS immediate_percentage
FROM (
  SELECT 
    customer_id,
    MIN(order_date) AS min_order_date,
    MIN(customer_pref_delivery_date) AS min_customer_pref_delivery_date
  FROM Delivery 
  GROUP BY customer_id
) AS new;
