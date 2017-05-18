package org.ibase4j.service;

import org.ibase4j.core.base.BaseService;
import org.ibase4j.model.SysNotice;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

/**
 * @author LiMiaoMiao
 *
 */
@Service
@CacheConfig(cacheNames = "sysNoticeTemplate")
public class SysNoticeService extends BaseService<SysNotice> {

}
