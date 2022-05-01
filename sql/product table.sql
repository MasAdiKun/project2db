CREATE TABLE product (
	product_id INT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(50) NOT NULL,
    product_category VARCHAR(20) NOT NULL,
    product_price BIGINT DEFAULT 0,
    product_stock INT DEFAULT 0,
    restock DATE NULL
);