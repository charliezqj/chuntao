package net.jeeshop.services.front.notifyTemplate.impl;import net.jeeshop.core.ServersManager;import net.jeeshop.services.front.notifyTemplate.NotifyTemplateService;import net.jeeshop.services.front.notifyTemplate.bean.NotifyTemplate;import net.jeeshop.services.front.notifyTemplate.dao.NotifyTemplateDao;import org.springframework.stereotype.Service;import javax.annotation.Resource;@Service("notifyTemplateServiceFront")public class NotifyTemplateServiceImpl extends ServersManager<NotifyTemplate, NotifyTemplateDao>		implements NotifyTemplateService {    @Resource(name = "notifyTemplateDaoFront")    @Override    public void setDao(NotifyTemplateDao notifyTemplateDao) {        this.dao = notifyTemplateDao;    }}