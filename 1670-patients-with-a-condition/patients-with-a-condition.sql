SELECT *
FROM Patients
WHERE EXISTS (
    SELECT 1
    FROM (
        SELECT TRIM(code) AS code, patient_id
        FROM Patients
        CROSS JOIN
        JSON_TABLE(
            CONCAT('["', REPLACE(conditions, ' ', '","'), '"]'),
            '$[*]' COLUMNS (code VARCHAR(100) PATH '$')
        ) AS codes
    ) AS separated_codes
    WHERE separated_codes.patient_id = Patients.patient_id
      AND code LIKE 'DIAB1%'
);
