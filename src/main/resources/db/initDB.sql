DROP TABLE IF EXISTS bookmanager.books;
CREATE TABLE bookmanager.books (
  id     INT AUTO_INCREMENT NOT NULL,
  title  VARCHAR(255)       NOT NULL,
  author VARCHAR(255)       NOT NULL,
  price  INT                NOT NULL,
  PRIMARY KEY (id)
);
