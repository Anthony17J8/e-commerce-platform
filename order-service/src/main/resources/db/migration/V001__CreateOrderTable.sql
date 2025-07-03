CREATE TABLE orders
(
    order_id               UUID PRIMARY KEY,
    user_id          UUID      NOT NULL,
    status           TEXT      NOT NULL,
    total            MONEY     NOT NULL CHECK (total::numeric > 0),
    created_at       TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at       TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    delivery_address JSONB,
    payment_method   VARCHAR(30)
);

CREATE INDEX idx_orders_user_id ON orders (user_id);
CREATE INDEX idx_orders_created_at ON orders (created_at);