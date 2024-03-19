SELECT /*+ PARALLEL */
    cfe.id_collateral_ref.nextval
     , id_collateral
FROM (  SELECT DISTINCT
            a.id_collateral
        FROM cfe.collateral a
                 LEFT JOIN cfe.collateral_ref b
                           ON a.id_collateral = b.id_collateral
        WHERE b.id_collateral_ref IS NULL )