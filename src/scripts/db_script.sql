
CREATE TABLE contact (
	contact_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
	first_name VARCHAR(50) NOT NULL, 
	last_name VARCHAR(50) NOT NULL, 
	email_address VARCHAR(100) NOT NULL, 
	telephone_no VARCHAR(50), 
	address1 VARCHAR(150), 
	address2 VARCHAR(150), 
	city VARCHAR(50), 
	post_code VARCHAR(50)
);

CREATE TABLE activity (
	activity_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	contact_id INT NOT NULL, 
	activity_type VARCHAR(20) NOT NULL,
	title VARCHAR(100) NOT NULL, 
	notes VARCHAR(500), 
	due_date DATE,
	FOREIGN KEY (contact_id) REFERENCES contact(contact_id)
);
