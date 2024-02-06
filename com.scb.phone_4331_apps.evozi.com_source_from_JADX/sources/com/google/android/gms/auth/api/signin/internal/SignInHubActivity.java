package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001authapi.zzan;
import p040o.size;
import p040o.sizeOf;

public class SignInHubActivity extends FragmentActivity {
    private static boolean zzco = false;
    private boolean zzcp = false;
    private SignInConfiguration zzcq;
    private boolean zzcr;
    /* access modifiers changed from: private */
    public int zzcs;
    /* access modifiers changed from: private */
    public Intent zzct;

    final class zzc implements sizeOf.IconCompatParcelizer<Void> {
        private zzc() {
        }

        public final void onLoaderReset(size<Void> size) {
        }

        public final size<Void> onCreateLoader(int i, Bundle bundle) {
            return new zzf(SignInHubActivity.this, GoogleApiClient.getAllClients());
        }

        public final /* synthetic */ void onLoadFinished(size size, Object obj) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.zzcs, SignInHubActivity.this.zzct);
            SignInHubActivity.this.finish();
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String str = (String) zzan.checkNotNull(intent.getAction());
        if ("com.google.android.gms.auth.NO_IMPL".equals(str)) {
            zzc((int) GoogleSignInStatusCodes.SIGN_IN_FAILED);
        } else if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || str.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            SignInConfiguration signInConfiguration = (SignInConfiguration) ((Bundle) zzan.checkNotNull(intent.getBundleExtra("config"))).getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.zzcq = signInConfiguration;
            if (bundle != null) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.zzcr = z;
                if (z) {
                    this.zzcs = bundle.getInt("signInResultCode");
                    this.zzct = (Intent) zzan.checkNotNull((Intent) bundle.getParcelable("signInResultData"));
                    zzq();
                }
            } else if (zzco) {
                setResult(0);
                zzc((int) GoogleSignInStatusCodes.SIGN_IN_CURRENTLY_IN_PROGRESS);
            } else {
                zzco = true;
                Intent intent2 = new Intent(str);
                if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra("config", this.zzcq);
                try {
                    startActivityForResult(intent2, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.zzcp = true;
                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    zzc(17);
                }
            }
        } else {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", valueOf.length() != 0 ? "Unknown action: ".concat(valueOf) : new String("Unknown action: "));
            finish();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.zzcr);
        if (this.zzcr) {
            bundle.putInt("signInResultCode", this.zzcs);
            bundle.putParcelable("signInResultData", this.zzct);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.zzcp) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
                    if (signInAccount != null && signInAccount.getGoogleSignInAccount() != null) {
                        GoogleSignInAccount googleSignInAccount = signInAccount.getGoogleSignInAccount();
                        zzo.zzd(this).zzc(this.zzcq.zzo(), (GoogleSignInAccount) zzan.checkNotNull(googleSignInAccount));
                        intent.removeExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
                        intent.putExtra("googleSignInAccount", googleSignInAccount);
                        this.zzcr = true;
                        this.zzcs = i2;
                        this.zzct = intent;
                        zzq();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = GoogleSignInStatusCodes.SIGN_IN_CANCELLED;
                        }
                        zzc(intExtra);
                        return;
                    }
                }
                zzc(8);
            }
        }
    }

    private final void zzq() {
        getSupportLoaderManager().read(new zzc());
        zzco = false;
    }

    private final void zzc(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        zzco = false;
    }
}
