package com.expr.brule.xml;

import java.io.File;

/**
 * Configre parameters to convert a rule from XML
 * @author ssdImmanuel
 *
 */
public class ConvertorConfigBuilder {

	public ConvertorConfigBuilder() {
		
	}
	
	private String rule;
	private boolean includeSequence;
	private boolean includeDepth;
	private File outfile;
	
	private boolean writeToFile=false;
	
	public static ConvertorConfigBuilder getDefaultConfig(String rule) {
		ConvertorConfigBuilder cnf = new ConvertorConfigBuilder()
				.forRule(rule)
				.includeDepth(false)
				.includeSequence(false)
				;
		
		return cnf;
	}
	
	public ConvertorConfigBuilder forRule(String rule) {
		this.rule = rule;
		return this;
	}
	
	public ConvertorConfigBuilder outputToFile(File outfile) {
		this.setOutfile(outfile);
		if(outfile!=null) {
			this.writeToFile = true;
		}
		return this;
	}
	
	public ConvertorConfigBuilder includeDepth(boolean include) {
		this.includeDepth = include;
		return this;
	}
	
	public ConvertorConfigBuilder includeSequence(boolean include) {
		this.includeSequence = include;
		return this;
	}
	
	public boolean isIncludeSequence() {
		return includeSequence;
	}

	public String getRule() {
		return rule;
	}

	public boolean isIncludeDepth() {
		return includeDepth;
	}

	public void setIncludeDepth(boolean includeDepth) {
		this.includeDepth = includeDepth;
	}

	public File getOutfile() {
		return outfile;
	}

	public void setOutfile(File outfile) {
		this.outfile = outfile;
	}

	public boolean isWriteToFile() {
		return writeToFile;
	}

	public void setWriteToFile(boolean writeToFile) {
		this.writeToFile = writeToFile;
	}

}
