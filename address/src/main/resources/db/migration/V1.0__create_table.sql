CREATE TABLE IF NOT EXISTS address (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY UNIQUE,
    country VARCHAR,
    city VARCHAR,
    address VARCHAR
);