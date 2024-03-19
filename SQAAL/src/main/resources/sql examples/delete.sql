DELETE FROM orders
WHERE EXISTS
          (SELECT *
           FROM customers
           WHERE customers.customer_id = orders.customer_id
             AND customers.last_name = 'Jackson');