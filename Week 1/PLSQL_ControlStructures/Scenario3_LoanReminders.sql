DECLARE
    CURSOR c_loans IS
        SELECT l.loan_id, l.end_date, c.name, c.customer_id
        FROM Loans l
        JOIN Customers c ON l.customer_id = c.customer_id
        WHERE l.end_date BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
    FOR rec IN c_loans LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Dear ' || rec.name || ', your loan (ID: ' || rec.loan_id || ') is due on ' || TO_CHAR(rec.end_date, 'DD-MON-YYYY') || '. Please make the payment.');
    END LOOP;
END;
/
