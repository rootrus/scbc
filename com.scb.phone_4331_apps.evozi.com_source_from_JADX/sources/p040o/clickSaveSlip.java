package p040o;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import com.thunderhead.android.infrastructure.server.entitys.Captures;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: o.clickSaveSlip */
public final class clickSaveSlip implements FragmentBuilder_BindHmlBusinessOccupationInfoFragment {
    private FragmentBuilder_BindHmlBusinessOccupationInfoFragment IconCompatParcelizer = FragmentBuilder_BindHmlIssuerLandingFragment.setTabContainer();
    public write write = new write();

    public final void write(String str, setTextAppearance<String, String> settextappearance) {
        setTextAppearance read2 = this.write.read(str, settextappearance);
        if (read2.size() > 0) {
            this.write.MediaBrowserCompat$CustomActionResultReceiver(str, read2);
            this.IconCompatParcelizer.write(str, read2);
        }
    }

    public final void IconCompatParcelizer(String str, String str2) {
        this.IconCompatParcelizer.IconCompatParcelizer(str, str2);
    }

    /* renamed from: o.clickSaveSlip$read */
    public static class read {
        public static Handler read = new Handler(Looper.getMainLooper());
        public Captures[] IconCompatParcelizer;
        public FragmentBuilder_BindHmlBusinessOccupationInfoFragment MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public C10786read RatingCompat;
        public clickSaveSlip$MediaBrowserCompat$CustomActionResultReceiver write;

        /* renamed from: o.clickSaveSlip$read$read  reason: collision with other inner class name */
        public class C10786read implements Runnable {
            private C10786read() {
            }

            public /* synthetic */ C10786read(read read, byte b) {
                this();
            }

            public final void run() {
                read.this.MediaBrowserCompat$CustomActionResultReceiver.write(read.this.MediaBrowserCompat$ItemReceiver, read.this.write.MediaBrowserCompat$ItemReceiver);
                read.this.write.read = true;
            }
        }

        public read(String str, FragmentBuilder_BindHmlBusinessOccupationInfoFragment fragmentBuilder_BindHmlBusinessOccupationInfoFragment) {
            this.MediaBrowserCompat$ItemReceiver = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindHmlBusinessOccupationInfoFragment;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(DeejungTransferLandingActivity deejungTransferLandingActivity) {
            if (deejungTransferLandingActivity != null) {
                ArrayList arrayList = deejungTransferLandingActivity.read;
                for (int i = 0; i < arrayList.size(); i++) {
                    MediaBrowserCompat$CustomActionResultReceiver((DeejungTransferLandingActivity) arrayList.get(i));
                }
                setTapIcon.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity.IconCompatParcelizer);
            }
        }
    }

    /* renamed from: o.clickSaveSlip$write */
    public static class write {
        public setTextAppearance<String, setTextAppearance<String, String>> MediaBrowserCompat$CustomActionResultReceiver = new setTextAppearance<>();

        write() {
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver(String str, setTextAppearance<String, String> settextappearance) {
            int size = settextappearance.size();
            for (int i = 0; i < size; i++) {
                int i2 = i << 1;
                MediaBrowserCompat$CustomActionResultReceiver(str, (String) settextappearance.read[i2], (String) settextappearance.read[i2 + 1]);
            }
        }

        private void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3) {
            setTextAppearance settextappearance = this.MediaBrowserCompat$CustomActionResultReceiver.get(str);
            if (settextappearance == null) {
                settextappearance = new setTextAppearance();
                this.MediaBrowserCompat$CustomActionResultReceiver.put(str, settextappearance);
            }
            settextappearance.put(str2, str3);
        }

        private boolean write(String str, String str2, String str3) {
            String str4;
            setTextAppearance settextappearance = this.MediaBrowserCompat$CustomActionResultReceiver.get(str);
            if (settextappearance == null || (str4 = (String) settextappearance.get(str2)) == null) {
                return false;
            }
            return str4.equals(str3);
        }

        /* access modifiers changed from: package-private */
        public final setTextAppearance read(String str, setTextAppearance<String, String> settextappearance) {
            int size = settextappearance.size();
            int i = 0;
            while (i < size) {
                int i2 = i << 1;
                if (write(str, (String) settextappearance.read[i2], (String) settextappearance.read[i2 + 1])) {
                    settextappearance.write(i);
                    size--;
                    i--;
                }
                i++;
            }
            return settextappearance;
        }
    }

    public final void IconCompatParcelizer(String str, Captures[] capturesArr, Map<String, DeejungTransferLandingActivity> map) {
        boolean z;
        if (capturesArr != null && capturesArr.length != 0 && map != null) {
            clickSaveSlip$MediaBrowserCompat$CustomActionResultReceiver clicksaveslip_mediabrowsercompat_customactionresultreceiver = null;
            boolean z2 = false;
            for (Captures captures : capturesArr) {
                DeejungTransferLandingActivity deejungTransferLandingActivity = map.get(captures.getPath());
                if (!(deejungTransferLandingActivity == null || deejungTransferLandingActivity.IconCompatParcelizer == null)) {
                    View view = deejungTransferLandingActivity.IconCompatParcelizer;
                    if (view != null && (view instanceof Button)) {
                        z = true ^ (view instanceof CompoundButton);
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (clicksaveslip_mediabrowsercompat_customactionresultreceiver == null) {
                            clicksaveslip_mediabrowsercompat_customactionresultreceiver = new clickSaveSlip$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
                        }
                        try {
                            clicksaveslip_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver(captures.getId(), BankingAgentReviewActivity.write(deejungTransferLandingActivity.IconCompatParcelizer));
                        } catch (Exception e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Error whilst data capturing. ");
                            sb.append(e.getMessage());
                            MyECouponActivity_ViewBinding.write(sb.toString());
                        }
                        View view2 = deejungTransferLandingActivity.IconCompatParcelizer;
                        String id = captures.getId();
                        if (!BankingAgentSuccessActivity_ViewBinding.write(view2)) {
                            setTapIcon.MediaBrowserCompat$ItemReceiver(view2, id, str, this);
                        }
                    }
                }
            }
            if (clicksaveslip_mediabrowsercompat_customactionresultreceiver != null) {
                if (clicksaveslip_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver.size() > 0) {
                    z2 = true;
                }
                if (z2) {
                    write(str, clicksaveslip_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver);
                }
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, Captures[] capturesArr, Map<String, DeejungTransferLandingActivity> map) {
        if (capturesArr != null && capturesArr.length != 0 && map != null) {
            this.write.MediaBrowserCompat$CustomActionResultReceiver.remove(str);
            for (Captures path : capturesArr) {
                DeejungTransferLandingActivity deejungTransferLandingActivity = map.get(path.getPath());
                if (deejungTransferLandingActivity != null) {
                    setTapIcon.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity.IconCompatParcelizer);
                }
            }
        }
    }
}
