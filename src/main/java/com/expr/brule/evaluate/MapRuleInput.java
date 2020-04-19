package com.expr.brule.evaluate;

import java.util.HashMap;

public class MapRuleInput implements IRuleInput {
	
	private HashMap<String, Object> data;
	public MapRuleInput(HashMap<String, Object> datamap) {
		data = datamap;
	}

	@Override
	public Object getValue(String fieldName) {
		return data.get(fieldName);
	}

}
