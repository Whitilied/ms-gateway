package cn.ms.gateway.base;

import java.util.List;

/**
 * 微服务网关
 * 
 * @author lry
 *
 * @param <REQ>
 * @param <RES>
 */
public interface IGateway<REQ, RES> extends Adaptor {

	//$NON-NLS-添加自定义过滤器$
	void addFilter(IFilter<REQ, RES> filter);

	void addFilters(List<IFilter<REQ, RES>> filters);

	
	/**
	 * The Start of Gateway.
	 * 
	 * @throws Exception
	 */
	void start() throws Exception;

	/**
	 * The Gateway handler center.
	 * 
	 * @param req
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	RES handler(REQ req, Object... args) throws Throwable;

}
