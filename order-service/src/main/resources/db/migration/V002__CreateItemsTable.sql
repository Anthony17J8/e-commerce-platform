CREATE TABLE order_items
(
    id             SERIAL PRIMARY KEY,
    order_id       UUID REFERENCES orders ON DELETE CASCADE,
    product_id     UUID    NOT NULL,
    product_name   TEXT    NOT NULL,
    price_per_unit MONEY   NOT NULL CHECK (price_per_unit::numeric >= 0),
    quantity       INTEGER NOT NULL CHECK (quantity > 0)
);
