package top.swiftx.framework.rest.core.exception;

/**
 * HTTP 标准异常累
 */
public class HttpException extends RuntimeException {
    /**
     * 响应状态码
     */
    protected int status;

    /**
     * 业务异常状态码
     */
    protected Integer code;

    /**
     * 错误消息
     */
    protected String message;

    /**
     * 错误荷载
     */
    protected Object payload;

    /**
     * 错误状态码
     *
     * @param cause 异常
     */
    protected void init(Throwable cause) {
        initCause(cause);
    }

    /**
     * 错误状态码
     *
     * @param message 消息
     */
    protected void init(String message) {
        this.message = message;
    }

    /**
     * 错误状态码
     *
     * @param message 消息
     * @param cause   异常
     */
    protected void init(String message, Throwable cause) {
        init(message);
        initCause(cause);
    }

    /**
     * 默认构造
     */
    protected HttpException() {
        super();
    }

    /**
     * 错误状态码
     *
     * @param status 状态码
     */
    public HttpException(int status) {
        this.status = status;
    }

    /**
     * 错误状态码
     *
     * @param status 状态码
     * @param cause  异常
     */
    public HttpException(
            int status,
            Throwable cause
    ) {
        this(status);
        init(cause);
    }

    /**
     * 错误状态码
     *
     * @param status  状态码
     * @param message 消息
     */
    public HttpException(
            int status,
            String message
    ) {
        this(status);
        init(message);
    }

    /**
     * 错误状态码
     *
     * @param status  状态码
     * @param message 消息
     * @param cause   异常
     */
    public HttpException(
            int status,
            String message,
            Throwable cause
    ) {
        this(status);
        init(message, cause);
    }
}