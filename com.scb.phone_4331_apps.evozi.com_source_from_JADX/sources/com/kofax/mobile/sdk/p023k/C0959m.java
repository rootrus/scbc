package com.kofax.mobile.sdk.p023k;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.view.accessibility.AccessibilityManager;
import com.kofax.kmc.kut.utilities.error.IllegalArgumentException;
import com.kofax.mobile.sdk._internal.capture.C0517g;
import com.kofax.mobile.sdk._internal.dagger.C0519a;
import com.kofax.mobile.sdk._internal.dagger.C7896d;
import java.util.HashMap;
import java.util.Locale;
import p040o.HmlPinActivity;

@C0519a
/* renamed from: com.kofax.mobile.sdk.k.m */
public class C0959m implements C0517g {

    /* renamed from: GM */
    private AccessibilityManager f2332GM;
    /* access modifiers changed from: private */

    /* renamed from: GN */
    public TextToSpeech f2333GN = null;

    /* renamed from: GO */
    private String f2334GO;

    @HmlPinActivity
    public C0959m(Context context) {
        this.f2332GM = (AccessibilityManager) context.getSystemService("accessibility");
        this.f2333GN = new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            public void onInit(int i) {
                if (i != -1) {
                    try {
                        C0959m.this.f2333GN.setLanguage(Locale.US);
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private void m2497a(C7896d dVar) {
        this.f2333GN.shutdown();
    }

    /* renamed from: ly */
    private boolean m2499ly() {
        return this.f2332GM.isEnabled() && this.f2332GM.isTouchExplorationEnabled();
    }

    /* renamed from: lz */
    private void m2500lz() {
        TextToSpeech textToSpeech = this.f2333GN;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
    }

    /* renamed from: ai */
    private boolean m2498ai(String str) {
        return m2499ly() && !str.equals(this.f2334GO);
    }

    /* renamed from: M */
    public void mo11322M(String str) {
        if (m2498ai(str)) {
            m2500lz();
            this.f2334GO = str;
            this.f2333GN.speak(str, 0, (HashMap) null);
        }
    }
}
