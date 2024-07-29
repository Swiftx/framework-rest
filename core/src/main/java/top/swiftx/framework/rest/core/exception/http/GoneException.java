package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 被请求的资源在服务器上已经不再可用，而且没有任何已知的转发地址。<br/>
 * 这样的状况应当被认为是永久性的。<br/>
 * 如果可能，拥有链接编辑功能的客户端应当在获得用户许可后删除所有指向这个地址的引用。<br/>
 * 如果服务器不知道或者无法确定这个状况是否是永久的，那么就应该使用404状态码。<br/>
 * 除非额外说明，否则这个响应是可缓存的。<br/>
 *
 * @author 胡永强
 */
public class GoneException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public GoneException() {
        super(HttpStatus.GONE);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public GoneException(String type, String title) {
        super(HttpStatus.GONE);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public GoneException(@Nullable Throwable cause) {
        super(HttpStatus.GONE, cause);
    }

    /**
     * 默认异常
     */
    public GoneException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.GONE, body, cause);
    }
}
