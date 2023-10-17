SELECT name FROM Client_master
/
SELECT * FROM Client_master
/
SELECT name,city FROM Client_master
/
SELECT description FROM product_master
/
SELECT name FROM Client_master WHERE name LIKE '_a%'
/
SELECT name FROM Client_master WHERE city IN ('Bombay','Delhi','Madras')
/
SELECT name FROM Client_master WHERE city ='Bombay'
/
SELECT name FROM Client_master WHERE bal_due > 10000
/
SELECT * FROM sales_order WHERE TO_CHAR(s_order_date ,'Mon') = 'Jan'
/
SELECT * FROM sales_order WHERE client_no IN ('C00001','C00002')
/
SELECT * FROM product_master WHERE description IN ('1.44 Drive','1.22 Drive')
/
SELECT description FROM product_master WHERE sell_price > 2000 AND sell_price <= 5000
/
SELECT sell_price, sell_price *15 AS new FROM product_master WHERE sell_price > 1500
/
ALTER TABLE product_master rename column new TO new_price
/
SELECT description FROM product_master WHERE cost_price < 1500
/
SELECT description FROM product_master ORDER BY description ASC
/
SELECT sell_price, SQRT(sell_price) AS square_root FROM product_master
/
SELECT sell_price / (sell_price -100) AS cost FROM product_master WHERE description = '540 HDD'
/
SELECT name,city,state FROM client_master WHERE state != 'Maharashtra'
/
SELECT product_no, description, sell_price FROM Product_master WHERE description LIKE 'M%'
/
SELECT * FROM sales_order  WHERE order_status = 'Canceled' AND TO_CHAR(dely_date,'Mon') = 'May'
/


SELECT product_no,description FROM product_master WHERE product_no NOT IN (select distinct product_no from sales_order_details);
/
SELECT name,address1,address2,city,pincode FROM Client_master WHERE client_no IN (SELECT client_no FROM sales_order WHERE s_order_no='O19001');
/
SELECT name FROM client_master WHERE client_no IN (SELECT client_no FROM sales_order WHERE dely_date <to_date('01-May-1996','DD-Mon-YYYY'));
/
SELECT client_no,name FROM Client_master WHERE client_no IN (SELECT client_no FROM sales_order WHERE s_order_no IN( (SELECT s_order_no FROM sales_order_details WHERE product_no IN(SELECT product_no FROM product_master WHERE description ='1.44 Drive'))));
/
SELECT name AS Order_more_than_10000 FROM Client_master WHERE client_no IN(SELECT client_no FROM sales_order WHERE s_order_no IN (SELECT s_order_no FROM sales_order_details  GROUP BY s_order_no HAVING SUM(qty_ordered*product_rate)>10000));
/
SELECT s_order_no,TO_CHAR(s_order_date, 'DAY') AS day_name FROM sales_order;
/
SELECT TO_CHAR(dely_date, 'MONTH-DD') AS Delivery_format FROM sales_order;
/
SELECT TO_CHAR(s_order_date,'DD-MONTH-YYYY') AS ordered_format FROM sales_order;
/
SELECT SYSDATE + 15 AS date_after_15_days FROM DUAL;
/
SELECT DATEDIFF(NOW(), dely_date) AS days_elapsed FROM sales_order;
/
UPDATE sales_order SET s_order_date = 'TO_DATE('24-07-1996','DD-MM-YYYY')' WHERE client_no ='C00001';
/
UPDATE product_master SET sell_price = 1150.00 WHERE description ='1.44 Drive'
/