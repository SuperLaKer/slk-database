use sfnotes;

explain
UPDATE goods
SET goods_name =
        CASE id
            WHEN 1 THEN 'value'
            WHEN 2 THEN 'value'
            WHEN 3 THEN 'value'
            END
WHERE id IN (1, 2, 3);


