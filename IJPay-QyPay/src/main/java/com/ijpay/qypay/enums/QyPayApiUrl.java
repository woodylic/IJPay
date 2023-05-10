package com.ijpay.qypay.enums;

public enum QyPayApiUrl {
	LIVE_DOMAIN("https://qyapi.weixin.qq.com"),
	/**
	 * 获取 access_token
	 */
	GET_TOKEN("/cgi-bin/gettoken"),
	/**
	 * 小程序下单
	 */
	CREATE_ORDER("/cgi-bin/miniapppay/create_order"),
	/**
	 * 查询订单
	 */
	GET_ORDER("/cgi-bin/miniapppay/get_order"),
	/**
	 * 获取支付签名
	 */
	GET_SIGN("/cgi-bin/miniapppay/get_sign"),
	/**
	 * 申请退款
	 */
	REFUND("/cgi-bin/miniapppay/refund");

	private final String url;

	QyPayApiUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	@Override
	public String toString() {
		return this.url;
	}
}
