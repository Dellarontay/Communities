package tree.test;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void exploreTheCommunity(View view) {

        EditText text = (EditText) findViewById(R.id.editText);
        String info = text.getText().toString();

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if (user != null) {
            // Name, email address, and profile photo Url
            String name = user.getProviderId();
            String email2 = user.getEmail();
            Uri photoUrl = user.getPhotoUrl();

            // The user's ID, unique to the Firebase project. Do NOT use this value to
            // authenticate with your backend server, if you have one. Use
            // FirebaseUser.getToken() instead.
            String uid = user.getUid();

            System.out.println( " Activity 2 : Name of user: " + email2);
            System.out.println( " Name of user: " + name);
            System.out.println( " Name of user: " + name);

            //Log.d(TAG,email2);
            //Log.d(TAG,uid);
            Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
            startActivity(intent);
        }

        System.out.println(info);
    }
}
