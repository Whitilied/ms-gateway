package cn.ms.gateway.base.filter.route;

import cn.ms.gateway.base.annotation.Filter;
import cn.ms.gateway.base.annotation.FilterEnable;
import cn.ms.gateway.base.filter.IFilter;
import cn.ms.gateway.base.type.FilterType;

@FilterEnable
@Filter(value=FilterType.ROUTE, order=10)
public class TestRouteFilter1 implements IFilter<String, String> {

	@Override
	public String filterName() {
		return "TestRouteFilter1";
	}

	@Override
	public boolean check(String req, String res, Object...args) {
		System.out.println(filterName()+" ---> check");
		return true;
	}

	@Override
	public String run(String req, String res, Object...args) {
		System.out.println(filterName()+" ---> run");
		throw new RuntimeException();
	}

}
