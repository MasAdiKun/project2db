CREATE TABLE sales (
	id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customer (customer_id),
    product_id INT NOT NULL,
    FOREIGN KEY (product_id) REFERENCES product (product_id),
	 quantity INT default 0,
    total_price BIGINT DEFAULT 0,
    transaction_date DATE NULL
);