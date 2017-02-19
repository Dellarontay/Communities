package tree.test;

import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
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

        ScrollView scrollView = (ScrollView)findViewById(R.id.scroller);



        LinearLayout linLayout = (LinearLayout) scrollView.findViewById(R.id.vertStack);
        //ListAdapter adapter = new ListAdapter()
        for(int i = 0; i < 10; i ++){

        }

    }
}
