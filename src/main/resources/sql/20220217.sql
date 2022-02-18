RENAME TABLE wcss_whitelist_setting TO wcss_user;
ALTER TABLE wcss_user MODIFY `is_deleted` tinyint(1) NOT NULL default 0;