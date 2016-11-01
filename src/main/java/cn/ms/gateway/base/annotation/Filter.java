package cn.ms.gateway.base.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import cn.ms.gateway.base.type.FilterType;

/**
 * 过滤器
 * 
 * @author lry
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
public @interface Filter {

	/**
	 * 过滤器类型,默认为#{FilterType.PRE}
	 * 
	 * @return
	 */
	FilterType value() default FilterType.PRE;

	/**
	 * 过滤权值
	 * 
	 * @return
	 */
	int order() default 0;
	
	/**
	 * 过滤器名称
	 * 
	 * @return
	 */
	String name() default "";
	
}
