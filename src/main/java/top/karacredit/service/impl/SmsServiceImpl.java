package top.karacredit.service.impl;

import org.springframework.stereotype.Service;

import top.karacredit.service.SmsService;

@Service("smsService")
public class SmsServiceImpl implements SmsService {

	@Override
	public void sendCaptcha(String captcha) {
	}
}
