package cn.ms.gateway.base.filter.route;

import cn.ms.gateway.base.IFilter;
import cn.ms.gateway.base.annotation.Filter;
import cn.ms.gateway.base.annotation.FilterEnable;
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String run(String req, String res, Object...args) {
		// TODO Auto-generated method stub
		return null;
	}

}
