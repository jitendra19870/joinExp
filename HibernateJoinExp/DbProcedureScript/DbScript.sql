ELIMITER $$

DROP PROCEDURE IF EXISTS `databaseuser`.`GetItem`$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getItem`(int_itemId varchar(20))
BEGIN
  select * from item_tab where iid=int_itemId;
    END$$

DELIMITER ;