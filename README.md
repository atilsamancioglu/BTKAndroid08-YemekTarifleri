**SQLite Temelleri derslerinde kullandığımız basit komutları aşağıda bulabilirsiniz:**

CREATE TABLE IF NOT EXISTS urunler (id INTEGER PRIMARY KEY, isim VARCHAR, fiyat INT);

INSERT INTO urunler (isim, fiyat) VALUES ('Ayakkabı', 100);

INSERT INTO urunler (isim, fiyat) VALUES ('Elbise', 150);

INSERT INTO urunler (isim, fiyat) VALUES ('Tshirt', 50);

INSERT INTO urunler (isim, fiyat) VALUES ('Şapka', 10);

INSERT INTO urunler (isim, fiyat) VALUES ('Atkı', 70);

INSERT INTO urunler (isim, fiyat) VALUES ('Bere', 40);

INSERT INTO urunler (isim, fiyat) VALUES ('Palto', 200);

SELECT * FROM urunler;

SELECT isim, fiyat from urunler;

SELECT * FROM urunler WHERE fiyat = 200;

SELECT * FROM urunler;

DELETE FROM urunler;

DELETE FROM urunler WHERE id = 2;

UPDATE urunler SET fiyat = 250 WHERE isim = 'Palto';

SELECT * FROM urunler WHERE isim LIKE '%a%';
