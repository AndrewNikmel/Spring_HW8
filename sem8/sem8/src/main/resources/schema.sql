CREATE TABLE users (
                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      name VARCHAR(255) NOT NULL,
                      age INTEGER,
                      email VARCHAR(255)
);

INSERT INTO users (name, age, email) VALUES ('Thomas', '22', 'tomj@example.com');
INSERT INTO users (name, age, email) VALUES ('Gerrard', '52', 'gerry@example.com');
INSERT INTO users (name, age, email) VALUES ('Alison', '18', 'alis@example.com');
INSERT INTO users (name, age, email) VALUES ('Robert', '57', 'bobby@example.com');