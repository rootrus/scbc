package com.scb.phone.domain.interactor.etb;

import com.scb.phone.domain.ScbException;
import p040o.CloseAccountReviewActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.HmlPinActivity;
import p040o.IndoorBuilding;
import p040o.LocalProjectProvider;
import p040o.recordWrite;

public final class ETBCheckIdentityCase extends IndoorBuilding {
    private LocalProjectProvider.C69353 write;

    public static class ErrorCode3013Exception extends ScbException {
    }

    @HmlPinActivity
    public ETBCheckIdentityCase(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69353 r3) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.write = r3;
    }

    public final DebitCardResetOtpActivity read(recordWrite recordwrite) {
        return write(this.write.read(recordwrite));
    }
}
