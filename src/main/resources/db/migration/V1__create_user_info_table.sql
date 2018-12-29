CREATE TABLE `user_info` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(64) COLLATE utf8_unicode_ci NOT NULL DEFAULT '''''',
  `gender` tinyint(4) NOT NULL DEFAULT '0' COMMENT '//0: 未知 1: 男性 2: 女性',
  `age` int(8) NOT NULL DEFAULT '0',
  `telphone` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '''''',
  `register_mode` varchar(16) COLLATE utf8_unicode_ci NOT NULL DEFAULT '''''' COMMENT '//phone, wechat, alipay',
  `third_party_id` varchar(64) COLLATE utf8_unicode_ci NOT NULL DEFAULT '''''',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `user_password` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL DEFAULT '0',
  `encrypted_password` varchar(128) COLLATE utf8_unicode_ci NOT NULL DEFAULT '''''',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;