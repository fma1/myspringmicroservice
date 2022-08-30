CREATE TABLE IF NOT EXISTS "transactions"
(
    id UUID DEFAULT random_uuid() PRIMARY KEY,
    amount DECIMAL(16,2) NOT NULL,
    reference VARCHAR(255) NOT NULL,
    receiving_user VARCHAR(255) NOT NULL,
    `timestamp` TIMESTAMP WITH TIME ZONE NOT NULL,
    version INT
);