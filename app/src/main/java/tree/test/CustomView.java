package tree.test;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Dellarontay on 2/18/2017.
 */

public class CustomView extends RelativeLayout {

    Context context;
    private ImageView imgView;
    private TextView lblView;
    LayoutInflater inflater;
/*Do I need all three constructors for an Android custom view?*/

    //if you add your View from xml and also spcify the android:style attribute like : <com.mypack.MyView style="@styles/MyCustomStyle" />
//you will also need the first constructor public MyView(Context context, AttributeSet attrs,int defStyle)
    public CustomView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;
        init();
    }
    //you will need the constructor public MyView(Context context, AttributeSet attrs), otherwise you will get an Exception when Android tries to inflate your View.
    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();
    }

    //The third constructor is usually used when you extend a style and customize it, and then you would like to set that style to a given View in your layouts
    public CustomView(Context context) {
        super(context);
        this.context = context;
        init();
    }



    public void init()
    {
        LayoutInflater.from(context).inflate(R.layout.customview, this);
        lblView =(TextView) findViewById(R.id.userEmail);
        //imgView = (ImageView) findViewById(R.id.imgView);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        WindowManager wm = (WindowManager) this.getContext().getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        setMeasuredDimension(display.getWidth(), display.getHeight());
    }
}
