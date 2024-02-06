package org.ejbca.cvc.exception;

public class ParseException extends CvcException {
    public ParseException() {
    }

    public ParseException(String str) {
        super(str);
    }

    public ParseException(Throwable th) {
        super(th);
    }
}
