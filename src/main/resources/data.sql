INSERT INTO users (full_name, email, password, role)
VALUES
    ('Gandalf', 'gandalf@gmail.com', 'Pass123', 'USER'),
    ('Daenerys Targaryen', 'daenerys@gmail.com', 'Pass123', 'USER'),
    ('Harry Potter', 'harry@gmail.com', 'Pass123', 'USER'),
    ('Bilbo Baggins', 'bilbo@gmail.com', 'Pass123', 'USER'),
    ('Sherlock Holmes', 'sherlock@gmail.com', 'Pass123', 'USER'),
    ('Frodo Baggins', 'frodo@gmail.com', 'Pass123', 'USER'),
    ('Hermione Granger', 'hermione@gmail.com', 'Pass123', 'USER'),
    ('Arya Stark', 'arya@gmail.com', 'Pass123', 'USER'),
    ('Tyrion Lannister', 'tyrion@gmail.com', 'Pass123', 'USER'),
    ('John Snow', 'jojn@gmail.com', 'Pass123', 'USER');

INSERT INTO todos (title, owner_id, access_code, date_create)
VALUES
    ('Brotherhood of The Ring', 1, '550e8400-e29b-41d4-a716-446655440000', '2024-01-23 15:57:00'),
    ('Game of Thrones', 2, '550e8400-e29b-41d4-a716-446655440002', '2024-01-23 16:05:00'),
    ('Dumbledore''s Squad', 3, '550e8400-e29b-41d4-a716-446655440003', '2024-01-23 16:10:00');

INSERT INTO tasks (title,todo_id, description, performer_id, state, date_create)
VALUES
    ('Steal the Arkenstone', 1, 'none', 4, 'IN_PROCESSING', '2024-01-23 15:59:21'),
    ('Escape from the Woodland Realm', 1, 'none', 4, 'WAITING', '2024-01-23 16:05:00'),
    ('Confront the Dragon Smaug', 1, 'none', 4, 'DONE', '2024-01-23 12:10:00'),
    ('Destroy the One Ring', 1, 'none', 6, 'IN_PROCESSING', '2024-01-23 15:59:21'),
    ('Defend Helm''s Deep', 1, 'none', 1, 'IN_PROCESSING', '2024-01-23 16:05:00');

INSERT INTO tasks (title,todo_id, description, performer_id, state, date_create)
VALUES
    ('Defend Winterfell', 2, 'none', 8, 'IN_PROCESSING', '2024-01-23 15:59:21'),
    ('Claim the Iron Throne', 2, 'none', 2, 'IN_PROCESSING', '2024-01-23 16:05:00'),
    ('Uncover White Walker Threat', 2, 'none', 10, 'DONE', '2024-01-23 16:10:00');

INSERT INTO tasks (title, todo_id, description, performer_id, state, date_create)
VALUES
    ('Retrieve the Sorcerer''s Stone', 3, 'none', 3, 'DONE', '2024-01-23 15:59:21'),
    ('Triwizard Tournament', 3, 'none', 3, 'IN_PROCESSING', '2024-01-23 16:05:00'),
    ('Battle at the Ministry of Magic', 3, 'none', 3, 'WAITING', '2024-01-23 16:10:00');


INSERT INTO member_list (todo_id, user_id)
VALUES
    (1, 1),
    (1, 4),
    (1, 6),
    (2, 2),
    (2, 8),
    (2, 10),
    (3, 3),
    (3, 7);