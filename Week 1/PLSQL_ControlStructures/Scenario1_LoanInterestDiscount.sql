DECLARE
    CURSOR c_customers IS
        SELECT customer_id, name, TRUNC(MONTHS_BETWEEN(SYSDATE, dob) / 12) AS age
        FROM Customers;
BEGIN
    FOR rec IN c_customers LOOP
        IF rec.age > 60 THEN
            UPDATE Loans
            SET interest_rate = interest_rate - 1
            WHERE customer_id = rec.customer_id;
            DBMS_OUTPUT.PUT_LINE('Discount applied for customer: ' || rec.name || ' (Age: ' || rec.age || ')');
        END IF;
    END LOOP;
    COMMIT;
END;
/
