package com.expr.brule.edits;

import java.util.HashMap;

import com.expr.brule.common.ParseWrapper;

import lombok.Data;

@Data
public class RuleEditSupport extends ParseWrapper {

	protected HashMap<Object, Object> replaceMap = new HashMap();
	
	public RuleEditSupport(String rule,HashMap rmap) {
		super(rule);
		this.replaceMap = rmap;
	}
}
