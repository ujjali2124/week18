DROP TABLE IF EXISTS order_details;
DROP TABLE IF EXISTS user_details;
DROP TABLE IF EXISTS product_category;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS product_details;

CREATE TABLE product_details(
  product_id INT NOT NULL AUTO_INCREMENT,
  product_name VARCHAR(128) NOT NULL,
  product_cost INT,
  product_description VARCHAR(128),
  PRIMARY KEY (product_id)
);

CREATE TABLE category (
  category_id INT NOT NULL AUTO_INCREMENT,
  category_name VARCHAR(64) NOT NULL,
  PRIMARY KEY (category_id)
);

CREATE TABLE product_category (
  product_id INT NOT NULL,
  category_id INT NOT NULL,
  FOREIGN KEY (product_id) REFERENCES product_details (product_id) ON DELETE CASCADE,
  FOREIGN KEY (category_id) REFERENCES category (category_id) ON DELETE CASCADE,
  UNIQUE KEY (product_id, category_id)
);

CREATE TABLE user_details(
  user_id INT NOT NULL AUTO_INCREMENT,
  user_name VARCHAR(64) NOT NULL,
  password VARCHAR(64) NOT NULL,
  confirm_password VARCHAR(64) NOT NULL,
  userCategory_id INT NOT NULL,
  PRIMARY KEY (user_id)
);

CREATE TABLE order_details(
  order_id INT NOT NULL AUTO_INCREMENT,
  product_id INT NOT NULL,
  amount DECIMAL(7, 2),
  PRIMARY KEY (order_id),
  FOREIGN KEY (product_id) REFERENCES product_details (product_id) ON DELETE CASCADE
);