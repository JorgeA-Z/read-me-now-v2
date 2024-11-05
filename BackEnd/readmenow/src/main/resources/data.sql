INSERT INTO author (author_id, about, name, lastname, created_at, modified_at, is_active) VALUES
(1, 'Author of fantasy novels', 'John', 'Doe', '2024-01-01 10:00:00', '2024-01-01 12:00:00', true),
(2, 'Known for historical fiction', 'Jane', 'Smith', '2024-01-02 10:00:00', '2024-01-02 12:00:00', true),
(3, 'Science fiction writer', 'Alan', 'Johnson', '2024-01-03 10:00:00', '2024-01-03 12:00:00', true),
(4, 'Famous poet', 'Emily', 'Brown', '2024-01-04 10:00:00', '2024-01-04 12:00:00', true),
(5, 'Children’s books author', 'David', 'White', '2024-01-05 10:00:00', '2024-01-05 12:00:00', true),
(6, 'Non-fiction writer', 'Maria', 'Garcia', '2024-01-06 10:00:00', '2024-01-06 12:00:00', true),
(7, 'Thriller and mystery novelist', 'Lucas', 'Martinez', '2024-01-07 10:00:00', '2024-01-07 12:00:00', true),
(8, 'Romantic novelist', 'Sophia', 'Wilson', '2024-01-08 10:00:00', '2024-01-08 12:00:00', true),
(9, 'Biographer', 'Chris', 'Miller', '2024-01-09 10:00:00', '2024-01-09 12:00:00', true),
(10, 'Philosophy author', 'Alice', 'Davis', '2024-01-10 10:00:00', '2024-01-10 12:00:00', true);


INSERT INTO book (book_id, about, author_id, cover, genre, subgenre, name, url, likes, read_global_time, created_at, modified_at, is_active) VALUES
(1, 'A thrilling adventure wizard.', 1, 'cover1.jpg', 'Fantasy', 'Magic', 'The Wizard\'s Journey', 'http://example.com/wizard', 1500, '02:30:00', NOW(), NOW(), true),
(2, 'A tale of love and loss in a dystopian future.', 2, 'cover2.jpg', 'Science Fiction', 'Dystopia', 'Lost in Tomorrow', 'http://example.com/lostintomorrow', 1200,'03:15:00', NOW(), NOW(), true),
(3, 'An exploration of the human psyche.', 3, 'cover3.jpg', 'Psychology', NULL, 'The Mind Unveiled', 'http://example.com/mindunveiled', 800, '01:45:00', NOW(), NOW(), true),
(4, 'A culinary journey through Italy.', 4, 'cover4.jpg', 'Cookbook', NULL, 'Flavors of Italy', 'http://example.com/flavorsofitaly', 600, '04:00:00', NOW(), NOW(), true),
(5, 'A heartwarming story of friendship and courage.', 5, 'cover5.jpg', 'Children', NULL, 'Together We Stand', 'http://example.com/togetherwestand', 2500, '02:00:00', NOW(), NOW(), true),
(6, 'A deep dive into the world of finance.', 6, 'cover6.jpg', 'Non-Fiction', 'Finance', 'Understanding Wealth', 'http://example.com/understandingwealth', 900, '05:30:00', NOW(), NOW(), true),
(7, 'A gripping mystery that keeps you guessing.', 7, 'cover7.jpg', 'Mystery', NULL, 'Whispers in the Dark', 'http://example.com/whispersinthedark', 1400, '03:00:00', NOW(), NOW(), true),
(8, 'An inspiring journey of self-discovery.', 8, 'cover8.jpg', 'Biography', NULL, 'Finding Me', 'http://example.com/findingme', 1100, '06:15:00', NOW(), NOW(), true),
(9, 'A collection of hauntingly beautiful poems.', 9, 'cover9.jpg', 'Poetry', NULL, 'Echoes of the Soul', 'http://example.com/echoesofthesoul', 700, '02:20:00', NOW(), NOW(), true),
(10, 'An epic saga of heroism and sacrifice.', 10, 'cover10.jpg', 'Epic', NULL, 'Legends of Valor', 'http://example.com/legendsofvalor', 2000, '04:50:00', NOW(), NOW(), true);