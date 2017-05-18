package org.ibase4j.core.exception;

import org.ibase4j.core.support.HttpCode;

/**
 * @author LiMiaoMiao
 * @version 2017年5月18日 下午20:21:19
 */
@SuppressWarnings("serial")
public class BusinessException extends BaseException {
	public BusinessException() {
	}

	public BusinessException(Throwable ex) {
		super(ex);
	}

	public BusinessException(String message) {
		super(message);
	}

	public BusinessException(String message, Throwable ex) {
		super(message, ex);
	}

	protected HttpCode getHttpCode() {
		return HttpCode.CONFLICT;
	}
}