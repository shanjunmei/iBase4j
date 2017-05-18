package org.ibase4j.core.exception;

import org.ibase4j.core.support.HttpCode;

/**
 * FTP异常
 * 
 * @author LiMiaoMiao
 * @version 2017年5月18日 下午20:21:19
 */
@SuppressWarnings("serial")
public class FtpException extends BaseException {
    public FtpException() {
    }

    public FtpException(String message) {
        super(message);
    }

    public FtpException(String message, Throwable throwable) {
        super(message, throwable);
    }

    protected HttpCode getHttpCode() {
        return HttpCode.INTERNAL_SERVER_ERROR;
    }
}
