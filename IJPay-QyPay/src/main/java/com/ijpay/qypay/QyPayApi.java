package com.ijpay.qypay;

import cn.hutool.core.util.StrUtil;
import com.ijpay.core.IJPayHttpResponse;
import com.ijpay.core.kit.HttpKit;
import com.ijpay.qypay.enums.QyPayApiUrl;

public class QyPayApi {

	/**
	 * 获取 AccessToken
	 *
	 * @param config {@link QyPayApiConfig} 支付配置
	 * @return {@link IJPayHttpResponse} 请求返回的结果
	 */
	public static IJPayHttpResponse getToken(QyPayApiConfig config) {
		String url = config.getDomain()
			.concat(QyPayApiUrl.GET_TOKEN.getUrl())
			.concat(StrUtil.format("?corpid={}&corpsecret={}", config.getCorpId(), config.getCorpSecret()));
		return HttpKit.getDelegate().get(url, null, null);
	}

	/**
	 * 获取接口请求的 URL
	 *
	 * @param domain 域名
	 * @param qyPayApiUrl {@link QyPayApiUrl} 支付 API 接口枚举
	 * @param accessToken 企业微信 API Access Token
	 * @return {@link String} 返回完整的接口请求URL
	 */
	public static String getReqUrl(String domain, QyPayApiUrl qyPayApiUrl, String accessToken) {
		return domain.concat(qyPayApiUrl.getUrl())
			.concat(StrUtil.format("?access_token={}", accessToken));
	}

	/**
	 * 通用请求方法
	 */
	public static IJPayHttpResponse execute(String url, String body) {
		return HttpKit.getDelegate().post(url, body, null);
	}
}
