/**
 * 
 */
package com.expr.brule.evaluate;

import java.util.List;

/**
 * Execute a set of rules serially
 * 
 * @author ssdImmanuel
 *
 */
public class RuleSetExecutor {

	/**
	 * Rule set to be executed
	 */
	private List<RuleExecutionContext> ruleSet;
	
	private long execstart;
	private long execend;
	
	private long diff;
	
	public RuleSetExecutor(List<RuleExecutionContext> set) {
		this.ruleSet=set;
	}

	/**
	 * Executes rules one by one serially
	 */
	public void execute() {
		this.execstart = System.currentTimeMillis();
		for(RuleExecutionContext set : this.ruleSet) {
			ExecutionEngine engine = new ExecutionEngine(set.getRule(), set.getData());
			engine.evaluate();
			System.out.println(engine.getRuleResult());
			System.out.println("---------------------------------");
		}
		
		this.execend = System.currentTimeMillis();
		
		setDiff(this.execend - this.execstart);
	}

	public List<RuleExecutionContext> getRuleSet() {
		return ruleSet;
	}

	public void setRuleSet(List<RuleExecutionContext> ruleSet) {
		this.ruleSet = ruleSet;
	}

	public long getDiff() {
		return diff;
	}

	public void setDiff(long diff) {
		this.diff = diff;
	}

}
