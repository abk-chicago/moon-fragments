package org.codeforcoffee.planetaryfragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MoonFragment extends Fragment {

    TextView mMoonName;
    String moonName;

    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        Bundle data = this.getArguments();
        moonName = data.getString("NAME");
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup parent,
                             Bundle state) {

        View moonFragment = inflater.inflate(R.layout.fragment_moon,
                parent, false);

        mMoonName = (TextView) moonFragment.findViewById(R.id.moon_name_text);
        mMoonName.setText(moonName);

        return moonFragment;
    }
}
