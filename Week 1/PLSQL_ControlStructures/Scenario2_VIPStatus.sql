DECLARE
    CURSOR c_customers IS
        SELECT customer_id, name, balance
        FROM Customers;
BEGIN
    FOR rec IN c_customers LOOP
        IF rec.balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE customer_id = rec.customer_id;
            DBMS_OUTPUT.PUT_LINE('Customer ' || rec.name || ' promoted to VIP (Balance: ' || rec.balance || ')');
        END IF;
    END LOOP;
    COMMIT;
END;
/
