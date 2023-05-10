package com.ijpay.qypay;

import java.io.Serializable;

public class QyPayApiConfig implements Serializable {

	private static final long serialVersionUID = 6817368275611234131L;

	/**
	 * 域名
	 */
	private String domain;
	/**
	 * 企业 ID
	 */
	private String corpId;
	/**
	 * 对外收款应用凭证密钥
	 */
	private String corpSecret;

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getCorpId() {
		return corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpSecret() {
		return corpSecret;
	}

	public void setCorpSecret(String corpSecret) {
		this.corpSecret = corpSecret;
	}
}
