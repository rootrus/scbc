package org.ejbca.cvc.exception;

public class ConstructionException extends CvcException {
    public ConstructionException() {
    }

    public ConstructionException(String str) {
        super(str);
    }

    public ConstructionException(Throwable th) {
        super(th);
    }

    public ConstructionException(String str, Throwable th) {
        super(str, th);
    }
}
