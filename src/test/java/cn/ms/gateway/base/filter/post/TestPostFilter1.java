package cn.ms.gateway.base.filter.post;

import cn.ms.gateway.base.annotation.Filter;
import cn.ms.gateway.base.annotation.FilterEnable;
import cn.ms.gateway.base.filter.IFilter;
import cn.ms.gateway.base.type.FilterType;

@FilterEnable
@Filter(value=FilterType.POST, order=10)
public class TestPostFilter1 implements IFilter<String, String> {

	@Override
	public String filterName() {
		return "TestPostFilter1";
	}

	@Override
	public boolean check(String req, String res, Object...args) {
		System.out.println(filterName()+" ---> check");
		return true;
	}

	@Override
	public String run(String req, String res, Object...args) {
		System.out.println(filterName()+" ---> run");
		return null;
	}

}
