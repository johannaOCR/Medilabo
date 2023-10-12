-- Patient table creation only if it doesn't exist
CREATE TABLE IF NOT EXISTS patient (
                                       id SERIAL PRIMARY KEY,
                                       first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    birth_date DATE NOT NULL,
    gender VARCHAR(50) NOT NULL,
    postal_address VARCHAR(500),
    phone_number VARCHAR(50)
    );

-- User table creation only if it doesn't exist
CREATE TABLE IF NOT EXISTS users (
                                     user_id SERIAL PRIMARY KEY,
                                     username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL, -- This should store a hashed password
    role VARCHAR(255) NOT NULL DEFAULT 'USER', -- Might have different roles like ADMIN, USER, etc.
    enabled BOOLEAN NOT NULL DEFAULT TRUE, -- To enable or disable a user
    patient_id INTEGER REFERENCES patient(id) -- FK reference to patient table, if one user is associated with a patient
    );

ALTER TABLE patient ADD CONSTRAINT unique_patient_name UNIQUE(first_name, last_name);

INSERT INTO patient (first_name, last_name, birth_date, gender, postal_address, phone_number)
VALUES
    ('Test', 'TestNone', '1966-12-31', 'F', '1 Brookside St', '100-222-3333'),
    ('Test', 'TestBorderline', '1945-06-24', 'M', '2 High St', '200-333-4444'),
    ('Test', 'TestInDanger', '2004-06-18', 'M', '3 Club Road', '300-444-5555'),
    ('Test', 'TestEarlyOnset', '2002-06-28', 'F', '4 Valley Dr', '400-555-6666')
ON CONFLICT (first_name, last_name) DO NOTHING;
