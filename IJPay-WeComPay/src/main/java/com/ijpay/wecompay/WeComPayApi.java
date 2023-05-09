package com.ijpay.wecompay;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.ijpay.core.IJPayHttpResponse;
import com.ijpay.core.kit.HttpKit;
import com.ijpay.wecompay.model.UnifiedOrderModel;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class WeComPayApi {

	private static String CREATE_ORDER_PATH = "/cgi-bin/miniapppay/create_order";
	private static String QUERY_ORDER_PATH = "/cgi-bin/miniapppay/get_order";
	private static String GET_SIGN_PATH = "/cgi-bin/miniapppay/get_sign";
	private static String REFUND_PATH = "/cgi-bin/miniapppay/refund";

	/**
	 * 生成预支付交易单
	 * @return
	 */
	@SneakyThrows
	public static IJPayHttpResponse createOrder(String baseUrl, String accessToken, UnifiedOrderModel orderModel) {

		// 参考：https://developer.work.weixin.qq.com/document/path/97322
		String url = buildUrl(baseUrl, CREATE_ORDER_PATH, accessToken);
		String data = JSONUtil.toJsonStr(orderModel);
		return post(url, data);
	}

	public static IJPayHttpResponse queryOrder() {
		throw new UnsupportedOperationException("not implemented");

		//TODO:
		// 参考：https://developer.work.weixin.qq.com/document/path/97322
		// 从参数接收 accessToken。
		// 从参数接收 UnifiedOrderModel，变成 requestBody (string)。
		// 调用 POST /miniapppay/create_order?access_token=ACCESS_TOKEN
		// 发送请求，返回 IJPayHttpResponse。
	}

	public static IJPayHttpResponse getSign() {
		throw new UnsupportedOperationException("not implemented");
	}

	public static IJPayHttpResponse refund() {
		throw new UnsupportedOperationException("not implemented");
	}

	private static String buildUrl(String baseUrl, String path, String accessToken) {
		return baseUrl + path + "?access_token=" + accessToken;
	}

	private static IJPayHttpResponse post(String url, String data) {
		return HttpKit.getDelegate().post(url, data, null);
	}
}
