package kr.co.tjeit.facebookcopy.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

import kr.co.tjeit.facebookcopy.R;
import kr.co.tjeit.facebookcopy.data.FriendRequestData;

/**
 * Created by user on 2017-08-08.
 */

public class FriendRequestAdapter extends ArrayAdapter<FriendRequestData> {

    Context mContext;
    List<FriendRequestData> mList;
    LayoutInflater inf;

    public FriendRequestAdapter(Context context, List<FriendRequestData> list) {
        super(context, R.layout.friend_request_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = inf.inflate(R.layout.friend_request_list_item, null);
        }
        return row;
    }

    @Override
    public int getCount() {
        return  15;
    }
}






