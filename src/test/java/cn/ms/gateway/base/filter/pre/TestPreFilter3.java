package cn.ms.gateway.base.filter.pre;

import cn.ms.gateway.base.IFilter;
import cn.ms.gateway.base.annotation.Filter;
import cn.ms.gateway.base.annotation.FilterEnable;
import cn.ms.gateway.base.type.FilterType;

@FilterEnable
@Filter(value=FilterType.PRE, order=10)
public class TestPreFilter3 implements IFilter<String, String> {

	@Override
	public String filterName() {
		return "TestPreFilter3";
	}

	@Override
	public boolean check(String req, String res) {
		return false;
	}

	@Override
	public String run(String req, String res) {
		// TODO Auto-generated method stub
		return null;
	}

}
