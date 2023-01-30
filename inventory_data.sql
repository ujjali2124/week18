-- product_details

INSERT INTO product_details(product_id,product_name,product_cost,product_description) VALUES(1,'Advil', 6,'Advil For Relief Of Your Tough Pain.');
INSERT INTO product_details(product_id,product_name,product_cost,product_description) VALUES(2,'TYLENOL', 6,'Helps Relieve And Comfort Aches And Pains From Young To Old.');
INSERT INTO product_details(product_id,product_name,product_cost,product_description) VALUES(3,'Azithromycin', 10,'used to treat certain bacterial infections.');
INSERT INTO product_details(product_id,product_name,product_cost,product_description) VALUES(4,'NyQuil', 4,'cough & cold Relief.');

-- category

INSERT INTO category(category_id,category_name) VALUES(1,'pain relief');
INSERT INTO category(category_id,category_name) VALUES(2,'bacterial infections');
INSERT INTO category(category_id,category_name) VALUES(3,'cough & cold Relief');

-- product_category

INSERT INTO product_category(product_id,category_id) VALUES(1,1);
INSERT INTO product_category(product_id,category_id) VALUES(2,1);
INSERT INTO product_category(product_id,category_id) VALUES(3,2);
INSERT INTO product_category(product_id,category_id) VALUES(4,3);

-- user_details

INSERT INTO user_details(user_id,user_name,password,confirm_password,userCategory_id) VALUES(1,'alex','alex','alex',1);
INSERT INTO user_details(user_id,user_name,password,confirm_password,userCategory_id) VALUES(2,'sena','sena','sena',2);

-- order_details

INSERT INTO order_details(order_id,product_id,amount) VALUES(1,2,8.0);
INSERT INTO order_details(order_id,product_id,amount) VALUES(2,3,6.0);
INSERT INTO order_details(order_id,product_id,amount) VALUES(3,4,3.0);