CREATE OR REPLACE PROCEDURE TransferFunds(
    p_source_account_id IN NUMBER,
    p_target_account_id IN NUMBER,
    p_amount IN NUMBER
) IS
    v_source_balance NUMBER;
BEGIN
    SELECT balance INTO v_source_balance
    FROM Accounts
    WHERE account_id = p_source_account_id;
    IF v_source_balance < p_amount THEN
        DBMS_OUTPUT.PUT_LINE('Error: Insufficient balance in source account.');
    ELSE
        UPDATE Accounts
        SET balance = balance - p_amount
        WHERE account_id = p_source_account_id;
        UPDATE Accounts
        SET balance = balance + p_amount
        WHERE account_id = p_target_account_id;
        COMMIT;
        DBMS_OUTPUT.PUT_LINE('Successfully transferred ' || p_amount || ' from account ' || p_source_account_id || ' to account ' || p_target_account_id);
    END IF;
END;
/
