package net.jeeshop.services.front.keyvalue.impl;import net.jeeshop.core.ServersManager;import net.jeeshop.services.front.keyvalue.KeyvalueService;import net.jeeshop.services.front.keyvalue.bean.Keyvalue;import net.jeeshop.services.front.keyvalue.dao.KeyvalueDao;import org.springframework.stereotype.Service;import javax.annotation.Resource;@Service("keyvalueServiceFront")public class KeyvalueServiceImpl extends ServersManager<Keyvalue, KeyvalueDao> implements		KeyvalueService {    @Resource(name = "keyvalueDaoFront")    @Override    public void setDao(KeyvalueDao keyvalueDao) {        this.dao = keyvalueDao;    }}