package p040o;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

/* renamed from: o.FragmentBuilder_BindTopUpTabFragment$MediaBrowserCompat$MediaItem */
final class C6848x5f44fdd7 implements View.OnClickListener {
    private /* synthetic */ Activity read;
    private /* synthetic */ String write;

    C6848x5f44fdd7(Activity activity, String str) {
        this.read = activity;
        this.write = str;
    }

    public final void onClick(View view) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", this.write);
        this.read.startActivity(intent);
    }
}
