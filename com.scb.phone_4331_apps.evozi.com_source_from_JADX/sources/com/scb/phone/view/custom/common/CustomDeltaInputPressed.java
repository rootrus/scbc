package com.scb.phone.view.custom.common;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import java.math.BigDecimal;
import p040o.getGeomarkers;
import p040o.verifyFastPayTransfer;

public class CustomDeltaInputPressed extends CustomDeltaInput {
    private CountDownTimer MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public int MediaDescriptionCompat = 50;
    /* access modifiers changed from: private */
    public int MediaMetadataCompat = 0;
    /* access modifiers changed from: private */
    public boolean RatingCompat = true;

    public CustomDeltaInputPressed(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomDeltaInputPressed(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CountDownTimer countDownTimer = this.MediaBrowserCompat$SearchResultReceiver;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    static /* synthetic */ void write(CustomDeltaInputPressed customDeltaInputPressed, Runnable runnable) {
        if (customDeltaInputPressed.RatingCompat) {
            runnable.run();
            customDeltaInputPressed.RatingCompat = false;
            return;
        }
        int i = customDeltaInputPressed.MediaMetadataCompat + 1;
        customDeltaInputPressed.MediaMetadataCompat = i;
        if (i >= customDeltaInputPressed.MediaDescriptionCompat) {
            runnable.run();
            int i2 = customDeltaInputPressed.MediaDescriptionCompat;
            if (i2 > 6) {
                customDeltaInputPressed.MediaDescriptionCompat = i2 - 10;
            } else if (i2 == 6) {
                customDeltaInputPressed.MediaDescriptionCompat = 5;
            }
            customDeltaInputPressed.MediaMetadataCompat = 0;
        }
    }

    public static /* synthetic */ void read(CustomDeltaInputPressed customDeltaInputPressed, double d) {
        double d2;
        customDeltaInputPressed.errorMessage.setVisibility(8);
        if (customDeltaInputPressed.IconCompatParcelizer > customDeltaInputPressed.read()) {
            d2 = customDeltaInputPressed.read();
        } else {
            d2 = BigDecimal.valueOf(customDeltaInputPressed.IconCompatParcelizer).subtract(BigDecimal.valueOf(d)).doubleValue();
        }
        customDeltaInputPressed.write(d2);
        if (customDeltaInputPressed.read != null) {
            customDeltaInputPressed.read.mo13975x50fd9e4a();
        }
        customDeltaInputPressed.inputValue.requestFocus();
    }

    public static /* synthetic */ void IconCompatParcelizer(CustomDeltaInputPressed customDeltaInputPressed, double d) {
        double d2;
        customDeltaInputPressed.errorMessage.setVisibility(8);
        if (customDeltaInputPressed.IconCompatParcelizer < customDeltaInputPressed.MediaBrowserCompat$CustomActionResultReceiver) {
            d2 = customDeltaInputPressed.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            d2 = BigDecimal.valueOf(customDeltaInputPressed.IconCompatParcelizer).add(BigDecimal.valueOf(d)).doubleValue();
        }
        customDeltaInputPressed.write(d2);
        if (customDeltaInputPressed.read != null) {
            customDeltaInputPressed.read.MediaSessionCompat$Token();
        }
        customDeltaInputPressed.inputValue.requestFocus();
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(final double d) {
        C58111 r0 = new CountDownTimer() {
            public final void onTick(long j) {
                if (CustomDeltaInputPressed.this.increaseButton.isPressed()) {
                    CustomDeltaInputPressed.write(CustomDeltaInputPressed.this, new verifyFastPayTransfer(this, d));
                } else if (CustomDeltaInputPressed.this.decreaseButton.isPressed()) {
                    CustomDeltaInputPressed.write(CustomDeltaInputPressed.this, new getGeomarkers(this, d));
                } else {
                    int unused = CustomDeltaInputPressed.this.MediaMetadataCompat = 0;
                    int unused2 = CustomDeltaInputPressed.this.MediaDescriptionCompat = 50;
                    boolean unused3 = CustomDeltaInputPressed.this.RatingCompat = true;
                }
            }

            public final void onFinish() {
                start();
            }
        };
        this.MediaBrowserCompat$SearchResultReceiver = r0;
        r0.start();
    }
}
