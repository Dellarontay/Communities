package tree.test;

import android.net.Uri;
import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;


import com.facebook.FacebookDialog;
import com.facebook.messenger.MessengerUtils;
import com.facebook.messenger.MessengerThreadParams;
import com.facebook.messenger.ShareToMessengerParams;

import java.util.List;



public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ScrollView scrollView = (ScrollView)findViewById(R.id.scroller);

        for(int i = 0; i < 10; i ++){

        }

        LinearLayout linLayout = (LinearLayout) scrollView.findViewById(R.id.vertStack);
        //linLayout.addView(new CustomView(getCallingActivity(),));
        //linLayout.addView(new MyChartView(getActivity(), chartBuilder, ChartBuilder.DATASET.SPEED));
        //scrollView.addView();

    }

    public void tryIt(View view) {


        String mimeType = "image/jpeg";
        String contentUri = "https://upload.wikimedia.org/wikipedia/en/e/e5/Crash_(Have_Some_Fun).jpeg";
        //String contentUri = "https://15932df5.ngrok.io";
        //String contentUri = "https://98d61ccc.ngrok.io/";
        Uri uri = Uri.parse(contentUri);

        //String contentUri = "https://98d61ccc.ngrok.io/";

// contentUri points to the content being shared to Messenger
        ShareToMessengerParams shareToMessengerParams =
                ShareToMessengerParams.newBuilder(uri, mimeType)
                        .build();

// Sharing from an Activity
        MessengerUtils.shareToMessenger(
                this,1,
                shareToMessengerParams);
    }
}
