package com.expr.brule.evaluate;

public class ContextNotPassedException extends RuntimeException {

	public ContextNotPassedException() {
	}

	public ContextNotPassedException(String message) {
		super(message);
	}

	public ContextNotPassedException(Throwable cause) {
		super(cause);
	}

	public ContextNotPassedException(String message, Throwable cause) {
		super(message, cause);
	}

	public ContextNotPassedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
