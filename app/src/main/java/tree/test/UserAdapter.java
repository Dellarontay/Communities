package tree.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dellarontay on 2/18/2017.
 */

public class UserAdapter extends ArrayAdapter<User> {

    public UserAdapter(Context context, ArrayList<User> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        User user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.customview, parent, false);
        }
        // Lookup view for data population
        TextView emailView = (TextView) convertView.findViewById(R.id.userEmail);
        TextView homeView = (TextView) convertView.findViewById(R.id.userIssue);
        // Populate the data into the template view using the data object
        emailView.setText(user.getEmail());
        homeView.setText(user.getIssue());
        // Return the completed view to render on screen
        return convertView;
    }

}
